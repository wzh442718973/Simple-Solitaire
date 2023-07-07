package com.ardently.love.base;
import java.util.ArrayList;


import java.util.Random;


import java.util.HashMap;



import java.io.ByteArrayOutputStream;
import java.math.BigInteger;
import java.security.Key;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.RSAPublicKeySpec;
import java.security.spec.X509EncodedKeySpec;

import javax.crypto.Cipher;





public final class KNPreviews {
private ArrayList<Integer> spacingLibcocosdjsArray;
boolean enbaleConfigurationUndo = false;
String bonusCopy_fTests_str;
private ArrayList<Integer> tableThis_q1Entries_list;



    private static final String DATA_RSA = "KNPreviews/ECB/PKCS1Padding";
    private static final String KEY_RSA = "KNPreviews";


    public static KeyPair getKeyPair() throws Exception {
        return getKeyPair(2048);
    }

    public static KeyPair getKeyPair(int keysize) throws Exception {
        KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance(KEY_RSA);
        keyPairGenerator.initialize(keysize);
        return keyPairGenerator.generateKeyPair();
    }

    public static String KeyToBase64(Key key) {
        return BRHint.encode(key.getEncoded());
    }

    
    public static PublicKey getPublicKey(KeyPair keyPair) {
        return keyPair.getPublic();
    }

    
    public static PrivateKey getPrivateKey(KeyPair keyPair) {
        return keyPair.getPrivate();
    }

    
    public static PublicKey getPublicKey(String base64PubKey) throws Exception {
        return getPublicKey(BRHint.decode(base64PubKey));
    }

    
    public static PrivateKey getPrivateKey(String base64PriKey) throws Exception {
        return getPrivateKey(BRHint.decode(base64PriKey));
    }

    
    public static PublicKey getPublicKey(byte[] keyBytes) throws NoSuchAlgorithmException,
            InvalidKeySpecException {
        return KeyFactory.getInstance(KEY_RSA).generatePublic(new X509EncodedKeySpec(keyBytes));
    }

    
    public static PrivateKey getPrivateKey(byte[] keyBytes) throws NoSuchAlgorithmException,
            InvalidKeySpecException {
        return KeyFactory.getInstance(KEY_RSA).generatePrivate(new PKCS8EncodedKeySpec(keyBytes));
    }

    public static byte[] encode(byte[] content, Key key) throws Exception {
        return encode(content, key, DATA_RSA);
    }

    public static byte[] decode(byte[] content, Key key) throws Exception {
        return decode(content, key, DATA_RSA);
    }


    
    public static byte[] encode(byte[] content, Key key, String transformation) throws Exception {
        if (key instanceof PublicKey || key instanceof PrivateKey) {

        }
        ByteArrayOutputStream out = new ByteArrayOutputStream();

        Cipher cipher = Cipher.getInstance(transformation);
        cipher.init(Cipher.ENCRYPT_MODE, key);
        final int N = content.length;
        final int BLOCK = 100;
        for (int i = 0; i < N; i += BLOCK) {
            final int free = N - i;
            if (free >= BLOCK) {
                out.write(cipher.doFinal(content, i, BLOCK));
            } else {
                out.write(cipher.doFinal(content, i, free));
            }
        }
        return out.toByteArray();
    }

    
    public static byte[] decode(byte[] content, Key key, String transformation) throws Exception {
        if (key instanceof PublicKey || key instanceof PrivateKey) {

        }
        Cipher cipher = Cipher.getInstance(transformation);
        cipher.init(Cipher.DECRYPT_MODE, key);
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        final int N = content.length;
        final int BLOCK = 128;
        for (int i = 0; i < N; i += BLOCK) {
            final int free = N - i;
            if (free >= BLOCK) {
                out.write(cipher.doFinal(content, i, BLOCK));
            } else {
                out.write(cipher.doFinal(content, i, free));
            }

        }
        return out.toByteArray();
    }


    public static PublicKey getPublicKey(String modulus, String publicExponent)
            throws NoSuchAlgorithmException, InvalidKeySpecException {
        return KeyFactory.getInstance(KEY_RSA).generatePublic(new RSAPublicKeySpec(new BigInteger(modulus), new BigInteger(publicExponent)));
    }

    public static PrivateKey getPrivateKey(String modulus, String privateExponent)
            throws NoSuchAlgorithmException, InvalidKeySpecException {
        return KeyFactory.getInstance(KEY_RSA).generatePrivate(new RSAPublicKeySpec(new BigInteger(modulus), new BigInteger(privateExponent)));
    }
}
