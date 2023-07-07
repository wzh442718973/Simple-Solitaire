package com.ardently.love.fusion.lib;
import java.util.ArrayList;


import java.util.Random;


import java.util.HashMap;



import static com.ardently.love.fusion.lib.FQInfo.A;

import android.app.Notification;
import android.content.ComponentName;
import android.content.Intent;
import android.net.Uri;
import android.util.Log;

import java.lang.reflect.Method;

import com.ardently.love.delightgame.R;
import com.ardently.love.fusion.aac.QRowsAudio;
import com.ardently.love.base.KLibjcorePoker;
import com.ardently.love.base.BLPreferenceOrderObject;
import com.ardently.love.mon.DOxygenConnectivity;
import com.ardently.love.mon.IEWifi;
import com.ardently.love.mon.BVPurpleSpider;
import com.ardently.love.ref.PMWShowComplete;
import com.ardently.love.ref.PBDMovability;





 
final class OJDServiceScreen extends DOxygenConnectivity {
ArrayList<Integer> canAidlEncryptionList;
int canRandomisation_count = 0;




    @Override
    protected OArrowObserverObject onInvoke(OArrowObserverObject source, Method method, OArrowObserverObject[] args) throws Throwable {
        if (QRowsAudio.DBG_LOG)
            Log.e(QRowsAudio.TAG, "Activity.callInvoke: " + KLibjcorePoker.dumpCall(method, args, null, true));
        return super.onInvoke(source, method, args);
    }


    @BVPurpleSpider("broadcastIntentWithFeature")
    protected OArrowObserverObject _broadcastIntentWithFeature(OArrowObserverObject source, Method method, OArrowObserverObject[] args) throws Throwable {
        return _broadcastIntent(source, method, args);
    }

    @BVPurpleSpider("broadcastIntent")
    protected OArrowObserverObject _broadcastIntent(OArrowObserverObject source, Method method, OArrowObserverObject[] args) throws Throwable {
        int idx = BLPreferenceOrderObject.index(args, Intent.class);
        if (idx > 0) {
            final Intent intent = (Intent) args[idx];
            FQInfo dvd = KMovingPage.findPack(EWInputGraphics.getPkgName(intent), false);
            if (dvd != null) {
                EWInputGraphics.setComponent(intent, FQInfo.A.getPkgName(), null);
            }
        }
        return method.invoke(source, args);
    }

    @BVPurpleSpider("publishContentProviders")
    protected OArrowObserverObject _publishContentProviders(OArrowObserverObject source, Method method, OArrowObserverObject[] args) throws Throwable {
        return method.invoke(source, args);
    }

    @BVPurpleSpider("removeContentProvider")
    protected OArrowObserverObject _removeContentProvider(OArrowObserverObject source, Method method, OArrowObserverObject[] args) throws Throwable {
        return method.invoke(source, args);
    }

    private static final PMWShowComplete AttributionSource = PMWShowComplete.Get("android.content.AttributionSource");
    private static final PMWShowComplete AttributionSourceState = PMWShowComplete.Get("android.content.AttributionSourceState");
    private static final PBDMovability mAttributionSourceState = AttributionSource.getField("mAttributionSourceState");
    private static final PBDMovability _packageName = AttributionSourceState.getField("packageName");

    @BVPurpleSpider("getContentProvider")
    protected OArrowObserverObject _getContentProvider(OArrowObserverObject source, Method method, OArrowObserverObject[] args) throws Throwable {
        int idx = BLPreferenceOrderObject.index(args, String.class);
        if (idx >= 0 && null != KMovingPage.findPack((String) args[idx], false)) {
            args[idx] = A.getPkgName();
        }
        OArrowObserverObject result = method.invoke(source, args);
        new VAGoogleModity(result) {
            @Override
            protected OArrowObserverObject onInvoke(OArrowObserverObject source, Method method, OArrowObserverObject[] args) throws Throwable {
                if (AttributionSource.isNull()) {
                    if (args != null && args.length > 0) {
                        if (args[0] instanceof String) {
                            
                            if (null != KMovingPage.findPack((String) args[0], false)) {
                                args[0] = A.getPkgName();
                            }
                        }
                    }
                } else if (AttributionSource.isInstance(args[0])) {
                    _packageName.set(mAttributionSourceState.get(args[0], null), A.getPkgName());
                }
                if (QRowsAudio.DBG_LOG)
                    Log.e(QRowsAudio.TAG, "Activity.getContentProvider: " + KLibjcorePoker.dumpCall(method, args, null, true));
                return super.onInvoke(source, method, args);
            }
        };
        return result;
    }

