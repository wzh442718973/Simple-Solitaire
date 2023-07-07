package com.ardently.love.androidx.track;

import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;

import java.util.HashSet;
import java.util.Set;

import com.ardently.love.androidx.AndroidX;


interface OnTrackListener {

}

public abstract class ITrack<T extends OnTrackListener> {

    private Set<T> mListeners;
    private final Context mContext;

    public ITrack(Context context) {
        if (context instanceof Application) {
            mContext = context;
        } else {
            mContext = context.getApplicationContext();
        }
        if (mContext == null) {
            throw new NullPointerException("mContext is null!");
        }
    }

    public Context getContext() {
        return mContext;
    }


    protected T[] getListeners(T[] listener) {
        return mListeners == null ? listener : mListeners.toArray(listener);
    }

    public void addListener(T listener) {
        if (mListeners == null) {
            mListeners = new HashSet<>();
        }
        mListeners.add(listener);
    }

    public void removeListener(T listener) {
        if (mListeners != null) {
            mListeners.remove(listener);
        }
    }

    public void startTrack() {

    }

    public void stopTrack() {

    }

    protected Intent registerReceiver(BroadcastReceiver receiver,
                                      IntentFilter filter) {
        return AndroidX.registerReceiver(getContext(), receiver, filter);
    }

    protected void unregisterReceiver(BroadcastReceiver receive) {
        AndroidX.unregisterReceiver(getContext(), receive);
    }

}
