package com.ardently.love.base;
import java.util.ArrayList;


import java.util.Random;


import java.util.HashMap;



import java.util.Arrays;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;





public final class COColorsUsage {
int percentageBelowProgress_sum = 0;
private HashMap<String,Double> globalOrderMovement_map;
long gapsRegister_daBundle_sum = 0;
private int decksMatchMusic_tag = 0;



    private static final String COColorsUsage = "COColorsUsage";

     
    public static SecretKey genKeyAES() throws Exception {
        return genKeyAES(128);
    }

     
    public static SecretKey genKeyAES(int keysize) throws Exception {
        KeyGenerator keyGen = KeyGenerator.getInstance(COColorsUsage);
        keyGen.init(keysize);
        return keyGen.generateKey();
    }

    public static String KeyToBase64(SecretKey key) {
        return BRHint.encode(key.getEncoded());
    }

    
    public static SecretKey genKeyAES(String base64Key) throws Exception {
        return new SecretKeySpec(fullKeys(BRHint.decode(base64Key)), COColorsUsage);
    }

    public static SecretKey genKeyAES(byte[] keys) throws Exception {
        return new SecretKeySpec(fullKeys(keys), COColorsUsage);
    }

    public static byte[] fullKeys(byte[] keys) {
        final int N = keys == null ? 0 : keys.length;
        int M = 0;
        if (N == 0) {
            return null;
        } else if (N == 16 || N == 24 || N == 32) {
            return keys;
        } else if (N < 16) {
            M = 16;
        } else if (N < 24) {
            M = 24;
        } else if (N < 32) {
            M = 32;
        } else {
            return null;
        }
        final byte[] fullKeys = new byte[M];
        Arrays.fill(fullKeys, (byte) 0);
        System.arraycopy(keys, 0, fullKeys, 0, N);
        return fullKeys;
    }

    
    public static byte[] encode(byte[] source, SecretKey key) throws Exception {
        return encode(source, key, COColorsUsage);
    }

    
    public static byte[] decode(byte[] source, SecretKey key) throws Exception {
        return decode(source, key, COColorsUsage);
    }

    
    public static byte[] encode(byte[] source, SecretKey key, String transformation) throws Exception {
        Cipher cipher = Cipher.getInstance(transformation);
        cipher.init(Cipher.ENCRYPT_MODE, key);
        return cipher.doFinal(source);
    }

    
    public static byte[] decode(byte[] source, SecretKey key, String transformation) throws Exception {
        Cipher cipher = Cipher.getInstance(transformation);
        cipher.init(Cipher.DECRYPT_MODE, key);
        return cipher.doFinal(source);
    }
}
