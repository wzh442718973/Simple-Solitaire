package com.ardently.love.andx.track;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.text.TextUtils;

public class HomeTrack extends ITrack<HomeTrack.OnHomeListener> {

    public HomeTrack(Context context) {
        super(context);
    }

    @Override
    public void startTrack() {
        super.startTrack();
    }

    @Override
    public void stopTrack() {
        super.stopTrack();
    }


    private BroadcastReceiver mHomeReceiver = null;

    private final class HomeKeyReceiver extends BroadcastReceiver {
        String SYSTEM_REASON = "reason";
        String SYSTEM_HOME_KEY = "homekey";
        String SYSTEM_HOME_KEY_LONG = "recentapps";

        @Override
        public void onReceive(Context context, Intent intent) {
            try {
                final String action = intent.getAction();
                OnHomeListener[] listeners = getListeners(new OnHomeListener[0]);

                String reason = intent.getStringExtra(SYSTEM_REASON);
                if (TextUtils.equals(reason, SYSTEM_HOME_KEY)) {
                    // 表示按了home键,程序到了后台
                    for (OnHomeListener listener : listeners) {
                        listener.onHomePress();
                    }
                } else if (TextUtils.equals(reason, SYSTEM_HOME_KEY_LONG)) {
                    // 表示长按home键,显示最近使用的程序列表
                    for (OnHomeListener listener : listeners) {
                        listener.onHomeLongPress();
                    }
                }
            } catch (Throwable e) {
                e.printStackTrace();
            }
        }
    }

    private void registerReceiver() {
        if (mHomeReceiver == null) {
            mHomeReceiver = new HomeKeyReceiver();
            registerReceiver(mHomeReceiver, new IntentFilter(Intent.ACTION_CLOSE_SYSTEM_DIALOGS));
        }
    }

    private void unregisterReceiver() {
        if (mHomeReceiver != null) {
            unregisterReceiver(mHomeReceiver);
            mHomeReceiver = null;
        }
    }

    public interface OnHomeListener extends OnTrackListener {
        void onHomePress();

        void onHomeLongPress();


    }
}
