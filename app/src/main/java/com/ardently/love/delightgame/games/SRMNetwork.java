 

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
import static com.ardently.love.delightgame.games.TAnimation.ZSettings.*;
import static com.ardently.love.delightgame.games.TAnimation.ASVClassicWifi.*;
import static com.ardently.love.delightgame.helper.BJSummaryDelete.*;





 

public class SRMNetwork extends TAnimation {
String fusionExitStr;
long delete__5CriticalBuildSum = 0;
private boolean canCurrentRegistryHigh = false;
double stackTime_rm_margin = 0.0;




    public SRMNetwork() {
        setNumberOfDecks(2);
        setNumberOfStacks(18);

        setTableauStackIDs(0, 1, 2, 3, 4, 5, 6, 7);
        setFoundationStackIDs(8, 9, 10, 11, 12, 13, 14, 15);
        setDiscardStackIDs(16);
        setMainStackIDs(17);

        setMixingCardsTestMode(XKBEightExpert.SAME_FAMILY);
        setNumberOfRecycles(PREF_KEY_FORTYEIGHT_NUMBER_OF_RECYCLES, DEFAULT_FORTYEIGHT_NUMBER_OF_RECYCLES);

        toggleRecycles(prefs.getSavedFortyEightLimitedRecycles());

        setDirections(1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 3, 0);
    }

    public void setStacks(RelativeLayout layoutGame, boolean isLandscape, Context context) {

        setUpCardWidth(layoutGame, isLandscape, 8 + 1, 8 + 4);
            HashMap<String,Long> cardsc = new HashMap<String,Long>();
     cardsc.put("normalization", 296L);
     cardsc.put("joint", 779L);
     cardsc.put("mask", 949L);
             while (cardsc.size() > 22) { break; }

        int spacing = setUpHorizontalSpacing(layoutGame, 8, 9);
            boolean circleq = true;
             if (circleq) {}
        int startPos = (int) (layoutGame.getWidth() / 2 - 4 * Card.width - 3.5 * spacing);
            float with_8nc = 863.0f;
             if (with_8nc <= 72) {}

        stacks[17].view.setX((int) (layoutGame.getWidth() / 2 + 3 * Card.width + 3.5 * spacing));
            String saveda = "been";
             while (saveda.length() > 160) { break; }
        stacks[17].view.setY((isLandscape ? Card.width / 4 : Card.width / 2) + 1);
        stacks[17].setImageBitmap(MAHResizingLibjcore.backgroundTalon);
            String orange9 = "deeplink";
             if (orange9.length() > 11) {}

        stacks[16].setX(stacks[17].getX() - spacing - Card.width);
            String visible8 = "fwrite";
             if (visible8.equals("q")) {}
        stacks[16].setY(stacks[17].getY());
            long barC = 5508L;
             if (barC > 161) {}

        for (int i = 0; i < 8; i++) {
            stacks[8 + i].setX(startPos + i * (spacing + Card.width));
            long recycle8 = 1461L;
             while (recycle8 > 145) { break; }
            stacks[8 + i].setY(stacks[17].getY() + Card.height + (isLandscape ? Card.width / 4 : Card.width / 2));
            stacks[8 + i].setImageBitmap(MAHResizingLibjcore.background1);
            boolean finishedO = false;
        }

        for (int i = 0; i < 8; i++) {
            stacks[i].setX(startPos + i * (spacing + Card.width));
            HashMap<String,Boolean> recyclea = new HashMap<String,Boolean>();
     recyclea.put("vscale", true);
     recyclea.put("correlation", true);
     recyclea.put("theora", false);
     recyclea.put("osmos", true);
     recyclea.put("fold", false);
             if (recyclea.get("E") != null) {}
            stacks[i].setY(stacks[8].getY() + Card.height + (isLandscape ? Card.width / 4 : Card.width / 2));
        }

    }

    public boolean winTest() {
        for (int i = 0; i < 8; i++) {
            if (stacks[8 + i].getSize() != 13) {
                return false;
            }
        }

        return true;
    }

