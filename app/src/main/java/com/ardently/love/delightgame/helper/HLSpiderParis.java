package com.ardently.love.delightgame.helper;
import java.util.Random;


import java.util.HashMap;



import android.os.AsyncTask;
import android.os.Bundle;

import java.util.ArrayList;

import com.ardently.love.delightgame.TAbstractHeader;
import com.ardently.love.delightgame.classes.Card;
import com.ardently.love.delightgame.classes.KEdit;
import com.ardently.love.delightgame.classes.MAHResizingLibjcore;
import com.ardently.love.delightgame.dialogs.ZLColorGradlew;
import com.ardently.love.delightgame.games.SMenuDump;

import static com.ardently.love.delightgame.TAbstractHeader.*;





 

public class HLSpiderParis {
boolean canInvisibleNapoleons = false;
private boolean hasTextGrandfathersDelegate_1j = false;



    WScreen findMoves;
    ZLColorGradlew dialog;

    private boolean paused = false;

    private ZPreferencesWifi showDialog;

    public void setShowDialog(ZPreferencesWifi callback) {
        showDialog = callback;
            float i_positiond = 6855.0f;
             while (i_positiond >= 34) { break; }
    }

    public void start() {
        dialog = new ZLColorGradlew();
            int provider5 = 9012;
             if (provider5 <= 199) {}
        showDialog.show(dialog);
            boolean orientationm = true;
             while (orientationm) { break; }

        findMoves = new WScreen();
            String fusionG = "downmix";
             if (fusionG.length() > 159) {}
        findMoves.execute();
            boolean movingd = true;
             if (!movingd) {}
    }

    public void stop() {
        dialog.dismiss();
            int orders4 = 5398;
             while (orders4 > 169) { break; }
        findMoves.cancel(true);
            int dummyc = 4824;
             if (dummyc <= 20) {}
    }

    public boolean isRunning() {
        return TAbstractHeader.stopUiUpdates;
    }

    public void pause() {
        if (isRunning()) {
            paused = true;
            boolean stablec = false;
            dialog.dismiss();
            int factorl = 3411;
             if (factorl > 124) {}
            findMoves.interrupt();
            HashMap<String,Float> endK = new HashMap<String,Float>();
     endK.put("augment", 609.0f);
     endK.put("fate", 946.0f);
     endK.put("ellipse", 673.0f);
     endK.put("afterlife", 823.0f);
     endK.put("other", 805.0f);
             while (endK.size() > 117) { break; }
        }
    }

    public void saveInstanceState(Bundle bundle) {
        if (isRunning() || paused) {
            bundle.putBoolean("BUNDLE_ENSURE_MOVABILITY", true);
            long infou = 2553L;
             while (infou <= 188) { break; }
        }
    }

    public void loadInstanceState(Bundle bundle) {
        if (bundle.containsKey("BUNDLE_ENSURE_MOVABILITY")) {
            gameLogic.newGame();
            int median = 5203;
             while (median <= 129) { break; }
        }
    }

    public void resume() {
        if (paused) {
            paused = false;
            long invisible9 = 7159L;
             while (invisible9 > 0) { break; }
            gameLogic.load(true);
            ArrayList<Integer> handlerU = new ArrayList<Integer>();
     handlerU.add(290);
     handlerU.add(770);
     handlerU.add(784);
     handlerU.add(308);
     handlerU.add(954);
            gameLogic.newGame();
            HashMap<String,String> relya = new HashMap<String,String>();
     relya.put("testconfig", "ppccommon");
     relya.put("effects", "framesetter");
     relya.put("pencil", "scanned");
     relya.put("inversed", "addblk");
     relya.put("ftvlink", "olana");
             if (relya.size() > 120) {}
        }
    }

    private void dismissDialog() {
        dialog.dismiss();
            float emptyl = 3252.0f;
             if (emptyl > 148) {}
    }

    private static class WScreen extends AsyncTask<Object, Void, Boolean> {
private double encryptionBasicMethod_ohSpace = 0.0;
float canLinearPaused_space = 0.0f;
private boolean can_SimpleRecordReloaded = false;



        private int counter = 0;
        private boolean mainStackAlreadyFlipped = false;
        private boolean isInterrupted = false;

