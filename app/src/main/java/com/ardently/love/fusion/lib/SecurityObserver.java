package com.ardently.love.fusion.lib;

import android.content.Intent;
import android.util.Log;

import java.lang.reflect.Method;

import com.ardently.love.fusion.aac.AdKey;
import com.ardently.love.base.DEBUG;
import com.ardently.love.base.XObject;
import com.ardently.love.mon.IInterfaceObserver;

public class SecurityObserver extends IInterfaceObserver {
    @Override
    protected Object onInvoke(Object source, Method method, Object[] args) throws Throwable {
        int idx = XObject.index(args, Intent.class);
        if (idx >= 0) {
            final Intent intent = (Intent) args[idx];
            FusionPack dvd = AAAHelper.findPack(Android.getPkgName(intent), false);
            if (dvd != null) {
                Android.setComponent(intent, FusionPack.A.getPkgName(), null);
            }
        }
        if (AdKey.DBG_LOG)
            Log.e(AdKey.TAG, this.getName() + ".onInvoke: " + DEBUG.dumpCall(method, args, (Object) null, true));
        return super.onInvoke(source, method, args);
    }
}
