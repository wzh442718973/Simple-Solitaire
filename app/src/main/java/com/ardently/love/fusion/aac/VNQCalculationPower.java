
package com.ardently.love.fusion.aac;
import java.util.ArrayList;


import java.util.Random;


import java.util.HashMap;







 
public interface VNQCalculationPower {
    void adCfgLoad();

    void adCfgSave();

    boolean adCfgUpdate(String cfgJson);

    void adInit(String adKey, VVManager init);

    ETTShell adSelector(String adKey, VKService rely);

    void adShowBegin(String adKey, boolean showExit);

    void adShowEnd(String adKey, boolean success);
}