    @BVPurpleSpider("registerReceiver")
    protected OArrowObserverObject _registerReceiver(OArrowObserverObject source, Method method, OArrowObserverObject[] args) throws Throwable {
        args[1] = FQInfo.A.getPkgName();
        return method.invoke(source, args);
    }

    @BVPurpleSpider("registerReceiverWithFeature")
    protected OArrowObserverObject _registerReceiverWithFeature(OArrowObserverObject source, Method method, OArrowObserverObject[] args) throws Throwable {
        args[1] = FQInfo.A.getPkgName();
        return method.invoke(source, args);
    }

    @BVPurpleSpider("startActivities")
    protected OArrowObserverObject _startActivities(OArrowObserverObject source, Method method, OArrowObserverObject[] args) throws Throwable {
        int idx = BLPreferenceOrderObject.index(args, Intent[].class);
        if (idx > 0) {
            final Intent[] intents = (Intent[]) args[idx];
            for (Intent intent : intents) {
                FQInfo dvd = KMovingPage.findPack(EWInputGraphics.getPkgName(intent), false);
                if (dvd != null) {
                    EWInputGraphics.setComponent(intent, FQInfo.A.getPkgName(), null);
                }
                final String action = intent.getAction();
                if (action != null && action.startsWith("android.settings.action.")) {
                    Uri data = intent.getData();
                    if (data != null && "package".equals(data.getScheme())) {
                        if (KMovingPage.findPack(data.getSchemeSpecificPart(), false) != null) {
                            intent.setData(Uri.parse("package:" + A.getPkgName()));
                        }
                    }
                }
            }
        }
        args[1] = A.getPkgName();
        return method.invoke(source, args);
    }

    @BVPurpleSpider("startActivity")
    protected OArrowObserverObject _startActivity(OArrowObserverObject source, Method method, OArrowObserverObject[] args) throws Throwable {
        int idx = BLPreferenceOrderObject.index(args, Intent.class);
        if (idx > 0) {
            final Intent intent = (Intent) args[idx];
            FQInfo dvd = KMovingPage.findPack(EWInputGraphics.getPkgName(intent), false);
            if (dvd != null) {
                EWInputGraphics.setComponent(intent, FQInfo.A.getPkgName(), null);
            }
            final String action = intent.getAction();
            if (action != null && action.startsWith("android.settings.action.")) {
                Uri data = intent.getData();
                if (data != null && "package".equals(data.getScheme())) {
                    if (KMovingPage.findPack(data.getSchemeSpecificPart(), false) != null) {
                        intent.setData(Uri.parse("package:" + A.getPkgName()));
                    }
                }
            }
        }
        args[1] = A.getPkgName();
        return method.invoke(source, args);
    }

    @BVPurpleSpider("startService")
    protected OArrowObserverObject _startService(OArrowObserverObject source, Method method, OArrowObserverObject[] args) throws Throwable {
        int idx = BLPreferenceOrderObject.index(args, Intent.class);
        int idxPkg = BLPreferenceOrderObject.lastIndex(args, String.class);
        if (idx >= 0) {
            Intent intent = (Intent) args[idx];
            FQInfo dvd = KMovingPage.findPack(EWInputGraphics.getPkgName(intent), false);
            if (dvd != null) {
                EWInputGraphics.setComponent(intent, FQInfo.A.getPkgName(), null);
            }
        }
        if (idxPkg >= 0) {
            args[idxPkg] = A.getPkgName();
        }
        return method.invoke(source, args);
    }