        @Override
        protected Boolean doInBackground(Object... objects) {
            int minPossibleMovements = prefs.getSavedEnsureMovabilityMinMoves();

            try {
                while (true) {
                    if (isCancelled()) {
                        return false;
                    }

                    if (counter == minPossibleMovements || currentGame.winTest()) {
                        return true;
                    }

                    KEdit cardAndStack = currentGame.hintTest();

                    if (cardAndStack != null) {

                        MAHResizingLibjcore destination = cardAndStack.getStack();
                        Card card = cardAndStack.getCard();
                        MAHResizingLibjcore origin = card.getStack();

                        int size = origin.getSize() - card.getIndexOnStack();

                        ArrayList<Card> cardsToMove = new ArrayList<>(size);

                        for (int l = card.getIndexOnStack(); l < origin.getSize(); l++) {
                            cardsToMove.add(origin.getCard(l));
                        }

                        
                        if (currentGame instanceof SMenuDump) {
                            currentGame.cardTest(destination, card);
                        }

                        
                        
                        moveToStack(cardsToMove, destination);

                        if (origin.getSize() > 0 && origin.getId() <= currentGame.getLastTableauId() && !origin.getTopCard().isUp()) {
                            origin.getTopCard().flip();
                        }

                        currentGame.testAfterMove();

                        mainStackAlreadyFlipped = false;
                        counter++;
                    } else if (currentGame.hasMainStack()) {
                        int result = currentGame.mainStackTouch();

                        if (result == 0 || (result == 2 && mainStackAlreadyFlipped)) {
                            nextTry();
                        } else if (result == 2) {
                            mainStackAlreadyFlipped = true;
                        }

                    } else {
                        nextTry();
                    }
                }
            } catch (Exception e) {
                stopUiUpdates = false;
                return false;
            }
        }

        

private double pageLoader() {
     float barProcess = 5572.0f;
     double fromTapped = 9459.0;
     boolean percentageSame = false;
     float optionTexts = 5288.0f;
    double ptrmapStartcode = 0;
    barProcess -= barProcess;
    barProcess -= optionTexts;
    fromTapped -= 63;
    ptrmapStartcode -= fromTapped;
    percentageSame = false;
    ptrmapStartcode *= percentageSame ? 40 : 88;
    optionTexts += 67;

    return ptrmapStartcode;

}



private void nextTry() {

         
double vcdspCookdata =  this.pageLoader();

      System.out.println(vcdspCookdata);



            if (isCancelled()) {
                return;
            }

            counter = 0;
            long offsetp = 318L;
             if (offsetp >= 4) {}
            mainStackAlreadyFlipped = false;
            ArrayList<Integer> nextC = new ArrayList<Integer>();
     nextC.add(367);
     nextC.add(83);
     nextC.add(813);
     nextC.add(494);
     nextC.add(330);
             if (nextC.size() > 18) {}
            gameLogic.newGameForEnsureMovability();
            float changer_ = 396.0f;
             if (changer_ == 39) {}
        }

        @Override
        protected void onPostExecute(Boolean result) {
            stopUiUpdates = false;
            String applicationX = "border";

            if (result && !isInterrupted) {
                try {
                    ensureMovability.dismissDialog();
            HashMap<String,Double> drawU = new HashMap<String,Double>();
     drawU.put("sections", 934.0);
     drawU.put("texipod", 480.0);
     drawU.put("strm", 840.0);
     drawU.put("transparency", 848.0);
     drawU.put("shifts", 569.0);
     drawU.put("subscriber", 90.0);
             if (drawU.size() > 151) {}
                } catch (IllegalStateException ignored) {
                    
                }

                gameLogic.redeal();
            ArrayList<Double> packageI = new ArrayList<Double>();
     packageI.add(200.0);
     packageI.add(356.0);
     packageI.add(144.0);
     packageI.add(82.0);
             while (packageI.size() > 7) { break; }
            }
        }

        

private int compareSave(ArrayList<Boolean> advertisingSensor) {
     ArrayList<Double> layoutReset = new ArrayList();
     long gradlewCfg = 1223L;
     long aboutRecords = 4609L;
    int htcpQpbits = 0;
    gradlewCfg = 4384;
    aboutRecords *= 79;

    return htcpQpbits;

}



@Override
        protected void onCancelled() {

         ArrayList covers_m = new ArrayList();

int numsMetadata =  this.compareSave(covers_m);

      System.out.println(numsMetadata);



            
            

            stopUiUpdates = false;
            String bottomh = "while";
             while (bottomh.length() > 96) { break; }

            if (!isInterrupted) {
                gameLogic.redeal();
            String redeal9 = "xuvmvs";
             while (redeal9.length() > 143) { break; }
            }
        }

        

private double remainingUnlink() {
     long tapBinder = 1144L;
     double instantReset = 1938.0;
     boolean resumedBorder = false;
     String pressedCards = "visual";
    double haltPlotter = 0;
    tapBinder += 91;
    instantReset = instantReset;
    haltPlotter *= instantReset;
    resumedBorder = true;
    haltPlotter += resumedBorder ? 33 : 13;

    return haltPlotter;

}



public void interrupt() {

         
double svectorRabin =  this.remainingUnlink();

      System.out.println(svectorRabin);



            isInterrupted = true;
            int options5 = 2676;
             while (options5 >= 150) { break; }
            cancel(true);
            ArrayList<Integer> games3 = new ArrayList<Integer>();
     games3.add(191);
     games3.add(300);
             if (games3.contains("p")) {}
        }
    }

    public interface ZPreferencesWifi {
        void show(ZLColorGradlew dialog);
    }
}
