package com.ardently.love.fusion.lib;
import java.util.ArrayList;


import java.util.Random;


import java.util.HashMap;



import static com.ardently.love.fusion.lib.FQInfo.A;

import java.lang.reflect.Method;

import com.ardently.love.mon.DOxygenConnectivity;
import com.ardently.love.mon.BVPurpleSpider;





public class RWDrawerMode extends DOxygenConnectivity {
private boolean enbale_RectComplete = false;
String splashCategory_hdGapsStr;
private float betWifiMargin = 0.0f;




    @BVPurpleSpider("set")
    protected Object _set(Object source, Method method, Object[] args) throws Throwable {
        if (args[0] instanceof String) {
            if (null != KMovingPage.findPack((String) args[0], false)) {
                args[0] = A.getPkgName();
            }
        }
        return super.onInvoke(source, method, args);
    }
}
