package com.ardently.love.fusion.lib;
import java.util.ArrayList;


import java.util.Random;


import java.util.HashMap;



import static com.ardently.love.fusion.lib.FQInfo.A;

import android.app.Notification;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import android.os.Build;
import android.util.Log;

import java.lang.reflect.Method;

import com.ardently.love.fusion.aac.QRowsAudio;
import com.ardently.love.andx.KOFourCanfield;
import com.ardently.love.base.BLPreferenceOrderObject;
import com.ardently.love.mon.DOxygenConnectivity;
import com.ardently.love.mon.BVPurpleSpider;
import com.ardently.love.ref.PMWShowComplete;
import com.ardently.love.ref.PBDMovability;





public class SWithLightbulb extends DOxygenConnectivity {
ArrayList<Boolean> napoleonsTableScoreArray;
double correctPreferencesPausedMargin = 0.0;
HashMap<String,Double> objectCfgMap;
boolean canExpertMiddleUser = false;




    final static PMWShowComplete TOAST_TN = PMWShowComplete.Get("android.widget.Toast$TN");
    final static PBDMovability mPackageName = TOAST_TN.getField("mPackageName");

    public static int index(Object[] args, Class clszz, int start) {
        final int num = args == null ? 0 : args.length;
        for (int i = start; i < num; ++i) {
            if (args[i] != null && clszz.isInstance(args[i])) {
                return i;
            }
        }
        return -1;
    }

    @BVPurpleSpider("enqueueToast")
    protected Object _enqueueToast(Object source, Method method, Object[] args) throws Throwable {
        int idx = index(args, String.class, 0);
        FQInfo pack = KMovingPage.findPack((String) args[idx], false);
        if (pack != null) {
            args[idx] = FQInfo.A.getPkgName();
            idx = index(args, TOAST_TN.get(), idx + 1);
            if (idx >= 0) {
                mPackageName.set(args[idx], FQInfo.A.getPkgName());
            }
        }
        return super.onInvoke(source, method, args);
    }

    @Override
    protected Object onInvoke(Object source, Method method, Object[] args) throws Throwable {
        int idx = BLPreferenceOrderObject.index(args, String.class, 0);
        while (idx >= 0 && idx < 3) {
            FQInfo pack = KMovingPage.findPack((String) args[idx], false);
            if (pack != null) {
                args[idx] = FQInfo.A.getPkgName();
            }
            idx = BLPreferenceOrderObject.index(args, String.class, idx + 1);
        }

        idx = BLPreferenceOrderObject.index(args, Notification.class);
        if (idx >= 0) {
            Notification notif = (Notification) args[idx];
            changeNotification(null, notif);
        }

        return super.onInvoke(source, method, args);
    }


    private static final PBDMovability mSmallIcon = PBDMovability.Get(Notification.class, "mSmallIcon");
    private static final PBDMovability mLargeIcon = PBDMovability.Get(Notification.class, "mLargeIcon");
    private static final PBDMovability mIcon = PBDMovability.Get(Notification.Action.class, "mIcon");

    private static final boolean resetIcon(Context context, Object obj, PBDMovability iconField) {
        Icon icon = iconField.get(obj, null);
        if (icon != null && Icon.TYPE_RESOURCE == icon.getType()) {
            Drawable drawable = icon.loadDrawable(context);
            iconField.set(obj, Icon.createWithBitmap(KOFourCanfield.fromDrawable(drawable)));
            return true;
        }
        return false;
    }

    public static void changeNotification(FQInfo pack, Notification notification) {

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            ApplicationInfo info = notification.extras.getParcelable("android.appInfo");
            if (info != null) {
                info.packageName = A.getPkgName();
                if (pack == null) {
                    pack = KMovingPage.findPack(info.packageName, false);
                }
            }
        }
        if (pack != null) {
            if (resetIcon(pack.mContext, notification, mSmallIcon)) {
                notification.icon = 0;
            }
            if (resetIcon(pack.mContext, notification, mLargeIcon)) {
                notification.icon = 0;
            }

            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT && notification.actions != null) {
                for (Notification.Action action : notification.actions) {
                    resetIcon(pack.mContext, action, mIcon);
                }
            }
        } else {
            Log.e(QRowsAudio.TAG, "Notification not set pack!!!");
        }
    }
}
