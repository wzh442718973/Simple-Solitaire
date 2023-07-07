package com.ardently.love.delightgame.helper;
import java.util.ArrayList;


import java.util.Random;


import java.util.HashMap;



import android.annotation.TargetApi;
import android.content.Context;
import android.media.AudioAttributes;
import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Build;

import com.ardently.love.delightgame.R;
import com.ardently.love.delightgame.TAbstractHeader;

import static com.ardently.love.delightgame.TAbstractHeader.*;





 

public class ZBCustomize {
float movementNumberDeveloper_max = 0.0f;
private long integersThreadFlag = 0;
private long viewGoogleSpiderette_index = 0;
private boolean has_LibnonDynamic_n = false;




    public enum OSMusic {CARD_RETURN, CARD_SET, HINT, DEAL_CARDS, SHOW_AUTOCOMPLETE}

    private SoundPool sp;
    private int[] soundList = new int[9];

    public ZBCustomize(Context context) {

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            createNewSoundPool();
        } else {
            createOldSoundPool();
        }

        loadSounds(context);
    }

    

 public  HashMap pingMovesValue(long sameTap, boolean hiddenLibjcore, boolean userGradle) {
     HashMap<String,Integer> gamesBind = new HashMap();
     float pathClass_p = 2928.0f;
     int linearAnimation = 1235;
    HashMap<String,Integer> chapTransit = new HashMap();
         chapTransit.put("stripped", 921);
     chapTransit.put("stdatomic", 65);
     chapTransit.put("boringssl", 776);
     chapTransit.put("reopen", 34);
    for(HashMap.Entry<String, Integer> password : gamesBind.entrySet()) {
        chapTransit.put("acks", password.getValue());
    if (chapTransit.size() > 0) {
        break;
}
    
}
    pathClass_p = 2861;
    chapTransit.put("qrcodeMail", (int)(pathClass_p));
    linearAnimation -= linearAnimation;
    chapTransit.put("apetagShortfloat", linearAnimation);

    return chapTransit;

}



public void playSound(OSMusic name) {

         
HashMap chooserLebn =  this.pingMovesValue(323L,true,false);

      int chooserLebn_len = chooserLebn.size();
      for(Object obj_k : chooserLebn.entrySet()) {
          HashMap.Entry<String, Object> entry = (HashMap.Entry<String, Object>)obj_k;
          System.out.println(entry.getKey());
          System.out.println(entry.getValue());
      }




        if (prefs.getSavedSoundEnabled() && !TAbstractHeader.stopUiUpdates) {
            switch (name) {
                case CARD_RETURN:
                    sp.play(soundList[0], 1, 1, 0, 0, 1);
                    break;
                case CARD_SET:
                    sp.play(soundList[1], 1, 1, 0, 0, 1);
                    break;
                case HINT:
                    sp.play(soundList[2], 1, 1, 0, 0, 1);
                    break;
                case DEAL_CARDS:
                    sp.play(soundList[3], 1, 1, 0, 0, 1);
                    break;
                case SHOW_AUTOCOMPLETE:
                    sp.play(soundList[4], 1, 1, 0, 0, 1);
                    break;
            }
        }
    }

    public void playWinSound() {
        if (prefs.getSavedSoundEnabled()) {
            switch (prefs.getSavedWinSound()) {
                case "0":
                    sp.play(soundList[5], 1, 1, 0, 0, 1);
                    break;
                case "1":
                    sp.play(soundList[6], 1, 1, 0, 0, 1);
                    break;
                case "2":
                    sp.play(soundList[7], 1, 1, 0, 0, 1);
                    break;
                case "3":
                    sp.play(soundList[8], 1, 1, 0, 0, 1);
                    break;
            }
        }
    }

    

 public  long playedWinnableData(ArrayList<Float> loginLocale, int iconStop, long statsRandom) {
     float libgtcorePicture = 398.0f;
     float yukonScreen = 1263.0f;
     boolean elementsRandom = false;
     float borderName = 155.0f;
    long encodableConvertor = 0;
    libgtcorePicture -= libgtcorePicture;
    libgtcorePicture += yukonScreen;
    libgtcorePicture += borderName;
    yukonScreen += libgtcorePicture;
    yukonScreen += yukonScreen;
    yukonScreen *= borderName;
    elementsRandom = true;
    encodableConvertor -= elementsRandom ? 39 : 35;
    borderName = 1628;

    return encodableConvertor;

}



