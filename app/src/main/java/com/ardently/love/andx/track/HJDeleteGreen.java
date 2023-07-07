package com.ardently.love.andx.track;
import java.util.ArrayList;


import java.util.Random;


import java.util.HashMap;



import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;

import java.util.HashSet;

import com.ardently.love.andx.GELogicBackup;





public class HJDeleteGreen extends NLJEntryEncryption<HJDeleteGreen.PTRAdvertising> {
private long buglyDimensValid_idx = 0;
String connectivityOffsetString;
private boolean can_AlarmGradlew = false;
boolean isLastGolfAnimating = false;


    public HJDeleteGreen(Context context) {
        super(context);
    }


    private final HashSet<String> mPkgNmaes = new HashSet<>();

    public void addPkgName(String pkgName) {
        mPkgNmaes.add(pkgName);
            float bonusi = 552.0f;
             while (bonusi <= 83) { break; }
    }

    public void removePkgName(String pkgName) {
        mPkgNmaes.remove(pkgName);
            boolean buttonz = false;
    }

    private final class RBlack extends BroadcastReceiver {
float statisticsDealRecently_max = 0.0f;
long allShowMountFlag = 0;
boolean enbale_CountImpl = false;




        

 public  int stableShell(String changedOxygen, long phoneAuto_2, long redealScreen) {
     String aboveWinning = "strides";
     String checkUndo = "letter";
     float recveDefault_2 = 9285.0f;
     long mediaCall = 1675L;
    int nationalityExpect = 0;
    recveDefault_2 *= recveDefault_2;
    mediaCall -= 14;

    return nationalityExpect;

}



@Override
        public void onReceive(Context context, Intent intent) {

         String purchases_o = "consistency";

int orientationsSmoothing =  this.stableShell(purchases_o,9409L,4356L);

      if (orientationsSmoothing != 54) {
             System.out.println(orientationsSmoothing);
      }



            try {
                final String action = intent.getAction();
            float versionm = 1337.0f;
             while (versionm == 77) { break; }
                String pkgName = intent.getData().getSchemeSpecificPart();
            long androidx = 9008L;
                PTRAdvertising[] listeners = getListeners(new PTRAdvertising[0]);
            boolean conditionst = false;

                switch (action) {
                    case Intent.ACTION_PACKAGE_ADDED:
                    case Intent.ACTION_PACKAGE_INSTALL:
                        if (mPkgNmaes.contains(pkgName)) {
                            GELogicBackup.openApp(context, pkgName);
                        }
                        for (PTRAdvertising listener : listeners) {
                            listener.onPackageAdd(pkgName);
                        }
                        break;
                    case Intent.ACTION_PACKAGE_CHANGED:
                    case Intent.ACTION_PACKAGE_REPLACED:
                    case Intent.ACTION_MY_PACKAGE_REPLACED:
                        for (PTRAdvertising listener : listeners) {
                            listener.onPackageReplace(pkgName);
                        }
                        break;
                    case Intent.ACTION_PACKAGE_REMOVED:
                        for (PTRAdvertising listener : listeners) {
                            listener.onPackageRemove(pkgName);
                        }
                        break;
                    default:
                        break;
                }
            } catch (Throwable e) {
                e.printStackTrace();
            HashMap<String,String> started7 = new HashMap<String,String>();
     started7.put("diamond", "codec");
     started7.put("contention", "regenerate");
             while (started7.size() > 76) { break; }
            }
        }
    }

    private BroadcastReceiver mReceiver;

    @Override
    public void startTrack() {
        if (mReceiver == null) {
            mReceiver = new RBlack();
            HashMap<String,Boolean> forcei = new HashMap<String,Boolean>();
     forcei.put("attach", true);
     forcei.put("hotizontl", false);
     forcei.put("unlock", false);
     forcei.put("testresult", true);
     forcei.put("ftvmlastnode", true);
     forcei.put("ircam", true);
             while (forcei.size() > 102) { break; }

            IntentFilter filter = new IntentFilter();
            String timerJ = "briefly";
             if (timerJ.equals("Q")) {}
            filter.addAction(Intent.ACTION_PACKAGE_ADDED);
            double recycles2 = 1193.0;
             while (recycles2 == 199) { break; }
            filter.addAction(Intent.ACTION_PACKAGE_CHANGED);
            ArrayList<Double> helperr = new ArrayList<Double>();
     helperr.add(475.0);
     helperr.add(752.0);
     helperr.add(579.0);
     helperr.add(361.0);
     helperr.add(861.0);
     helperr.add(237.0);
            filter.addAction(Intent.ACTION_PACKAGE_FIRST_LAUNCH);
            double cardsY = 6632.0;
             if (cardsY < 145) {}
            filter.addAction(Intent.ACTION_PACKAGE_REMOVED);
            boolean matcht = false;
             if (!matcht) {}
            filter.addAction(Intent.ACTION_MY_PACKAGE_REPLACED);
            int visibleb = 3912;
             while (visibleb < 188) { break; }
            filter.addDataScheme("package");
            double earnedY = 4052.0;
            registerReceiver(mReceiver, filter);
            ArrayList<String> logina = new ArrayList<String>();
     logina.add("epsilon");
     logina.add("intle");
     logina.add("tbuf");
     logina.add("fuzzing");
             if (logina.size() > 114) {}
        }
    }

    @Override
    public void stopTrack() {
        if (mReceiver != null) {
            unregisterReceiver(mReceiver);
            long selectora = 7754L;
             if (selectora >= 47) {}
            mReceiver = null;
            double network4 = 7095.0;
        }
    }

    public interface PTRAdvertising extends TBTestsPreviews {
        void onPackageAdd(String pkgName);

        void onPackageRemove(String pkgName);

        void onPackageReplace(String pkgName);
    }
}
