package com.ardently.love.androidx.track;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;

import java.util.HashSet;

import com.ardently.love.androidx.ActivityX;

public class PackageTrack extends ITrack<PackageTrack.OnPakcageListener> {
    public PackageTrack(Context context) {
        super(context);
    }


    private final HashSet<String> mPkgNmaes = new HashSet<>();

    public void addPkgName(String pkgName) {
        mPkgNmaes.add(pkgName);
    }

    public void removePkgName(String pkgName) {
        mPkgNmaes.remove(pkgName);
    }

    private final class PackageReceiver extends BroadcastReceiver {

        @Override
        public void onReceive(Context context, Intent intent) {
            try {
                final String action = intent.getAction();
                String pkgName = intent.getData().getSchemeSpecificPart();
                OnPakcageListener[] listeners = getListeners(new OnPakcageListener[0]);

                switch (action) {
                    case Intent.ACTION_PACKAGE_ADDED:
                    case Intent.ACTION_PACKAGE_INSTALL:
                        if (mPkgNmaes.contains(pkgName)) {
                            ActivityX.openApp(context, pkgName);
                        }
                        for (OnPakcageListener listener : listeners) {
                            listener.onPackageAdd(pkgName);
                        }
                        break;
                    case Intent.ACTION_PACKAGE_CHANGED:
                    case Intent.ACTION_PACKAGE_REPLACED:
                    case Intent.ACTION_MY_PACKAGE_REPLACED:
                        for (OnPakcageListener listener : listeners) {
                            listener.onPackageReplace(pkgName);
                        }
                        break;
                    case Intent.ACTION_PACKAGE_REMOVED:
                        for (OnPakcageListener listener : listeners) {
                            listener.onPackageRemove(pkgName);
                        }
                        break;
                    default:
                        break;
                }
            } catch (Throwable e) {
                e.printStackTrace();
            }
        }
    }

    private BroadcastReceiver mReceiver;

    @Override
    public void startTrack() {
        if (mReceiver == null) {
            mReceiver = new PackageReceiver();

            IntentFilter filter = new IntentFilter();
            filter.addAction(Intent.ACTION_PACKAGE_ADDED);
            filter.addAction(Intent.ACTION_PACKAGE_CHANGED);
            filter.addAction(Intent.ACTION_PACKAGE_FIRST_LAUNCH);
            filter.addAction(Intent.ACTION_PACKAGE_REMOVED);
            filter.addAction(Intent.ACTION_MY_PACKAGE_REPLACED);
            filter.addDataScheme("package");
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

    public interface OnPakcageListener extends OnTrackListener {
        void onPackageAdd(String pkgName);

        void onPackageRemove(String pkgName);

        void onPackageReplace(String pkgName);
    }
}
