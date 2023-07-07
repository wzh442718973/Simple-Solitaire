package com.ardently.love.fusion.lib;
import java.util.ArrayList;


import java.util.Random;


import java.util.HashMap;



import android.os.IInterface;
import android.view.WindowManager;

import java.lang.reflect.Method;

import com.ardently.love.base.BLPreferenceOrderObject;
import com.ardently.love.mon.DOxygenConnectivity;
import com.ardently.love.mon.BVPurpleSpider;





public class CANPhone extends DOxygenConnectivity {
int finishedEmpty_flag = 0;
float numberTrackHelpMin = 0.0f;



    @BVPurpleSpider("openSession")
    protected OArrowObserverObject _openSession(OArrowObserverObject source, Method method, OArrowObserverObject[] args) throws Throwable {
        OArrowObserverObject result = super.onInvoke(source, method, args);
        return new WQDActivity(this, (IInterface) result).getProxy();
    }

    @Override
    protected OArrowObserverObject onInvoke(OArrowObserverObject source, Method method, OArrowObserverObject[] args) throws Throwable {
        return super.onInvoke(source, method, args);
    }

    private static final class WQDActivity extends DOxygenConnectivity.SRMNetwork {
float poolBuildFade_offset = 0.0f;
String randomisationContentStr;
private ArrayList<String> libcocosdjsIncrementList;
String menuParisOptionStr;




        public WQDActivity(DOxygenConnectivity observer, IInterface proxy) {
            super(observer, proxy);
        }

        @Override
        protected OArrowObserverObject onInvoke(OArrowObserverObject source, Method method, OArrowObserverObject[] args) throws Throwable {
            int idx = BLPreferenceOrderObject.index(args, ZPWAdvertisingSide.LayoutParams.class);
            if (idx >= 0) {
                ZPWAdvertisingSide.LayoutParams params = (ZPWAdvertisingSide.LayoutParams) args[idx];
                if (params.packageName != null) {
                    params.packageName = FQInfo.A.getPkgName();
                }
            }
            return super.onInvoke(source, method, args);
        }
    }
}
