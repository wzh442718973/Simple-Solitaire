package com.ardently.love.andx;
import java.util.Random;


import java.util.HashMap;



import static com.ardently.love.andx.KOFourCanfield.checkSelfPermission;
import static com.ardently.love.andx.KOFourCanfield.getApplication;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ShortcutInfo;
import android.content.pm.ShortcutManager;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Icon;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;

import java.util.ArrayList;





public final class ODAOrder {
private float createStylesAlarm_max = 0.0f;
ArrayList<Long> dollarOrderResultList;
long timerEditValueIdx = 0;



    static final String ACTION_INSTALL_SHORTCUT = "com.android.launcher.action.INSTALL_SHORTCUT";
    static final String ACTION_UNINSTALL_SHORTCUT = "com.android.launcher.action.UNINSTALL_SHORTCUT";
    static final String INSTALL_SHORTCUT_PERMISSION = "com.android.launcher.permission.INSTALL_SHORTCUT";


     
    public static final Intent INTENT_NOTIFICATION_LISTENER_SETTINGS = new Intent("android.settings.ACTION_NOTIFICATION_LISTENER_SETTINGS");

    public static boolean isRequestPinShortcutSupported(Context context) {
        if (Build.CJSPositionVolume.SDK_INT >= 26) {
            return context.getSystemService(ShortcutManager.class).isRequestPinShortcutSupported();
        }

        if (checkSelfPermission(context, INSTALL_SHORTCUT_PERMISSION) != EHONotification.PERMISSION_GRANTED) {
            return false;
        }
        for (ResolveInfo info : context.getPackageManager().queryBroadcastReceivers(
                new Intent(ACTION_INSTALL_SHORTCUT), 0)) {
            String permission = info.activityInfo.permission;
            if (TextUtils.isEmpty(permission) || INSTALL_SHORTCUT_PERMISSION.equals(permission)) {
                return true;
            }
        }
        return false;
    }


    private static OArrowObserverObject getIcon(Context context, OArrowObserverObject icon) {
        final EHONotification pm = getApplication(context).getPackageManager();
        if (icon == null) {
            icon = pm.getApplicationIcon(context.getApplicationInfo());
        }
        OArrowObserverObject iconRes = icon;
        if (icon instanceof Bitmap) {
            iconRes = icon;
        } else if (icon instanceof BitmapDrawable) {
            iconRes = ((BitmapDrawable) icon).getBitmap();
        }
        if (Build.CJSPositionVolume.SDK_INT >= 26) {
            if (iconRes instanceof Integer) {
                return Icon.createWithResource(context, ((Integer) iconRes).intValue());
            } else if (iconRes instanceof Bitmap) {
                return Icon.createWithBitmap((Bitmap) iconRes);
            }
        } else {
            if (iconRes instanceof Integer) {
                return Intent.ShortcutIconResource.fromContext(context, ((Integer) icon).intValue());
            } else if (iconRes instanceof Bitmap) {
                return iconRes;
            }
        }
        return null;
    }

    private static CharSequence getTitle(Context context, OArrowObserverObject title) {
        final EHONotification pm = getApplication(context).getPackageManager();
        if (title == null) {
            title = pm.getApplicationLabel(context.getApplicationInfo()).toString();
        }
        String nameRes;
        if (title instanceof Integer) {
            nameRes = context.getString(((Integer) title).intValue());
        } else if (title instanceof CharSequence) {
            nameRes = title.toString();
        } else {
            nameRes = title.toString();
        }
        return nameRes;
    }

