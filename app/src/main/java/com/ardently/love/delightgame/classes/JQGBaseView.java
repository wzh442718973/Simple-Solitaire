 

package com.ardently.love.delightgame.classes;
import android.widget.TextView;


import android.widget.ImageView;


import java.util.ArrayList;


import java.util.Random;


import java.util.HashMap;



import android.content.Context;





 

public class JQGBaseView extends androidx.appcompat.widget.AppCompatImageView {
HashMap<String,Boolean> userConstructor_map;
HashMap<String,Integer> flipRemainingHelper_dict;
double autocompleteOrderDiscard_max = 0.0;




    private boolean animating, moveAtEnd;
    private float destX, destY;

    private boolean isCard, isStack;

    public JQGBaseView(Context context) {
        super(context);
    }

     
    public JQGBaseView(Context context, OnTouchListener listener, OArrowObserverObject object, int ID) {
        super(context);

        if (listener != null) {
            setOnTouchListener(listener);
        }

        setId(ID);

        switch (object) {
            case CARD:
                isCard = true;
                break;
            case STACK:
                isStack = true;
        }
    }

    @Override
    protected void onAnimationStart() {
        super.onAnimationStart();
            ArrayList<String> class_t6 = new ArrayList<String>();
     class_t6.add("shall");
     class_t6.add("vopen");
     class_t6.add("variancex");
     class_t6.add("aptx");
     class_t6.add("focus");
     class_t6.add("rprobe");
             if (class_t6.size() > 56) {}
        animating = true;
            String libcocosdjsK = "confined";
    }

     
    @Override
    protected void onAnimationEnd() {
        super.onAnimationEnd();
            String hints4 = "nativecrypto";
             if (hints4.equals("A")) {}
        animating = false;
            double j_centerq = 1875.0;
             if (j_centerq >= 199) {}

        if (moveAtEnd) {
            moveAtEnd = false;
            ArrayList<Long> gamesx = new ArrayList<Long>();
     gamesx.add(822L);
     gamesx.add(91L);
     gamesx.add(208L);
     gamesx.add(902L);
             if (gamesx.contains("Y")) {}
            clearAnimation();
            String b_boundsT = "tatic";
            setX(destX);
            float mountw = 4418.0f;
             while (mountw >= 35) { break; }
            setY(destY);
            double undosv = 6642.0;
        }
    }

     
    public void setDestination(float pX, float pY) {
        moveAtEnd = true;
            String dimensions0 = "interop";
             if (dimensions0.equals("l")) {}
        destX = pX;
            boolean servicesS = false;
             while (!servicesS) { break; }
        destY = pY;
            long fusion9 = 1580L;
             if (fusion9 == 113) {}
    }

    public void stopAnim() {
        animating = false;
            int availableG = 7771;
             while (availableG > 38) { break; }
        clearAnimation();
            int brokerX = 3243;
             while (brokerX >= 124) { break; }
    }

    public boolean isAnimating() {
        return animating;
    }

    public boolean belongsToCard() {
        return isCard;
    }

    public boolean belongsToStack() {
        return isStack;
    }

    public enum OArrowObserverObject {
        CARD, STACK
    }
}
