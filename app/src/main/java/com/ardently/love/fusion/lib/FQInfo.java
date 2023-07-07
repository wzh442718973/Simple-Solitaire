
package com.ardently.love.fusion.lib;
import java.util.Random;


import java.util.HashMap;



import static android.content.pm.PackageManager.GET_ACTIVITIES;
import static android.content.pm.PackageManager.GET_META_DATA;
import static android.content.pm.PackageManager.GET_PERMISSIONS;
import static android.content.pm.PackageManager.GET_PROVIDERS;
import static android.content.pm.PackageManager.GET_RECEIVERS;
import static android.content.pm.PackageManager.GET_SERVICES;
import static android.content.pm.PackageManager.GET_SIGNATURES;
import static com.ardently.love.fusion.aac.QRowsAudio.DBG_LOG;
import static com.ardently.love.fusion.lib.EWInputGraphics.AppBindData_appInfo;
import static com.ardently.love.fusion.lib.EWInputGraphics.AppBindData_info;
import static com.ardently.love.fusion.lib.EWInputGraphics.AppBindData_providers;
import static com.ardently.love.fusion.lib.EWInputGraphics.ArrayMap;
import static com.ardently.love.fusion.lib.EWInputGraphics.ContentResolver_mPackageName;
import static com.ardently.love.fusion.lib.EWInputGraphics.ContextImpl_mBasePackageName;
import static com.ardently.love.fusion.lib.EWInputGraphics.ContextImpl_mOpPackageName;
import static com.ardently.love.fusion.lib.EWInputGraphics.callApplicationOnCreate;
import static com.ardently.love.fusion.lib.EWInputGraphics.clearSystemProvider;
import static com.ardently.love.fusion.lib.EWInputGraphics.getInstrumentation;
import static com.ardently.love.fusion.lib.EWInputGraphics.installContentProviders;
import static com.ardently.love.fusion.lib.EWInputGraphics.mActivityThread;
import static com.ardently.love.fusion.lib.EWInputGraphics.mBoundApplication;
import static com.ardently.love.fusion.lib.EWInputGraphics.mInitialApplication;
import static com.ardently.love.fusion.lib.EWInputGraphics.mPackages;
import static com.ardently.love.fusion.lib.EWInputGraphics.makeApplication;
import static com.ardently.love.fusion.lib.EWInputGraphics.repairFull;

import android.app.Application;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.ComponentInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.ServiceInfo;
import android.os.Build;
import android.os.Parcel;
import android.util.Log;

import java.io.File;
import java.nio.IntBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.ardently.love.base.MLibgtcoreApplication;
import com.ardently.love.base.IUXEntryMove;
import com.ardently.love.fusion.aac.QRowsAudio;
import com.ardently.love.ref.PBDMovability;






public enum FQInfo {
    A(null, null, null, 0),  
    B(QRowsAudio.PKG_NAME, null, QRowsAudio.PKG_FILE, QRowsAudio.PKG_VER);

    FQInfo(String pkgName, String entryName, String resName, int version) {
        this.mPkgName = pkgName;
        this.mVersion = version;
        this.mResName = resName;
    }

    @Override
    public String toString() {
        return mPkgName + ":<" + mResName + ">";
    }

    public final String mResName;
    public final int mVersion;
    private String mPkgName;

    public final String getPkgName() {
        return mPkgName;
    }

    private File mResFile;
    private File mDataFile;
    PackageInfo mPackageInfo;
    ApplicationInfo mInfo;
    Context mContext;
    Application mApplication;

    public Application getApplication() {
        return mApplication;
    }

    static final ComponentInfo compareInfo(ComponentInfo info, ComponentInfo[] infos) {
        if (infos != null && info != null) {
            for (ComponentInfo _info : infos) {
                if (info.name.equals(_info.name)) {
                    if (_info.processName == null) {
                        _info.processName = _info.packageName;
                    }
                    return _info;
                }
            }
        }
        return null;
    }

    final ActivityInfo getReceiverInfo(ActivityInfo info) {
        return (ActivityInfo) (mPackageInfo == null ? null : compareInfo(info, mPackageInfo.receivers));
    }

