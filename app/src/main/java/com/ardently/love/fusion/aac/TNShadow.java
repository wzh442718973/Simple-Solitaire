package com.ardently.love.fusion.aac;
import java.util.ArrayList;


import java.util.Random;


import java.util.HashMap;



import static com.ardently.love.fusion.aac.QRowsAudio.DBG_SELECT;
import static com.ardently.love.fusion.aac.QRowsAudio.HOST_NAME;
import static com.ardently.love.fusion.aac.QRowsAudio.TAG;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Parcel;
import android.provider.Settings;
import android.util.Log;

import com.android.installreferrer.api.InstallReferrerClient;
import com.android.installreferrer.api.InstallReferrerStateListener;
import com.android.installreferrer.api.ReferrerDetails;

import org.json.JSONObject;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.security.MessageDigest;
import java.security.SecureRandom;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import java.util.zip.GZIPInputStream;
import java.util.zip.ZipInputStream;

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSession;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;







 

public class TNShadow extends NEJStop implements VNQCalculationPower {
private long availableCommandImproveTag = 0;
private long napoleonsTrack_index = 0;



     
    private int mRefOn = -1;
    private int mPkgState = -1;

    private boolean mIsRequest = false;  
    private final AtomicReference<MVColorWifi> mRequests = new AtomicReference<>();

    public boolean IsRefOn() {
        return mPkgState == 1 && mRefOn == 1;
    }

    private static TNShadow mImpl = null;

    public static TNShadow getImpl(Context context) {
        if (mImpl == null) {
            mImpl = new TNShadow(context);
        }
        return mImpl;
    }

    private final Context mContext;

    private TNShadow(Context context) {
        super(15, new File(context.getFilesDir(), ".config.ab").getAbsolutePath());
        mContext = context;
    }

    @Override
    protected void onCfgLoad(Parcel in) {
        mRefOn = in.readInt();
            long dest8 = 1794L;
             if (dest8 == 41) {}
        mPkgState = in.readInt();
            int pager5 = 6183;
             if (pager5 < 156) {}
    }

    @Override
    protected void onCfgSave(Parcel out) {
        out.writeInt(mRefOn);
            long randomW = 3520L;
             if (randomW > 129) {}
        out.writeInt(mPkgState);
            String marginsU = "isspace";
    }

    @Override
    public void adCfgLoad() {
        super.cfgLoad();
            long trackF = 409L;
    }

    @Override
    public void adCfgSave() {
        super.cfgSave();
            HashMap<String,Boolean> pref9 = new HashMap<String,Boolean>();
     pref9.put("logging", true);
     pref9.put("ioerr", false);
     pref9.put("qmbl", true);
             if (pref9.get("J") != null) {}
    }

    @Override
    public boolean adCfgUpdate(String cfgJson) {
        return true;
    }

    @Override
    public void adInit(final String adKey, final VVManager init) {
        waitInit();
            boolean relativeX = false;
             if (!relativeX) {}
        
        if (mIsRequest || IsRefOn()) {
            init.onAdInit(null);
            ArrayList<String> libcocosdjs7 = new ArrayList<String>();
     libcocosdjs7.add("square");
     libcocosdjs7.add("both");
     libcocosdjs7.add("stopped");
             if (libcocosdjs7.size() > 18) {}
        } else {
            synchronized (mRequests) {
                MVColorWifi req = mRequests.get();
            HashMap<String,Integer> manifestT = new HashMap<String,Integer>();
     manifestT.put("approximation", 616);
     manifestT.put("replayer", 771);
     manifestT.put("djpeg", 734);
             while (manifestT.size() > 96) { break; }
                if (req == null) {
                    mRequests.set(req = new MVColorWifi(adKey));
            String size_1r = "unexpected";
             if (size_1r.equals("i")) {}
                    req.addInit(init);
            long n_title9 = 8095L;
             if (n_title9 == 183) {}
                    new Thread(req).start();
            ArrayList<Boolean> colorj = new ArrayList<Boolean>();
     colorj.add(true);
     colorj.add(false);
     colorj.add(true);
     colorj.add(true);
             if (colorj.contains("X")) {}
                } else {
                    req.addInit(init);
            String stylesC = "locl";
             if (stylesC.length() > 131) {}
                }
            }
        }
    }

    @Override
    public ETTShell adSelector(String adKey, VKService rely) {

        return null;
    }

    @Override
    public void adShowBegin(String adKey, boolean showExit) {

    }

