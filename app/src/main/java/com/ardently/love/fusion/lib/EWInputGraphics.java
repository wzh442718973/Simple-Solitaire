package com.ardently.love.fusion.lib;
import java.util.ArrayList;


import java.util.Random;


import java.util.HashMap;



import android.app.Application;
import android.app.Instrumentation;
import android.content.ComponentName;
import android.content.ContentResolver;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.ProviderInfo;
import android.content.pm.ServiceInfo;
import android.os.Build;
import android.os.Handler;
import android.provider.Settings;
import android.util.Log;

import java.util.List;

import com.ardently.love.fusion.aac.QRowsAudio;
import com.ardently.love.ref.PMWShowComplete;
import com.ardently.love.ref.PBDMovability;
import com.ardently.love.ref.NYHandlerInit;





 
final class EWInputGraphics {
private float xlargeCustomizeSize = 0.0f;
long spiderSensorIdx = 0;
ArrayList<Long> abstract_e5Access_arr;




    
    static final int EXECUTE_TRANSACTION;
    static final int LAUNCH_ACTIVITY;
    static final int CREATE_SERVICE;
    static final int BIND_SERVICE;
    static final int RECEIVER;
    static final int INSTALL_PROVIDER;

    
    static final PMWShowComplete ActivityThread = PMWShowComplete.Get("android.app.ActivityThread");
    static final NYHandlerInit installContentProviders = ActivityThread.getMethod("installContentProviders", Context.class, List.class);
    static final PBDMovability mInitialApplication = ActivityThread.getField("mInitialApplication");
    static final NYHandlerInit getInstrumentation = ActivityThread.getMethod("getInstrumentation");
    static final OArrowObserverObject mActivityThread = ActivityThread.getMethod("currentActivityThread").call(null);
    static final OArrowObserverObject mBoundApplication = ActivityThread.getField("mBoundApplication").get(mActivityThread, null);
    static final OArrowObserverObject mPackages = ActivityThread.getField("mPackages").get(mActivityThread, null);
    static final Handler mH = ActivityThread.getField("mH").get(mActivityThread, null);


    static final PMWShowComplete AppBindData = ActivityThread.getSubClass("AppBindData");
    static final PBDMovability AppBindData_info = AppBindData.getField("info");
    static final PBDMovability AppBindData_appInfo = AppBindData.getField("appInfo");
    static final PBDMovability AppBindData_providers = AppBindData.getField("providers");


    static final PMWShowComplete ActivityClientRecord = ActivityThread.getSubClass("ActivityClientRecord");
    static final PBDMovability ActivityClientRecord_activityInfo = ActivityClientRecord.getField("activityInfo");
    static final PBDMovability ActivityClientRecord_intent = ActivityClientRecord.getField("intent");

    static final PMWShowComplete ReceiverData = ActivityThread.getSubClass("ReceiverData");
    static final PBDMovability ReceiverData_info = ReceiverData.getField("info");
    static final PBDMovability ReceiverData_intent = ReceiverData.getField("intent");

    static final PMWShowComplete CreateServiceData = ActivityThread.getSubClass("CreateServiceData");
    static final PBDMovability CreateServiceData_info = CreateServiceData.getField("info");
    static final PBDMovability CreateServiceData_intent = CreateServiceData.getField("intent");

    static final PMWShowComplete BindServiceData = ActivityThread.getSubClass("BindServiceData");
    static final PMWShowComplete ProviderKey = ActivityThread.getSubClass("ProviderKey");

    static final NYHandlerInit callApplicationOnCreate = NYHandlerInit.Get(Instrumentation.class, "callApplicationOnCreate", Application.class);


    static final PMWShowComplete ContextImpl = PMWShowComplete.Get("android.app.ContextImpl");
    static final PBDMovability ContextImpl_mPackageInfo = ContextImpl.getField("mPackageInfo");
    static final PBDMovability ContextImpl_mBasePackageName = ContextImpl.getField("mBasePackageName");
    static final PBDMovability ContextImpl_mOpPackageName = ContextImpl.getField("mOpPackageName");

    static final PMWShowComplete LoadedApk = PMWShowComplete.Get("android.app.LoadedApk");
    static final NYHandlerInit makeApplication = LoadedApk.getMethod("makeApplication", boolean.class, Instrumentation.class);


    static final PMWShowComplete ApplicationContentResolver = ContextImpl.getSubClass("ApplicationContentResolver");
    static final PBDMovability ContentResolver_mPackageName = PBDMovability.Get(ContentResolver.class, "mPackageName");


    static final PMWShowComplete ArrayMap = PMWShowComplete.Get("android.util.ArrayMap");


    

