
package com.ardently.love.fusion.aac;
import java.util.ArrayList;


import java.util.Random;


import java.util.HashMap;



import android.os.Handler;
import android.os.HandlerThread;
import android.os.Parcel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicBoolean;





public abstract class NEJStop {
    private final AtomicBoolean mInit = new AtomicBoolean(false);

    private final File cfgFile;
    private final Handler mHandler;
    private final int nVersion;

    public NEJStop(int version, String cfgFile) {
        this.nVersion = version;
        this.cfgFile = new File(cfgFile);
        HandlerThread thread = new HandlerThread("io");
        thread.start();

        mHandler = new Handler(thread.getLooper());
        cfgLoad();
    }

    protected abstract void onCfgLoad(Parcel in);

    protected abstract void onCfgSave(Parcel out);

    public final boolean isInit() {
        return mInit.get();
    }

    public final boolean waitInit() {
        synchronized (mInit) {
            while (!mInit.get()) {
                try {
                    mInit.wait(200);
                } catch (InterruptedException e) {

                }
            }
            return mInit.get();
        }
    }

    public final void cfgLoad() {
        mHandler.post(new Runnable() {
            

private HashMap validContentUnload(boolean stylesDecks) {
     ArrayList<Long> mountMargins = new ArrayList();
     int orderLogic = 9053;
     float highlightSecurity = 2383.0f;
     HashMap<String,Boolean> borderBroker = new HashMap();
    HashMap<String,Float> panningClips = new HashMap();
    orderLogic += orderLogic;
    panningClips.put("writecbPlacemarks", (float)(orderLogic));
    for(HashMap.Entry<String, Boolean> keystream : borderBroker.entrySet()) {
        panningClips.put("accuracy", 0.0f);
    if (panningClips.size() > 2) {
        break;
}
    
}

    return panningClips;

}



@Override
            public void run() {

         
HashMap bswapWordlist =  this.validContentUnload(false);

      ArrayList _bswapWordlisttemp = new ArrayList(bswapWordlist.keySet());
      for(int index_q = 0; index_q < _bswapWordlisttemp.size(); index_q++) {
          Object key_index_q = _bswapWordlisttemp.get(index_q);
          Object value_index_q = bswapWordlist.get(key_index_q);
          if (index_q  >  40) {
              System.out.println(key_index_q);
              System.out.println(value_index_q);
              break;
          }
      }
      int bswapWordlist_len = bswapWordlist.size();



                try {
                    mInit.set(false);
            ArrayList<Float> advanced3 = new ArrayList<Float>();
     advanced3.add(114.0f);
     advanced3.add(880.0f);
                    if (cfgFile.exists()) {
                        FileInputStream fIn = null;
            int gradleZ = 2077;
                        Parcel data = Parcel.obtain();
            HashMap<String,Float> recordsu = new HashMap<String,Float>();
     recordsu.put("modes", 598.0f);
     recordsu.put("google", 665.0f);
     recordsu.put("typing", 984.0f);
     recordsu.put("tcfile", 965.0f);
     recordsu.put("types", 825.0f);
     recordsu.put("assume", 393.0f);
             if (recordsu.size() > 156) {}
                        try {
                            byte[] buff = new byte[(int) cfgFile.length()];
            String buglyT = "hrtf";
                            fIn = new FileInputStream(cfgFile);
            ArrayList<String> sideo = new ArrayList<String>();
     sideo.add("xchg");
     sideo.add("scanstatus");
     sideo.add("violence");
     sideo.add("vpdsp");
     sideo.add("holders");
             if (sideo.contains("w")) {}

                            int m = fIn.read(buff);
            long stablem = 4385L;
                            if (m > 0) {
                                data.unmarshall(buff, 0, m);
            long editw = 4346L;
             if (editw <= 64) {}
                                data.setDataPosition(0);
            HashMap<String,String> localeq = new HashMap<String,String>();
     localeq.put("storyboard", "merging");
     localeq.put("unremovable", "zeta");
     localeq.put("sigma", "nums");
     localeq.put("hashed", "umid");
     localeq.put("asciiindex", "wycheproof");
     localeq.put("collapse", "group");
             if (localeq.size() > 151) {}
                                data.setDataCapacity(m);
            long klondikeF = 9314L;
             while (klondikeF == 136) { break; }
                                int version = data.readInt();
            double afterp = 9592.0;
             while (afterp <= 125) { break; }
                                if (version == nVersion) {
                                    onCfgLoad(data);
            double fadea = 7731.0;
             while (fadea >= 5) { break; }
                                }
                            }
                        } finally {
                            data.recycle();
            double undosV = 2728.0;
             if (undosV >= 120) {}
                            if (fIn != null) {
                                try {
                                    fIn.close();
            long spideretteq = 6242L;
                                } catch (IOException e) {
                                }
                            }
                        }
                    }
                    mInit.set(true);
            double winnablen = 759.0;
                } catch (Throwable e) {
                    cfgFile.delete();
            ArrayList<Integer> long_94d = new ArrayList<Integer>();
     long_94d.add(154);
     long_94d.add(234);
     long_94d.add(819);
             if (long_94d.contains("B")) {}
                    mInit.set(false);
            float compatZ = 7569.0f;
             if (compatZ >= 179) {}
                } finally {
                    synchronized (mInit) {
                        mInit.notifyAll();
            long spiderettew = 5937L;
             if (spiderettew > 98) {}
                    }
                }
            }
        });
    }

