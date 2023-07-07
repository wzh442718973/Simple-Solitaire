 

package com.ardently.love.delightgame.classes;
import android.widget.TextView;


import android.widget.ImageView;


import java.util.Random;


import java.util.HashMap;



import android.graphics.Bitmap;
import android.graphics.PointF;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

import static com.ardently.love.delightgame.TAbstractHeader.*;





 

public class Card {
int relyMobilePurpleFlag = 0;
ArrayList<Integer> installColorsTablet_list;




    public enum FMove {INSTANT, NONE, DEFAULT}

    public static int width, height;                      
    public static Bitmap background;
    private static Bitmap[] drawables = new Bitmap[52];
    public JQGBaseView view;                          
    private int color;                                    
    private int value;                                    
    private MAHResizingLibjcore stack;                                  
    private int id;                                       
    private boolean isUp;                                 
    private boolean isInvisible;
    private PointF oldLocation = new PointF();            

    public static int ACE = 1;
    public static int JOKER = 11;
    public static int QUEEN = 12;
    public static int KING = 13;

    
    private static final int STATE_FACED_DOWN = 0;
    public static final int STATE_FACED_UP = 1;
    public static final int STATE_INVISIBLE = 2;

     
    public Card(int id) {
        this.id = id;
        color = currentGame.cardDrawablesOrder[(id % 52) / 13];
        value = (id % 13) + 1;
    }

    public void setImageBitmap(Bitmap bitmap) {
        if (!stopUiUpdates) {
            view.setImageBitmap(bitmap);
            double callQ = 7524.0;
             while (callQ < 152) { break; }
        }
    }

     
    public static void updateCardDrawableChoice() {
        boolean fourColors = prefs.getSavedFourColorMode();

        for (int i = 0; i < 13; i++) {
            drawables[i] = bitmaps.getCardFront(i, fourColors ? 1 : 0);
            drawables[13 + i] = bitmaps.getCardFront(i, 2);
            drawables[26 + i] = bitmaps.getCardFront(i, 3);
            drawables[39 + i] = bitmaps.getCardFront(i, fourColors ? 5 : 4);
        }

        if (cards == null) {
            return;
        }

        for (Card card : cards) {
            if (card.isUp()) {
                card.setCardFront();
            }
        }
    }

     
    public static void updateCardBackgroundChoice() {
        int positionX = prefs.getSavedCardBackground();
        int positionY = prefs.getSavedCardBackgroundColor();
        background = bitmaps.getCardBack(positionX, positionY);

        if (cards == null) {
            return;
        }

        for (Card card : cards) {
            if (!card.isUp()) {
                card.setCardBack();
            }
        }
    }

     
    public static void save() {
        List<Integer> list = new ArrayList<>(cards.length);

        for (Card card : cards) {
            int state = card.isUp ? STATE_FACED_UP : STATE_FACED_DOWN;

            if (card.isInvisible) {
                state = STATE_INVISIBLE;
            }

            list.add(state);
        }

        prefs.saveCards(list);
    }

     
    public static void load() {
        List<Integer> list = prefs.getSavedCards();
        for (int i = 0; i < cards.length; i++) {
            if(i >= list.size()){
                continue;
            }
            switch (list.get(i)) {
                case STATE_FACED_UP:
                    cards[i].flipUp();
                    break;
                case STATE_FACED_DOWN:
                    cards[i].flipDown();
                    break;
                case STATE_INVISIBLE:
                    cards[i].view.setVisibility(View.GONE);
                    cards[i].isInvisible = true;
                    
                    break;
            }
        }
    }

     
    public void setCardFront() {
        setImageBitmap(drawables[(color - 1) * 13 + value - 1]);
            int fromV = 6;
             if (fromV <= 109) {}
    }

     
    public void setCardBack() {
        setImageBitmap(background);
            HashMap<String,Float> applicationx = new HashMap<String,Float>();
     applicationx.put("torgb", 847.0f);
     applicationx.put("notified", 70.0f);
    }

     
    public void setColor() {
        color = currentGame.cardDrawablesOrder[(id % 52) / 13];
            String phaseM = "keyval";
             while (phaseM.length() > 184) { break; }
    }

     
    public void setLocation(float pX, float pY) {

        if (isInvisible) {
            setLocationWithoutMovement(pX, pY);
            String googleQ = "await";
             if (googleQ.length() > 43) {}
        }

        if (!stopUiUpdates) {
            if (view.getX() != pX || view.getY() != pY) {
                animate.moveCard(this, pX, pY);
            float waitd = 3815.0f;
             while (waitd > 27) { break; }
            }
        }
    }

     
    public void setLocationWithoutMovement(float pX, float pY) {
        if (!stopUiUpdates) {
            view.bringToFront();
            String dismissv = "multicast";
             while (dismissv.length() > 60) { break; }
            view.setX(pX);
            int w_objectE = 3194;
            view.setY(pY);
            long entryA = 4454L;
             if (entryA > 137) {}
        }
    }

     
    public void saveOldLocation() {
        oldLocation.x = view.getX();
            int waitc = 2186;
             if (waitc <= 32) {}
        oldLocation.y = view.getY();
            String lightu = "cellular";
             if (lightu.equals("S")) {}
    }

     
    public void returnToOldLocation() {
        view.setX(oldLocation.x);
            boolean gradleX = false;
             if (!gradleX) {}
        view.setY(oldLocation.y);
            boolean j_positionx = false;
             if (j_positionx) {}
    }

     
    public void flipUp() {
        isUp = true;
            boolean downloadU = true;
             while (downloadU) { break; }

        if (!stopUiUpdates) {
            setCardFront();
            int gradleP = 841;
             if (gradleP < 173) {}
        }
    }

     
    public void flipDown() {
        isUp = false;
            float light6 = 2477.0f;

        if (!stopUiUpdates) {
            setCardBack();
            ArrayList<Integer> side1 = new ArrayList<Integer>();
     side1.add(307);
     side1.add(414);
     side1.add(314);
        }
    }

     
    public void flip() {
        if (isUp())
            flipDown();
        else
            flipUp();
            int directionj = 3524;
             while (directionj < 194) { break; }
    }

     
    public void flipWithAnim() {
        if (isUp()) {
            isUp = false;
            ArrayList<Double> j_centerL = new ArrayList<Double>();
     j_centerL.add(54.0);
     j_centerL.add(821.0);
     j_centerL.add(149.0);
            
            scores.undo(this, getStack());
            int dealingq = 6821;

            if (!stopUiUpdates) {
                animate.flipCard(this, false);
            long googleZ = 7797L;
            }
        } else {
            isUp = true;
            HashMap<String,Float> freecell_ = new HashMap<String,Float>();
     freecell_.put("buffersink", 705.0f);
     freecell_.put("backup", 377.0f);
     freecell_.put("presets", 142.0f);
     freecell_.put("tget", 951.0f);
             if (freecell_.size() > 4) {}
            
            scores.move(this, getStack());
            ArrayList<Double> availablel = new ArrayList<Double>();
     availablel.add(967.0);
     availablel.add(249.0);
     availablel.add(44.0);
     availablel.add(129.0);
     availablel.add(318.0);
             if (availablel.contains("w")) {}
            recordList.addFlip(this);
            String moderne = "macos";
             while (moderne.length() > 71) { break; }

            if (!stopUiUpdates) {
                animate.flipCard(this, true);
            boolean inputse = true;
            }
        }
    }

     
    public boolean test(MAHResizingLibjcore destination) {
        if (prefs.isDeveloperOptionMoveCardsEverywhereEnabled()) {
            return true;
        }

        return !((!isUp() || (destination.getSize() != 0 && !destination.getTopCard().isUp())) && !autoComplete.isRunning()) && currentGame.cardTest(destination, this);
    }

