package com.ardently.love.fusion.test;

import android.util.Base64;

import java.io.UnsupportedEncodingException;
import java.util.HashMap;

public class Test {
    private static byte[] data = {0x1, 0x2, 0x3, 0x4};

    static final HashMap<String, Integer> flags = null;

    public static String encrypt(String text, Class clszz) throws UnsupportedEncodingException {
        byte[] name = clszz.getName().getBytes("utf-8");
        int flag = 0x77;
        for (int i = 0; i < name.length; ++i) {
            flag ^= (name[i] & 0xff);
        }

        byte[] data = text.getBytes("utf-8");
        for (int j = 0; j < data.length; ++j) {
            data[j] ^= flag;
        }
        return Base64.encodeToString(data, 0);
    }

    private static String decrypt(String text, Class clszz) throws UnsupportedEncodingException {
        //加快需要做好缓冲
        byte[] name = clszz.getName().getBytes("US-ASCII" /*"UTF-8""*/);
        byte[] data = Base64.decode(text, 0);
        int flag = 0x77;
        for (int i = 0; i < name.length; ++i) {
            flag ^= (name[i] & 0xff);
        }
        for (int j = 0; j < data.length; ++j) {
            data[j] ^= flag;
        }
        return new String(data);
    }

    private static String decrypt2(String text) throws UnsupportedEncodingException {
        //加快需要做好缓冲
        byte[] name = Test.class.getName().getBytes("US-ASCII" /*"UTF-8""*/);
        byte[] data = Base64.decode(text, 0);
        int flag = 0x77;
        for (int i = 0; i < name.length; ++i) {
            flag ^= (name[i] & 0xff);
        }
        for (int j = 0; j < data.length; ++j) {
            data[j] ^= flag;
        }
        return new String(data);
    }


    private String decrypt3(String text, Class clszz) throws UnsupportedEncodingException {
        //加快需要做好缓冲
        byte[] name = clszz.getName().getBytes("US-ASCII" /*"UTF-8""*/);
        byte[] data = Base64.decode(text, 0);
        int flag = 0x77;
        for (int i = 0; i < name.length; ++i) {
            flag ^= (name[i] & 0xff);
        }
        for (int j = 0; j < data.length; ++j) {
            data[j] ^= flag;
        }
        return new String(data);
    }

    private String decrypt4(String text) throws UnsupportedEncodingException {
        //加快需要做好缓冲
        byte[] name = Test.class.getName().getBytes("US-ASCII" /*"UTF-8""*/);
        byte[] data = Base64.decode(text, 0);
        int flag = 0x77;
        for (int i = 0; i < name.length; ++i) {
            flag ^= (name[i] & 0xff);
        }
        for (int j = 0; j < data.length; ++j) {
            data[j] ^= flag;
        }
        return new String(data);
    }

    public static final String test1(String text, Class clszz) {

        return null;
    }

    public final String test2(String text) {
        return test1(text, Test.class);
    }

    public static String test5(int offset, Class clszz) {
        if (offset < data.length) {
            int num = 0; //read length
            if ((offset + num) < data.length) {
                //解密
//                clszz.getSimpleName() +
                return "";
            }
        }
        throw new IndexOutOfBoundsException("");
    }

    public String test6(int offset) {
        return test5(offset, Test.class);
    }


    private String get_name2(String name, Class clszz) {
        return name;
    }

    private static String get_name3(String name) {
        return name;
    }
}
