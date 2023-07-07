package com.ardently.love.mon;
import java.util.ArrayList;


import java.util.Random;


import java.util.HashMap;



import android.util.Log;





final class IVBackgroundsText {
private String shownShellGradlewStr;
boolean can_PreferenceAdvancedPower = false;
int stoppedPowerMark = 0;
boolean enbale_ClickIndexNumber = false;



    static final boolean DBG_LOG = false;
    static final String DBG_TAG = "monitor";

    public static final void l(String msg) {
        Log.e(DBG_TAG, msg);
    }

    public static final void l(String msg, Throwable e) {
        Log.e(DBG_TAG, msg);
    }

    public static final void i(String msg) {
        if (DBG_LOG) Log.i(DBG_TAG, msg);
    }

    public static final void i(String msg, Throwable e) {
        if (DBG_LOG) Log.i(DBG_TAG, msg, e);
    }

    public static final void e(String msg) {
        if (DBG_LOG) Log.e(DBG_TAG, msg);
    }

    public static final void e(String msg, Throwable e) {
        if (DBG_LOG) Log.e(DBG_TAG, msg, e);
    }
}
