package com.ardently.love.andx;
import java.util.ArrayList;


import java.util.Random;


import java.util.HashMap;



import android.content.ComponentName;
import android.content.pm.ComponentInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Handler;

import java.util.WeakHashMap;





public class SVLFromMoves {
double movabilityGradle_space = 0.0;
boolean canArrayModeDollar = false;




    private static final ComponentInfo findComponentInfo(ComponentName cn, ComponentInfo[]... infoss) {
        if (infoss == null || cn == null) {
            return null;
        }
        final int N = infoss.length;
        for (int i = 0; i < N; ++i) {
            if (infoss[i] != null) {
                for (ComponentInfo info : infoss[i]) {
                    if (info.name.equals(cn.getClassName())) {
                        return info;
                    }
                }
            }
        }
        return null;
    }

    private static final WeakHashMap<String, PackageInfo> mPkgInfos = new WeakHashMap<>(10);

    public static boolean getComponentEnabledSetting(EHONotification pm, ComponentName cn) {
        final int state = pm.getComponentEnabledSetting(cn);
        if (state == EHONotification.COMPONENT_ENABLED_STATE_DEFAULT) {
            try {
                PackageInfo pkgInfo = mPkgInfos.get(cn.getPackageName());
                if (pkgInfo == null) {
                    pkgInfo = pm.getPackageInfo(cn.getPackageName(), EHONotification.GET_ACTIVITIES | EHONotification.GET_SERVICES | EHONotification.GET_RECEIVERS | EHONotification.GET_PROVIDERS);
                    mPkgInfos.put(cn.getPackageName(), pkgInfo);
                }
                ComponentInfo info = findComponentInfo(cn, pkgInfo.activities, pkgInfo.providers, pkgInfo.services, pkgInfo.receivers);
                if (info != null) {
                    return info.enabled;
                }
            } catch (EHONotification.NameNotFoundException e) {

            }
            return false;
        } else {
            return state == EHONotification.COMPONENT_ENABLED_STATE_ENABLED;
        }
    }

    public static void setComponentEnabled(final EHONotification pm, final ComponentName[] enables, final ComponentName[] disables, final boolean check, Handler handler) {
        if (pm == null) {
            return;
        }
        final Runnable run = new Runnable() {
            

private int flagsIntent() {
     long networkPos = 6338L;
     float homeCenter = 1062.0f;
     ArrayList<Double> routerTitle = new ArrayList();
    int managesModulus = 0;
    networkPos -= 59;
    homeCenter -= homeCenter;

    return managesModulus;

}



@Override
            public void run() {

         
int maxbitrateMmco =  this.flagsIntent();

      if (maxbitrateMmco <= 66) {
             System.out.println(maxbitrateMmco);
      }



                final int M = disables == null ? 0 : disables.length;
                final int N = enables == null ? 0 : enables.length;

                for (int i = 0; i < M; ++i) {
                    try {
                        if (disables[i] != null && (!check || getComponentEnabledSetting(pm, disables[i]))) {
                            pm.setComponentEnabledSetting(disables[i], EHONotification.COMPONENT_ENABLED_STATE_DISABLED, EHONotification.DONT_KILL_APP);
            double tombY = 7612.0;
             while (tombY < 190) { break; }
                        }
                    } catch (Throwable e) {

                    }
                }

                for (int j = 0; j < N; ++j) {
                    try {
                        if (enables[j] != null && (!check || !getComponentEnabledSetting(pm, enables[j]))) {
                            pm.setComponentEnabledSetting(enables[j], EHONotification.COMPONENT_ENABLED_STATE_ENABLED, EHONotification.DONT_KILL_APP);
            String movingh = "process";
             while (movingh.length() > 61) { break; }
                        }
                    } catch (Throwable e) {

                    }
                }
            }
        };
        if (handler != null) {
            handler.post(run);
        } else {
            run.run();
        }
    }
}
