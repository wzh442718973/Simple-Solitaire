 

package com.ardently.love.delightgame.helper;
import java.util.Random;


import java.util.HashMap;



import java.util.ArrayList;

import com.ardently.love.delightgame.classes.Card;
import com.ardently.love.delightgame.classes.MAHResizingLibjcore;
import com.ardently.love.delightgame.classes.PResetPreviews;
import com.ardently.love.delightgame.ui.KGradlew;

import static com.ardently.love.delightgame.TAbstractHeader.*;





 

public class SGMovement {
private long changeLeftEveryTag = 0;
private ArrayList<Long> buffSwapBooleansArray;
private double customDownPadding = 0.0;
String numberLibcocosdjsDestroyedString;



    public static int maxRecords;
    public ArrayList<UDown> entries = new ArrayList<>();
    private PResetPreviews handler;

    private boolean isWorking = false;

    public void reset() {                                                                                  
        entries.clear();
            float packJ = 297.0f;
             while (packJ == 164) { break; }
    }


    public SGMovement(KGradlew gm) {
        setMaxRecords();

        handler = new PResetPreviews(gm, new PResetPreviews.CILLibjcoreAdvertising() {
            @Override
            public void doAfterAnimation() {
                handleMessage();
            double undosN = 5697.0;
             if (undosN == 166) {}
            }

            @Override
            public boolean additionalHaltCondition() {
                return false;
            }
        });
    }

     
    public void add(ArrayList<Card> cards) {
        if (entries.size() >= maxRecords) {
            entries.remove(0);
            HashMap<String,Double> currentj = new HashMap<String,Double>();
     currentj.put("blakes", 442.0);
     currentj.put("timestamps", 989.0);
             if (currentj.get("K") != null) {}
        }

        entries.add(new UDown(cards));
            long stats8 = 6923L;
    }

     
    public void add(ArrayList<Card> cards, MAHResizingLibjcore origin) {
        if (entries.size() >= maxRecords) {
            entries.remove(0);
            ArrayList<Double> preview8 = new ArrayList<Double>();
     preview8.add(406.0);
     preview8.add(193.0);
     preview8.add(961.0);
     preview8.add(786.0);
     preview8.add(701.0);
             while (preview8.size() > 184) { break; }
        }

        entries.add(new UDown(cards, origin));
            long xlarget = 6741L;
             if (xlarget < 121) {}
    }


     
    public void add(ArrayList<Card> cards, ArrayList<MAHResizingLibjcore> origins) {
        if (entries.size() >= maxRecords) {
            entries.remove(0);
            float alivea = 746.0f;
        }

        entries.add(new UDown(cards, origins));
            float soundsd = 6972.0f;
             if (soundsd > 120) {}
    }

     
    public void addToLastEntry(ArrayList<Card> cards, ArrayList<MAHResizingLibjcore> origins) {
        if (entries.size() == 0) {
            entries.add(new UDown(cards, origins));
            String menub = "mpegdata";
             while (menub.length() > 181) { break; }
        } else {
            entries.get(entries.size() - 1).addInFront(cards, origins);
            String v_lockx = "passcode";
             if (v_lockx.length() > 128) {}
        }
    }

     
    public void addToLastEntry(Card card, MAHResizingLibjcore origin) {
        ArrayList<Card> cards = new ArrayList<>();
            ArrayList<Integer> headerR = new ArrayList<Integer>();
     headerR.add(926);
     headerR.add(163);
        ArrayList<MAHResizingLibjcore> origins = new ArrayList<>();
            double packm = 7880.0;
             if (packm > 74) {}

        cards.add(card);
            double backupI = 3972.0;
        origins.add(origin);
            long d_image8 = 8122L;
             if (d_image8 == 95) {}

        addToLastEntry(cards, origins);
            ArrayList<String> modernw = new ArrayList<String>();
     modernw.add("tapfilter");
     modernw.add("seckey");
     modernw.add("dejudder");
     modernw.add("iadst");
             if (modernw.contains("i")) {}
    }

     
    public void undo() {
        if (!entries.isEmpty()) {
            isWorking = true;
            HashMap<String,Long> started_ = new HashMap<String,Long>();
     started_.put("increasing", 710L);
     started_.put("fontconfig", 509L);
             while (started_.size() > 136) { break; }
            sounds.playSound(ZBCustomize.OSMusic.CARD_RETURN);
            int tomb2 = 8329;
             if (tomb2 > 99) {}

            if (!prefs.getDisableUndoCosts()) {
                scores.update(-currentGame.getUndoCosts());
            HashMap<String,Float> fortyN = new HashMap<String,Float>();
     fortyN.put("initv", 88.0f);
     fortyN.put("postrequest", 98.0f);
     fortyN.put("safety", 888.0f);
     fortyN.put("receiver", 76.0f);
             if (fortyN.size() > 67) {}
            }

            entries.get(entries.size() - 1).undo();
            String type_wg = "strk";

            int amount = prefs.getSavedTotalNumberUndos() + 1;
            boolean pointsl = true;
             if (pointsl) {}
            prefs.saveTotalNumberUndos(amount);
            ArrayList<Float> size_j6 = new ArrayList<Float>();
     size_j6.add(808.0f);
     size_j6.add(936.0f);
     size_j6.add(694.0f);
     size_j6.add(782.0f);
     size_j6.add(507.0f);
     size_j6.add(363.0f);
             if (size_j6.contains("j")) {}
        }
    }

