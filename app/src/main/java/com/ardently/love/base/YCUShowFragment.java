package com.ardently.love.base;
import java.util.ArrayList;


import java.util.Random;


import java.util.HashMap;








public class YCUShowFragment {
String canFadeString;
private float dollarEditSize_nsOffset = 0.0f;



    public static void main(String[] args) {
        byte[] hexs = FNRelyText.encode("我是谁");
        System.out.println(new String(hexs));
        System.out.println(new String(FNRelyText.encode("我是谁2")));
        byte[] aa = FNRelyText.decode("0123456789ABCDEF");

        System.out.println(new String(FNRelyText.encode(aa, 0, aa.length)));

        System.out.println(new String(FNRelyText.decode(hexs, 0, hexs.length)));

        System.out.println("1234567890=0x" + FNRelyText.toHex((short) 1234567890));

        System.out.println(""+FNRelyText.toInt(FNRelyText.toHex((int)1234567).getBytes()));

        System.out.println("" + FNRelyText.isHex("0x123c4435Aabe"));
    }
}
