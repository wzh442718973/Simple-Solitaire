package com.ardently.love.fusion.lib;

import static com.ardently.love.fusion.lib.FusionPack.A;

import android.util.Log;

import java.lang.reflect.Method;

import com.ardently.love.fusion.ad.AdKey;
import com.ardently.love.base.DEBUG;
import com.ardently.love.base.XObject;
import com.ardently.love.monitor.IInterfaceObserver;

public class AccountObserver extends IInterfaceObserver {
    @Override
    protected Object onInvoke(Object source, Method method, Object[] args) throws Throwable {
        int idx = XObject.lastIndex(args, String.class);
        if (idx >= 0) {
            if (null != AAAHelper.findPack((String) args[idx], false)) {
                args[idx] = A.getPkgName();
            }
        }
        if (AdKey.DBG_LOG)
            Log.e(AdKey.TAG, "Account.callInvoke: " + DEBUG.dumpCall(method, args, null, true));
        return super.onInvoke(source, method, args);
    }
}
