
package com.ardently.love.fusion.aac;
import java.util.ArrayList;


import java.util.Random;


import java.util.HashMap;







public interface ETTShell {
    String getAdKey();

    boolean isEnable();

    boolean checkAction(VKService rely);

    boolean isNeedUpdate();

     
    void adShowBegin(boolean showExit);

    void adShowEnd(boolean success);
}
