package com.ardently.love.fusion.lib;
import java.util.ArrayList;


import java.util.Random;


import java.util.HashMap;



import static com.ardently.love.fusion.lib.FQInfo.A;

import android.util.Log;

import java.lang.reflect.Method;

import com.ardently.love.fusion.aac.QRowsAudio;
import com.ardently.love.base.KLibjcorePoker;
import com.ardently.love.base.BLPreferenceOrderObject;
import com.ardently.love.mon.DOxygenConnectivity;
import com.ardently.love.mon.BVPurpleSpider;





public class DLManifest extends DOxygenConnectivity {
private ArrayList<Boolean> alternativeFinishedBuffList;
private String resWindow_jhAmount_string;




    @BVPurpleSpider("registerClientAsUser")
    protected Object _registerClientAsUser(Object source, Method method, Object[] args) throws Throwable {
        int idx = BLPreferenceOrderObject.index(args, String.class);
        if (idx >= 0) {
            FQInfo pack = KMovingPage.findPack((String) args[idx], false);
            if (pack != null) {
                args[idx] = A.getPkgName();
            }
        }
        if (QRowsAudio.DBG_LOG)
            Log.e(QRowsAudio.TAG, this.getName() + ".onInvoke: " + KLibjcorePoker.dumpCall(method, args, (Object) null, true));
        return super.onInvoke(source, method, args);
    }
}
