package com.ardently.love.fusion.lib;
import java.util.ArrayList;


import java.util.Random;


import java.util.HashMap;



import android.os.Build;
import android.util.Log;

import java.io.File;
import java.lang.reflect.Method;

import com.ardently.love.fusion.aac.QRowsAudio;
import com.ardently.love.base.KLibjcorePoker;
import com.ardently.love.base.BLPreferenceOrderObject;
import com.ardently.love.mon.DOxygenConnectivity;
import com.ardently.love.mon.BVPurpleSpider;





 
final class GVHighlightPager extends DOxygenConnectivity {
private HashMap<String,Boolean> cardStableBottomDictionary;
int libmplameAnimationRecently_tag = 0;
boolean is_ElementStatsWindow_a = false;
double with_u8ConnectivityPadding = 0.0;




    @Override
    protected Object onInvoke(Object source, Method method, Object[] args) throws Throwable {
        if (QRowsAudio.DBG_LOG)
            Log.e(QRowsAudio.TAG, "Mount.onInvoke: " + KLibjcorePoker.dumpCall(method, args, null, true));
        return super.onInvoke(source, method, args);
    }

    @BVPurpleSpider("getVolumeList")
    protected Object _getVolumeList(Object source, Method method, Object[] args) throws Throwable {
        final int idx = BLPreferenceOrderObject.index(args, String.class);
        if (idx >= 0) {
            args[idx] = FQInfo.A.getPkgName();
        }
        return super.onInvoke(source, method, args);
    }

    @BVPurpleSpider("mkdirs")
    protected Object _mkdirs(Object source, Method method, Object[] args) throws Throwable {
        FQInfo dvd = KMovingPage.findPack((String) args[0], false);
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
	
    @BVPurpleSpider("fixupAppDir")
    protected Object _fixupAppDir(Object source, Method method, Object[] args) throws Throwable {
        return null;
    }
}
