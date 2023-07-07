package com.ardently.love.fusion.lib;

import static com.ardently.love.fusion.lib.FusionPack.A;

import java.lang.reflect.Method;

import com.ardently.love.mon.IInterfaceObserver;
import com.ardently.love.mon.ServiceInterface;

public class AlarmObserver extends IInterfaceObserver {

    @ServiceInterface("set")
    protected Object _set(Object source, Method method, Object[] args) throws Throwable {
        if (args[0] instanceof String) {
            if (null != AAAHelper.findPack((String) args[0], false)) {
                args[0] = A.getPkgName();
            }
        }
        return super.onInvoke(source, method, args);
    }
}
