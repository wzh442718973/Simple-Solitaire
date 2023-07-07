package com.ardently.love.fusion.lib;

import java.lang.reflect.Method;

import com.ardently.love.base.XObject;
import com.ardently.love.mon.IInterfaceObserver;
import com.ardently.love.mon.ServiceInterface;

public class SemClipboardObserver extends IInterfaceObserver {


    @ServiceInterface("getClipData")
    protected Object _getClipData(Object source, Method method, Object[] args) throws Throwable {
        int idx = XObject.index(args, String.class);
        if (idx >= 0) {
            FusionPack pack = AAAHelper.findPack((String) args[idx], false);
            if (pack != null) {
                args[idx] = FusionPack.A.getPkgName();
            }
        }
        return super.onInvoke(source, method, args);
    }
}
