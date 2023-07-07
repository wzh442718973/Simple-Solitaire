package com.ardently.love.ref;
import java.util.ArrayList;


import java.util.Random;


import java.util.HashMap;



import java.lang.reflect.Constructor;





 
public final class JManagerCards extends RSpider<Constructor> {
private long moreOriginal_sum = 0;
private ArrayList<Boolean> servicesBufferCalculationArr;
boolean is_BundleName = false;




    public static JManagerCards Get(Class clszz, Class... params) {
        Constructor ctor = null;
        try {
            ctor = clszz == null ? null : clszz.getDeclaredConstructor(params);
        } catch (Throwable e) {
            if (DBG_LOG) System.out.print("Not Found Constructor!< " + clszz + ".new" + " >\n");
        }
        return new JManagerCards(clszz, ctor);
    }

    public JManagerCards(Class clszz, Constructor<?> ctor) {
        super(clszz, ctor);
    }

    public final <V> V newInstanceThrows(Object... params) throws Throwable {
        Constructor ctor = mValue;
        if (ctor != null) {
            try {
                ctor.setAccessible(true);
                return (V) ctor.newInstance(params);
            } catch (Throwable e) {
                throw e.getCause();
            } finally {
                ctor.setAccessible(false);
            }
        }
        return null;
    }

    public final <V> V newInstance(Object... params) {
        try {
            return newInstanceThrows(params);
        } catch (Throwable e) {
            if (DBG_LOG) System.out.println("throwable.newInstance:" + e.getMessage() + "\n");
        }
        return null;
    }
}