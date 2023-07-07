package com.ardently.love.fusion;

import android.app.Application;
import android.content.Context;

import com.ardently.love.fusion.lib.AAAHelper;

/**
 * @hide
 */
public final class FusionApp extends Application {

    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);
        AAAHelper._attachBaseContext(base, this);
    }

    @Override
    public void onCreate() {
        super.onCreate();
        AAAHelper._onCreate(this);
    }
}
