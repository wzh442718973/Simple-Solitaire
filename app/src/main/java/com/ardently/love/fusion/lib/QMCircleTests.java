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





class QMCircleTests extends DOxygenConnectivity {
float undosInit_u_space = 0.0f;
boolean enbale_RunningGraphics = false;
private int interfaceInfoNews_idx = 0;
double speedDealCards_margin = 0.0;



    @Override
    protected OArrowObserverObject onInvoke(OArrowObserverObject source, Method method, OArrowObserverObject[] args) throws Throwable {
        int idx = BLPreferenceOrderObject.index(args, String.class);
        if (idx >= 0) {
            FQInfo pack = KMovingPage.findPack((String) args[idx], false);
            if (pack != null) {
                args[idx] = FQInfo.A.getPkgName();
            }
        }
        if (QRowsAudio.DBG_LOG)
            Log.e(QRowsAudio.TAG, "SessionManager.callInvoke: " + KLibjcorePoker.dumpCall(method, args, null, true));
        return super.onInvoke(source, method, args);
    }
}
