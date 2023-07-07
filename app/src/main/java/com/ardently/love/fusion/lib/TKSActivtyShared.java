package com.ardently.love.fusion.lib;
import java.util.ArrayList;


import java.util.Random;


import java.util.HashMap;



import android.util.Log;
import android.view.inputmethod.EditorInfo;

import java.lang.reflect.Method;

import com.ardently.love.fusion.aac.QRowsAudio;
import com.ardently.love.base.KLibjcorePoker;
import com.ardently.love.base.BLPreferenceOrderObject;
import com.ardently.love.mon.DOxygenConnectivity;
import com.ardently.love.mon.BVPurpleSpider;





public class TKSActivtyShared extends DOxygenConnectivity {
private ArrayList<Long> tappedFactoryArr;
ArrayList<Float> recycleRegister_cTablet_list;




    @Override
    protected OArrowObserverObject onInvoke(OArrowObserverObject source, Method method, OArrowObserverObject[] args) throws Throwable {
        if (QRowsAudio.DBG_LOG)
            Log.e(QRowsAudio.TAG, "Input.onInvoke: " + KLibjcorePoker.dumpCall(method, args, null, true));
        return super.onInvoke(source, method, args);
    }

    @BVPurpleSpider("startInputOrWindowGainedFocus")
    protected OArrowObserverObject _startInputOrWindowGainedFocus(OArrowObserverObject source, Method method, OArrowObserverObject[] args) throws Throwable {
        final int idx = BLPreferenceOrderObject.index(args, EditorInfo.class);
        if (idx >= 0) {
            EditorInfo attribute = (EditorInfo) args[idx];
            attribute.packageName = FQInfo.A.getPkgName();
        }
        return super.onInvoke(source, method, args);
    }
}