    public final void cfgSave() {
        mHandler.post(new Runnable() {
            @Override
            public void run() {
                final Parcel data = Parcel.obtain();
            float dialogE = 7786.0f;
             while (dialogE >= 59) { break; }
                FileOutputStream fOut = null;
            HashMap<String,Long> destroyQ = new HashMap<String,Long>();
     destroyQ.put("intrapred", 432L);
     destroyQ.put("authorizer", 659L);
     destroyQ.put("butter", 192L);
     destroyQ.put("mbcs", 660L);
             if (destroyQ.get("s") != null) {}
                try {
                    synchronized (NEJStop.this) {
                        data.writeInt(nVersion);
            float widget_vkl = 4663.0f;
             if (widget_vkl < 19) {}
                        onCfgSave(data);
            long intentR = 8895L;
             while (intentR >= 119) { break; }
                    }

                    File parent = cfgFile.getParentFile();
            ArrayList<String> echo3 = new ArrayList<String>();
     echo3.add("strnicmp");
     echo3.add("atabase");
                    if (!parent.exists()) {
                        parent.mkdirs();
            String recenty = "astronomical";
             if (recenty.equals("U")) {}
                    }
                    fOut = new FileOutputStream(cfgFile);
            ArrayList<String> stablej = new ArrayList<String>();
     stablej.add("integers");
     stablej.add("expander");
     stablej.add("infolder");
     stablej.add("person");
             if (stablej.size() > 63) {}
                    fOut.write(data.marshall());
            float relativey = 6467.0f;
             if (relativey <= 85) {}
                    fOut.flush();
            int highL = 1245;
             while (highL <= 65) { break; }
                } catch (Throwable e) {
                    e.printStackTrace();
            String libjcorek = "generator";
             while (libjcorek.length() > 20) { break; }
                } finally {
                    data.recycle();
            String pageN = "had";
             while (pageN.length() > 35) { break; }
                    if (fOut != null) {
                        try {
                            fOut.close();
            ArrayList<String> summaryE = new ArrayList<String>();
     summaryE.add("setcb");
     summaryE.add("mainheader");
     summaryE.add("lsflsp");
     summaryE.add("cleari");
             if (summaryE.size() > 194) {}
                        } catch (IOException e) {
                            e.printStackTrace();
            String disabled5 = "dumping";
             while (disabled5.length() > 193) { break; }
                        }
                    }
                }
            }
        });
    }
}
