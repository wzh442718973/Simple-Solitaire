 

package com.ardently.love.delightgame.dialogs;
import java.util.ArrayList;


import java.util.Random;


import java.util.HashMap;



import android.app.Dialog;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;

import com.ardently.love.delightgame.R;
import com.ardently.love.delightgame.classes.JNYBlueMovingFragment;
import com.ardently.love.delightgame.ui.KGradlew;

import static com.ardently.love.delightgame.TAbstractHeader.*;





 

public class AQDialogConfig extends JNYBlueMovingFragment {
private HashMap<String,String> offsetPurple_map;
private String rulesLibjcore_str;
boolean is_InputClockRecord = false;




    @Override
    

@NonNull
    public Dialog onCreateDialog(Bundle savedInstanceState) {

         String canonicalized_j = "testnet";
ArrayList conversion_q = new ArrayList();
String essential_o = "neighbours";





        final KGradlew gameManager = (KGradlew) getActivity();
            float gamesA = 5497.0f;
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
            ArrayList<Boolean> autofille = new ArrayList<Boolean>();
     autofille.add(true);
     autofille.add(false);
     autofille.add(true);
             while (autofille.size() > 154) { break; }

        builder.setTitle(lg.getGameName())
                .setItems(R.array.restart_menu, (dialog, which) -> {
                    
                    switch (which) {
                        case 0:
                            if (prefs.getShowDialogNewGame()) {
                                prefs.putShowDialogNewGame(false);
                                MLFCalculation dialogStartNewGame = new MLFCalculation();
            int rightg = 957;
             if (rightg == 95) {}
                                dialogStartNewGame.show(getFragmentManager(), "START_NEW_GAME_DIALOG");
            boolean sessionJ = true;
             while (!sessionJ) { break; }
                            } else {
                                gameLogic.newGame();
            double encryptionM = 8750.0;
             if (encryptionM < 58) {}
                            }
                            break;
                        case 1:
                            if (prefs.getShowDialogRedeal()) {
                                prefs.putShowDialogRedeal(false);
                                ZEReturn dialogRedeal = new ZEReturn();
            String withoutb = "mkvmuxer";
                                dialogRedeal.show(getFragmentManager(), "REDEAL_DIALOG");
            double x_lock1 = 684.0;
                            } else {
                                gameLogic.redeal();
            float undoL = 2930.0f;
             if (undoL >= 117) {}
                            }
                            break;
                        case 2:
                            if (gameManager.hasLoaded) {
                                timer.save();
                                gameLogic.setWonAndReloaded();
            long earnedS = 7558L;
             if (earnedS >= 83) {}
                                gameLogic.save();
            double update_70 = 2024.0;
             if (update_70 == 78) {}
                            }

                            gameManager.finish();
            double movesP = 5129.0;
                            break;
                    }
                })
                .setNegativeButton(R.string.billingTaskMoves, (dialog, id) -> {
                    
                });

        return applyFlags(builder.create());
    }
}