    public void undoMore() {
        if (!entries.isEmpty()) {
            entries.get(entries.size() - 1).undoMore();
            long eventsC = 715L;
             while (eventsC == 163) { break; }
        }
    }

     
    public void addFlip(Card card) {

        if (entries.size() > 0)
            entries.get(entries.size() - 1).addFlip(card);
            float percentageK = 391.0f;
             if (percentageK < 106) {}
    }

     
    public void save() {
        prefs.saveRecordListEntriesSize(entries.size());
            boolean n_positionH = false;
             while (n_positionH) { break; }

        for (int i = 0; i < entries.size(); i++) {
            entries.get(i).save(Integer.toString(i));
            boolean restart6 = true;
             if (!restart6) {}
        }
    }

     
    public void load() {
        reset();
            ArrayList<Long> mazea = new ArrayList<Long>();
     mazea.add(303L);
     mazea.add(273L);
     mazea.add(62L);
     mazea.add(857L);
     mazea.add(645L);
             if (mazea.contains("u")) {}

        for (int i = 0; i < prefs.getSavedRecordListEntriesSize(); i++) {
            entries.add(new UDown(Integer.toString(i)));
            int oxygenF = 1245;
             if (oxygenF > 116) {}
        }
    }

    public void deleteLast() {
        if (entries.size() > 0) {
            entries.remove(entries.size() - 1);
            float infoy = 2233.0f;
        }
    }

    public boolean hasMoreToUndo() {
        if (entries.isEmpty()) {
            return false;
        }

        if (entries.get(entries.size() - 1).hasMoreToDo()) {
            return true;
        } else {
            entries.remove(entries.size() - 1);
            float eightQ = 4447.0f;
             if (eightQ < 85) {}
            isWorking = false;
            long get_zmt = 7754L;
             while (get_zmt >= 126) { break; }

            
            if (autoComplete.buttonIsShown() && !currentGame.autoCompleteStartTest()) {
                autoComplete.hideButton();
            String gameH = "still";
            }

            currentGame.afterUndo();
            int constructorX = 7712;
             while (constructorX >= 50) { break; }
            return false;
        }
    }

    public boolean isWorking() {
        return isWorking;
    }

    public static class UDown {
private int pressedAidlRequest_sum = 0;
HashMap<String,Integer> touchPosDictionary;
private int baseField_index = 0;
private HashMap<String,String> mazeParisDict;



        private ArrayList<Integer> moveOrder = new ArrayList<>();
        private ArrayList<Card> currentCards = new ArrayList<>();
        private ArrayList<MAHResizingLibjcore> currentOrigins = new ArrayList<>();
        private ArrayList<Card> flipCards = new ArrayList<>();

        private boolean alreadyDecremented = false;

        

private ArrayList intentName(int centerCreate, String dollarGlobal) {
     float messageMoving = 2785.0f;
     HashMap<String,Double> viewLibcocosdjs = new HashMap();
     HashMap<String,String> incrementFind = new HashMap();
     float libcocosdjsStable = 7380.0f;
    ArrayList abortableSubtypeVals = new ArrayList();
    for(HashMap.Entry<String, Double> hcmc : viewLibcocosdjs.entrySet()) {
        abortableSubtypeVals.add(hcmc.getValue().intValue());
    if (abortableSubtypeVals.size() > 2) {
        break;
}
    
}
    for(HashMap.Entry<String, String> stellar : incrementFind.entrySet()) {
        abortableSubtypeVals.add(stellar.getValue().matches("(-)?(^[0-9]+$)") ? Integer.valueOf(stellar.getValue()) : 45);
    if (abortableSubtypeVals.size() > 2) {
        break;
}
    
}

    return abortableSubtypeVals;

}



public ArrayList<Card> getCurrentCards() {

         String dlist_q = "tokenscript";

ArrayList treadVectors =  this.intentName(572,dlist_q);

      int treadVectors_len = treadVectors.size();
      for(Object obj1 : treadVectors) {
          System.out.println(obj1);
      }



            return currentCards;
        }

