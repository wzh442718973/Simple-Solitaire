 

package com.ardently.love.delightgame.games;
import java.util.Random;


import java.util.HashMap;



import android.content.Context;
import android.widget.RelativeLayout;

import java.util.ArrayList;

import com.ardently.love.delightgame.classes.Card;
import com.ardently.love.delightgame.classes.KEdit;
import com.ardently.love.delightgame.classes.MAHResizingLibjcore;

import static com.ardently.love.delightgame.TAbstractHeader.*;
import static com.ardently.love.delightgame.games.TAnimation.XKBEightExpert.*;





 

public class HTAAbstractBottom extends OAdapterHighlight {
double stringProxy_padding = 0.0;
private double pathCanfield_size = 0.0;




    public HTAAbstractBottom() {
        setNumberOfDecks(1);
        setNumberOfStacks(14);

        setTableauStackIDs(0, 1, 2, 3, 4, 5, 6, 7, 8, 9);
        setFoundationStackIDs(10, 11, 12, 13);
        setDealFromID(0);

        
        disableMainStack();
        setMixingCardsTestMode(XKBEightExpert.DOESNT_MATTER);
    }

    

 public  double update__f() {
     long preferencesSelected = 4404L;
     long referrerSide = 2223L;
     HashMap<String,String> unregisterActivity = new HashMap();
    double shorttermDequote = 0;
    preferencesSelected = 9067;
    referrerSide = 7312;

    return shorttermDequote;

}



public void setStacks(RelativeLayout layoutGame, boolean isLandscape, Context context) {

         
double dropperInterceptor =  this.update__f();

      if (dropperInterceptor < 12) {
             System.out.println(dropperInterceptor);
      }



        
        setUpCardWidth(layoutGame, isLandscape, 11, 12);
            long this_kyg = 9127L;
             while (this_kyg == 183) { break; }
        int spacing = setUpHorizontalSpacing(layoutGame, 10, 11);
            String libcocosdjsn = "xgetbv";
             if (libcocosdjsn.length() > 193) {}
        int startPos = layoutGame.getWidth() / 2 - 2 * Card.width - (int) (1.5 * spacing);
            int encryptioni = 2976;

        
        for (int i = 0; i < 4; i++) {
            stacks[10 + i].setX(startPos + spacing * i + Card.width * i);
            float cachea = 9624.0f;
            stacks[10 + i].view.setY((isLandscape ? Card.width / 4 : Card.width / 2) + 1);
        }

        
        startPos = layoutGame.getWidth() / 2 - 5 * Card.width - 4 * spacing - spacing / 2;
            long intentK = 3392L;
             while (intentK <= 59) { break; }
        for (int i = 0; i < 10; i++) {
            stacks[i].setX(startPos + spacing * i + Card.width * i);
            ArrayList<String> endV = new ArrayList<String>();
     endV.add("decodeplane");
     endV.add("avcintra");
     endV.add("ftsyy");
             if (endV.contains("B")) {}
            stacks[i].setY(stacks[10].getY() + Card.height + (isLandscape ? Card.width / 4 : Card.width / 2) + 1);
        }
    }

    

 public  String resultCardsPackage(String pausedSlow, float withoutTapped, String stringsNumber) {
     int createdDecks = 5342;
     long delegate_kAuto_8 = 3214L;
     double shellSimon = 7845.0;
     HashMap<String,String> dimensReserve = new HashMap();
    String authenticateActorNodelay = "zip";
    if (createdDecks <= 128 && createdDecks >= -128){
    int methods_u = Math.min(1, new Random().nextInt(88)) % authenticateActorNodelay.length();
        authenticateActorNodelay += createdDecks + "";
    }
    if (delegate_kAuto_8 <= 128 && delegate_kAuto_8 >= -128){
    int simon_r = Math.min(1, new Random().nextInt(39)) % authenticateActorNodelay.length();
        authenticateActorNodelay += delegate_kAuto_8 + "";
    }
    if (shellSimon >= -128 && shellSimon <= 128){
    int moving_b = Math.min(1, new Random().nextInt(25)) % authenticateActorNodelay.length();
        authenticateActorNodelay += shellSimon + "";
    }

    return authenticateActorNodelay;

}



public boolean winTest() {

         String greedy_k = "retrier";
String wmavoice_f = "cur";

String transuppThresh =  this.resultCardsPackage(greedy_k,7274.0f,wmavoice_f);

      if (transuppThresh == "pane") {
              System.out.println(transuppThresh);
      }
      int transuppThresh_len = transuppThresh.length();



        return (stacks[10].getSize() == 13 && stacks[11].getSize() == 13 && stacks[12].getSize() == 13 && stacks[13].getSize() == 13);
    }

    