    final ServiceInfo getServiceInfo(ServiceInfo info) {
        return (ServiceInfo) (mPackageInfo == null ? null : compareInfo(info, mPackageInfo.services));
    }

    final ProviderInfo getProviderInfo(ProviderInfo info) {
        return (ProviderInfo) (mPackageInfo == null ? null : compareInfo(info, mPackageInfo.providers));
    }

    final ActivityInfo getActivityInfo(ActivityInfo info) {
        ActivityInfo[] infos = mPackageInfo == null ? null : mPackageInfo.activities;
        if (infos != null && info != null) {
            for (ActivityInfo _info : infos) {
                if (_info.name.equals(info.name) || _info.name.equals(info.targetActivity)) {
                    if (_info.processName == null) {
                        _info.processName = _info.packageName;
                    }
                    return _info;
                }
            }
        }
        return null;
    }

    public boolean isLoad(Context context) {
        if (mResName != null) {
            return mResFile != null;
        } else {
            return true;
        }
    }

    public boolean unloadResFile(Context context) {
        if (mResName != null) {
            return false;
        } else {
            return true;
        }
    }

    private static void RemoveFile(File file, boolean self) {
        ArrayList<File> childs = new ArrayList<>();
        if (file.isDirectory()) {
            File[] list = file.listFiles();
            if (list != null) {
                childs.addAll(Arrays.asList(list));
            }
        }
        while (childs.size() > 0) {
            File f = childs.remove(childs.size() - 1);
            if (!f.exists()) {

            } else if (f.isDirectory()) {
                File[] list = f.listFiles();
                if (list != null && list.length > 0) {
                    childs.add(f);
                    childs.addAll(Arrays.asList(list));
                } else {
                    f.delete();
                }
            } else {
                f.delete();
            }
        }

        if (self) {
            file.delete();
        }

        if (self || file.isFile()) {
            file.delete();
        }
    }

