package com.ardently.love.fusion.lib;
import java.util.ArrayList;


import java.util.Random;


import java.util.HashMap;



import android.content.Intent;
import android.util.Log;

import java.lang.reflect.Method;

import com.ardently.love.fusion.aac.QRowsAudio;
import com.ardently.love.base.KLibjcorePoker;
import com.ardently.love.base.BLPreferenceOrderObject;
import com.ardently.love.mon.DOxygenConnectivity;





public class TYHint extends DOxygenConnectivity {
long belongsRedealHighlightIndex = 0;
float unloadSimple_size = 0.0f;



    @Override
    protected OArrowObserverObject onInvoke(OArrowObserverObject source, Method method, OArrowObserverObject[] args) throws Throwable {
        int idx = BLPreferenceOrderObject.index(args, Intent.class);
        if (idx >= 0) {
            final Intent intent = (Intent) args[idx];
            FQInfo dvd = KMovingPage.findPack(EWInputGraphics.getPkgName(intent), false);
            if (dvd != null) {
                EWInputGraphics.setComponent(intent, FQInfo.A.getPkgName(), null);
            }
        }
        if (QRowsAudio.DBG_LOG)
            Log.e(QRowsAudio.TAG, this.getName() + ".onInvoke: " + KLibjcorePoker.dumpCall(method, args, (OArrowObserverObject) null, true));
        return super.onInvoke(source, method, args);
    }
}
