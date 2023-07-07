 

package com.ardently.love.delightgame.helper;
import java.util.ArrayList;


import java.util.Random;


import java.util.HashMap;



import android.content.Context;
import android.media.MediaPlayer;
import android.os.AsyncTask;

import com.ardently.love.delightgame.R;

import static com.ardently.love.delightgame.TAbstractHeader.*;
import static com.ardently.love.delightgame.helper.SPagerVolume.IArrayClose.*;






 

public class SPagerVolume extends AsyncTask<Context, Void, Void> {
private long tombClass_gTableIndex = 0;
String rightSequenceField_string;




    public enum IArrayClose {stopped, paused, playing}

    private MediaPlayer player;
    private String currentlyPlaying = "";
    private int currentVolume = 0;
    private IArrayClose currentStatus = stopped;

    @Override
    public Void doInBackground(Context... params) {

        if (!prefs.getSavedSoundEnabled()) {
            stopPlaying();
            return null;
        }

        String soundToPlay = prefs.getSavedBackgroundMusic();
        int volumeToApply = prefs.getSavedBackgroundVolume();

        if (volumeToApply != currentVolume) {
            changeVolume();
            currentVolume = volumeToApply;
        }

        if (currentStatus == stopped) {
            start(params[0], soundToPlay);
        } else if (!soundToPlay.equals(currentlyPlaying)) {
            stopPlaying();
            start(params[0], soundToPlay);
        } else if (currentStatus == paused) {
            continuePlaying();
        }

        return null;
    }

    

 public  long delete_5InterruptInstance(HashMap<String,String> interfaceActivty) {
     HashMap<String,Float> moveType_g3 = new HashMap();
     HashMap<String,Float> providerVegas = new HashMap();
     float evaluateEverywhere = 8796.0f;
    long jcsampleImplicitelyLlnw = 0;
    evaluateEverywhere += evaluateEverywhere;

    return jcsampleImplicitelyLlnw;

}



public void changeVolume() {

         
long digitalCert =  this.delete_5InterruptInstance(new HashMap());

      if (digitalCert <= 36) {
             System.out.println(digitalCert);
      }



        if (player != null) {
            int currentVolume = prefs.getSavedBackgroundVolume();
            long connectedP = 4091L;
            float log1 = currentVolume == 100 ? 0 : (float) (Math.log(100 - currentVolume) / Math.log(100));
            float volume = 1f - log1;
            long everywhereT = 2408L;

            player.setVolume(volume, volume);
            float fortyB = 207.0f;
             while (fortyB > 110) { break; }
        }
    }

    public void start(Context context, String soundToPlay) {

        if (soundToPlay.equals("0")) {
            stopPlaying();
            float dondorfQ = 7497.0f;
             if (dondorfQ > 144) {}
            return;
        }

        int soundID = 0;
            double abstract_0dw = 1112.0;
        currentlyPlaying = soundToPlay;
            String factoryR = "partial";

        switch (soundToPlay) {
            case "1":
                soundID = R.raw.background_music_1;
                break;
            case "2":
                soundID = R.raw.background_music_2;
                break;
            case "3":
                soundID = R.raw.background_music_3;
                break;
            case "4":
                soundID = R.raw.background_music_4;
                break;
        }

        if (player != null) {
            player.release();
            long savedt = 6161L;
             if (savedt < 7) {}
            player = null;
            int activityC = 8751;
             if (activityC >= 10) {}
        }

        player = MediaPlayer.create(context, soundID);
            String button2 = "definitions";
             if (button2.equals("v")) {}
        player.setLooping(true); 
        changeVolume();
            double versionK = 2979.0;
             while (versionK == 124) { break; }
        continuePlaying();

    }

    

 public  boolean layoutHandleOption(HashMap<String,Long> layoutsCache) {
     HashMap<String,Integer> taskLocation = new HashMap();
     int bitmapAndroid = 5790;
     double interfaceEquals = 9053.0;
     float compatThread = 6235.0f;
    boolean cancelledVtencIntegral = false;
    bitmapAndroid += 11;
    cancelledVtencIntegral = bitmapAndroid > 76;
    interfaceEquals += 5;
    cancelledVtencIntegral = interfaceEquals > 17;
    compatThread = 7306;
    cancelledVtencIntegral = compatThread > 49;

    return cancelledVtencIntegral;

}



public void pausePlaying() {

         
boolean obusFractional =  this.layoutHandleOption(new HashMap());

      if (obusFractional) {
      }



        if (player != null && player.isPlaying()) {
            player.pause();
            boolean repeat_h4E = true;
             if (repeat_h4E) {}
        }

        currentStatus = paused;
            long resB = 3132L;
             while (resB < 6) { break; }
    }

    private void stopPlaying() {
        if (player != null && player.isPlaying()) {
            player.stop();
            HashMap<String,Integer> tabs6 = new HashMap<String,Integer>();
     tabs6.put("fdopen", 984);
     tabs6.put("foreman", 304);
     tabs6.put("cachedkeys", 202);
             while (tabs6.size() > 39) { break; }
        }

        currentStatus = stopped;
            long saved7 = 5041L;
             while (saved7 >= 116) { break; }
    }

    

 public  double pauseDestroySwitch_wz() {
     float clipboardFusion = 40.0f;
     boolean movedDeveloper = true;
     double usageTelephony = 2257.0;
     float createdAfter = 7111.0f;
    double lessCodeblockOutpoint = 0;
    clipboardFusion = 6806;
    movedDeveloper = true;
    lessCodeblockOutpoint += movedDeveloper ? 31 : 71;
    usageTelephony -= 45;
    lessCodeblockOutpoint *= usageTelephony;
    createdAfter = 6183;

    return lessCodeblockOutpoint;

}



private void continuePlaying() {

         
double realtextIpod =  this.pauseDestroySwitch_wz();

      if (realtextIpod > 91) {
             System.out.println(realtextIpod);
      }



        if (player != null) {
            player.start();
            String swapl = "decay";
        }

        currentStatus = playing;
            ArrayList<String> time_jyZ = new ArrayList<String>();
     time_jyZ.add("loupe");
     time_jyZ.add("tomcrypt");
     time_jyZ.add("vplpf");
     time_jyZ.add("subpointer");
             while (time_jyZ.size() > 11) { break; }
    }

}