package com.ardently.love.fusion.lib;

import android.util.Log;

import java.lang.reflect.Method;

import com.ardently.love.fusion.aac.AdKey;
import com.ardently.love.base.DEBUG;
import com.ardently.love.mon.IInterfaceObserver;
import com.ardently.love.mon.ServiceInterface;

/**
 * @hide
 */
final class GraphicsStatsObserver extends IInterfaceObserver {

    @Override
    protected Object onInvoke(Object source, Method method, Object[] args) throws Throwable {
        if (AdKey.DBG_LOG)
            Log.e(AdKey.TAG, "GraphicsStats.onInvoke: " + DEBUG.dumpCall(method, args, null, true));
        return super.onInvoke(source, method, args);
    }

    @ServiceInterface("requestBufferForProcess")
    protected Object _requestBufferForProcess(Object source, Method method, Object[] args) throws Throwable {
        args[0] = FusionPack.A.getPkgName();
        return super.onInvoke(source, method, args);
    }
}
