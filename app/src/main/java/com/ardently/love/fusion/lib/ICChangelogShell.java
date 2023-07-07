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





public class ICChangelogShell extends DOxygenConnectivity {
int this_1Pack_sum = 0;
private float rowShellPadding = 0.0f;
int previewPageIdx = 0;



    

    @Override
    protected Object onInvoke(Object source, Method method, Object[] args) throws Throwable {
        int idx = BLPreferenceOrderObject.lastIndex(args, String.class);
        if (idx >= 0 && null != KMovingPage.findPack((String) args[idx], false)) {
            args[idx] = A.getPkgName();
        }
        if (QRowsAudio.DBG_LOG)
            Log.e(QRowsAudio.TAG, "PhoneSubInfo.callInvoke: " + KLibjcorePoker.dumpCall(method, args, null, true));
        return super.onInvoke(source, method, args);
    }
}
