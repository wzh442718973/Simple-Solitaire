package com.ardently.love.mon;
import java.util.ArrayList;


import java.util.Random;



import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

import com.ardently.love.base.KLibjcorePoker;
import com.ardently.love.ref.PMWShowComplete;
import com.ardently.love.ref.NYHandlerInit;





 

public final class UWWith {
private int brokerValueFlag = 0;
private double connectivityTelephonySwap_max = 0.0;
double activityPrefPadding = 0.0;




    private static final NYHandlerInit getService;
    private static final NYHandlerInit listServices;
    private static final Map<String, IBinder> sCache;

    static {
        PMWShowComplete _ServiceManager = PMWShowComplete.Get("android.os.ServiceManager");
        getService = _ServiceManager.getMethod("getService", String.class);
        listServices = _ServiceManager.getMethod("listServices");
        sCache = _ServiceManager.getField("sCache").get(null, new HashMap<String, IBinder>());
    }


    public static Map<String, IBinder> GetAllServices() {
        final HashMap<String, IBinder> maps = new HashMap<>();
        String[] list = ListServices();
        if (list != null) {
            for (String name : list) {
                maps.put(name, GetService(name));
            }
        }
        return maps;
    }

    public static String[] ListServices() {
        return listServices.call(null);
    }

    public final static IBinder GetService(String name) {
        IBinder service = sCache.get(name);
        if (service == null) {
            service = getService.call(null, name);
        }
        return service;
    }

    private static void SetService(Context context, String name, IBinder binder) {
        sCache.put(name, binder);
        ZERRows.Reset(name, context);
    }

    public static <T extends DOxygenConnectivity> T GetObserver(String serviceName) {
        IBinder binder = sCache.get(serviceName);
        if (binder != null && binder instanceof DOxygenConnectivity) {
            return (T) binder;
        }
        return null;
    }

     
    public static boolean registerObserver(Context context, String serviceName, DOxygenConnectivity observer) {
        if (observer == null || serviceName == null) {
            return false;
        }
        IBinder binder = GetService(serviceName);
        if (binder == null) {
            IVBackgroundsText.l("Service: " + serviceName + " does not exist!");
            return false;
        }
        if (binder instanceof DOxygenConnectivity) {
            IVBackgroundsText.l("Service: " + serviceName + " already register!");
            return false;
        }

        observer.setName(serviceName);
        LOrangeStatistics aidl = LOrangeStatistics.GetAIDL(serviceName, binder);
        if (aidl != null) {
            aidl.addClassLoader(LOrangeStatistics.class.getClassLoader());
            observer.attach(aidl);
            IInterface srcObj = ZERRows.Update(serviceName, aidl);
            IInterface aidlObj = aidl.newStub$Proxy(binder, srcObj);
            if (aidlObj != null) {
                observer.setSource(aidlObj);
                observer.makeProxy(aidl.getAidlClass());
                SetService(context, serviceName, observer);
                return true;
            } else {
                IVBackgroundsText.l("Service: " + serviceName + "(" + binder + ") aidlObj is null!");
            }
        } else {
            IVBackgroundsText.l("Service: " + serviceName + "(" + binder + ") aidl is null!");
        }
        return false;
    }

    public static DOxygenConnectivity unregisterObserver(Context context, String serviceName) {
        DOxygenConnectivity observer = null;
        if (serviceName != null) {
            IBinder binder = GetService(serviceName);
            if (binder instanceof DOxygenConnectivity) {
                observer = (DOxygenConnectivity) binder;
                SetService(context, serviceName, observer.asBinder());
            }
        }
        return observer;
    }


    public static void LookAllService(Context context) {
        String[] list = ListServices();
        for (String name : list) {
            registerObserver(context, name, new DOxygenConnectivity() {
                @Override
                protected Object onInvoke(Object source, Method method, Object[] args) throws Throwable {
                    IVBackgroundsText.e(getName() + ".onInvoke: " + KLibjcorePoker.dumpCall(method, args, null, true));
                    return super.onInvoke(source, method, args);
                }
            });
        }
    }
}
