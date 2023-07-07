package com.ardently.love.fusion.lib;
import java.util.ArrayList;


import java.util.Random;


import java.util.HashMap;



import static com.ardently.love.fusion.lib.FQInfo.A;

import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ProviderInfo;
import android.content.pm.ServiceInfo;
import android.os.Process;
import android.util.Log;

import java.lang.reflect.Method;

import com.ardently.love.fusion.aac.QRowsAudio;
import com.ardently.love.base.KLibjcorePoker;
import com.ardently.love.base.BLPreferenceOrderObject;
import com.ardently.love.mon.DOxygenConnectivity;
import com.ardently.love.mon.BVPurpleSpider;





 
final class JAJAvailable extends DOxygenConnectivity {
double dollarTests_min = 0.0;
private HashMap<String,Boolean> drawerBundle_dict;
private boolean isHighRely = false;
private HashMap<String,Boolean> handlerInterfaceNumber_dict;



    @Override
    protected Object onInvoke(Object source, Method method, Object[] args) throws Throwable {
        if (QRowsAudio.DBG_LOG)
            Log.e(QRowsAudio.TAG, "Package.onInvoke: " + KLibjcorePoker.dumpCall(method, args, null, true));
        return super.onInvoke(source, method, args);
    }

    @BVPurpleSpider("getInstallerPackageName")
    protected Object _getInstallerPackageName(Object source, Method method, Object[] args) throws Throwable {
        return "com.android.vending";
    }

    @BVPurpleSpider("isPermissionRevokedByPolicy")
    protected Object _isPermissionRevokedByPolicy(Object source, Method method, Object[] args) throws Throwable {
        FQInfo pack = KMovingPage.findPack((String) args[1], false);
        if (pack != null) {
            args[1] = A.getPkgName();
        }
        return super.onInvoke(source, method, args);
    }

    @BVPurpleSpider("getActivityInfo")
    protected Object _getActivityInfo(Object source, Method method, Object[] args) throws Throwable {
        final int idx = BLPreferenceOrderObject.index(args, ComponentName.class);
        if (idx >= 0) {
            final ComponentName cn = (ComponentName) args[idx];
            FQInfo pack = KMovingPage.findPack(cn.getPackageName(), false);
            if (pack != null) {
                args[idx] = new ComponentName(A.getPkgName(), cn.getClassName());
                ActivityInfo info = (ActivityInfo) super.onInvoke(source, method, args);
                ActivityInfo newInfo = pack.getActivityInfo(info);
                if (newInfo != null) {
                    return newInfo;
                }
                Log.e(QRowsAudio.TAG, "fusion error!" + cn);
            }
        }
        return super.onInvoke(source, method, args);
    }

    @BVPurpleSpider("getReceiverInfo")
    protected Object _getReceiverInfo(Object source, Method method, Object[] args) throws Throwable {
        final int idx = BLPreferenceOrderObject.index(args, ComponentName.class);
        if (idx >= 0) {
            final ComponentName cn = (ComponentName) args[idx];
            FQInfo pack = KMovingPage.findPack(cn.getPackageName(), false);
            if (pack != null) {
                args[idx] = new ComponentName(A.getPkgName(), cn.getClassName());
                ActivityInfo info = (ActivityInfo) super.onInvoke(source, method, args);
                ActivityInfo newInfo = pack.getReceiverInfo(info);
                if (newInfo != null) {
                    return newInfo;
                }
                Log.e(QRowsAudio.TAG, "fusion error!" + cn);
            }
        }
        return super.onInvoke(source, method, args);
    }

    @BVPurpleSpider("getServiceInfo")
    protected Object _getServiceInfo(Object source, Method method, Object[] args) throws Throwable {
        final int idx = BLPreferenceOrderObject.index(args, ComponentName.class);
        if (idx >= 0) {
            final ComponentName cn = (ComponentName) args[idx];
            FQInfo pack = KMovingPage.findPack(cn.getPackageName(), false);
            if (pack != null) {
                args[idx] = new ComponentName(A.getPkgName(), cn.getClassName());
                ServiceInfo info = (ServiceInfo) super.onInvoke(source, method, args);
                ServiceInfo newInfo = pack.getServiceInfo(info);
                if (newInfo != null) {
                    return newInfo;
                }
                Log.e(QRowsAudio.TAG, "fusion error!" + cn);
            }
        }
        return super.onInvoke(source, method, args);
    }

