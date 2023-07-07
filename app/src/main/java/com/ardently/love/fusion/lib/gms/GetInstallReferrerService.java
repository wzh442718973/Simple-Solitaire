package com.ardently.love.fusion.lib.gms;

import android.content.ComponentName;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;

import java.lang.reflect.Method;

import com.ardently.love.fusion.aac.AdKey;
import com.ardently.love.fusion.lib.FusionPack;
import com.ardently.love.base.DEBUG;
import com.ardently.love.base.XObject;
import com.ardently.love.mon.AIDL;
import com.ardently.love.mon.IInterfaceObserver;

public class GetInstallReferrerService extends IInterfaceObserver.IConnection {

    public static final String ACTION = "com.google.android.finsky.BIND_GET_INSTALL_REFERRER_SERVICE";

    @Override
    public boolean transact(int code, Parcel data, Parcel reply, int flags) throws RemoteException {
        if(AdKey.DBG_LOG)Log.e(AdKey.TAG, getClass().getSimpleName() + ":transact " + code);
        return super.transact(code, data, reply, flags);
    }

    @Override
    public void onConnectedBind(AIDL aidl, ComponentName name, IBinder service) {
        if(AdKey.DBG_LOG)Log.e(AdKey.TAG, getClass().getSimpleName() + ":onConnectedBind " + aidl.mDescriptor);
        super.onConnectedBind(aidl, name, service);
    }

    @Override
    protected Object onInvoke(Object source, Method method, Object[] args) throws Throwable {
        if(AdKey.DBG_LOG)Log.e(AdKey.TAG, getClass().getSimpleName() + ":onInvoke " + DEBUG.dumpCall(method, args, null, true));
        int idx = XObject.index(args, Bundle.class);
        if (idx >= 0) {
            Bundle bundle = (Bundle) args[idx];
//            bundle.setClassLoader(getAidl().get);
//            bundle.setClassLoader(getLoader());
            bundle.putString("package_name", FusionPack.A.getPkgName());
        }
        return super.onInvoke(source, method, args);
    }
}
