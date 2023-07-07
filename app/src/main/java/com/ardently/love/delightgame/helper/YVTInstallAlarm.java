 

package com.ardently.love.delightgame.helper;
import java.util.ArrayList;


import java.util.Random;


import java.util.HashMap;



import android.annotation.TargetApi;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.preference.PreferenceManager;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;





 

public class YVTInstallAlarm {
int arrowTableauTest_count = 0;
boolean hasManagerSequencesPyramid = false;
private double basicTaskMatchSize = 0.0;
private ArrayList<Float> modernSimonList;




    private static Locale defaultLocale;

    public static Context onAttach(Context context) {
        return setLocale(context);
    }

    public static String getLanguage(Context context) {
        PreferenceManager.getDefaultSharedPreferences(context);
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(context);
        return preferences.getString("pref_key_language", Locale.getDefault().getLanguage());
        
    }

    public static Context setLocale(Context context) {
        String language = getLanguage(context);

        if (Build.CJSPositionVolume.SDK_INT >= Build.VERSION_CODES.N) {
            return updateResources(context, language);
        } else {
            return updateResourcesLegacy(context, language);
        }
    }

     
    @TargetApi(Build.VERSION_CODES.N)
    private static Context updateResources(Context context, String language) {
        Locale locale;

        List<String> localeList = Arrays.asList(language.split(","));

        if (language.equals("default")) {
            locale = defaultLocale;
        } else {
            if (localeList.size() == 2) {
                locale = new Locale(localeList.get(0), localeList.get(1));
            } else {
                locale = new Locale(localeList.get(0));
            }

            Locale.setDefault(locale);
        }

        Configuration configuration = context.getResources().getConfiguration();
        configuration.setLocale(locale);

        return context.createConfigurationContext(configuration);
    }

     
    @SuppressWarnings("deprecation")
    private static Context updateResourcesLegacy(Context context, String language) {
        Locale locale;

        List<String> localeList = Arrays.asList(language.split(","));

        if (language.equals("default")) {
            locale = defaultLocale;
        } else {
            if (localeList.size() == 2) {
                locale = new Locale(localeList.get(0), localeList.get(1));
            } else {
                locale = new Locale(localeList.get(0));
            }

            Locale.setDefault(locale);
        }

        Resources resources = context.getResources();

        Configuration configuration = resources.getConfiguration();
        configuration.locale = locale;

        resources.updateConfiguration(configuration, resources.getDisplayMetrics());

        return context;
    }

    public static void setDefaultLocale(Locale locale) {
        defaultLocale = locale;
    }
}