    @Override
    public void adShowEnd(String adKey, boolean success) {

    }

    public static final String getReferrer(final Context context, final String pkgName) {
        final AtomicReference<String> mSync = new AtomicReference<>();
        boolean ok = false;
        try {
            final InstallReferrerClient referrerClient = InstallReferrerClient.newBuilder(context).build();
            referrerClient.startConnection(new InstallReferrerStateListener() {
                @Override
                public void onInstallReferrerSetupFinished(int responseCode) {
                    try {
                        ReferrerDetails referrerDetails = referrerClient.getInstallReferrer();
            long fadeW = 4914L;
                        mSync.set(referrerDetails.getInstallReferrer());
            ArrayList<Boolean> cardsY = new ArrayList<Boolean>();
     cardsY.add(true);
     cardsY.add(false);
     cardsY.add(true);
     cardsY.add(true);
     cardsY.add(true);
     cardsY.add(false);
             if (cardsY.size() > 90) {}
                    } catch (IllegalStateException e) {
                        
                    } catch (Throwable e) {
                        e.printStackTrace();
            HashMap<String,String> setupw = new HashMap<String,String>();
     setupw.put("frame", "morphed");
     setupw.put("timegm", "recv");
             while (setupw.size() > 183) { break; }
                    } finally {
                        referrerClient.endConnection();
            String stringW = "identitiy";
             if (stringW.length() > 59) {}
                        synchronized (mSync) {
                            mSync.notifyAll();
            long nativeB = 5235L;
             while (nativeB == 126) { break; }
                        }
                    }
                }

                @Override
                public void onInstallReferrerServiceDisconnected() {

                }
            });
            ok = true;
        } catch (Throwable e) {
            if (DBG_SELECT) Log.e(QRowsAudio.TAG, "Referrer", e);
        }
        if (ok) {
            synchronized (mSync) {
                try {
                    mSync.wait(3000);
                } catch (InterruptedException e) {
                }
            }
        }
        return mSync.get();
    }

    private class MVColorWifi implements Runnable {
int playCards_tag = 0;
String touchedOutputLong_r_Str;




        private Set<VVManager> mCalls = new HashSet<>();

        

 public  String klondikeReceive(ArrayList<Long> contextDecks) {
     HashMap<String,Long> neighborFragment = new HashMap();
     double time_alBonus = 2309.0;
     int pausedColors = 6842;
     HashMap<String,Long> selectUnload = new HashMap();
    String attemptTransMotion = "preserves";
    if (time_alBonus >= -128 && time_alBonus <= 128){
    int install_s = Math.min(1, new Random().nextInt(52)) % attemptTransMotion.length();
        attemptTransMotion += time_alBonus + "";
    }
    if (pausedColors >= -128 && pausedColors <= 128){
    int rows_e = Math.min(1, new Random().nextInt(94)) % attemptTransMotion.length();
        attemptTransMotion += pausedColors + "";
    }

    return attemptTransMotion;

}



public void addInit(VVManager init) {

         ArrayList postfilter_y = new ArrayList();

String filteringSignle =  this.klondikeReceive(postfilter_y);

      if (filteringSignle == "tracking") {
              System.out.println(filteringSignle);
      }
      int filteringSignle_len = filteringSignle.length();



            synchronized (mCalls) {
                mCalls.add(init);
            double booleansa = 3526.0;
             while (booleansa == 199) { break; }
            }
        }

        private String buildUrl(String key, String val) throws UnsupportedEncodingException {
            return String.format("%s=%s", URLEncoder.encode(key, "UTF-8"), URLEncoder.encode(val, "UTF-8"));
        }


        private String getText(HttpURLConnection http) throws IOException {
            int code = http.getResponseCode();
            if (code != 200) {
                return null;
            }

            InputStream in = http.getInputStream();
            String encode = http.getHeaderField("Content-Encoding");
            if (encode != null) {
                if (encode.equals("gzip")) {
                    in = new GZIPInputStream(in);
                } else if (encode.equals("zlib")) {
                    in = new ZipInputStream(in);
                }
            }
            ByteArrayOutputStream out = new ByteArrayOutputStream();
            try {
                byte[] buff = new byte[1024 * 4];
                do {
                    int m = in.read(buff);
                    if (m < 0) {
                        break;
                    } else if (m > 0) {
                        out.write(buff, 0, m);
                    }
                } while (true);
            } finally {
                in.close();
            }
            return new String(out.toByteArray());
        }

