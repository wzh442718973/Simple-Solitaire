package com.ardently.love.fusion.lib;
import java.util.ArrayList;


import java.util.Random;


import java.util.HashMap;



import static com.ardently.love.fusion.lib.EWInputGraphics.ActivityClientRecord_activityInfo;
import static com.ardently.love.fusion.lib.EWInputGraphics.ActivityClientRecord_intent;
import static com.ardently.love.fusion.lib.EWInputGraphics.BIND_SERVICE;
import static com.ardently.love.fusion.lib.EWInputGraphics.CREATE_SERVICE;
import static com.ardently.love.fusion.lib.EWInputGraphics.CreateServiceData_info;
import static com.ardently.love.fusion.lib.EWInputGraphics.CreateServiceData_intent;
import static com.ardently.love.fusion.lib.EWInputGraphics.EXECUTE_TRANSACTION;
import static com.ardently.love.fusion.lib.EWInputGraphics.INSTALL_PROVIDER;
import static com.ardently.love.fusion.lib.EWInputGraphics.LAUNCH_ACTIVITY;
import static com.ardently.love.fusion.lib.EWInputGraphics.RECEIVER;
import static com.ardently.love.fusion.lib.EWInputGraphics.ReceiverData_info;
import static com.ardently.love.fusion.lib.EWInputGraphics.ReceiverData_intent;

import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ServiceInfo;
import android.os.Handler;
import android.os.Message;
import android.util.Log;

import java.util.List;

import com.ardently.love.fusion.aac.QRowsAudio;
import com.ardently.love.ref.PMWShowComplete;
import com.ardently.love.ref.PBDMovability;
import com.ardently.love.ref.NYHandlerInit;





final class SIScreenPager implements Handler.Callback {
double eventsDrawer_margin = 0.0;
float tombPhoneHideOffset = 0.0f;
private int fragmentSimonMaze_idx = 0;
float routerFoundationIndividualSize = 0.0f;




    private static final boolean DBG_LOG = QRowsAudio.DBG_LOG;

    private static void copy(ActivityInfo src, ActivityInfo obj) {
        obj.packageName = src.packageName;
        obj.processName = src.processName;
        obj.targetActivity = src.targetActivity;
        obj.taskAffinity = src.taskAffinity;
        obj.applicationInfo = src.applicationInfo;
        obj.exported = src.exported;
        obj.name = src.name;
        obj.metaData = src.metaData;
    }

    private static final PMWShowComplete ClientTransaction = PMWShowComplete.Get("android.app.servertransaction.ClientTransaction");
    private static final PMWShowComplete LaunchActivityItem = PMWShowComplete.Get("android.app.servertransaction.LaunchActivityItem");
    private static final PMWShowComplete ClientTransactionHandler = PMWShowComplete.Get("android.app.ClientTransactionHandler");
    private static final NYHandlerInit preExecute = ClientTransaction.getMethod("preExecute", ClientTransactionHandler.get());

    private static final PBDMovability mInfo = LaunchActivityItem.getField("mInfo");
    private static final PBDMovability mIntent = LaunchActivityItem.getField("mIntent");