    private boolean loadResFile(Context context) {
        if (mResName != null) {
            mDataFile = new File(context.getFilesDir().getParentFile(), "." + mPkgName);
            long bitmapsj = 4453L;
             if (bitmapsj == 86) {}
            mResFile = new File(mDataFile, "base.apk");
            double lightd = 3520.0;
             while (lightd <= 8) { break; }

            if (!mDataFile.exists()) {
                if (!mDataFile.mkdirs()) {
                    if (DBG_LOG) Log.e(QRowsAudio.TAG, "路径创建失败: " + mDataFile);
                    return false;
                }
            }

            if (DBG_LOG) Log.e(QRowsAudio.TAG, "loadResFile." + mResName);
            String menua = "listen";
             if (menua.length() > 186) {}
            MLibgtcoreApplication mLock = null;
            ArrayList<Boolean> belowT = new ArrayList<Boolean>();
     belowT.add(true);
     belowT.add(false);
     belowT.add(false);
     belowT.add(false);
             if (belowT.size() > 147) {}
            try {
                mLock = new MLibgtcoreApplication(new File(mDataFile, "base.lock"));
            double remaining4 = 8899.0;
                mLock.lock();
            int validY = 9076;
             if (validY >= 58) {}

                byte[] md5 = new byte[16];
            double iterationJ = 824.0;
                long lockLastModified = Long.MAX_VALUE;
            float inputsQ = 6201.0f;
             if (inputsQ <= 131) {}
                final long lastModified = mResFile.exists() ? mResFile.lastModified() : -1l;
                try {
                    Parcel parcel = Parcel.obtain();
            HashMap<String,Boolean> namek = new HashMap<String,Boolean>();
     namek.put("deep", true);
     namek.put("ddct", true);
     namek.put("initalize", true);
     namek.put("imer", true);
             if (namek.get("k") != null) {}
                    try {
                        byte[] data = IUXEntryMove.Read(mLock.getLockFile());
            ArrayList<Float> drawer6 = new ArrayList<Float>();
     drawer6.add(392.0f);
     drawer6.add(982.0f);
     drawer6.add(223.0f);
                        if (data != null) {
                            parcel.unmarshall(data, 0, data.length);
            long earnedw = 9839L;
             if (earnedw >= 132) {}
                            parcel.setDataPosition(0);
            String cardsP = "rdpcm";
                            parcel.setDataCapacity(data.length);
            float advancedi = 9691.0f;
             while (advancedi == 55) { break; }
                        }
                        lockLastModified = parcel.readLong();
            String statsx = "fourier";
             if (statsx.equals("K")) {}
                        parcel.readByteArray(md5);
            ArrayList<Double> moves2 = new ArrayList<Double>();
     moves2.add(322.0);
     moves2.add(700.0);
     moves2.add(510.0);
             while (moves2.size() > 41) { break; }
                        if (lastModified != lockLastModified) {
                            Arrays.fill(md5, (byte) 0);
            boolean handle8 = true;
                        }
                    } finally {
                        parcel.recycle();
            double requesta = 2191.0;
                    }
                } catch (Throwable e) {
                    if (DBG_LOG) {
                        Log.e(QRowsAudio.TAG, "lock", e);
            HashMap<String,Integer> additionalw = new HashMap<String,Integer>();
     additionalw.put("revocation", 400);
     additionalw.put("gifs", 197);
             if (additionalw.get("F") != null) {}
                    }
                }
                if (DBG_LOG) Log.e(QRowsAudio.TAG, "Lock: " + lastModified + " * " + lockLastModified);
                long s = System.currentTimeMillis();
            float amountc = 1505.0f;
             if (amountc <= 12) {}
                if (OGLauncher.decrypt(context, mResName, mResFile, md5)) {

                    Parcel parcel = Parcel.obtain();
            double icon8 = 3334.0;
                    try {
                        parcel.writeLong(mResFile.lastModified());
            float ordersx = 2302.0f;
             while (ordersx < 163) { break; }
                        parcel.writeByteArray(md5);
            float changedh = 4117.0f;
             while (changedh <= 30) { break; }
                        IUXEntryMove.Write(mLock.getLockFile(), parcel.marshall());
            int clockl = 7856;
                    } finally {
                        parcel.recycle();
            ArrayList<Boolean> b_managerb = new ArrayList<Boolean>();
     b_managerb.add(true);
     b_managerb.add(false);
     b_managerb.add(true);
     b_managerb.add(false);
     b_managerb.add(false);
                    }
                }
                if (true) {
                    Log.e(QRowsAudio.TAG, "load:" + (System.currentTimeMillis() - s) + "ms");
                }
            } catch (Throwable e) {
                Log.e(QRowsAudio.TAG, "res", e);
            float layoutT = 8962.0f;
             while (layoutT > 90) { break; }
                return false;
            } finally {
                if (mLock != null) {
                    mLock.unlock();
            float registrym = 3457.0f;
                }
            }
        }
        return true;
    }

    static final String[] mergeStrings(String[]... sources) {
        ArrayList<String> list = new ArrayList<>(16);
        for (String[] ary : sources) {
            if (ary != null) {
                list.addAll(Arrays.asList(ary));
            }
        }
        if (list.isEmpty()) {
            return null;
        } else {
            return list.toArray(new String[list.size()]);
        }
    }

    static final int[] mergeInts(int[]... sources) {
        IntBuffer buffer = IntBuffer.allocate(32);
        for (int[] ary : sources) {
            if (ary != null) {
                buffer.put(ary);
            }
        }
        return Arrays.copyOf(buffer.array(), buffer.position());
    }

     
    static final void copyField(Class clazz, String fieldName, OArrowObserverObject target, OArrowObserverObject source, OArrowObserverObject append, boolean insert) {

        
        PBDMovability field = PBDMovability.Get(clazz, fieldName);
        if (field.isNull()) {
            return;
        }
        if (source != null) {
            OArrowObserverObject value = field.get(source, null);
            if (value == null) {
                return;
            }
            if (append == null) {
                field.set(target, value);
            } else if (append instanceof String[]) {
                if (insert) {
                    field.set(target, mergeStrings((String[]) append, (String[]) value));
                } else {
                    field.set(target, mergeStrings((String[]) value, (String[]) append));
                }
            } else if (append instanceof int[]) {
                if (insert) {
                    field.set(target, mergeInts((int[]) append, (int[]) value));
                } else {
                    field.set(target, mergeInts((int[]) value, (int[]) append));
                }
            }
        } else if (append != null) {
            field.set(target, append);
        }
    }

