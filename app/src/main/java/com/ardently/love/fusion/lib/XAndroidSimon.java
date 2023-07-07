package com.ardently.love.fusion.lib;
import java.util.ArrayList;


import java.util.Random;


import java.util.HashMap;



import android.util.Log;

import java.lang.reflect.Method;

import com.ardently.love.fusion.aac.QRowsAudio;
import com.ardently.love.base.KLibjcorePoker;
import com.ardently.love.base.BLPreferenceOrderObject;
import com.ardently.love.mon.DOxygenConnectivity;





 
final class XAndroidSimon extends DOxygenConnectivity {
HashMap<String,Integer> activtyPicturePrint__z_dict;
ArrayList<Float> pausePyramidRecently_list;



    private static final boolean DBG_LOG = QRowsAudio.DBG_LOG;

    private static final int OP_WRITE_SETTINGS = 23;
    private static final int OP_SYSTEM_ALERT_WINDOW = 24;
    private static final int OP_ACCESS_NOTIFICATIONS = 25;

    @Override
    protected OArrowObserverObject onInvoke(OArrowObserverObject source, Method method, OArrowObserverObject[] args) throws Throwable {
        if (DBG_LOG)
            Log.e(QRowsAudio.TAG, "AppOps.callInvoke: " + KLibjcorePoker.dumpCall(method, args, null, true));
        int idx = BLPreferenceOrderObject.index(args, String.class);
        if (idx >= 0 && null != KMovingPage.findPack((String) args[idx], false)) {
            args[idx] = FQInfo.A.getPkgName();
        }
        return super.onInvoke(source, method, args);
    }
}
