package com.ardently.love.fusion.lib;

import android.content.ComponentName;
import android.util.Log;

import java.lang.reflect.Method;

import com.ardently.love.fusion.ad.AdKey;
import com.ardently.love.base.DEBUG;
import com.ardently.love.base.XObject;
import com.ardently.love.monitor.IInterfaceObserver;
import com.ardently.love.monitor.ServiceInterface;

public class AutofillObserver extends IInterfaceObserver {

    @ServiceInterface("isServiceEnabled")
    public Object _isServiceEnabled(Object source, Method method, Object[] args) throws Throwable {
        args[1] = FusionPack.A.getPkgName();
        return super.onInvoke(source, method, args);
    }

    @Override
    protected Object onInvoke(Object source, Method method, Object[] args) throws Throwable {
        int idx = XObject.index(args, ComponentName.class);
        if (idx >= 0) {
            ComponentName cn = (ComponentName) args[idx];
            FusionPack pack = AAAHelper.findPack(cn.getPackageName(), false);
            if (pack != null) {
                args[idx] = new ComponentName(FusionPack.A.getPkgName(), cn.getClassName());
            }
        }
        if (AdKey.DBG_LOG)
            Log.e(AdKey.TAG, "Autofill.callInvoke: " + DEBUG.dumpCall(method, args, null, true));
        return super.onInvoke(source, method, args);
    }
}