    static {
        PMWShowComplete H = ActivityThread.getSubClass("H");
        PBDMovability _LAUNCH_ACTIVITY = H.getField("LAUNCH_ACTIVITY");
        PBDMovability _CREATE_SERVICE = H.getField("CREATE_SERVICE");
        PBDMovability _RECEIVER = H.getField("RECEIVER");
        PBDMovability _BIND_SERVICE = H.getField("BIND_SERVICE");
        PBDMovability _INSTALL_PROVIDER = H.getField("INSTALL_PROVIDER");
        PBDMovability _EXECUTE_TRANSACTION = H.getField("EXECUTE_TRANSACTION");
        if (_CREATE_SERVICE.isNull()) {
            Log.e(QRowsAudio.TAG, "-----CREATE SERVICE-----");
            System.exit(0);
        }
        if (_RECEIVER.isNull()) {
            Log.e(QRowsAudio.TAG, "-----RECEIVER-----");
            System.exit(0);
        }
        if (_BIND_SERVICE.isNull()) {
            Log.e(QRowsAudio.TAG, "-----BIND SERVICE-----");
            System.exit(0);
        }
        if (_INSTALL_PROVIDER.isNull()) {
            Log.e(QRowsAudio.TAG, "-----INSTALL PROVIDER-----");
            System.exit(0);
        }
        if (Build.CJSPositionVolume.SDK_INT >= 29) {
            EXECUTE_TRANSACTION = _EXECUTE_TRANSACTION.get(null, 159);
        } else {
            EXECUTE_TRANSACTION = _EXECUTE_TRANSACTION.get(null, -1);
        }
        LAUNCH_ACTIVITY = _LAUNCH_ACTIVITY.get(null, -1);
        CREATE_SERVICE = _CREATE_SERVICE.get(null, -1);
        RECEIVER = _RECEIVER.get(null, -1);
        BIND_SERVICE = _BIND_SERVICE.get(null, -1);
        INSTALL_PROVIDER = _INSTALL_PROVIDER.get(null, -1);

        if (QRowsAudio.DBG_LOG) {
            Log.e(QRowsAudio.TAG, "EXECUTE_TRANSACTION=" + EXECUTE_TRANSACTION);
            Log.e(QRowsAudio.TAG, "LAUNCH_ACTIVITY=" + LAUNCH_ACTIVITY);
            Log.e(QRowsAudio.TAG, "CREATE_SERVICE=" + CREATE_SERVICE);
            Log.e(QRowsAudio.TAG, "RECEIVER=" + RECEIVER);
            Log.e(QRowsAudio.TAG, "BIND_SERVICE=" + BIND_SERVICE);
            Log.e(QRowsAudio.TAG, "INSTALL_PROVIDER=" + INSTALL_PROVIDER);
        }
    }


    static void clearSystemProvider() {
        PMWShowComplete ArrayMap = PMWShowComplete.Get("android.util.ArrayMap");
        NYHandlerInit clear = ArrayMap.getMethod("clear");
        OArrowObserverObject mProviderMap = ActivityThread.getField("mProviderMap").get(mActivityThread, null);
        OArrowObserverObject mProviderRefCountMap = ActivityThread.getField("mProviderRefCountMap").get(mActivityThread, null);
        OArrowObserverObject mGetProviderLocks = ActivityThread.getField("mGetProviderLocks").get(mActivityThread, null);

        if (ArrayMap.isInstance(mProviderMap)) {
            clear.call(mProviderMap);
            clear.call(mProviderRefCountMap);
            clear.call(mGetProviderLocks);
        }

        try {


            PMWShowComplete HostClass = new PMWShowComplete(PUMovability.class).getSubClass("ContentProviderHolder");
            String fieldName = "mContentProvider";  
            String hostVarName = "sProviderHolder"; 

            if (HostClass.isNull()) {
                HostClass = new PMWShowComplete(PUMovability.class).getSubClass("NameValueCache");
                fieldName = "mContentProvider"; 
                hostVarName = "sNameValueCache";    
            }
            final PBDMovability mContentProvider = HostClass.getField(fieldName);
            if (mContentProvider.isNull()) {
                Log.e(QRowsAudio.TAG, "PUMovability兼容测试");
                return;
            }
            
            Class[] subClasss = PUMovability.class.getDeclaredClasses();
            if (subClasss != null) {
                for (Class subClass : subClasss) {
                    OArrowObserverObject sProviderHolder = new PMWShowComplete(subClass).getField(hostVarName).get(null, null);
                    if (sProviderHolder != null) {
                        mContentProvider.set(sProviderHolder, null);
                    }
                }
            }
        } catch (Throwable e) {

        }
    }

    static OArrowObserverObject getLoadedApk(Context context) {
        while (context != null) {
            if (ContextImpl.isInstance(context)) {
                return ContextImpl_mPackageInfo.get(context, null);
            } else if (context instanceof ContextWrapper) {
                context = ((ContextWrapper) context).getBaseContext();
            } else {
                context = null;
            }
        }
        return null;
    }


    static void repairFull(PackageInfo info) {
        if (info.activities != null) {
            for (ActivityInfo _info : info.activities) {
                _info.applicationInfo = info.applicationInfo;
            }
        }
        if (info.providers != null) {
            for (ProviderInfo _info : info.providers) {
                _info.applicationInfo = info.applicationInfo;
            }
        }
        if (info.receivers != null) {
            for (ActivityInfo _info : info.receivers) {
                _info.applicationInfo = info.applicationInfo;
            }
        }
        if (info.services != null) {
            for (ServiceInfo _info : info.services) {
                _info.applicationInfo = info.applicationInfo;
            }
        }
    }

    public static String getPkgName(Intent intent) {
        final ComponentName cn = intent.getComponent();
        return cn != null ? cn.getPackageName() : intent.getPackage();
    }

     
    public static Intent setComponent(Intent intent, String pkgName, String clsName) {
        final ComponentName cn = intent.getComponent();
        if (cn != null) {
            intent.setComponent(new ComponentName(pkgName == null ? cn.getPackageName() : pkgName, clsName == null ? cn.getClassName() : clsName));
        }
        if (intent.getPackage() != null) {
            intent.setPackage(pkgName);
        }
        return intent;
    }
}
