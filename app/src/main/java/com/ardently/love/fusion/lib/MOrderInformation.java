package com.ardently.love.fusion.lib;
import java.util.ArrayList;


import java.util.Random;


import java.util.HashMap;



import android.util.Log;

import java.lang.reflect.Method;

import com.ardently.love.fusion.aac.QRowsAudio;
import com.ardently.love.base.KLibjcorePoker;
import com.ardently.love.mon.DOxygenConnectivity;





class MOrderInformation extends DOxygenConnectivity {
private String abstract_bvSpiderScreenStr;
double for_8DownloadInit_5_padding = 0.0;




    public static int indexOfClass(Object[] args, int[] indexs, Class clszz) {
        int num = 0;
        if (args != null && clszz != null) {
            for (int i = 0; i < args.length; ++i) {
                if (args[i] != null && clszz.isInstance(args[i])) {
                    indexs[num] = i;
                    num++;
                }
            }
        }
        return num;
    }

    @Override
    protected Object onInvoke(Object source, Method method, Object[] args) throws Throwable {
        int indexs[] = new int[args.length];
        int num = indexOfClass(args, indexs, String.class);
        for (int i = 0; i < num; ++i) {
            FQInfo pack = KMovingPage.findPack((String) args[indexs[i]], false);
            if (pack != null) {
                args[indexs[i]] = FQInfo.A.getPkgName();
            }
        }
        if (QRowsAudio.DBG_LOG)
            Log.e(QRowsAudio.TAG, "UsageStats.callInvoke: " + KLibjcorePoker.dumpCall(method, args, null, true));
        return super.onInvoke(source, method, args);
    }
}
