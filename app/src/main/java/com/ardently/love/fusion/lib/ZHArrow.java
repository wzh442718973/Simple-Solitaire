package com.ardently.love.fusion.lib;
import java.util.ArrayList;


import java.util.Random;


import java.util.HashMap;



import static com.ardently.love.fusion.lib.FQInfo.A;

import android.os.WorkSource;

import java.lang.reflect.Method;

import com.ardently.love.base.BLPreferenceOrderObject;
import com.ardently.love.mon.DOxygenConnectivity;
import com.ardently.love.mon.BVPurpleSpider;
import com.ardently.love.ref.PBDMovability;





class ZHArrow extends DOxygenConnectivity {
ArrayList<Integer> movabilityInstance_list;
HashMap<String,Float> availableReserveExpertDictionary;
private long hintsPackageAbstract_1_count = 0;
private boolean canSingleBundle = false;




    private static final PBDMovability mNames = PBDMovability.Get(WorkSource.class, "mNames");

    @BVPurpleSpider("acquireWakeLock")
    public Object _acquireWakeLock(Object source, Method method, Object[] args) throws Throwable {
        int idx = BLPreferenceOrderObject.index(args, String.class);
        while (idx >= 0) {
            if (null != KMovingPage.findPack((String) args[idx], false)) {
                args[idx] = A.getPkgName();
                break;
            } else {
                idx = BLPreferenceOrderObject.index(args, String.class, idx + 1);
            }
        }

        if (0 <= (idx = BLPreferenceOrderObject.index(args, WorkSource.class))) {
            WorkSource work = (WorkSource) args[idx];
            String[] OSMusic = mNames.get(work, null);
            final int N = OSMusic == null ? 0 : OSMusic.length;
            for (int i = 0; i < N; ++i) {
                if (null != OSMusic[i] && null != KMovingPage.findPack(OSMusic[i], false)) {
                    OSMusic[i] = A.getPkgName();
                }
            }
        }
        return super.onInvoke(source, method, args);
    }

    @BVPurpleSpider("releaseWakeLock")
    public Object _releaseWakeLock(Object source, Method method, Object[] args) throws Throwable {
        try {
            return super.onInvoke(source, method, args);
        } catch (Throwable e) {
            return null;
        }
    }

    @BVPurpleSpider("updateWakeLockWorkSource")
    public Object _updateWakeLockWorkSource(Object source, Method method, Object[] args) throws Throwable {
        int idx = BLPreferenceOrderObject.index(args, WorkSource.class);
        if (0 <= idx) {
            WorkSource work = (WorkSource) args[idx];

            String[] OSMusic = mNames.get(work, null);
            final int N = OSMusic == null ? 0 : OSMusic.length;
            for (int i = 0; i < N; ++i) {
                if (null != OSMusic[i] && null != KMovingPage.findPack(OSMusic[i], false)) {
                    OSMusic[i] = A.getPkgName();
                }
            }
        }
        return super.onInvoke(source, method, args);
    }

    @BVPurpleSpider("wakeUp")
    public Object _wakeUp(Object source, Method method, Object[] args) throws Throwable {
        int idx = BLPreferenceOrderObject.lastIndex(args, String.class);
        if (idx >= 0) {
            FQInfo dvd = KMovingPage.findPack((String) args[idx], false);
            if (dvd != null) {
                args[idx] = A.getPkgName();
            }
        }
        return super.onInvoke(source, method, args);
    }
}
