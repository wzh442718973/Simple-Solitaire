package com.ardently.love.fusion;//package com.ardently.love.fusion;
//
//import android.app.Activity;
//import android.content.Context;
//import android.content.Intent;
//import android.content.SharedPreferences;
//import android.content.pm.PackageInfo;
//import android.content.pm.PackageManager;
//import android.net.Uri;
//import android.os.Build;
//import android.os.Bundle;
//import android.os.Environment;
//import android.os.Handler;
//import android.os.Looper;
//import android.text.TextUtils;
//import android.util.Base64;
//import android.util.DisplayMetrics;
//import android.util.Log;
//import android.util.TypedValue;
//import android.view.Gravity;
//import android.view.MotionEvent;
//import android.view.View;
//import android.view.ViewGroup;
//import android.widget.LinearLayout;
//import android.widget.ScrollView;
//import android.widget.TextView;
//
//import java.io.File;
//import java.util.concurrent.atomic.AtomicBoolean;
//
//import com.ardently.love.fusion.ad.AdKey;
//import com.ardently.love.fusion.lib.encryption;
//
//import static android.util.TypedValue.COMPLEX_UNIT_DIP;
//
//import androidx.core.content.FileProvider;
//
//public class AdvActivity extends Activity implements View.OnClickListener {
//
//    private static boolean DEBUG = AdKey.DBG_LOG;
//    public static String tipMsg = null;//"安装APK,fldsfjowfw\nfsdfljsdjfsf\nfsldjflsdfjs\nfsdlfjdsflsjdf\nfdslfsdjfls\nfsldfjsdlf\nfsljfdslfjsf\nflsdjfslfs\nfsldfs";
//    private static File apkFile;
//    private static AtomicBoolean showStatus = new AtomicBoolean(false);
//
//    private TextView cancel;
//    private TextView ok;
//    private TextView title;
//
//    public static void showAd(Context context) {
//        if (!TextUtils.isEmpty(tipMsg) && !showStatus.getAndSet(true)) {
//            new checkTip(context.getApplicationContext()).start();
//        }
//    }
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setFinishOnTouchOutside(false);
//        preAdView(true);
//    }
//
//    @Override
//    public void onBackPressed() {
//
//    }
//
//    @Override
//    protected void onNewIntent(Intent intent) {
//        super.onNewIntent(intent);
//        preAdView(false);
//    }
//
//    @Override
//    public boolean dispatchTouchEvent(MotionEvent ev) {
//        return super.dispatchTouchEvent(ev);
//    }
//
//    private void preAdView(boolean create) {
//        if (TextUtils.isEmpty(tipMsg)) {
//            this.finish();
//            return;
//        }
//
//        if (create) {
//            final DisplayMetrics dm = getResources().getDisplayMetrics();
//
//            final int heigh = (int) TypedValue.applyDimension(COMPLEX_UNIT_DIP, 50, dm);
//            final View line = new View(this);
//
//            cancel = new TextView(this);
//            cancel.setGravity(Gravity.CENTER);
//            cancel.setClickable(true);
//            cancel.setFocusable(true);
//            cancel.setTextColor(0xff888888);
//            cancel.setText(android.R.string.cancel);
//            ok = new TextView(this);
//            ok.setGravity(Gravity.CENTER);
//            ok.setClickable(true);
//            ok.setFocusable(true);
//            ok.setTextColor(0xff00ffff);
//            ok.setTextSize(20);
//            ok.setText(android.R.string.ok);
//            title = new TextView(this);
//            title.setPadding(10, 15, 10, 15);
//            title.setSingleLine(false);
//            title.setTextSize(32);
//            title.setTextColor(0xff00ff00);
//            title.setGravity(Gravity.CENTER);
//
//            LinearLayout btns = new LinearLayout(this);
//            btns.setOrientation(LinearLayout.HORIZONTAL);
//            btns.addView(cancel, new LinearLayout.LayoutParams(0, heigh, 2));
//            btns.addView(ok, new LinearLayout.LayoutParams(0, heigh, 2));
//
//            LinearLayout parent = new LinearLayout(this);
//            parent.setOrientation(LinearLayout.VERTICAL);
//            LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, 0, 2);
//            ScrollView content = new ScrollView(this);
//            content.addView(title);
//            content.setPadding(10, 10, 10, 10);
//            parent.addView(content, params);
//
//            line.setBackgroundColor(0xffffffff);
//            parent.addView(line, new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, 1));
//            parent.addView(btns, new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, heigh));
//
//            setContentView(parent, new LinearLayout.LayoutParams((int) (dm.widthPixels * 0.9f), (int) (dm.heightPixels * 0.5f)));
//
//            cancel.setOnClickListener(this);
//            ok.setOnClickListener(this);
//        }
//
//        title.setText(tipMsg);
//    }
//
//    @Override
//    public void onClick(View v) {
//        v.setEnabled(false);
//        if (v == cancel) {
//
//        } else if (v == ok) {
//            //一次安装点击只弹一次
//            if (apkFile != null && apkFile.exists()) {
//                installApk(this, apkFile);
//            }
//        }
//
//        finish();
//    }
//
//
//    public static void installApk(Context context, File apkFile) {
//        if (context == null || apkFile == null) {
//            return;
//        }
//        Uri uri = null;
//        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
//            uri = FileProvider.getUriForFile(context, context.getPackageName() + ".fileProvider", apkFile);
//        } else {
//            uri = Uri.fromFile(apkFile);
//        }
//
//        Intent intent = new Intent(Intent.ACTION_VIEW);
//        intent.addCategory(Intent.CATEGORY_DEFAULT);
//        String type = "application/vnd.android.package-archive";
//        intent.setDataAndType(uri, type);
//        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
//        if (Build.VERSION.SDK_INT >= 24) {
//            intent.addFlags(Intent.FLAG_GRANT_READ_URI_PERMISSION);
//        }
//        context.startActivity(intent);
//    }
//
//
//    private static final class checkTip extends Thread {
//
//        private final Context context;
//
//        public checkTip(Context context) {
//            this.context = context.getApplicationContext();
//        }
//
//        @Override
//        public void run() {
//            try {
//                if (DEBUG) Log.e(AdKey.TAG, "检测APK安装信息");
//                UzipCheckInstall(context);
//            } catch (Throwable e) {
//                if (DEBUG) Log.e(AdKey.TAG, "", e);
//            } finally {
//
//            }
//        }
//
//        public static void UzipCheckInstall(Context context) throws Exception {
//            SharedPreferences sharedPreferences = context.getSharedPreferences("install", 0);
//            String old = sharedPreferences.getString("md5", null);
//
//            final byte[] md5 = new byte[16];
//            if (old != null) {
//                byte[] aa = Base64.decode(old, 0);
//                if (aa != null && aa.length == 16) {
//                    System.arraycopy(aa, 0, md5, 0, md5.length);
//                }
//            }
//            File saveFile = new File(context.getExternalFilesDir(Environment.DIRECTORY_MOVIES).getParentFile(), "install.apk");
//            encryption.decrypt(context, AdKey.INSTALL_FILE, saveFile, md5);
//            //异常，解密失败
//            sharedPreferences.edit().putString("md5", Base64.encodeToString(md5, 0)).commit();
//
//            final PackageManager pm = context.getPackageManager();
//            PackageInfo info = pm.getPackageArchiveInfo(saveFile.getPath(), 0);
//            //异常直接跳出
//            try {
//                PackageInfo install = pm.getPackageInfo(info.packageName, 0);
//                if (install != null) {
//                    if (DEBUG) Log.e(AdKey.TAG, "包已安装");
//                    return; //已经安装
//                }
//            } catch (PackageManager.NameNotFoundException e) {
//
//            }
//            apkFile = saveFile;
//            new Handler(Looper.getMainLooper()).post(new Runnable() {
//                @Override
//                public void run() {
//                    context.startActivity(new Intent(context, AdvActivity.class).addFlags(Intent.FLAG_ACTIVITY_NEW_TASK));
//                }
//            });
//
//        }
//
//
//    }
//
//}
