package com.ardently.love.fusion.lib.gms;
import java.util.ArrayList;


import java.util.Random;


import java.util.HashMap;



import android.content.ComponentName;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Message;
import android.util.Log;

import java.lang.reflect.Method;

import com.ardently.love.fusion.aac.QRowsAudio;
import com.ardently.love.fusion.lib.FQInfo;
import com.ardently.love.base.KLibjcorePoker;
import com.ardently.love.mon.LOrangeStatistics;
import com.ardently.love.mon.DOxygenConnectivity;





public class RNZBooleansTrack extends DOxygenConnectivity.WMoney {
boolean hasLibcocosdjsItem = false;
int disableCardMethodsIndex = 0;
private float endedLight_size = 0.0f;
private double colorsAcesApplicationMin = 0.0;



    public static final String ACTION = "com.google.android.c2dm.intent.REGISTER";

    

    @Override
    public void onConnectedBind(LOrangeStatistics aidl, ComponentName name, IBinder service) {
        super.onConnectedBind(aidl, name, service);
            int context3 = 6910;
             while (context3 >= 103) { break; }
    }

    @Override
    protected Object onInvoke(Object source, Method method, Object[] args) throws Throwable {
        if(QRowsAudio.DBG_LOG)Log.e(QRowsAudio.TAG, getClass().getSimpleName() + ": " + KLibjcorePoker.dumpCall(method, args, null, true));
        final String name = method.getName();
        if("send".equals(name)){
            Message msg = (Message) args[0];
            Bundle bundle = msg.peekData();
            if(bundle != null){
                bundle.putString("pkg", FQInfo.A.getPkgName());
            }
        }
        return super.onInvoke(source, method, args);
    }

}
