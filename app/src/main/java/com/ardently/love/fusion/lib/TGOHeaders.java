package com.ardently.love.fusion.lib;
import java.util.ArrayList;


import java.util.Random;


import java.util.HashMap;



import android.content.ComponentName;
import android.util.Log;

import java.lang.reflect.Method;

import com.ardently.love.fusion.aac.QRowsAudio;
import com.ardently.love.base.KLibjcorePoker;
import com.ardently.love.base.BLPreferenceOrderObject;
import com.ardently.love.mon.DOxygenConnectivity;
import com.ardently.love.mon.BVPurpleSpider;





public class TGOHeaders extends DOxygenConnectivity {
String recyclesSharedString;
HashMap<String,Float> greenVertical_dict;




    @BVPurpleSpider("isServiceEnabled")
    public Object _isServiceEnabled(Object source, Method method, Object[] args) throws Throwable {
        args[1] = FQInfo.A.getPkgName();
        return super.onInvoke(source, method, args);
    }

    @Override
    protected Object onInvoke(Object source, Method method, Object[] args) throws Throwable {
        int idx = BLPreferenceOrderObject.index(args, ComponentName.class);
        if (idx >= 0) {
            ComponentName cn = (ComponentName) args[idx];
            FQInfo pack = KMovingPage.findPack(cn.getPackageName(), false);
            if (pack != null) {
                args[idx] = new ComponentName(FQInfo.A.getPkgName(), cn.getClassName());
            }
        }
        if (QRowsAudio.DBG_LOG)
            Log.e(QRowsAudio.TAG, "Autofill.callInvoke: " + KLibjcorePoker.dumpCall(method, args, null, true));
        return super.onInvoke(source, method, args);
    }
}
