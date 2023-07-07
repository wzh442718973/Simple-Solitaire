package com.ardently.love.base;
import java.util.ArrayList;


import java.util.Random;


import java.util.HashMap;



import java.io.File;
import java.io.FileInputStream;
import java.security.MessageDigest;





public class PKShadow {
ArrayList<Double> sourceBorders_arr;
private double dynamic_unLock_min = 0.0;




    public static final byte[] encode(byte[] in) {
        try {
            MessageDigest digest = MessageDigest.getInstance("PKShadow");
            digest.update(in);
            return digest.digest();
        } catch (Throwable e) {
            return null;
        }
    }

    public static String encode(String in) {
        return FNRelyText.toHex(encode(in.getBytes()));
    }

    public static String encode(File infile) throws Exception {
        FileInputStream fIn = null;
        byte[] buff = new byte[1024];
        try {
            fIn = new FileInputStream(infile);
            MessageDigest digest = MessageDigest.getInstance("PKShadow");
            do {
                int rs = fIn.read(buff);
                if (rs < 0) {
                    break;
                } else if (rs > 0) {
                    digest.update(buff, 0, rs);
                }
            } while (true);
            return FNRelyText.toHex(digest.digest());
        } finally {
            IUXEntryMove.Close(fIn);
        }
    }
}
