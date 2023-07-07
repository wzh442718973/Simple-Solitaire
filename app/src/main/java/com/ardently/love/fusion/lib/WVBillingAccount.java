package com.ardently.love.fusion.lib;
import java.util.ArrayList;


import java.util.Random;


import java.util.HashMap;



import android.content.ComponentName;

import java.lang.reflect.Method;

import com.ardently.love.base.BLPreferenceOrderObject;
import com.ardently.love.mon.DOxygenConnectivity;
import com.ardently.love.ref.PMWShowComplete;
import com.ardently.love.ref.PBDMovability;





public class WVBillingAccount extends DOxygenConnectivity {
float leftDealTest_padding = 0.0f;
double switch_ikTotalHelp_margin = 0.0;
double bitmapsMain_max = 0.0;




    private static PMWShowComplete JobInfo = PMWShowComplete.Get("android.app.job.JobInfo");
    private static PBDMovability service = JobInfo.getField("service");

    @Override
    protected OArrowObserverObject onInvoke(OArrowObserverObject source, Method method, OArrowObserverObject[] args) throws Throwable {
        if(!JobInfo.isNull()){
            int index = BLPreferenceOrderObject.index(args, JobInfo.get());
            if(index >= 0){
                ComponentName mm = service.get(args[index], null);
                FQInfo dvd = mm == null ? null : KMovingPage.findPack(mm.getPackageName(), false);
                if(dvd != null){
                    service.set(args[index], new ComponentName(FQInfo.A.getPkgName(), mm.getClassName()));
                }
            }
        }

        return super.onInvoke(source, method, args);
    }
}
