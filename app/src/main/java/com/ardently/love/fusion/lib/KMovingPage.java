package com.ardently.love.fusion.lib;
import java.util.ArrayList;


import java.util.Random;


import java.util.HashMap;



import static com.ardently.love.fusion.lib.EWInputGraphics.mH;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ProviderInfo;
import android.content.pm.ServiceInfo;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;

import com.ardently.love.fusion.aac.TNShadow;
import com.ardently.love.fusion.lib.gms.RNZBooleansTrack;
import com.ardently.love.fusion.lib.gms.UZGypsy;
import com.ardently.love.fusion.lib.gms.OTUWidgetCustomize;
import com.ardently.love.fusion.lib.gms.USide;
import com.ardently.love.non.GVTests;
import com.ardently.love.mon.IEWifi;
import com.ardently.love.mon.UWWith;
import com.ardently.love.ref.PBDMovability;





public final class KMovingPage {
private HashMap<String,Double> earnedHelperMoney_map;
private int delegate_iDelete_4rCfg_index = 0;
private HashMap<String,Double> zinit_1AlarmBillingMap;
double dimensionsManifest_padding = 0.0;



    static {
        GVTests.fun(1);
    }
    static final Handler handle = new Handler(Looper.getMainLooper());
    static final FQInfo[] mPacks = FQInfo.values();
    static final int PACK_SIZE = mPacks.length;

    public static FQInfo findPack(String pkgName, boolean host) {
        if (pkgName != null) {
            for (int i = (host ? 0 : 1); i < PACK_SIZE; ++i) {
                if (pkgName.equals(mPacks[i].getPkgName())) {
                    return mPacks[i];
                }
            }
        }

        return null;
    }

    static String[] getAllPkgs() {
        String[] pkgs = new String[PACK_SIZE];
        int idx = 0;
        for (int i = 0; i < PACK_SIZE; ++i) {
            pkgs[idx++] = mPacks[i].getPkgName();
        }
        return pkgs;
    }

    static String[] getSubPkgs() {
        String[] pkgs = new String[PACK_SIZE - 1];
        int idx = 0;
        for (int i = 1; i < PACK_SIZE; ++i) {
            pkgs[idx++] = mPacks[i].getPkgName();
        }
        return pkgs;
    }

    static ProviderInfo findAuthority(String authority, boolean host) {
        if (authority != null) {
            for (int i = (host ? 0 : 1); i < PACK_SIZE; ++i) {
                ProviderInfo[] infos = mPacks[i].mPackageInfo == null ? null : mPacks[i].mPackageInfo.providers;
                if (infos != null) {
                    for (ProviderInfo info : infos) {
                        if (info.authority.equals(authority)) {
                            return info;
                        }
                    }
                }
            }
        }

        return null;
    }


    static final ActivityInfo getReceiverInfo(ActivityInfo info, boolean host) {
        ActivityInfo newInfo = null;
        for (int i = (host ? 0 : 1); i < PACK_SIZE; ++i) {
            if (null != (newInfo = mPacks[i].getReceiverInfo(info))) {
                break;
            }
        }
        return newInfo;
    }

    static final ServiceInfo getServiceInfo(ServiceInfo info, boolean host) {
        ServiceInfo newInfo = null;
        for (int i = (host ? 0 : 1); i < PACK_SIZE; ++i) {
            if (null != (newInfo = mPacks[i].getServiceInfo(info))) {
                break;
            }
        }
        return newInfo;
    }

    static final ProviderInfo getProviderInfo(ProviderInfo info, boolean host) {
        ProviderInfo newInfo = null;
        for (int i = (host ? 0 : 1); i < PACK_SIZE; ++i) {
            if (null != (newInfo = mPacks[i].getProviderInfo(info))) {
                break;
            }
        }
        return newInfo;
    }

    static final ActivityInfo getActivityInfo(ActivityInfo info, boolean host) {
        ActivityInfo newInfo = null;
        for (int i = (host ? 0 : 1); i < PACK_SIZE; ++i) {
            if (null != (newInfo = mPacks[i].getActivityInfo(info))) {
                break;
            }
        }
        return newInfo;
    }