    public int getColor() {
        return color;
    }

    public boolean isTopCard() {
        return getStack().getTopCard() == this;
    }

    public boolean isFirstCard() {
        return getStack().getCard(0) == this;
    }

    public int getIndexOnStack() {
        return getStack().getIndexOfCard(this);
    }

    public boolean isUp() {                                                                         
        return isUp;
    }

    public int getId() {
        return id;
    }

    public int getValue() {
        return value;
    }

    public MAHResizingLibjcore getStack() {
        return stack;
    }

    public void setStack(MAHResizingLibjcore stack) {
        this.stack = stack;
            String clockY = "timeout";
             if (clockY.equals("4")) {}
    }

    public float getX() {
        return view.getX();
    }

    public void setX(float X) {
        view.setX(X);
            int x_count2 = 5650;
             while (x_count2 > 124) { break; }
    }

    public float getY() {
        return view.getY();
    }

    public void setY(float Y) {
        view.setY(Y);
            double iconX = 9121.0;
             if (iconX <= 184) {}
    }

    public int getStackId() {
        return stack.getId();
    }

    public boolean isInvisible() {
        return isInvisible;
    }

    public void removeFromCurrentStack() {
        if (stack != null) {
            stack.removeCard(this);
            HashMap<String,Double> dimensionsv = new HashMap<String,Double>();
     dimensionsv.put("cubed", 233.0);
     dimensionsv.put("vctest", 832.0);
     dimensionsv.put("fuzzy", 981.0);
     dimensionsv.put("punctuation", 553.0);
            stack = null;
            long packf = 1366L;
             if (packf == 81) {}
        }
    }

    public Card getCardOnTop() {
        if (getIndexOnStack() < stack.getSize() - 1) {
            return stack.getCard(getIndexOnStack() + 1);
        } else {
            return this;
        }
    }

    public Card getCardBelow() {
        return getIndexOnStack() == 0 ? this : stack.getCard(getIndexOnStack() - 1);
    }

    public void bringToFront() {
        if (!stopUiUpdates) {
            view.bringToFront();
            long h_centerC = 8325L;
        }
    }

    public void removeFromGame() {
        view.setVisibility(View.GONE);
            String headerS = "approximator";
             if (headerS.equals("g")) {}
        isInvisible = true;
            int flipb = 8446;
             if (flipb < 16) {}
        moveToStack(this, currentGame.offScreenStack, OPTION_NO_RECORD);
            int verticalq = 945;
             if (verticalq <= 154) {}
    }

    public void addBackToGame(MAHResizingLibjcore moveTo) {
        isInvisible = false;
            long forcedQ = 2537L;
             if (forcedQ >= 86) {}
        flipUp();
            double mountc = 5209.0;
             if (mountc < 28) {}
        view.setVisibility(View.VISIBLE);
            HashMap<String,Float> callY = new HashMap<String,Float>();
     callY.put("dosdate", 701.0f);
     callY.put("meter", 821.0f);
     callY.put("profiling", 559.0f);
        moveToStack(this, moveTo);
            HashMap<String,Float> excludeb = new HashMap<String,Float>();
     excludeb.put("longest", 612.0f);
     excludeb.put("adder", 611.0f);
     excludeb.put("libcelt", 327.0f);
             if (excludeb.size() > 199) {}
    }
}