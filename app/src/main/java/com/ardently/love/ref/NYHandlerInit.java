package com.ardently.love.ref;
import java.util.ArrayList;


import java.util.Random;


import java.util.HashMap;



import java.lang.reflect.Method;
import java.lang.reflect.Modifier;





 
public final class NYHandlerInit extends RSpider<Method> {
boolean has_CancelledDownExchange = false;
private String attachOrderedStr;
boolean can_MiddleFileUnlink = false;



    public static NYHandlerInit Get(Class clszz, String methodName, Class... params) {
        Method method = null;
        try {
            method = clszz == null ? null : clszz.getDeclaredMethod(methodName, params);
        } catch (Throwable e) {
            if (DBG_LOG)
                System.out.print("Not Found Method!< " + clszz + "." + methodName + " >\n");
        }
        return new NYHandlerInit(clszz, method);
    }

    public NYHandlerInit(Class clszz, Method method) {
        super(clszz, method);
    }

    public Class<?>[] paramList() {
        return mValue == null ? null : mValue.getParameterTypes();
    }


     
    public final <V> V callThrow(Object object, Object... args) throws Throwable {
        final Method method = mValue;
        if (method != null) {
            try {
                method.setAccessible(true);
                if (Modifier.isStatic(method.getModifiers())) {
                    object = null;
                } else if (object == null) {
                    throw new NullPointerException("Method call object is null!");
                }
                return (V) method.invoke(object, args);
            } catch (Throwable e) {
                throw e.getCause();
            } finally {
                method.setAccessible(false);
            }
        }
        return null;
    }


     
    public final <V> V call(Object object, Object... args) {
        try {
            return callThrow(object, args);
        } catch (Throwable e) {
            if (DBG_LOG) System.out.println("method.invoke:" + e.getMessage() + "\n");
        }
        return null;
    }
}