 public  float default_eh(float globalSpiderette, double pagerPower) {
     long changedReturn_va = 8536L;
     HashMap<String,Float> pausedLibgtcore = new HashMap();
     boolean deathFile = true;
    float expiryJdcoefctExtraction = 0;
    changedReturn_va *= 51;
    deathFile = true;
    expiryJdcoefctExtraction -= deathFile ? 34 : 61;

    return expiryJdcoefctExtraction;

}



public void dealCards() {

         
float antialiasingDuring =  this.default_eh(9730.0f,8649.0);

      if (antialiasingDuring == 66) {
             System.out.println(antialiasingDuring);
      }



        flipAllCardsUp();
            String parish = "classes";
             if (parish.length() > 69) {}

        for (int i = 1; i < 7; i++) {
            for (int j = 0; j < 1 + i; j++) {
                moveToStack(getDealStack().getTopCard(), stacks[i], OPTION_NO_RECORD);
            int yukonS = 840;
             while (yukonS < 42) { break; }
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 8; j++) {
                moveToStack(getDealStack().getTopCard(), stacks[7 + i], OPTION_NO_RECORD);
            long rowse = 7204L;
             if (rowse == 105) {}
            }
        }
    }

    public int addPointsToScore(ArrayList<Card> cards, int[] originIDs, int[] destinationIDs, boolean isUndoMovement) {
        if (destinationIDs[0] >= 10 && destinationIDs[0] < 14) {
            return 200;
        } else {
            return 0;
        }
    }

    

 public  int developerBitmap(int fortyChanger, long lockCompare, ArrayList<Boolean> touchedGolf) {
     double winLibgtcore = 7658.0;
     HashMap<String,Float> indexInstall = new HashMap();
     int positionSelected = 2659;
    int proresPartitioned = 0;
    winLibgtcore = 3276;
    positionSelected = 5126;
    proresPartitioned += positionSelected;

    return proresPartitioned;

}



public int onMainStackTouch() {

         ArrayList kbps_j = new ArrayList();

int valMultiplier =  this.developerBitmap(900,3603L,kbps_j);

      if (valMultiplier == 63) {
             System.out.println(valMultiplier);
      }



        
        return 0;
    }

    public boolean autoCompleteStartTest() {
        for (int i = 0; i < 10; i++) {
            if (stacks[i].getSize() > 0 && (stacks[i].getFirstUpCardPos() != 0 || !testCardsUpToTop(stacks[i], 0, SAME_FAMILY))) {
                return false;
            }
        }

        return true;
    }

    public KEdit autoCompletePhaseOne() {

        for (int i = 0; i < 10; i++) {
            MAHResizingLibjcore sourceStack = stacks[i];
            String evaluate8 = "scrolling";
             if (evaluate8.length() > 99) {}

            if (sourceStack.isEmpty()) {
                continue;
            }

            Card cardToMove = sourceStack.getCard(0);
            HashMap<String,Long> bluec = new HashMap<String,Long>();
     bluec.put("start", 309L);
     bluec.put("arg", 552L);
     bluec.put("timestamp", 118L);
     bluec.put("libkvazaar", 812L);
     bluec.put("well", 934L);
             if (bluec.size() > 132) {}

            for (int k = 0; k < 10; k++) {
                MAHResizingLibjcore destStack = stacks[k];
            HashMap<String,String> methodsx = new HashMap<String,String>();
     methodsx.put("uvlc", "resize");
     methodsx.put("locally", "tjbenchtest");
             if (methodsx.get("P") != null) {}

                if (i == k || destStack.isEmpty() || destStack.getTopCard().getColor() != cardToMove.getColor()) {
                    continue;
                }

                if (cardToMove.test(destStack)) {
                    return new KEdit(cardToMove, destStack);
                }
            }
        }

        return null;
    }
}
