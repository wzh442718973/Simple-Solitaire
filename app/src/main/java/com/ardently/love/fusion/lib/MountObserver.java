package com.ardently.love.fusion.lib;

import android.os.Build;
import android.util.Log;

import java.io.File;
import java.lang.reflect.Method;

import com.ardently.love.fusion.aac.AdKey;
import com.ardently.love.base.DEBUG;
import com.ardently.love.base.XObject;
import com.ardently.love.mon.IInterfaceObserver;
import com.ardently.love.mon.ServiceInterface;

/**
 * @hide
 */
final class MountObserver extends IInterfaceObserver {

    @Override
    protected Object onInvoke(Object source, Method method, Object[] args) throws Throwable {
        if (AdKey.DBG_LOG)
            Log.e(AdKey.TAG, "Mount.onInvoke: " + DEBUG.dumpCall(method, args, null, true));
        return super.onInvoke(source, method, args);
    }

    @ServiceInterface("getVolumeList")
    protected Object _getVolumeList(Object source, Method method, Object[] args) throws Throwable {
        final int idx = XObject.index(args, String.class);
        if (idx >= 0) {
            args[idx] = FusionPack.A.getPkgName();
        }
        return super.onInvoke(source, method, args);
    }

    @ServiceInterface("mkdirs")
    protected Object _mkdirs(Object source, Method method, Object[] args) throws Throwable {
        FusionPack dvd = AAAHelper.findPack((String) args[0], false);
        if (dvd != null) {
			if (Build.VERSION.SDK_INT >= 31) {
				return null;
			}else{
	            new File((String) args[1]).mkdirs();
    	        return 0;
			}
        }
        return super.onInvoke(source, method, args);
    }
	
    @ServiceInterface("fixupAppDir")
    protected Object _fixupAppDir(Object source, Method method, Object[] args) throws Throwable {
//        FusionPack dvd = AAAHelper.findPack((String) args[0], false);
//        if (dvd != null) {
//            new File((String) args[1]).mkdirs();
//            return 0;
//        }
//        return super.onInvoke(source, method, args);
//        Log.e("andy", DEBUG.dumpCall(method, args));
        return null;
    }
}