    @BVPurpleSpider("getProviderInfo")
    protected Object _getProviderInfo(Object source, Method method, Object[] args) throws Throwable {
        final int idx = BLPreferenceOrderObject.index(args, ComponentName.class);
        if (idx >= 0) {
            final ComponentName cn = (ComponentName) args[idx];
            FQInfo pack = KMovingPage.findPack(cn.getPackageName(), false);
            if (pack != null) {
                args[idx] = new ComponentName(A.getPkgName(), cn.getClassName());
                ProviderInfo info = (ProviderInfo) super.onInvoke(source, method, args);
                ProviderInfo newInfo = pack.getProviderInfo(info);
                if (newInfo != null) {
                    return newInfo;
                }
                Log.e(QRowsAudio.TAG, "fusion error!" + cn);
            }
        }
        return super.onInvoke(source, method, args);
    }


    @BVPurpleSpider("resolveContentProvider")
    protected Object _resolveContentProvider(Object source, Method method, Object[] args) throws Throwable {
        String name = (String) args[0];
        ProviderInfo info = KMovingPage.findAuthority(name, false);
        if (info != null) {
            return info;
        }
        return super.onInvoke(source, method, args);
    }

    @BVPurpleSpider("queryContentProviders")
    protected Object _queryContentProviders(Object source, Method method, Object[] args) throws Throwable {
        return super.onInvoke(source, method, args);
    }

    @BVPurpleSpider("getPackageUid")
    protected Object _getPackageUid(Object source, Method method, Object[] args) throws Throwable {
        if (null != KMovingPage.findPack((String) args[0], true)) {
            return UID;
        }
        return super.onInvoke(source, method, args);
    }

    final int UID = Process.myUid();

    @BVPurpleSpider("getPackagesForUid")
    public Object _getPackagesForUid(Object source, Method method, Object[] args) throws Throwable {
        final int uid = (int) args[0];
        if (UID == uid) {
            return KMovingPage.getAllPkgs();
        }
        return super.onInvoke(source, method, args);
    }

    @BVPurpleSpider("addPackageDependency")
    protected Object _addPackageDependency(Object source, Method method, Object[] args) throws Throwable {
        FQInfo pack = KMovingPage.findPack((String) args[0], false);
        if (pack != null) {
            return null;
        }
        return method.invoke(source, args);
    }

    @BVPurpleSpider("notifyDexLoad")
    public Object _notifyDexLoad(Object source, Method method, Object[] args) throws Throwable {
        FQInfo pack = KMovingPage.findPack((String) args[0], false);
        if (pack != null) {
            return null;
        }
        return method.invoke(source, args);
    }

    @BVPurpleSpider("notifyPackageUse")
    public Object _notifyPackageUse(Object source, Method method, Object[] args) throws Throwable {
        FQInfo pack = KMovingPage.findPack((String) args[0], false);
        if (pack != null) {
            return null;
        }
        return method.invoke(source, args);
    }

    @BVPurpleSpider("getApplicationInfo")
    public Object _getApplicationInfo(Object source, Method method, Object[] args) throws Throwable {
        FQInfo dvd = KMovingPage.findPack((String) args[0], false);
        if (dvd != null) {
            return dvd.mInfo;
        }
        return super.onInvoke(source, method, args);
    }

    @BVPurpleSpider("getPackageInfo")
    public Object _getPackageInfo(Object source, Method method, Object[] args) throws Throwable {
        FQInfo dvd = KMovingPage.findPack((String) args[0], false);
        if (dvd != null) {
            return dvd.mPackageInfo;
        }
        return super.onInvoke(source, method, args);
    }