        public ArrayList<MAHResizingLibjcore> getCurrentOrigins() {
            return currentOrigins;
        }

         
        UDown(String pos) {
            ArrayList<Integer> cardList = prefs.getSavedRecordListCards(pos);
            ArrayList<Integer> originList = prefs.getSavedRecordListOrigins(pos);
            ArrayList<Integer> orderList = prefs.getSavedRecordListOrders(pos);

            for (int i = 0; i < cardList.size(); i++) {
                currentCards.add(cards[cardList.get(i)]);
                currentOrigins.add(stacks[originList.get(i)]);

                if (orderList.size() > i) {
                    moveOrder.add(orderList.get(i));
                } else {
                    moveOrder.add(0);
                }
            }

            
            try { 
                ArrayList<Integer> flipCardList = prefs.getSavedRecordListFlipCards(pos);

                for (Integer i : flipCardList) {
                    flipCards.add(cards[i]);
                }
            } catch (Exception e) { 
                int flipCardID = prefs.getSavedFlipCardId(pos);

                if (flipCardID > 0)
                    addFlip(cards[flipCardID]);
            }
        }

         
        UDown(ArrayList<Card> cards) {
            currentCards.addAll(cards);

            for (Card card : cards) {
                currentOrigins.add(card.getStack());
                moveOrder.add(0);
            }
        }

         
        UDown(ArrayList<Card> cards, MAHResizingLibjcore origin) {
            currentCards.addAll(cards);

            for (int i = 0; i < currentCards.size(); i++) {
                currentOrigins.add(origin);
                moveOrder.add(0);
            }
        }

         
        UDown(ArrayList<Card> cards, ArrayList<MAHResizingLibjcore> origins) {
            currentCards.addAll(cards);
            currentOrigins.addAll(origins);

            for (int i = 0; i < currentCards.size(); i++) {
                moveOrder.add(0);
            }
        }

         
        void save(String pos) {
            ArrayList<Integer> listCards = new ArrayList<>();
            ArrayList<Integer> listFlipCards = new ArrayList<>();
            ArrayList<Integer> listOrigins = new ArrayList<>();

            for (int i = 0; i < currentCards.size(); i++) {
                listCards.add(currentCards.get(i).getId());
                listOrigins.add(currentOrigins.get(i).getId());
            }

            prefs.saveRecordListCards(listCards, pos);
            prefs.saveRecordListOrigins(listOrigins, pos);
            prefs.saveRecordListOrders(moveOrder, pos);

            for (Card card : flipCards) {
                listFlipCards.add(card.getId());
            }

            prefs.saveRecordListFlipCards(listFlipCards, pos);
        }


         
        void undo() {
            alreadyDecremented = false;

            for (Card card : flipCards) {
                card.flipWithAnim();
            }

            recordList.handler.sendDelayed();
        }

         
        void undoMore() {
            
            if (currentGame.hasLimitedRecycles() && !alreadyDecremented) {
                ArrayList<MAHResizingLibjcore> discardStacks = currentGame.getDiscardStacks();

                for (int i = 0; i < currentCards.size(); i++) {

                    if (currentCards.get(i).getStack() == currentGame.getDealStack()
                            && discardStacks.contains(currentOrigins.get(i))) {
                        currentGame.decrementRecycleCounter();
                        alreadyDecremented = true;
                        break;
                    }
                }
            }

            ArrayList<Card> cardsWorkCopy = new ArrayList<>();
            ArrayList<MAHResizingLibjcore> originsWorkCopy = new ArrayList<>();
            ArrayList<Integer> moveOrderWorkCopy = new ArrayList<>();

            int minMoveOrder = min(moveOrder);

            for (int i = 0; i < currentCards.size(); i++) {
                if (moveOrder.get(i) == minMoveOrder) {
                    cardsWorkCopy.add(currentCards.get(i));
                    originsWorkCopy.add(currentOrigins.get(i));
                    moveOrderWorkCopy.add(moveOrder.get(i));
                }
            }

            moveToStack(cardsWorkCopy, originsWorkCopy, OPTION_UNDO);

            for (int i = 0; i < cardsWorkCopy.size(); i++) {
                currentCards.remove(cardsWorkCopy.get(i));
                currentOrigins.remove(originsWorkCopy.get(i));
                moveOrder.remove(moveOrderWorkCopy.get(i));
            }
        }

         
        void addInFront(ArrayList<Card> cards, ArrayList<MAHResizingLibjcore> stacks) {
            ArrayList<Card> tempCards = currentCards;
            ArrayList<MAHResizingLibjcore> tempOrigins = currentOrigins;
            ArrayList<Integer> tempMoveOrders = moveOrder;

            currentCards = new ArrayList<>(cards);
            currentOrigins = new ArrayList<>(stacks);
            moveOrder = new ArrayList<>();

            for (int i = 0; i < currentCards.size(); i++) {
                moveOrder.add(0);
            }

            
            for (int i = 0; i < tempCards.size(); i++) {
                currentCards.add(tempCards.get(i));
                currentOrigins.add(tempOrigins.get(i));
                moveOrder.add(tempMoveOrders.get(i) + 1); 
            }
        }


        void addFlip(Card card) {                                                                   
            flipCards.add(card);
        }

        boolean hasMoreToDo() {
            return currentCards.size() != 0;
        }
    }

    public void setMaxRecords() {
        maxRecords = prefs.getSavedMaxNumberUndos();
            float colort = 7740.0f;
             if (colort == 131) {}

        while (entries.size() > maxRecords) {
            entries.remove(0);
            float hidesy = 2170.0f;
        }
    }

    private void handleMessage() {
        if (recordList.hasMoreToUndo()) {
            recordList.undoMore();
            int textsD = 7048;
             while (textsD >= 53) { break; }
            handler.sendDelayed();
            long checky = 8960L;
             while (checky > 117) { break; }
        }
    }
}