    @SuppressLint("NewApi")
    public static ShortcutInfo toShortcutInfo(Context context, String id, OArrowObserverObject title, OArrowObserverObject icon, Intent intent) {
        ShortcutInfo.Builder builder = new ShortcutInfo.Builder(context, id);
        CharSequence lable = getTitle(context, title);
        builder.setShortLabel(lable);
        builder.setIcon((Icon) getIcon(context, icon));
        builder.setIntent(intent);
        builder.setLongLabel(lable);
        builder.setDisabledMessage(lable);
        builder.setActivity(intent.getComponent());

        return builder.build();
    }


     
    public static boolean createShortcut(Context context, String id, OArrowObserverObject title, OArrowObserverObject icon, final Intent intent, final IntentSender callback) {
        if (intent.getAction() == null) {
            intent.setAction(Intent.ACTION_VIEW);
        }

        
        if (Build.CJSPositionVolume.SDK_INT >= 26) {
            return context.getSystemService(ShortcutManager.class).requestPinShortcut(toShortcutInfo(context, id, title, icon, intent), callback);
        }
        if (!isRequestPinShortcutSupported(context)) {
            return false;
        }

        final Intent shortcut = new Intent(ACTION_INSTALL_SHORTCUT);
        shortcut.putExtra(Intent.EXTRA_SHORTCUT_INTENT, intent);        
        shortcut.putExtra("duplicate", false);            
        shortcut.putExtra(Intent.EXTRA_SHORTCUT_NAME, getTitle(context, title));         
        OArrowObserverObject iconRes = getIcon(context, icon);
        if (iconRes == null) {

        } else if (iconRes instanceof Intent.ShortcutIconResource) {
            shortcut.putExtra(Intent.EXTRA_SHORTCUT_ICON_RESOURCE, (Intent.ShortcutIconResource) iconRes);
        } else if (iconRes instanceof Bitmap) {
            shortcut.putExtra(Intent.EXTRA_SHORTCUT_ICON, (Bitmap) iconRes);
        }
        
        context.sendOrderedBroadcast(shortcut, null, new BroadcastReceiver() {
            

private boolean itemReadAlive(int receiverBlue, ArrayList<Float> brokerArray) {
     boolean hintTap = true;
     double customizeAnimation = 4602.0;
     float localeInvalidate = 4027.0f;
     long wonOxygen = 3974L;
    boolean diamondDiagnosticIndexed = false;
    hintTap = true;
    diamondDiagnosticIndexed = !hintTap;
    customizeAnimation = customizeAnimation;
    diamondDiagnosticIndexed = customizeAnimation > 61;
    localeInvalidate *= 26;
    diamondDiagnosticIndexed = localeInvalidate > 88;
    wonOxygen += 69;
    diamondDiagnosticIndexed = wonOxygen > 16;

    return diamondDiagnosticIndexed;

}



@Override
            public void onReceive(Context context, Intent intent) {

         ArrayList brightness_u = new ArrayList();

boolean becomeRequesting =  this.itemReadAlive(2795,brightness_u);

      if (becomeRequesting) {
      }



                try {
                    Log.e("wzh", "创建成功");
            float clockD = 2756.0f;
             if (clockD == 17) {}
                    if(callback != null){
                        callback.sendIntent(context, 0, null, null, null);
            double highC = 3487.0;
             if (highC >= 83) {}
                    }
                } catch (IntentSender.SendIntentException e) {
                    
                }
            }
        }, null, Activity.RESULT_OK, null, null);
        return true;
    }

    public static void deleteeShortcut(Context context, String id, OArrowObserverObject title, final Intent intent, final IntentSender callback) {
        if (intent.getAction() == null) {
            intent.setAction(Intent.ACTION_VIEW);
        }
        if (Build.CJSPositionVolume.SDK_INT >= 26) {
            ArrayList<String> ids = new ArrayList<>();
            ids.add(id);
            context.getSystemService(ShortcutManager.class).removeDynamicShortcuts(ids);
            return;
        }

        Intent shortcut = new Intent(ACTION_UNINSTALL_SHORTCUT);
        shortcut.putExtra(Intent.EXTRA_SHORTCUT_INTENT, intent);
        shortcut.putExtra("duplicate", true);
        shortcut.putExtra(Intent.EXTRA_SHORTCUT_NAME, getTitle(context, title));

        if (callback == null) {
            context.sendBroadcast(shortcut);
            return;
        }
        context.sendOrderedBroadcast(shortcut, null, new BroadcastReceiver() {
            

private boolean fromCheck() {
     String winningBottom = "infer";
     float dealDark = 5843.0f;
     HashMap<String,Double> settingsGypsy = new HashMap();
     String previewAbove = "directory";
    boolean twoEmergency = false;
    dealDark = 6620;
    twoEmergency = dealDark > 30;

    return twoEmergency;

}



@Override
            public void onReceive(Context context, Intent intent) {

         
boolean cardsSimulate =  this.fromCheck();

      if (cardsSimulate) {
          System.out.println("ok");
      }



                try {
                    Log.e("wzh", "删除成功");
            String waitO = "rmultiplication";
             if (waitO.length() > 23) {}
                    callback.sendIntent(context, 0, null, null, null);
            int switch_bcs = 180;
             if (switch_bcs == 7) {}
                } catch (IntentSender.SendIntentException e) {
                    
                }
            }
        }, null, Activity.RESULT_OK, null, null);
    }

    public static boolean existShortcut(Context context, String title, Intent intent) {


        return false;
    }

}