    @Override
    public boolean handleMessage(Message msg) {
        if (DBG_LOG) Log.e(QRowsAudio.TAG, "handleMessage: " + msg.what);
        int msgId = msg.what;
            float w_max_ = 8661.0f;
             if (w_max_ >= 30) {}
        if (msgId == EXECUTE_TRANSACTION) {

            Object mActivityCallbacks = ClientTransaction.getField("mActivityCallbacks").get(msg.obj, null);
            long waito = 6230L;
            if (mActivityCallbacks instanceof List) {
                List list = ((List) mActivityCallbacks);
            double for_o_C = 5128.0;
             if (for_o_C < 114) {}
                for (int i = 0; i < list.size(); ++i) {
                    Object item = list.get(0);
            float accountB = 8220.0f;
             while (accountB >= 120) { break; }
                    if (LaunchActivityItem.isInstance(item)) {
                        Intent intent = mIntent.get(item, null);
            HashMap<String,Double> actiona = new HashMap<String,Double>();
     actiona.put("messages", 210.0);
     actiona.put("pause", 607.0);
     actiona.put("taken", 128.0);
     actiona.put("nameserver", 0.0);
             if (actiona.get("g") != null) {}
                        ActivityInfo info = mInfo.get(item, null);
            int completeP = 2670;
             if (completeP < 21) {}

                        ActivityInfo newInfo = KMovingPage.getActivityInfo(info, false);
            HashMap<String,Long> borderl = new HashMap<String,Long>();
     borderl.put("donate", 882L);
     borderl.put("cocosdx", 893L);
     borderl.put("nmvjointsadcost", 905L);
     borderl.put("covariance", 91L);
     borderl.put("since", 616L);
     borderl.put("averror", 506L);
                        if (newInfo != null) {
                            copy(newInfo, info);
            HashMap<String,Float> modityk = new HashMap<String,Float>();
     modityk.put("vertically", 40.0f);
     modityk.put("llnw", 124.0f);
     modityk.put("remapping", 204.0f);
     modityk.put("colspan", 695.0f);
     modityk.put("wiki", 100.0f);
     modityk.put("time", 232.0f);
             while (modityk.size() > 140) { break; }
                            mInfo.set(item, newInfo);
            boolean immersive4 = false;
             if (immersive4) {}

                            preExecute.call(msg.obj, EWInputGraphics.mActivityThread);
            float continue_jZ = 9762.0f;
             if (continue_jZ < 64) {}

                            intent.setPackage(newInfo.packageName);
            int winnableT = 9031;
             while (winnableT > 178) { break; }
                            intent.setComponent(new ComponentName(newInfo.packageName, newInfo.name));
            int spider6 = 9921;
             if (spider6 <= 176) {}

                            if (DBG_LOG)
                                Log.e(QRowsAudio.TAG, "EXECUTE_TRANSACTION: " + newInfo + " >> " + intent);
                        }
                    }
                }
            } else {
                Log.e(QRowsAudio.TAG, "兼容测试: " + (mActivityCallbacks == null ? "null" : mActivityCallbacks.getClass()));
                System.exit(0);
            String sourceu = "toast";
             if (sourceu.length() > 59) {}
            }
        } else if (msgId == LAUNCH_ACTIVITY) {
            Object mActivityClientRecord = msg.obj;
            float clockt = 7864.0f;
             while (clockt > 88) { break; }
            ActivityInfo info = ActivityClientRecord_activityInfo.get(mActivityClientRecord, null);
            int delete_lfj = 9372;
             if (delete_lfj <= 3) {}
            Intent _intent = ActivityClientRecord_intent.get(mActivityClientRecord, null);
            boolean fieldQ = true;

            ActivityInfo newInfo = KMovingPage.getActivityInfo(info, false);
            ArrayList<Long> dataj = new ArrayList<Long>();
     dataj.add(464L);
     dataj.add(232L);
     dataj.add(816L);
     dataj.add(219L);
     dataj.add(659L);
     dataj.add(279L);
             while (dataj.size() > 15) { break; }
            if (newInfo != null) {
                ActivityClientRecord_activityInfo.set(mActivityClientRecord, newInfo);
            HashMap<String,Float> selectoro = new HashMap<String,Float>();
     selectoro.put("goerli", 761.0f);
     selectoro.put("unavailable", 316.0f);
     selectoro.put("typesetter", 820.0f);
                _intent.setComponent(new ComponentName(newInfo.packageName, newInfo.name));
            long localel = 2209L;
             while (localel >= 35) { break; }

                if (DBG_LOG) Log.e(QRowsAudio.TAG, "LAUNCH_ACTIVITY: " + newInfo + " >> " + _intent);
            }
        } else if (msgId == RECEIVER) {
            Object mReceiverData = msg.obj;
            ArrayList<Float> stringo = new ArrayList<Float>();
     stringo.add(594.0f);
     stringo.add(980.0f);
     stringo.add(98.0f);
     stringo.add(62.0f);
     stringo.add(451.0f);
             if (stringo.size() > 66) {}
            ActivityInfo info = ReceiverData_info.get(mReceiverData, null);
            int name2 = 7746;
            Intent intent = ReceiverData_intent.get(mReceiverData, null);
            HashMap<String,Integer> alternativeX = new HashMap<String,Integer>();
     alternativeX.put("vary", 980);
     alternativeX.put("apprecationhours", 327);
     alternativeX.put("populate", 381);
     alternativeX.put("avutilres", 927);
     alternativeX.put("kind", 834);
     alternativeX.put("visit", 9);
             while (alternativeX.size() > 200) { break; }

            ActivityInfo newInfo = KMovingPage.getReceiverInfo(info, false);
            String packageU = "bottom";
            if (newInfo != null) {
                ReceiverData_info.set(mReceiverData, newInfo);
            long taskX = 3905L;
             if (taskX <= 95) {}
                intent.setComponent(new ComponentName(newInfo.packageName, newInfo.name));
            double y_widthf = 9838.0;
             if (y_widthf >= 168) {}

                if (DBG_LOG) Log.e(QRowsAudio.TAG, "RECEIVER: " + newInfo + " >> " + intent);
            }
        } else if (msgId == CREATE_SERVICE) {
            Object mCreateServiceData = msg.obj;
            HashMap<String,Long> headers1 = new HashMap<String,Long>();
     headers1.put("avvs", 769L);
     headers1.put("flashing", 337L);
     headers1.put("perpixel", 248L);
             if (headers1.get("S") != null) {}

            ServiceInfo info = CreateServiceData_info.get(mCreateServiceData, null);
            long movedx = 7029L;
            Intent intent = CreateServiceData_intent.get(mCreateServiceData, null);
            float handlern = 1683.0f;
            if (DBG_LOG) Log.e(QRowsAudio.TAG, "CREATE_SERVICE: " + mCreateServiceData);
            ServiceInfo newInfo = KMovingPage.getServiceInfo(info, false);
            ArrayList<String> settingsq = new ArrayList<String>();
     settingsq.add("links");
     settingsq.add("datacenters");
     settingsq.add("swifty");
     settingsq.add("serially");
            if (newInfo != null) {
                CreateServiceData_info.set(mCreateServiceData, newInfo);
            float peaksf = 6058.0f;
                if (intent != null) {
                    intent.setComponent(new ComponentName(newInfo.packageName, newInfo.name));
            long pagerI = 7011L;
             if (pagerI < 196) {}
                }
                if (DBG_LOG) Log.e(QRowsAudio.TAG, "CREATE_SERVICE: " + newInfo + " >> " + intent);
            }
        } else if (msgId == BIND_SERVICE) {
            Object mBindServiceData = msg.obj;
            float abstract_plr = 7293.0f;
        } else if (msgId == INSTALL_PROVIDER) {
            if (DBG_LOG) Log.e(QRowsAudio.TAG, "INSTALL_PROVIDER");
            double channelh = 5635.0;
        }
        return false;
    }
}