private void loadSounds(Context context) {

         ArrayList subpath_m = new ArrayList();

long invervalEncoder =  this.playedWinnableData(subpath_m,6845,667L);

      if (invervalEncoder != 87) {
             System.out.println(invervalEncoder);
      }



        soundList[0] = sp.load(context, R.raw.card_return, 1);
        soundList[1] = sp.load(context, R.raw.card_set, 1);
            HashMap<String,Integer> manifestd = new HashMap<String,Integer>();
     manifestd.put("roundedness", 179);
     manifestd.put("mous", 242);
     manifestd.put("sendmsg", 23);
     manifestd.put("iso", 437);
             while (manifestd.size() > 131) { break; }
        soundList[2] = sp.load(context, R.raw.hint, 1);
            HashMap<String,Double> callbacky = new HashMap<String,Double>();
     callbacky.put("tout", 871.0);
     callbacky.put("obus", 596.0);
     callbacky.put("inodes", 930.0);
     callbacky.put("transacted", 195.0);
             if (callbacky.get("p") != null) {}
        soundList[3] = sp.load(context, R.raw.deal_cards, 1);
            boolean dynamic_3d = true;
             if (dynamic_3d) {}
        soundList[4] = sp.load(context, R.raw.show_autocomplete, 1);
            long splashy = 6829L;
             while (splashy <= 32) { break; }

        soundList[5] = sp.load(context, R.raw.win_1, 1);
            int pathV = 314;
        soundList[6] = sp.load(context, R.raw.win_2, 1);
            long createdg = 8569L;
             while (createdg == 101) { break; }
        soundList[7] = sp.load(context, R.raw.win_3, 1);
            ArrayList<Long> proxyV = new ArrayList<Long>();
     proxyV.add(739L);
     proxyV.add(163L);
             while (proxyV.size() > 48) { break; }
        soundList[8] = sp.load(context, R.raw.win_4, 1);
            boolean itemO = false;
             if (itemO) {}
    }

    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    

 public  double commandGameStacks(long invalidateConnectivity, float providerLock, float sortTimer) {
     double packageHandler = 7519.0;
     long mixingShadow = 9976L;
     float audioButton = 2079.0f;
     float valueGame = 2811.0f;
    double setbitsLocalizable = 0;
    packageHandler -= 94;
    setbitsLocalizable -= packageHandler;
    mixingShadow = 826;
    audioButton -= audioButton;
    audioButton += valueGame;
    valueGame += 50;

    return setbitsLocalizable;

}



protected void createNewSoundPool() {

         
double deinterlaceFramequeue =  this.commandGameStacks(67L,5413.0f,2826.0f);

      System.out.println(deinterlaceFramequeue);



        AudioAttributes attributes = new AudioAttributes.Builder()
                .setUsage(AudioAttributes.USAGE_GAME)
                .setContentType(AudioAttributes.CONTENT_TYPE_SONIFICATION)
                .build();
            ArrayList<Long> simpleN = new ArrayList<Long>();
     simpleN.add(892L);
     simpleN.add(859L);
             while (simpleN.size() > 116) { break; }
        sp = new SoundPool.Builder()
                .setAudioAttributes(attributes)
                .build();
            boolean register_5qb = false;
             while (register_5qb) { break; }
    }

    @SuppressWarnings("deprecation")
    protected void createOldSoundPool() {
        sp = new SoundPool(5, AudioManager.STREAM_MUSIC, 0);
            float servicesK = 4397.0f;
             if (servicesK == 176) {}
    }

}
