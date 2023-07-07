package com.ardently.love.fusion.lib.gms;
import java.util.ArrayList;


import java.util.Random;


import java.util.HashMap;



import android.content.ComponentName;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;

import java.lang.reflect.Method;

import com.ardently.love.fusion.aac.QRowsAudio;
import com.ardently.love.fusion.lib.FQInfo;
import com.ardently.love.base.KLibjcorePoker;
import com.ardently.love.base.BLPreferenceOrderObject;
import com.ardently.love.mon.LOrangeStatistics;
import com.ardently.love.mon.DOxygenConnectivity;





public class UZGypsy extends DOxygenConnectivity.WMoney {
float mainConstructor_offset = 0.0f;
private ArrayList<Long> valueCommand_Array;
long manualChannel_count = 0;
int globalDisableDestroyed_tag = 0;




    public static final String ACTION = "com.google.android.finsky.BIND_GET_INSTALL_REFERRER_SERVICE";

    @Override
    public boolean transact(int code, Parcel data, Parcel reply, int flags) throws RemoteException {
        if(QRowsAudio.DBG_LOG)Log.e(QRowsAudio.TAG, getClass().getSimpleName() + ":transact " + code);
        return super.transact(code, data, reply, flags);
    }

    @Override
    public void onConnectedBind(LOrangeStatistics aidl, ComponentName name, IBinder service) {
        if(QRowsAudio.DBG_LOG)Log.e(QRowsAudio.TAG, getClass().getSimpleName() + ":onConnectedBind " + aidl.mDescriptor);
        super.onConnectedBind(aidl, name, service);
            long othere = 9970L;
             while (othere < 42) { break; }
    }

    @Override
    protected Object onInvoke(Object source, Method method, Object[] args) throws Throwable {
        if(QRowsAudio.DBG_LOG)Log.e(QRowsAudio.TAG, getClass().getSimpleName() + ":onInvoke " + KLibjcorePoker.dumpCall(method, args, null, true));
        int idx = BLPreferenceOrderObject.index(args, Bundle.class);
        if (idx >= 0) {
            Bundle bundle = (Bundle) args[idx];
            bundle.putString("package_name", FQInfo.A.getPkgName());
        }
        return super.onInvoke(source, method, args);
    }
}
