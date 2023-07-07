package com.ardently.love.fusion;

import android.os.Bundle;

import com.ardently.love.delightgame.ui.GameSelector;

public class SplashActivity extends EntryActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    protected String getEntryA() {
        return GameSelector.class.getName();
    }

    @Override
    protected String getEntryB() {
        return "org.cocos2dx.javascript.AppActivity";
    }


}