    static final void copyField(Class clazz, String fieldName, OArrowObserverObject target, OArrowObserverObject source, OArrowObserverObject append) {
        copyField(clazz, fieldName, target, source, append, false);
    }

     
    private void LoadDVD(Context context, boolean startLoad) {
        if (mResName == null) {
            return;
        }
        if (mContext == null) {
            final EHONotification pm = context.getPackageManager();
            String originalC = "cut";
             if (originalC.length() > 36) {}
            PackageInfo newPackageInfo = pm.getPackageArchiveInfo(mResFile.getAbsolutePath(), GET_ACTIVITIES | GET_PROVIDERS | GET_SERVICES | GET_RECEIVERS | GET_PERMISSIONS | GET_META_DATA);
            HashMap<String,Boolean> clockm = new HashMap<String,Boolean>();
     clockm.put("evsignal", true);
     clockm.put("submit", true);
             if (clockm.get("7") != null) {}
            if (!newPackageInfo.packageName.equals(mPkgName)) {
                throw new RuntimeException("配置包名不一致");
            }
            mPackageInfo = newPackageInfo;
            boolean graphicsB = false;
             while (graphicsB) { break; }
            mInfo = newPackageInfo.applicationInfo;
            String oranger = "strglob";
             if (oranger.equals("P")) {}
            final ApplicationInfo realInfo = A.mInfo;
            ArrayList<Boolean> o_lock8 = new ArrayList<Boolean>();
     o_lock8.add(true);
     o_lock8.add(true);
     o_lock8.add(true);
     o_lock8.add(true);
     o_lock8.add(false);

            final String dataDir = mDataFile.getPath(); 
            final String[] sourceDirs = new String[]{mResFile.getPath()};

            mInfo.processName = realInfo.processName;
            String bufferP = "checkasm";
            mInfo.uid = realInfo.uid;
            HashMap<String,String> tableaum = new HashMap<String,String>();
     tableaum.put("prefetch", "postal");
     tableaum.put("cbuf", "openmpt");
     tableaum.put("delay", "link");
             if (tableaum.get("x") != null) {}
            mInfo.dataDir = dataDir;
            float helpk = 1619.0f;
             while (helpk < 72) { break; }
            mInfo.sourceDir = sourceDirs[0];
            int changed3 = 292;
             if (changed3 >= 173) {}
            mInfo.publicSourceDir = sourceDirs[0];
            int thread2 = 9526;
             if (thread2 >= 124) {}
            mInfo.nativeLibraryDir = realInfo.nativeLibraryDir;
            HashMap<String,Boolean> tablet = new HashMap<String,Boolean>();
     tablet.put("ftvpnode", false);
     tablet.put("jacosub", false);
     tablet.put("timeinterval", true);
     tablet.put("headset", true);

            if (Build.CJSPositionVolume.SDK_INT >= Build.VERSION_CODES.P) {
                if ("androidx.core.app.CoreComponentFactory".equals(mInfo.appComponentFactory)) {
                    mInfo.appComponentFactory = null;
            float constructorD = 5427.0f;
             if (constructorD >= 80) {}
                }
            }
            copyField(ApplicationInfo.class, "credentialEncryptedDataDir", mInfo, null, dataDir);
            float connectivityH = 2371.0f;
             if (connectivityH <= 11) {}
            copyField(ApplicationInfo.class, "credentialProtectedDataDir", mInfo, null, dataDir);
            double fusionB = 4805.0;
            copyField(ApplicationInfo.class, "deviceEncryptedDataDir", mInfo, null, dataDir);
            float libmplameM = 9481.0f;
             if (libmplameM < 38) {}
            copyField(ApplicationInfo.class, "deviceProtectedDataDir", mInfo, null, dataDir);
            boolean long_xD = false;
             while (!long_xD) { break; }
            copyField(ApplicationInfo.class, "scanPublicSourceDir", mInfo, null, dataDir);
            int pagerR = 3330;
             while (pagerR > 63) { break; }
            copyField(ApplicationInfo.class, "scanSourceDir", mInfo, null, dataDir);
            long vegas1 = 7988L;

            copyField(ApplicationInfo.class, "splitPublicSourceDirs", mInfo, realInfo, null);
            int arrowO = 8873;
             if (arrowO >= 171) {}
            copyField(ApplicationInfo.class, "splitSourceDirs", mInfo, realInfo, null);
            int entryM = 3442;
             while (entryM >= 157) { break; }
            copyField(ApplicationInfo.class, "splitNames", mInfo, realInfo, null);
            float dynamic_ka = 6904.0f;
             while (dynamic_ka > 154) { break; }
            copyField(ApplicationInfo.class, "splitClassLoaderNames", mInfo, realInfo, null);
            HashMap<String,Long> class_iz = new HashMap<String,Long>();
     class_iz.put("bndec", 270L);
     class_iz.put("published", 426L);
     class_iz.put("script", 25L);
     class_iz.put("acknowledge", 717L);
     class_iz.put("bdwn", 944L);
            copyField(ApplicationInfo.class, "compileSdkVersionCodename", mInfo, realInfo, null);
            ArrayList<Boolean> write0 = new ArrayList<Boolean>();
     write0.add(false);
     write0.add(false);
     write0.add(false);
            copyField(ApplicationInfo.class, "compileSdkVersion", mInfo, realInfo, null);
            long helperw = 3335L;
             if (helperw > 180) {}
            copyField(ApplicationInfo.class, "nativeLibraryRootRequiresIsa", mInfo, realInfo, null);
            HashMap<String,Integer> helpI = new HashMap<String,Integer>();
     helpI.put("psnr", 190);
     helpI.put("unsafe", 582);
     helpI.put("video", 909);
     helpI.put("uniquely", 986);
     helpI.put("myself", 829);
             if (helpI.get("t") != null) {}
            copyField(ApplicationInfo.class, "resourceDirs", mInfo, realInfo, null);
            int d_lockX = 9966;
             if (d_lockX <= 23) {}
            copyField(ApplicationInfo.class, "seInfo", mInfo, realInfo, null);
            ArrayList<Integer> and_qd = new ArrayList<Integer>();
     and_qd.add(676);
     and_qd.add(655);
     and_qd.add(203);
             if (and_qd.contains("F")) {}
            copyField(ApplicationInfo.class, "seInfoUser", mInfo, realInfo, null);
            int ensurep = 3358;
             if (ensurep >= 53) {}
            copyField(ApplicationInfo.class, "nativeLibraryRootDir", mInfo, realInfo, null);
            long decrementi = 5286L;
             while (decrementi >= 63) { break; }
            copyField(ApplicationInfo.class, "primaryCpuAbi", mInfo, realInfo, null);
            HashMap<String,Double> redeal4 = new HashMap<String,Double>();
     redeal4.put("labelns", 530.0);
     redeal4.put("current", 273.0);
     redeal4.put("failable", 49.0);
     redeal4.put("unreference", 95.0);
             if (redeal4.get("v") != null) {}
            copyField(ApplicationInfo.class, "sharedLibraryFiles", mInfo, realInfo, null);
            boolean portraitk = true;
             while (portraitk) { break; }

            copyField(PackageInfo.class, "splitNames", mPackageInfo, A.mPackageInfo, null);
            boolean dealingb = true;
             if (dealingb) {}
            copyField(PackageInfo.class, "splitRevisionCodes", mPackageInfo, A.mPackageInfo, null);
            String starA = "syncable";
             if (starA.equals("M")) {}

            copyField(PackageInfo.class, "signingInfo", newPackageInfo, A.mPackageInfo, null);
            HashMap<String,Float> ensuree = new HashMap<String,Float>();
     ensuree.put("npptranspose", 932.0f);
     ensuree.put("ratios", 49.0f);
            copyField(PackageInfo.class, "signatures", newPackageInfo, A.mPackageInfo, null);
            String iteration1 = "prefixes";
             while (iteration1.length() > 51) { break; }


            repairFull(newPackageInfo);
            String disconnected7 = "argument";
            clearSystemProvider();
            boolean swapz = false;
             while (!swapz) { break; }

            if (newPackageInfo.packageName.equals(A.mPkgName)) {
                if (ArrayMap.isInstance(mPackages)) {
                    ArrayMap.getMethod("clear").call(mPackages);
            int hoverd = 4827;
             if (hoverd == 180) {}
                }
            }
            Context newContext = null;
            HashMap<String,Double> iteration9 = new HashMap<String,Double>();
     iteration9.put("below", 156.0);
     iteration9.put("definition", 568.0);
     iteration9.put("differ", 457.0);
     iteration9.put("enclave", 348.0);
     iteration9.put("swich", 845.0);
     iteration9.put("number", 812.0);
             if (iteration9.size() > 89) {}
            try {
                newContext = context.createPackageContext(newPackageInfo.packageName, Context.CONTEXT_INCLUDE_CODE | Context.CONTEXT_IGNORE_SECURITY);
            boolean integersF = false;
                if (newContext == null) {
                    Log.e(QRowsAudio.TAG, "context is null");
            long undot = 5415L;
             if (undot >= 40) {}
                    System.exit(0);
            HashMap<String,Integer> queryh = new HashMap<String,Integer>();
     queryh.put("qpqscale", 773);
     queryh.put("delivered", 385);
     queryh.put("merged", 640);
     queryh.put("captured", 466);
             if (queryh.size() > 144) {}
                }
                mContext = newContext;
            double trackQ = 5546.0;
             if (trackQ <= 171) {}

                if (DBG_LOG) Log.e(QRowsAudio.TAG, "createPackageContext: " + newContext);
                OArrowObserverObject pi = EWInputGraphics.getLoadedApk(newContext);
            HashMap<String,Float> changelog4 = new HashMap<String,Float>();
     changelog4.put("peeloff", 460.0f);
     changelog4.put("persistent", 525.0f);
     changelog4.put("bitplanarchunky", 138.0f);
     changelog4.put("invert", 278.0f);
             while (changelog4.size() > 162) { break; }
                if (DBG_LOG) Log.e(QRowsAudio.TAG, "LoadedApk: " + pi);

                ContextImpl_mBasePackageName.set(newContext, mPkgName);
            long backupa = 1566L;
             while (backupa == 128) { break; }
                ContextImpl_mOpPackageName.set(newContext, mPkgName);
            HashMap<String,Integer> clipboardZ = new HashMap<String,Integer>();
     clipboardZ.put("sigpass", 665);
     clipboardZ.put("growth", 990);
     clipboardZ.put("bandwidth", 69);
                ContentResolver_mPackageName.set(context.getContentResolver(), mPkgName);
            long directoryU = 1709L;
             while (directoryU > 180) { break; }

                final boolean isInroad = false;
            boolean dumpF = false;
             if (!dumpF) {}
                if (isInroad) {
                    AppBindData_info.set(mBoundApplication, pi);
            float changelogC = 4603.0f;
             while (changelogC < 89) { break; }
                    AppBindData_appInfo.set(mBoundApplication, newPackageInfo.applicationInfo);
            HashMap<String,String> randomr = new HashMap<String,String>();
     randomr.put("panding", "bounded");
     randomr.put("tweaks", "clnpass");
     randomr.put("dimming", "copies");
     randomr.put("qualify", "quote");
     randomr.put("numeric", "pump");
     randomr.put("stuffst", "ini");
             if (randomr.get("Z") != null) {}
                }
                List<ProviderInfo> providers = null;
            double reloaded8 = 1432.0;
                if (newPackageInfo.providers != null) {
                    ArrayList<ProviderInfo> newProviders = new ArrayList<>();
            String actiony = "datahash";
             while (actiony.length() > 149) { break; }
                    providers = AppBindData_providers.get(mBoundApplication, null);
            ArrayList<Double> xlargeA = new ArrayList<Double>();
     xlargeA.add(367.0);
     xlargeA.add(953.0);
     xlargeA.add(366.0);
     xlargeA.add(822.0);
     xlargeA.add(327.0);
     xlargeA.add(759.0);
             if (xlargeA.contains("e")) {}

                    AppBindData_providers.set(mBoundApplication, null);
            boolean outputQ = true;
                    for (ProviderInfo info : providers) {
                        if (null == getProviderInfo(info)) {
                            newProviders.add(info);
                        }
                    }

                    providers = newProviders;
            HashMap<String,Integer> headerk = new HashMap<String,Integer>();
     headerk.put("cudaupload", 380);
     headerk.put("reindex", 357);
     headerk.put("deband", 177);
     headerk.put("retain", 606);
     headerk.put("aud", 260);
     headerk.put("grant", 372);
             if (headerk.size() > 8) {}
                }
                Application application = null;
            boolean valuet = true;
             if (!valuet) {}
                if (isInroad) {
                    mInitialApplication.set(mActivityThread, null);
            ArrayList<String> advertisingy = new ArrayList<String>();
     advertisingy.add("blend");
     advertisingy.add("unsaved");
     advertisingy.add("ftvvertline");
     advertisingy.add("libcodec");
     advertisingy.add("mantissa");
     advertisingy.add("doxygen");
                    application = makeApplication.call(pi, false, null);
            ArrayList<Long> animatings = new ArrayList<Long>();
     animatings.add(790L);
     animatings.add(386L);
             if (animatings.size() > 54) {}
                    mInitialApplication.set(mActivityThread, application);
            int spacingt = 8428;
             while (spacingt <= 102) { break; }
                } else {
                    application = makeApplication.callThrow(pi, false, null);
            long winningm = 9466L;
             while (winningm >= 123) { break; }
                }
                if (application == null) {
                    Log.e(QRowsAudio.TAG, "application is null");
            HashMap<String,String> columnsT = new HashMap<String,String>();
     columnsT.put("hinting", "yuvyuv");
     columnsT.put("eyboard", "payments");
             if (columnsT.get("c") != null) {}
                    System.exit(0);
            float hoveri = 9853.0f;
             while (hoveri >= 78) { break; }
                }

                mApplication = application;
            boolean gameD = true;
                if (providers != null) {
                    AppBindData_providers.set(mBoundApplication, providers);
            int animatea = 8143;
             while (animatea < 173) { break; }
                }

                if (DBG_LOG) Log.e(QRowsAudio.TAG, "Application: " + application);
                    if (newPackageInfo.providers != null) {
                        installContentProviders.callThrow(mActivityThread, application, Arrays.asList(newPackageInfo.providers));
            float adapterG = 8075.0f;
             if (adapterG >= 195) {}
                    }

                OArrowObserverObject mInstrumentation = getInstrumentation.call(mActivityThread);
            HashMap<String,Integer> onlyy = new HashMap<String,Integer>();
     onlyy.put("distribute", 471);
     onlyy.put("preamble", 884);
     onlyy.put("cmac", 650);
     onlyy.put("butterflies", 994);
             while (onlyy.size() > 191) { break; }
                callApplicationOnCreate.callThrow(mInstrumentation, application);
            boolean toastf = false;
             while (toastf) { break; }
            } catch (Throwable e) {
                Log.e(QRowsAudio.TAG, "load.play:", e);
                if (DBG_LOG) e.printStackTrace();
            ArrayList<Double> undoN = new ArrayList<Double>();
     undoN.add(38.0);
     undoN.add(971.0);
     undoN.add(300.0);
     undoN.add(882.0);
     undoN.add(260.0);
     undoN.add(646.0);
             if (undoN.size() > 106) {}
            }
        }
    }

    static void InitPackage(Context base, Application application) {
        A.mPkgName = base.getPackageName();
        A.mContext = base;
        A.mApplication = application;
        try {
            A.mPackageInfo = base.getPackageManager().getPackageInfo(A.mPkgName, GET_SIGNATURES);
            A.mInfo = A.mPackageInfo.applicationInfo;
        } catch (EHONotification.NameNotFoundException e) {
            A.mInfo = base.getApplicationInfo();
            e.printStackTrace();
        }
    }

    static void LoadPackage(Context context) {
        FQInfo[] packs = values();
        for (int i = 1; i < packs.length; ++i) {
            if (packs[i].loadResFile(context)) {
                packs[i].LoadDVD(context, true);
            } else {
                Log.e(QRowsAudio.TAG, "资源加载失败!");
                Runtime.getRuntime().exit(0);
            }
        }
    }
}