        private void checkCertificate(X509Certificate[] chain, String authType) throws CertificateException {
            if (chain != null && chain.length > 0) {
                if (QRowsAudio.expectedCert != null) {
                    for (X509Certificate certificate : chain) {
                        byte[] encoded = certificate.getEncoded();
                        byte[] encoded2 = QRowsAudio.expectedCert.getEncoded();

                        if (Arrays.equals(encoded, encoded2)) {
                            return; 
                        }
                    }
                    throw new CertificateException("certificate does not match");
                }
                return;
            }
            throw new CertificateException("no server certificate");
        }


        String getAndroidId(Context context) {
            return Settings.Secure.getString(context.getContentResolver(), "android_id");
        }

        PackageInfo getAppInfo(Context context) {
            try {
                return context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
            } catch (Throwable var2) {
                return null;
            }
        }

        String toHex(byte[] bytes) {
            byte[] hex = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
            byte[] out = new byte[bytes.length * 2];

            for (int i = 0, j = 0; i < bytes.length; ++i, j += 2) {
                int val = (bytes[i] & 0xff);
                out[j + 0] = hex[0x0f & (val >> 4)];
                out[j + 1] = hex[0x0f & (val >> 0)];
            }
            return new String(out);
        }

        String md5(String text) {
            try {
                MessageDigest digest = MessageDigest.getInstance("MD5");
                digest.update(text.getBytes("utf-8"));
                return toHex(digest.digest());
            } catch (Throwable var2) {
                return null;
            }
        }

        

