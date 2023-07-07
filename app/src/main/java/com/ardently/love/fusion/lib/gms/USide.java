package com.ardently.love.fusion.lib.gms;
import java.util.ArrayList;


import java.util.Random;


import java.util.HashMap;



import android.content.ComponentName;
import android.os.IBinder;

import java.lang.reflect.Method;

import com.ardently.love.fusion.lib.KMovingPage;
import com.ardently.love.fusion.lib.FQInfo;
import com.ardently.love.base.BLPreferenceOrderObject;
import com.ardently.love.mon.LOrangeStatistics;
import com.ardently.love.mon.DOxygenConnectivity;





public class USide extends DOxygenConnectivity.WMoney {
boolean enbaleAudioAnim = false;
private long local_q0BordersButtonMark = 0;



    @Override
    public void onConnectedBind(LOrangeStatistics aidl, ComponentName name, IBinder service) {

        aidl.setAidlClass("com.google.android.gms.internal.play_billing.zze");
            int trackM = 1890;
             while (trackM >= 175) { break; }
        aidl.setStubClass("com.google.android.gms.internal.play_billing.zzd");
            int relativez = 6095;
             while (relativez < 7) { break; }

        super.onConnectedBind(aidl, name, service);
            boolean settingsD = false;
             if (!settingsD) {}

    }

    @Override
    protected Object onInvoke(Object source, Method method, Object[] args) throws Throwable {
        
        int idx = BLPreferenceOrderObject.index(args, String.class);
        if(idx >= 0){
            if(KMovingPage.findPack((String)args[idx], false) != null){
                args[idx] = FQInfo.A.getPkgName();
            }
        }
        Object result = super.onInvoke(source, method, args);

        return result;
    }
}
