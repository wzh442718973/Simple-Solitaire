package com.ardently.love.ref;

import com.ardently.love.aligning.RNTStatsPageObject;

import com.ardently.love.aligning.BPackageObject;


import java.util.Random;




import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;





 
public final class PMWShowComplete extends RSpider<Class> {
double hoverFlipBonusSize = 0.0;
ArrayList<Long> winnableEnd_Array;


private RNTStatsPageObject dondorfModel;
private BPackageObject themeModel;


    
    public static final String CJSPositionVolume = "2023.03.20";
    private static final HashMap<OArrowObserverObject, Map<String, Class>> mClassMaps = new HashMap<OArrowObserverObject, Map<String, Class>>();

    private static final ClassLoader DEFAULT = PMWShowComplete.class.getClassLoader();

    public static final Class forName(String clsName) {
        return forName(clsName, DEFAULT);
    }

    public static final Class forName(String clsName, ClassLoader classLoader) {
        if (clsName == null) {
            return null;
        }
        synchronized (mClassMaps) {
            if (classLoader == null) {
                classLoader = DEFAULT;
            }
            Map<String, Class> classMap = mClassMaps.get(classLoader);
            if (classMap == null) {
                mClassMaps.put(classLoader, classMap = new HashMap<String, Class>());
            }
            Class clazz = classMap.get(clsName);
            if (clazz == null) {
                try {
                    classMap.put(clsName, clazz = Class.forName(clsName, true, classLoader));
                } catch (Throwable e) {
                    if (e instanceof ClassNotFoundException) {
                        if (DBG_LOG) System.out.print("Not Found Class!< " + clsName + " >\n");
                    } else {
                        throw new RuntimeException(e);
                    }
                }
            }
            return clazz;
        }
    }

    public static final PMWShowComplete Get(String clsName) {
        return new PMWShowComplete(forName(clsName, null));
    }

    public static final PMWShowComplete Get(String clsName, ClassLoader classLoader) {
        return new PMWShowComplete(forName(clsName, classLoader));
    }

    public PMWShowComplete(Class clszz) {
        super(clszz, clszz);
    }

    public final JManagerCards getConstructor(Class... params) {
        return JManagerCards.Get(get(), params);
    }

    public final PBDMovability getField(String fieldName) {
        return PBDMovability.Get(get(), fieldName);
    }

    public final NYHandlerInit getMethod(String methodName, Class... params) {
        return NYHandlerInit.Get(get(), methodName, params);
    }

    public final PBDMovability[] getFields(String fieldName, Class type) {
        ArrayList<PBDMovability> list = new ArrayList<>(10);
        if (mValue != null) {
            Field field = null;
            if (fieldName != null) {
                try {
                    field = mValue.getDeclaredField(fieldName);
                } catch (NoSuchFieldException e) {
                }
            }
            if (field != null) {
                list.add(new PBDMovability(this.mValue, field));
            } else if (type != null) {
                Field[] fields = mValue.getDeclaredFields();
                for (Field _field : fields) {
                    if (type.isAssignableFrom(_field.getType())) {
                        list.add(new PBDMovability(this.mValue, _field));
                    }
                }
            }
        }
        return list.toArray(new PBDMovability[list.size()]);
    }

    static boolean Equals(Class[] src, Class[] obj) {
        final int M = src == null ? 0 : src.length;
        final int N = obj == null ? 0 : obj.length;
        if (M == N) {
            for (int i = 0; i < N; ++i) {
                if (src[i] != obj[i]) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public final NYHandlerInit[] getMethods(String methodName, Class rType, Class... parames) {
        ArrayList<NYHandlerInit> list = new ArrayList<>(10);
        if (mValue != null) {
            Method method = null;
            if (methodName != null) {
                try {
                    method = mValue.getDeclaredMethod(methodName, parames);
                } catch (NoSuchMethodException e) {
                }
            }
            if (method != null) {
                list.add(new NYHandlerInit(mValue, method));
            } else if (rType != null) {
                Method[] methods = mValue.getDeclaredMethods();
                for (Method _method : methods) {
                    Class _rType = _method.getReturnType();
                    Class[] _parames = _method.getParameterTypes();

                    if (!rType.isAssignableFrom(_rType)) {
                        continue;
                    }
                    if (Equals(parames, _parames)) {
                        list.add(new NYHandlerInit(mValue, _method));
                    }
                }
            }
        }
        return list.toArray(new NYHandlerInit[list.size()]);
    }

    public final boolean isInstance(OArrowObserverObject object) {
        final Class clszz = get();
        if (clszz == null || object == null) {
            return false;
        } else {
            return clszz.isInstance(object);
        }
    }

    public final boolean isParent(Class cls) {
        final Class clszz = get();
        if (clszz == null || cls == null) {
            return false;
        } else {
            return clszz.isAssignableFrom(cls);
        }
    }

    public final PMWShowComplete getSubClass(String subClsName) {
        if (mValue == null) {
            return new PMWShowComplete(null);
        } else {
            return Get(mValue.getName() + "$" + subClsName, mValue.getClassLoader());
        }
    }

    public final PMWShowComplete getSuperClass() {
        return new PMWShowComplete(mValue == null ? null : mValue.getSuperclass());
    }

    public Class[] getInterfaces(boolean containSuper) {
        Set<Class> sets = new HashSet<>();
        Class clszz = mValue;
        while (clszz != null) {
            if (clszz.isInterface()) {
                sets.add(clszz);
            }
            Class[] ins = clszz.getInterfaces();
            if (ins != null && ins.length > 0) {
                sets.addAll(Arrays.asList(ins));
            }
            clszz = containSuper ? clszz.getSuperclass() : null;
        }

        return sets.toArray(new Class[sets.size()]);
    }
}