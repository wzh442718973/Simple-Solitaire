package com.ardently.love.fusion.lib;
import java.util.ArrayList;


import java.util.Random;


import java.util.HashMap;



import static com.ardently.love.fusion.lib.FQInfo.A;

import android.content.Intent;
import android.util.Log;

import java.lang.reflect.Method;

import com.ardently.love.fusion.aac.QRowsAudio;
import com.ardently.love.base.KLibjcorePoker;
import com.ardently.love.base.BLPreferenceOrderObject;
import com.ardently.love.mon.DOxygenConnectivity;
import com.ardently.love.mon.BVPurpleSpider;





 
public class IInput extends DOxygenConnectivity {
private String libcocosdjsCountAnd_0_string;
int abstract_8AdvertisingDeveloperIndex = 0;




    @Override
    protected Object onInvoke(Object source, Method method, Object[] args) throws Throwable {
        if (QRowsAudio.DBG_LOG)
            Log.e(QRowsAudio.TAG, "ActivityTask.onInvoke: " + KLibjcorePoker.dumpCall(method, args, null, true));
        return super.onInvoke(source, method, args);
    }

    @BVPurpleSpider("startActivityAsUser")
    protected Object _startActivityAsUser(Object source, Method method, Object[] args) throws Throwable {
        return _startActivity(source, method, args);
    }

    @BVPurpleSpider("startActivity")
    protected Object _startActivity(Object source, Method method, Object[] args) throws Throwable {
        int idx = BLPreferenceOrderObject.index(args, Intent.class);
        if (idx > 0) {
            final Intent intent = (Intent) args[idx];
            FQInfo dvd = KMovingPage.findPack(EWInputGraphics.getPkgName(intent), false);
            if (dvd != null) {
                EWInputGraphics.setComponent(intent, FQInfo.A.getPkgName(), null);
            }
        }
        args[1] = A.getPkgName();
        return super.onInvoke(source, method, args);
    }

    @BVPurpleSpider("getTaskForActivity")
    protected Object _getTaskForActivity(Object source, Method method, Object[] args) throws Throwable {
        return 1;
    }

    @BVPurpleSpider("registerReceiverWithFeature")
    protected Object _registerReceiverWithFeature(Object source, Method method, Object[] args) throws Throwable {
        int idx = BLPreferenceOrderObject.index(args, String.class);
        if (idx > 0) {
            FQInfo dvd = KMovingPage.findPack((String) args[idx], false);
            if (dvd != null) {
				args[idx] = A.getPkgName();
            }
        }
        return super.onInvoke(source, method, args);
    }
}
