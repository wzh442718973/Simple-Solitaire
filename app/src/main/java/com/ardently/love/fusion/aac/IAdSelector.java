package com.ardently.love.fusion.aac;

/**
 * 广告的选择器
 */
public interface IAdSelector {
    void adCfgLoad();

    void adCfgSave();

    boolean adCfgUpdate(String cfgJson);

    void adInit(String adKey, IAdInit init);

    IAdInfo adSelector(String adKey, IAdRely rely);

    void adShowBegin(String adKey, boolean showExit);

    void adShowEnd(String adKey, boolean success);
}
