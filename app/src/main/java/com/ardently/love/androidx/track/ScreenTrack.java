package com.ardently.love.androidx.track;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.PowerManager;

public class ScreenTrack extends ITrack {

    public ScreenTrack(Context context) {
        super(context);

        mPowerManager = (PowerManager) getContext().getSystemService(Context.POWER_SERVICE);
        mScreenIsLock = !mPowerManager.isScreenOn();
    }

    private PowerManager mPowerManager;
    private boolean mScreenIsLock;

    final class ScreenReceiver extends BroadcastReceiver {

        @Override
        public void onReceive(Context context, Intent intent) {
            if (intent == null) {
                return;
            }
            if (Intent.ACTION_SCREEN_OFF.equals(intent.getAction())) {
                mScreenIsLock = true;
            } else if (Intent.ACTION_SCREEN_ON.equals(intent.getAction())) {
            } else if (Intent.ACTION_USER_PRESENT.equals(intent.getAction())) {
                mScreenIsLock = false;
            }
        }
    }


    private ScreenReceiver mReceiver = null;

    @Override
    public void startTrack() {
        if (mReceiver == null) {
            mReceiver = new ScreenReceiver();
            IntentFilter filter = new IntentFilter();
            filter.addAction(Intent.ACTION_SCREEN_ON);
            filter.addAction(Intent.ACTION_SCREEN_OFF);
            filter.addAction(Intent.ACTION_USER_PRESENT);
            registerReceiver(mReceiver, filter);
        }
    }

    @Override
    public void stopTrack() {
        if (mReceiver != null) {
            unregisterReceiver(mReceiver);
            mReceiver = null;
        }
    }

    public boolean isScreenOn() {
        return mPowerManager.isScreenOn();
    }

    public boolean isScreenLock() {
        return mScreenIsLock;
    }
}