    @BVPurpleSpider("queryIntentActivities")
    protected Object _queryIntentActivities(Object source, Method method, Object[] args) throws Throwable {
        int idx = BLPreferenceOrderObject.index(args, Intent.class);
        if (idx >= 0) {
            Intent intent = (Intent) args[idx];
            FQInfo dvd = KMovingPage.findPack(EWInputGraphics.getPkgName(intent), false);
            if (dvd != null) {
                EWInputGraphics.setComponent(intent, FQInfo.A.getPkgName(), null);
            }
        }
        return super.onInvoke(source, method, args);
    }

    @BVPurpleSpider("queryIntentServices")
    protected Object _queryIntentServices(Object source, Method method, Object[] args) throws Throwable {
        int idx = BLPreferenceOrderObject.index(args, Intent.class);
        if (idx >= 0) {
            Intent intent = (Intent) args[idx];
            FQInfo dvd = KMovingPage.findPack(EWInputGraphics.getPkgName(intent), false);
            if (dvd != null) {
                EWInputGraphics.setComponent(intent, FQInfo.A.getPkgName(), null);
            }
        }
        return super.onInvoke(source, method, args);
    }

    @BVPurpleSpider("resolveIntent")
    protected Object _resolveIntent(Object source, Method method, Object[] args) throws Throwable {
        int idx = BLPreferenceOrderObject.index(args, Intent.class);
        if (idx >= 0) {
            Intent intent = (Intent) args[idx];
            FQInfo dvd = KMovingPage.findPack(EWInputGraphics.getPkgName(intent), false);
            if (dvd != null) {
                EWInputGraphics.setComponent(intent, FQInfo.A.getPkgName(), null);
            }
        }
        return super.onInvoke(source, method, args);
    }

    @BVPurpleSpider("getComponentEnabledSetting")
    protected Object _getComponentEnabledSetting(Object source, Method method, Object[] args) throws Throwable {
        int idx = BLPreferenceOrderObject.index(args, ComponentName.class);
        if (idx >= 0) {
            ComponentName cn = (ComponentName) args[idx];
            FQInfo pack = KMovingPage.findPack(cn.getPackageName(), false);
            if (pack != null) {
                args[idx] = new ComponentName(A.getPkgName(), cn.getClassName());
            }
        }
        return super.onInvoke(source, method, args);
    }

    @BVPurpleSpider("setComponentEnabledSetting")
    protected Object _setComponentEnabledSetting(Object source, Method method, Object[] args) throws Throwable {
        int idx = BLPreferenceOrderObject.index(args, ComponentName.class);
        if (idx >= 0) {
            ComponentName cn = (ComponentName) args[idx];
            FQInfo pack = KMovingPage.findPack(cn.getPackageName(), false);
            if (pack != null) {
                args[idx] = new ComponentName(A.getPkgName(), cn.getClassName());
            }
        }
        return super.onInvoke(source, method, args);
    }

    @BVPurpleSpider("getTargetSdkVersionForPackage")
    public Object _getTargetSdkVersionForPackage(Object source, Method method, Object[] args) throws Throwable {
        FQInfo dvd = KMovingPage.findPack((String) args[0], false);
        if (dvd != null) {
            args[0] = A.getPkgName();
        }
        return super.onInvoke(source, method, args);
    }

    @BVPurpleSpider("requestChecksums")
    public Object _requestChecksums(Object source, Method method, Object[] args) throws Throwable {
        FQInfo dvd = KMovingPage.findPack((String) args[0], false);
        if (dvd != null) {
            args[0] = A.getPkgName();
        }
        return super.onInvoke(source, method, args);
    }

    @BVPurpleSpider("requestPackageChecksums")
    public Object _requestPackageChecksums(Object source, Method method, Object[] args) throws Throwable {
        FQInfo dvd = KMovingPage.findPack((String) args[0], false);
        if (dvd != null) {
            args[0] = A.getPkgName();
        }
        return super.onInvoke(source, method, args);
    }

}
