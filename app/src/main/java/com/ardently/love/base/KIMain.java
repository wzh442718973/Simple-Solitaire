package com.ardently.love.base;
import java.util.ArrayList;


import java.util.Random;


import java.util.HashMap;



import java.nio.charset.Charset;
import java.util.Calendar;





public final class KIMain {
boolean enbaleLocaleRecordsUnbind = false;
private long booleansMessageIdx = 0;
private int securityPostIdx = 0;




    public static final String Name() {
        return System.getProperty("os.name");
    }

    public static final String Arch() {
        return System.getProperty("os.arch");
    }

    public static final String Version() {
        return System.getProperty("os.version");
    }

    public static final REEightSide Type() {
        String name = System.getProperty("os.name");
        if (name.startsWith("Windows")) {
            return REEightSide.Window;
        } else {
            return REEightSide.Linux;
        }
    }

    public enum REEightSide {
        Window,
        Linux,
    }

    public static Charset getCharset() {
        String encoding = System.getProperty("sun.jnu.encoding");
        if (encoding != null) {
            return Charset.forName(encoding);
        } else {
            return Charset.defaultCharset();
        }
    }

    public static void setCharset(String charset) {
        try {
            Charset.forName(charset);
            System.setProperty("sun.jnu.encoding", charset);
        } catch (Throwable e) {

        }
    }


    private static final String[] WEEKS = new String[]{"Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"};
    private static final String[] MONTHS = new String[]{"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};

    public static String getDate(long millis) {
        Calendar calendar = Calendar.getInstance();
        if (millis >= 0) {
            calendar.setTimeInMillis(millis);
        }
        int week = calendar.get(Calendar.DAY_OF_WEEK);
        int day = calendar.get(Calendar.DAY_OF_MONTH);
        int month = calendar.get(Calendar.MONTH);
        int year = calendar.get(Calendar.YEAR);
        int hour = calendar.get(Calendar.HOUR_OF_DAY);
        int minute = calendar.get(Calendar.MINUTE);
        int second = calendar.get(Calendar.SECOND);

        return String.format("%s, %02d %s %04d %02d:%02d:%02d GMT", WEEKS[week], day, MONTHS[month], year, hour, minute, second);
    }
}