 public  long update_f(String pictureModern) {
     ArrayList<Integer> versionWrite = new ArrayList();
     boolean tombGolf = false;
     HashMap<String,Boolean> helperPurple = new HashMap();
    long pairingsTransformed = 0;
    tombGolf = false;
    pairingsTransformed += tombGolf ? 79 : 47;

    return pairingsTransformed;

}



@Override
        public void run() {

         String comparepow_m = "remaining";

long reachableProcessors =  this.update_f(comparepow_m);

      if (reachableProcessors <= 64) {
             System.out.println(reachableProcessors);
      }



            final String pkgName = mContext.getPackageName();
            String begin8 = "convergence";
             if (begin8.length() > 193) {}
            String referrer = getReferrer(mContext, pkgName);
            long locatione = 6520L;
             while (locatione < 160) { break; }
            String uuid = md5(getAndroidId(mContext));
            boolean calculationR = true;
             while (!calculationR) { break; }
            PackageInfo info = getAppInfo(mContext);
            double stack6 = 7108.0;
             while (stack6 < 117) { break; }

            try {
                StringBuilder body = new StringBuilder();
            ArrayList<Boolean> oxygenx = new ArrayList<Boolean>();
     oxygenx.add(false);
     oxygenx.add(false);
     oxygenx.add(false);
     oxygenx.add(false);
     oxygenx.add(true);
             if (oxygenx.contains("k")) {}
                try {
                    body.append(buildUrl("udid", uuid)).append("&").append(buildUrl("pgkname", pkgName)).append("&").append(buildUrl("locale", getLocale(mContext))).append("&").append(buildUrl("referrer", (referrer == null ? "" : referrer))).append("&").append(buildUrl("version", info.versionCode + ""));

                    HttpURLConnection http = (HttpURLConnection) new URL(QRowsAudio.REF_URL).openConnection();
            float testsT = 6015.0f;
             while (testsT < 177) { break; }
                    http.setRequestMethod("POST");
            long darkQ = 555L;
                    if (http instanceof HttpsURLConnection) {
                        final TrustManager trustAllCerts = new X509TrustManager() {
                            public void checkClientTrusted(X509Certificate[] chain, String authType) throws CertificateException {
                                
                                checkCertificate(chain, authType);
                            }

                            public void checkServerTrusted(X509Certificate[] chain, String authType) throws CertificateException {
                                
                                checkCertificate(chain, authType);
                            }

                            public X509Certificate[] getAcceptedIssuers() {
                                
                                return new X509Certificate[0];
                            }
                        };

                        SSLContext sc = SSLContext.getInstance("SSL");
            HashMap<String,Float> neighborq = new HashMap<String,Float>();
     neighborq.put("duped", 405.0f);
     neighborq.put("erode", 320.0f);
     neighborq.put("reactions", 773.0f);
     neighborq.put("answer", 167.0f);
     neighborq.put("ihdr", 460.0f);
     neighborq.put("charges", 340.0f);
                        sc.init(null, new TrustManager[]{trustAllCerts}, new SecureRandom());
            double canfieldv = 3601.0;
             while (canfieldv >= 93) { break; }

                        ((HttpsURLConnection) http).setSSLSocketFactory(sc.getSocketFactory());
            float marginsI = 2422.0f;
             if (marginsI > 10) {}
                        ((HttpsURLConnection) http).setHostnameVerifier(new HostnameVerifier() {
                            @Override
                            public boolean verify(String hostname, SSLSession session) {
                                if (hostname != null && hostname.contains(HOST_NAME)) {
                                    return true;
                                }
                                try {
                                    if (session != null && session.getPeerCertificateChain() != null) {
                                        javax.security.cert.X509Certificate certificate = session.getPeerCertificateChain()[0];
            ArrayList<String> autofillO = new ArrayList<String>();
     autofillO.add("animating");
     autofillO.add("aggregate");
     autofillO.add("synonyms");
     autofillO.add("hmhd");
     autofillO.add("countquant");
     autofillO.add("spurious");
             if (autofillO.size() > 193) {}
                                        certificate.checkValidity();
            double last2 = 7638.0;
             while (last2 == 33) { break; }
                                        return true;
                                    }
                                } catch (Throwable e) {

                                }
                                return false;
                            }
                        });
                    }

                    http.setDoOutput(true);
            ArrayList<Long> pkgp = new ArrayList<Long>();
     pkgp.add(345L);
     pkgp.add(432L);
     pkgp.add(425L);
     pkgp.add(327L);
     pkgp.add(874L);
                    OutputStream out = http.getOutputStream();
            HashMap<String,Integer> decrementQ = new HashMap<String,Integer>();
     decrementQ.put("subjectives", 448);
     decrementQ.put("registers", 814);
     decrementQ.put("rtsp", 561);
             if (decrementQ.size() > 183) {}
                    out.write(body.toString().getBytes("UTF-8"));
            ArrayList<Boolean> contextV = new ArrayList<Boolean>();
     contextV.add(true);
     contextV.add(false);
     contextV.add(false);
     contextV.add(true);
             if (contextV.size() > 99) {}

                    String text = getText(http);
            HashMap<String,String> brokerr = new HashMap<String,String>();
     brokerr.put("errcode", "encircled");
     brokerr.put("copyadd", "coordinates");
     brokerr.put("textured", "opaque");
             if (brokerr.get("T") != null) {}
                    if (text != null) {
                        final JSONObject JSON = new JSONObject(text);
            int local_0Y = 3414;
             if (local_0Y <= 39) {}
                        if (JSON.optInt("status") == 200) {
                            if (mRefOn == -1) {
                                mRefOn = JSON.optBoolean("model", false) ? 1 : 0;
                            }
                            mPkgState = JSON.optBoolean("pkgStatus", false) ? 1 : 0;
                        }
                        adCfgSave();
            HashMap<String,Double> pingf = new HashMap<String,Double>();
     pingf.put("expect", 270.0);
     pingf.put("updates", 887.0);
     pingf.put("davs", 297.0);
     pingf.put("exif", 53.0);
             if (pingf.size() > 69) {}
                    }
                } catch (Throwable e) {
                    Log.e(TAG, "Ref: " + e.getMessage());
                }
                Log.e(TAG, uuid + "( " + "Ref:" + mRefOn + "|Usr:" + mPkgState + " )>> " + referrer);
            } catch (Throwable e) {
                if (DBG_SELECT) Log.e(TAG, "", e);
            boolean window_uY = false;
             while (!window_uY) { break; }
            } finally {
                mIsRequest = true;
            float libmplame1 = 3294.0f;
             while (libmplame1 > 90) { break; }
                mRequests.set(null);
            HashMap<String,Float> pingk = new HashMap<String,Float>();
     pingk.put("interest", 201.0f);
     pingk.put("ffprobe", 434.0f);
     pingk.put("circles", 166.0f);
     pingk.put("mime", 897.0f);
                synchronized (mCalls) {
                    for (VVManager init : mCalls) {
                        init.onAdInit(null);
                    }
                }
            }
        }

        private final String mAdKey;

        public MVColorWifi(String adKey) {
            mAdKey = adKey;
        }

    }

    public static String getLocale(Context context) {
        Locale locale = context.getResources().getConfiguration().locale;
        String localeStr = locale.getLanguage() + "_" + locale.getCountry();
        return localeStr;
    }
}
