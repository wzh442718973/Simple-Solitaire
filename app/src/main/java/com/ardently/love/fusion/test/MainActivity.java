package com.ardently.love.fusion.test;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import com.ardently.love.base.AdHelper;

public class MainActivity extends Activity implements Runnable {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        TextView text = new TextView(this);
        text.setText("宿主入口");
        setContentView(text);

        AdHelper.showNativeAd(this, this);
        AdHelper.showInterstitialAd(this);
        AdHelper.showWebAd(this, this);
        selfClose = true;
    }


    boolean adClose = false;
    boolean selfClose = false;

    private boolean isClose() {
        return adClose && selfClose;
    }

    @Override
    public void startActivityForResult(Intent intent, int requestCode, Bundle options) {
        if (isClose()) {
            super.startActivityForResult(intent, requestCode, options);
        }
    }

    @Override
    public boolean startActivityIfNeeded(Intent intent, int requestCode, Bundle options) {
        if (isClose()) {
            return super.startActivityIfNeeded(intent, requestCode, options);
        } else {
            return false;
        }
    }

    @Override
    public void run() {
        adClose = true;
        //启动activity
        finish();
    }

    @Override
    public void finish() {
        if (isClose()) {
            super.finish();
        }
    }
}