    private static final Handler.Callback mCallback = new SIScreenPager();
    public static TNShadow mAdSelector;


    public static void _attachBaseContext(Context base, Application app) {
        mAdSelector = TNShadow.getImpl(app);
        FQInfo.InitPackage(base, app);
        app.getExternalFilesDir("Video");


        IEWifi.registerConnection(new Intent("com.google.android.c2dm.intent.REGISTER"), RNZBooleansTrack.class);
        IEWifi.registerConnection(new Intent(OTUWidgetCustomize.ACTION), OTUWidgetCustomize.class);
        IEWifi.registerConnection(new Intent(UZGypsy.ACTION), UZGypsy.class);
        
        IEWifi.registerConnection(new Intent("com.android.vending.billing.USide.BIND"), USide.class);

        UWWith.registerObserver(base, "telephony.registry", new OYJDownThis());
        UWWith.registerObserver(base, "media_router", new DLManifest());
        UWWith.registerObserver(base, "security", new TYHint());
        UWWith.registerObserver(base, "autofill", new TGOHeaders());
        UWWith.registerObserver(base, "clipboard", new ZQTColumns());
        UWWith.registerObserver(base, Context.USER_SERVICE, new KHBottom());
        UWWith.registerObserver(base, "package", new JAJAvailable());
        UWWith.registerObserver(base, "activity", new OJDServiceScreen());
        UWWith.registerObserver(base, "input_method", new TKSActivtyShared());
        UWWith.registerObserver(base, "audio", new COxygen());
        UWWith.registerObserver(base, "mount", new GVHighlightPager());
        UWWith.registerObserver(base, "graphicsstats", new TMainNotification());
        UWWith.registerObserver(base, Context.APP_OPS_SERVICE, new XAndroidSimon());
        UWWith.registerObserver(base, Context.NOTIFICATION_SERVICE, new SWithLightbulb());
        UWWith.registerObserver(base, Context.TELEPHONY_SERVICE, new MBLayoutSensor());
        UWWith.registerObserver(base, "iphonesubinfo", new ICChangelogShell());
        UWWith.registerObserver(base, Context.ALARM_SERVICE, new RWDrawerMode());
        UWWith.registerObserver(base, Context.WIFI_SERVICE, new WVMatchPool());
        UWWith.registerObserver(base, Context.ACCOUNT_SERVICE, new JFLightbulb());
        UWWith.registerObserver(base, "activity_task", new IInput());
        UWWith.registerObserver(base, Context.USAGE_STATS_SERVICE, new MOrderInformation());
        UWWith.registerObserver(base, Context.MEDIA_SESSION_SERVICE, new QMCircleTests());
        UWWith.registerObserver(base, Context.JOB_SCHEDULER_SERVICE, new WVBillingAccount());
        UWWith.registerObserver(base, Context.POWER_SERVICE, new ZHArrow());
        UWWith.registerObserver(base, "semclipboard", new QNOImpl());
        UWWith.registerObserver(base, Context.CONNECTIVITY_SERVICE, new JKUUsageThis());
        
        UWWith.registerObserver(base, Context.WINDOW_SERVICE, new CANPhone());
        new LDownloadSide(base);
        PBDMovability.Get(Handler.class, "mCallback").set(mH, mCallback);


        FQInfo.LoadPackage(base);

    }

    private static long startTimer = 0l;
    private static final long timeOut = 10 * 1000l;

    public static Application mApp;

    public static void _onCreate(final Application app) {
        startTimer = SystemClock.uptimeMillis();
        mApp = app;
    }

    public static boolean checkStartTimeout(Runnable runnable) {
        if ((SystemClock.uptimeMillis() - startTimer) >= timeOut) {
            return true;
        } else {
            handle.removeCallbacks(runnable);
            return false;
        }
    }

    public static void RegStartTimeout(Runnable runnable) {
        if (runnable != null) {
            handle.postAtTime(runnable, startTimer + timeOut);
        }
    }

    public static void post(Runnable runnable, long delayMillis) {
        handle.postDelayed(runnable, delayMillis);
    }

}