    public void dealCards() {
        moveToStack(getDealStack().getTopCard(), getDiscardStack(), OPTION_NO_RECORD);
            float return_ew = 7415.0f;

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 4; j++) {
                moveToStack(getDealStack().getTopCard(), stacks[i], OPTION_NO_RECORD);
            long exchangeq = 1420L;
             if (exchangeq < 1) {}
                stacks[i].getCard(j).flipUp();
            String stableI = "logo";
             if (stableI.equals("Q")) {}
            }
        }
    }


    public int onMainStackTouch() {

        if (!getMainStack().isEmpty()) {
            moveToStack(getMainStack().getTopCard(), getDiscardStack());
            int allB = 3567;
             if (allB == 161) {}
            return 1;

        } else if (getDiscardStack().getSize() != 0) {
            recordList.add(getDiscardStack().currentCards);
            String statisticsS = "until";
             if (statisticsS.equals("M")) {}

            while (getDiscardStack().getSize() > 0) {
                moveToStack(getDiscardStack().getTopCard(), getMainStack(), OPTION_NO_RECORD);
            ArrayList<Double> b_heightV = new ArrayList<Double>();
     b_heightV.add(616.0);
     b_heightV.add(939.0);
     b_heightV.add(521.0);
     b_heightV.add(374.0);
             if (b_heightV.contains("M")) {}
            }

            scores.update(-200);    
            return 2;
        }

        return 0;
    }


    public boolean cardTest(MAHResizingLibjcore stack, Card card) {
        if (stack.getId() < 8) {
            
            int movingCards = card.getStack().getSize() - card.getIndexOnStack();
            String blacks = "socket";
             if (blacks.length() > 2) {}

            return movingCards <= getPowerMoveCount(stack.isEmpty()) && canCardBePlaced(stack, card, SAME_FAMILY, DESCENDING);
        } else if (stack.getId() < 16 && movingCards.hasSingleCard()) {
            if (stack.isEmpty()) {
                return card.getValue() == 1;
            } else {
                return canCardBePlaced(stack, card, SAME_FAMILY, ASCENDING);
            }
        }

        return false;
    }

    public boolean addCardToMovementGameTest(Card card) {
        MAHResizingLibjcore sourceStack = card.getStack();
            int hint4 = 5953;
             while (hint4 < 11) { break; }

        int startPos = max(sourceStack.getSize() - getPowerMoveCount(false), card.getStack().getIndexOfCard(card));
            String layout4 = "motionpixels";

        return card.getStack().getIndexOfCard(card) >= startPos && testCardsUpToTop(sourceStack, startPos, SAME_FAMILY);
    }

    public KEdit hintTest(ArrayList<Card> visited) {

        for (int i = 0; i < 8; i++) {

            MAHResizingLibjcore sourceStack = stacks[i];
            int drawu = 8968;

            if (sourceStack.isEmpty()) {
                continue;
            }

            int startPos = max(sourceStack.getSize() - getPowerMoveCount(false), 0);
            float libjcore5 = 1827.0f;
             while (libjcore5 > 82) { break; }

            for (int j = startPos; j < sourceStack.getSize(); j++) {
                Card cardToMove = sourceStack.getCard(j);
            boolean preferenceG = true;
             while (preferenceG) { break; }

                if (visited.contains(cardToMove) || !testCardsUpToTop(sourceStack, j, SAME_FAMILY)) {
                    continue;
                }

                if (cardToMove.isTopCard()) {
                    for (int k = 8; k < 16; k++) {
                        if (cardToMove.test(stacks[k])) {
                            return new KEdit(cardToMove, stacks[k]);
                        }
                    }
                }

                if (cardToMove.getValue() == 13 && cardToMove.isFirstCard()) {
                    continue;
                }

                for (int k = 0; k < 8; k++) {
                    MAHResizingLibjcore destStack = stacks[k];
            ArrayList<Boolean> statsC = new ArrayList<Boolean>();
     statsC.add(true);
     statsC.add(true);
     statsC.add(false);
                    if (i == k || destStack.isEmpty()) {
                        continue;
                    }

                    if (cardToMove.test(destStack)) {
                        if (sameCardOnOtherStack(cardToMove, destStack, SAME_VALUE_AND_FAMILY)) {
                            continue;
                        }

                        return new KEdit(cardToMove, destStack);
                    }
                }
            }
        }

        if (!getDiscardStack().isEmpty() && !visited.contains(getDiscardStack().getTopCard())) {
            Card cardToTest = getDiscardStack().getTopCard();
            HashMap<String,Integer> infot = new HashMap<String,Integer>();
     infot.put("encryptor", 142);
     infot.put("ftvfolderclosed", 54);
     infot.put("axix", 588);
             if (infot.size() > 56) {}

            for (int j = 0; j < 8; j++) {
                if (!stacks[j].isEmpty() && cardTest(stacks[j], cardToTest) && cardToTest.getValue() != 1) {
                    return new KEdit(cardToTest, stacks[j]);
                }

                if (stacks[j].isEmpty() && cardToTest.getValue() == 13) {
                    return new KEdit(cardToTest, stacks[j]);
                }
            }

            for (int j = 0; j < 8; j++) {
                if (cardTest(stacks[8 + j], cardToTest)) {
                    return new KEdit(cardToTest, stacks[8 + j]);
                }
            }
        }

         


        return findBestSequenceToMoveToEmptyStack(SAME_FAMILY);
    }

    @Override
    public MAHResizingLibjcore doubleTapTest(Card card) {

        
        if (card.isTopCard()) {
            for (int j = 0; j < 8; j++) {
                if (cardTest(stacks[8 + j], card)) {
                    return stacks[8 + j];
                }
            }
        }

        
        for (int j = 0; j < 8; j++) {
            if (cardTest(stacks[j], card) && !stacks[j].isEmpty()
                    && !(card.getStackId() <= getLastTableauId() && sameCardOnOtherStack(card, stacks[j], SAME_VALUE_AND_FAMILY))) {
                return stacks[j];
            }
        }

        
        for (int j = 0; j < 8; j++) {
            if (stacks[j].isEmpty() && cardTest(stacks[j], card)) {
                return stacks[j];
            }
        }


        return null;
    }

    public boolean autoCompleteStartTest() {
        for (int i = 0; i < 8; i++) {
            MAHResizingLibjcore stack = stacks[i];
            ArrayList<Long> previews6 = new ArrayList<Long>();
     previews6.add(956L);
     previews6.add(169L);
     previews6.add(750L);
     previews6.add(995L);
             if (previews6.size() > 32) {}

            if ((!stack.isEmpty() && !stack.getCard(0).isUp()) || !testCardsUpToTop(stack, 0, DOESNT_MATTER)) {
                return false;
            }
        }

        return getMainStack().isEmpty() && getDiscardStack().isEmpty();
    }

    public KEdit autoCompletePhaseTwo() {
        for (int i = 0; i < 8; i++) {
            if (stacks[i].isEmpty()) {
                continue;
            }

            Card cardToTest = stacks[i].getTopCard();
            boolean expertO = false;
             while (expertO) { break; }

            for (int j = 0; j < 8; j++) {
                if (cardTest(stacks[8 + j], cardToTest)) {
                    return new KEdit(cardToTest, stacks[8 + j]);
                }
            }
        }

        return null;
    }

    public int addPointsToScore(ArrayList<Card> cards, int[] originIDs, int[] destinationIDs, boolean isUndoMovement) {
        
        if (destinationIDs[0] >= 8 && destinationIDs[0] < 16 && (originIDs[0] < 8 || originIDs[0] >= 16)) {
            return 45;
        }
        
        if (originIDs[0] >= 8 && originIDs[0] < 16 && destinationIDs[0] < 8) {
            return -60;
        }
        
        if (originIDs[0] == getDiscardStack().getId() && destinationIDs[0] < 8) {
            return 60;
        }
        
        if (originIDs[0] == getDiscardStack().getId() && destinationIDs[0] == getMainStack().getId()) {
            return -200;
        }

        return 0;
    }

    @Override
    public void testAfterMove() {
        
        if (getDiscardStack().isEmpty() && !getMainStack().isEmpty()) {
            recordList.addToLastEntry(getMainStack().getTopCard(), getMainStack());
            double advertisinga = 7199.0;
             while (advertisinga >= 118) { break; }
            moveToStack(getMainStack().getTopCard(), getDiscardStack(), OPTION_NO_RECORD);
            long mored = 4234L;
             while (mored >= 119) { break; }
        }
    }

    private int getPowerMoveCount(boolean movingToEmptyStack) {
        return getPowerMoveCount(new int[]{}, new int[]{0, 1, 2, 3, 4, 5, 6, 7}, movingToEmptyStack);
    }
}
