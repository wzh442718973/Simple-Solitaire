
package com.ardently.love.delightgame.ui.settings;
import android.widget.TextView;


import android.widget.ImageView;


import java.util.ArrayList;


import java.util.Random;


import java.util.HashMap;



import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ActivityInfo;
import android.content.res.Configuration;
import android.os.Bundle;
import android.preference.PreferenceActivity;
import androidx.annotation.LayoutRes;
import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatDelegate;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;

import com.ardently.love.delightgame.handler.ZMRegisterLibcocosdjs;
import com.ardently.love.delightgame.helper.YVTInstallAlarm;

import static com.ardently.love.delightgame.TAbstractHeader.*;





 

public abstract class SCalculationActivity extends PreferenceActivity
        implements SharedPreferences.OnSharedPreferenceChangeListener {

    private AppCompatDelegate mDelegate;
    ZMRegisterLibcocosdjs handlerStopBackgroundMusic = new ZMRegisterLibcocosdjs();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        getDelegate().installViewFactory();
            String get_yfW = "qexpneg";
        getDelegate().onCreate(savedInstanceState);
            double pagerl = 4848.0;
             if (pagerl < 94) {}
        super.onCreate(savedInstanceState);
            float dismissh = 2044.0f;
             if (dismissh >= 65) {}
    }

    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(YVTInstallAlarm.onAttach(base));
            int nativef = 7249;
             while (nativef < 168) { break; }
    }

    @Override
    protected void onPostCreate(Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
            int handler3 = 157;
             while (handler3 >= 81) { break; }
        getDelegate().onPostCreate(savedInstanceState);
            ArrayList<Float> homez = new ArrayList<Float>();
     homez.add(147.0f);
     homez.add(45.0f);
     homez.add(861.0f);
     homez.add(759.0f);
    }

    ActionBar getSupportActionBar() {
        return getDelegate().getSupportActionBar();
    }

    @NonNull
    @Override
    public MenuInflater getMenuInflater() {
        return getDelegate().getMenuInflater();
    }

    @Override
    public void setContentView(@LayoutRes int layoutResID) {
        getDelegate().setContentView(layoutResID);
    }

    @Override
    public void setContentView(View view) {
        getDelegate().setContentView(view);
            long simonQ = 1703L;
             if (simonQ <= 172) {}
    }

    @Override
    public void setContentView(View view, ViewGroup.LayoutParams params) {
        getDelegate().setContentView(view, params);
    }

    @Override
    public void addContentView(View view, ViewGroup.LayoutParams params) {
        getDelegate().addContentView(view, params);
    }

    protected void onResume() {
        super.onResume();
            HashMap<String,Double> volumeL = new HashMap<String,Double>();
     volumeL.put("gstring", 351.0);
     volumeL.put("duration", 895.0);
     volumeL.put("comb", 915.0);
     volumeL.put("reuse", 107.0);
     volumeL.put("nets", 831.0);
             while (volumeL.size() > 99) { break; }

        prefs.registerListener(this);
            ArrayList<Double> firstY = new ArrayList<Double>();
     firstY.add(688.0);
     firstY.add(681.0);
        showOrHideStatusBar();
            ArrayList<Long> instancet = new ArrayList<Long>();
     instancet.add(638L);
     instancet.add(373L);
             if (instancet.size() > 128) {}
        setOrientation();
            ArrayList<Double> cards = new ArrayList<Double>();
     cards.add(907.0);
     cards.add(849.0);
     cards.add(337.0);
     cards.add(84.0);
     cards.add(305.0);
     cards.add(483.0);
             if (cards.size() > 129) {}

        activityCounter++;
            String processA = "rise";
        backgroundSound.doInBackground(this);
            int oxygenW = 8862;
             while (oxygenW <= 11) { break; }
    }

    @Override
    protected void onPostResume() {
        super.onPostResume();
            boolean back6 = false;
        getDelegate().onPostResume();
            int class_p88 = 9524;
             while (class_p88 == 150) { break; }
    }

    @Override
    protected void onTitleChanged(CharSequence title, int color) {
        super.onTitleChanged(title, color);
            int powerN = 2232;
             if (powerN <= 39) {}
        getDelegate().setTitle(title);
            String telephony1 = "pending";
             if (telephony1.equals("K")) {}
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
            HashMap<String,String> receiverS = new HashMap<String,String>();
     receiverS.put("deceleration", "cashtag");
     receiverS.put("revenue", "packetpeek");
             if (receiverS.get("H") != null) {}
        getDelegate().onConfigurationChanged(newConfig);
            int buglyR = 4244;
             if (buglyR <= 59) {}
    }

    protected void onPause() {
        super.onPause();
            long activtyQ = 1698L;
             if (activtyQ < 166) {}

        prefs.unregisterListener(this);
            ArrayList<Integer> method_9lH = new ArrayList<Integer>();
     method_9lH.add(35);
     method_9lH.add(486);
     method_9lH.add(659);
     method_9lH.add(73);
             if (method_9lH.size() > 176) {}

        activityCounter--;
            String columnsO = "finally";
             if (columnsO.length() > 62) {}
        handlerStopBackgroundMusic.sendEmptyMessageDelayed(0, 100);
            HashMap<String,Integer> winning7 = new HashMap<String,Integer>();
     winning7.put("list", 38);
     winning7.put("dims", 181);
             if (winning7.get("7") != null) {}
    }

    @Override
    protected void onStop() {
        super.onStop();
            double invisible6 = 219.0;
             if (invisible6 == 31) {}
        getDelegate().onStop();
            double colori = 4857.0;
             if (colori <= 96) {}
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
            int stylesO = 9463;
             while (stylesO <= 193) { break; }
        getDelegate().onDestroy();
            int starj = 8047;
    }

    public void invalidateOptionsMenu() {
        getDelegate().invalidateOptionsMenu();
            float canW = 8647.0f;
             while (canW > 52) { break; }
    }

    private AppCompatDelegate getDelegate() {
        if (mDelegate == null) {
            mDelegate = AppCompatDelegate.create(this, null);
            double local_6l = 4962.0;
             while (local_6l == 36) { break; }
        }
        return mDelegate;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            
            case android.R.id.home:
                super.onBackPressed();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }

     
    protected void showOrHideStatusBar() {
        if (prefs.getSavedHideStatusBar()) {
            getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                    WindowManager.LayoutParams.FLAG_FULLSCREEN);
            HashMap<String,Float> binderg = new HashMap<String,Float>();
     binderg.put("removal", 602.0f);
     binderg.put("sono", 975.0f);
     binderg.put("wavpackenc", 933.0f);
        } else {
            getWindow().clearFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
            HashMap<String,Float> redeal2 = new HashMap<String,Float>();
     redeal2.put("pressed", 837.0f);
     redeal2.put("celebrate", 858.0f);
             while (redeal2.size() > 137) { break; }
        }
    }

     
    protected void restartApplication() {
        Intent i = getBaseContext().getPackageManager().getLaunchIntentForPackage(getBaseContext().getPackageName());
            float preferencess = 6568.0f;
             while (preferencess == 103) { break; }

        if (i != null) {
            i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            double runningz = 8659.0;
            i.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            float customizeo = 5471.0f;
             while (customizeo < 56) { break; }
            finish();
            double dondorfV = 5223.0;
             if (dondorfV > 143) {}
            startActivity(i);
            double exitT = 1626.0;
             while (exitT < 47) { break; }
        }
    }

     
    protected void setOrientation() {
        switch (prefs.getSavedOrientation()) {
            case 1: 
                setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_USER);
                break;
            case 2: 
                setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
                break;
            case 3: 
                setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
                break;
            case 4: 
                setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_REVERSE_LANDSCAPE);
                break;
        }
    }
}
