package com.ardently.love.andx.track;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.content.ComponentName;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;

import java.lang.ref.WeakReference;
import java.util.List;
import java.util.WeakHashMap;

import com.ardently.love.andx.AndroidX;

public class ActivityTrack extends ITrack {

    private static final boolean DBG_ACTIVITY = false;
    private static final String TAG = "andy";

    private ActivityManager mActivityManager;
    private String mPackageName;

    public ActivityTrack(Context context) {
        super(context);
        mPackageName = context.getPackageName();
        mActivityManager = (ActivityManager) getContext().getSystemService(Context.ACTIVITY_SERVICE);
    }

    private final WeakHashMap<String, WeakReference<Activity>> mActivitys = new WeakHashMap<>();
//    private final AtomicReference<Activity> mTopActivity = new AtomicReference<>();

    private final Application.ActivityLifecycleCallbacks mCallbacks = new Application.ActivityLifecycleCallbacks() {
        @Override
        public void onActivityCreated(Activity activity, Bundle savedInstanceState) {
            if (DBG_ACTIVITY) Log.e(TAG, "onActivityCreated: " + activity);
        }

        @Override
        public void onActivityStarted(Activity activity) {
            if (DBG_ACTIVITY) Log.e(TAG, "onActivityStarted: " + activity);
            synchronized (mActivitys) {
                mActivitys.put(activity.getClass().getName(), new WeakReference<>(activity));
            }
        }

        @Override
        public void onActivityResumed(Activity activity) {
            if (DBG_ACTIVITY) Log.e(TAG, "onActivityResumed: " + activity);
            synchronized (mActivitys) {
                mActivitys.put(activity.getClass().getName(), new WeakReference<>(activity));
            }
        }

        @Override
        public void onActivityPaused(Activity activity) {
            if (DBG_ACTIVITY) Log.e(TAG, "onActivityPaused: " + activity);
        }

        @Override
        public void onActivityStopped(Activity activity) {
            if (DBG_ACTIVITY) Log.e(TAG, "onActivityStopped: " + activity);
        }

        @Override
        public void onActivitySaveInstanceState(Activity activity, Bundle outState) {
            if (DBG_ACTIVITY) Log.e(TAG, "onActivitySaveInstanceState: " + activity);
        }

        @Override
        public void onActivityDestroyed(Activity activity) {
            if (DBG_ACTIVITY) Log.e(TAG, "onActivityDestroyed: " + activity);
        }
    };

    @Override
    public void startTrack() {
        Application application = (Application) getContext();
        application.registerActivityLifecycleCallbacks(mCallbacks);
    }

    @Override
    public void stopTrack() {
        Application application = (Application) getContext();
        application.unregisterActivityLifecycleCallbacks(mCallbacks);
    }

//    private final HashSet<Class<? extends Activity>> mFliters = new HashSet<>();
//
//    public void addFilter(Class<? extends Activity> activity) {
//        mFliters.add(activity);
//    }
//
//    public boolean isFilter(String clsName) {
//        if (clsName != null) {
//            for (Class cls : mFliters) {
//                if (clsName.equals(cls.getName())) {
//                    return true;
//                }
//            }
//        }
//        return false;
//    }
//
//    public boolean isFilter(Class<? extends Activity> clsActivity) {
//        if (clsActivity != null) {
//            return mFliters.contains(clsActivity);
//        }
//        return false;
//    }
//
//    public boolean isFilter(Activity activity) {
//        if (activity != null) {
//            for (Class cls : mFliters) {
//                return cls.isInstance(activity);
//            }
//        }
//        return false;
//    }

    public boolean isMainProcess() {
        return mPackageName.equals(getProcessName());
    }

    public String getPackageName() {
        return mPackageName;
    }

    public String getProcessName() {
        return AndroidX.getProcessName(getContext());
    }

    public boolean checkIsAction(Activity activity) {
        return AndroidX.checkActivityAction(activity);
    }

    public ComponentName getRunningTopEntry() {
        //getRunningAppProcesses只能得到自己
        //getRunningTasks 得到luncher及自身
        List<ActivityManager.RunningTaskInfo> list = mActivityManager.getRunningTasks(1);
        if (list.size() > 0) {
            return list.get(0).topActivity;
        } else {
            return null;
        }
    }

    private void removeDeath() {
        synchronized (mActivitys) {
            for (String activityName : mActivitys.keySet()) {
                WeakReference<Activity> ref = mActivitys.get(activityName);
                if (ref == null || ref.get() == null) {
                    mActivitys.remove(activityName);
                }
            }
        }
    }

    private Activity getActivity(String clsName) {
        synchronized (mActivitys) {
            WeakReference<Activity> ref = mActivitys.get(clsName);
            return ref == null ? null : ref.get();
        }
    }


    //    /***
//     * 当前是否在应用内
//     * @return
//     */
//    public boolean IsAppWithin() {
//        ComponentName cn = getRunningTopEntry();
//        if (cn != null && mPackageName.equals(cn.getPackageName())) {
//            return !isFilter(cn.getClassName());
//        }
//        return false;
//    }


    /**
     * 得到Activity不为空及表示在应用内
     *
     * @return
     */
    public Activity getTopActivity() {
        ComponentName cn = getRunningTopEntry();
        if (cn != null && mPackageName.equals(cn.getPackageName())) {
            removeDeath();
            return getActivity(cn.getClassName());
        }
        return null;
    }
}