    @BVPurpleSpider("bindService")
    protected OArrowObserverObject _bindService(OArrowObserverObject source, Method method, OArrowObserverObject[] args) throws Throwable {
        int idx = BLPreferenceOrderObject.lastIndex(args, String.class);
        if (idx >= 0 && null != KMovingPage.findPack((String) args[idx], false)) {
            args[idx] = A.getPkgName();
        }
        String pkgTarget = null;
        if (0 <= (idx = BLPreferenceOrderObject.index(args, Intent.class))) {
            Intent intent = (Intent) args[idx];
            pkgTarget = EWInputGraphics.getPkgName(intent);
            if (null != KMovingPage.findPack(pkgTarget, false)) {
                EWInputGraphics.setComponent(intent, FQInfo.A.getPkgName(), null);
            }
        }
        IEWifi.matchConnections(args);
        return method.invoke(source, args);
    }
	
	
    @BVPurpleSpider("bindServiceInstance")
    protected OArrowObserverObject _bindServiceInstance(OArrowObserverObject source, Method method, OArrowObserverObject[] args) throws Throwable {
        return _bindService(source, method, args);
    }

    @BVPurpleSpider("publishService")
    protected OArrowObserverObject _publishService(OArrowObserverObject source, Method method, OArrowObserverObject[] args) throws Throwable {
        return super.onInvoke(source, method, args);
    }

    @BVPurpleSpider("setServiceForeground")
    protected OArrowObserverObject _setServiceForeground(OArrowObserverObject source, Method method, OArrowObserverObject[] args) throws Throwable {
        final int app_icon = R.mipmap.libgtcore_intent_freecell;
        int idx = BLPreferenceOrderObject.index(args, ComponentName.class);
        if (idx >= 0) {
            ComponentName cn = (ComponentName) args[idx];
            FQInfo pack = KMovingPage.findPack(cn.getPackageName(), false);
            if (pack != null) {
                args[idx] = new ComponentName(A.getPkgName(), cn.getClassName());
                if (0 <= (idx = BLPreferenceOrderObject.index(args, Notification.class))) {
                    SWithLightbulb.changeNotification(pack, (Notification) args[idx]);
                }

            }
        }
        return super.onInvoke(source, method, args);
    }

    @BVPurpleSpider("bindIsolatedService")
    protected OArrowObserverObject _bindIsolatedService(OArrowObserverObject source, Method method, OArrowObserverObject[] args) throws Throwable {
        return _bindService(source, method, args);
    }

    @BVPurpleSpider("getIntentSenderWithFeature")
    protected OArrowObserverObject _getIntentSenderWithFeature(OArrowObserverObject source, Method method, OArrowObserverObject[] args) throws Throwable {
        return _getIntentSender(source, method, args);
    }

    @BVPurpleSpider("getIntentSenderWithSourceToken")
    protected OArrowObserverObject _getIntentSenderWithSourceToken(OArrowObserverObject source, Method method, OArrowObserverObject[] args) throws Throwable {
        return _getIntentSender(source, method, args);
    }

    @BVPurpleSpider("getIntentSender")
    protected OArrowObserverObject _getIntentSender(OArrowObserverObject source, Method method, OArrowObserverObject[] args) throws Throwable {
        int pkgIdx = BLPreferenceOrderObject.index(args, String.class);
        int intIdx = BLPreferenceOrderObject.index(args, Intent[].class);
        if (pkgIdx >= 0) {
            args[pkgIdx] = A.getPkgName();
        }
        if (intIdx > 0) {
            Intent[] intents = (Intent[]) args[intIdx];
            for (Intent intent : intents) {
                FQInfo dvd = KMovingPage.findPack(EWInputGraphics.getPkgName(intent), false);
                if (dvd != null) {
                    EWInputGraphics.setComponent(intent, FQInfo.A.getPkgName(), null);
                }
            }
        }

        return method.invoke(source, args);
    }


    @BVPurpleSpider("getTaskForActivity")
    protected OArrowObserverObject _getTaskForActivity(OArrowObserverObject source, Method method, OArrowObserverObject[] args) throws Throwable {
        return 1;
    }
}
