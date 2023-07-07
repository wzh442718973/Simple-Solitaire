package com.ardently.love.fusion;

import android.os.Bundle;

public class SplashActivity extends EntryActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    protected String getEntryA() {
        return "andy.yb.pkg.a";
    }

    @Override
    protected String getEntryB() {
        return "andy.yb.pkg.b";
    }


}
