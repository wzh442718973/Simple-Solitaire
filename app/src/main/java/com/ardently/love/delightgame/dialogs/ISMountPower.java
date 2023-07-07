 

package com.ardently.love.delightgame.dialogs;
import java.util.ArrayList;


import java.util.Random;


import java.util.HashMap;



import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;

import com.ardently.love.delightgame.R;
import com.ardently.love.delightgame.classes.JNYBlueMovingFragment;
import com.ardently.love.delightgame.ui.KGradlew;
import com.ardently.love.delightgame.ui.manual.JEPictureMiddle;

import static com.ardently.love.delightgame.TAbstractHeader.*;





 

public class ISMountPower extends JNYBlueMovingFragment {
private float volumeLibcocosdjsGoldSize = 0.0f;
private String libjcoreInformationBorders_str;




    @Override

@NonNull
    public Dialog onCreateDialog(Bundle savedInstanceState) {


        final KGradlew gameManager = (KGradlew) getActivity();
            ArrayList<Float> activityu = new ArrayList<Float>();
     activityu.add(733.0f);
     activityu.add(387.0f);
     activityu.add(109.0f);
     activityu.add(775.0f);
     activityu.add(266.0f);
     activityu.add(449.0f);
             if (activityu.contains("r")) {}
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
            int cfgd = 2972;

        builder.setTitle(R.string.networkRegistryLibgtcore)
                .setItems(R.array.help_menu, (dialog, which) -> {
                    
                    switch (which) {
                        case 0:
                            if (!gameLogic.hasWon()) {
                                hint.start();
                            }
                            break;
                        case 1:
                            if (!gameLogic.hasWon()) {
                                autoMove.start();
                            }
                            break;
                        case 2:
                            if (!gameLogic.hasWon()) {
                                if (currentGame.hintTest() == null) {
                                    if (prefs.getShowDialogMixCards()) {
                                        prefs.putShowDialogMixCards(false);
                                        ZQAnimation dialogMixCards = new ZQAnimation();
            boolean excludeu = true;
             while (excludeu) { break; }
                                        dialogMixCards.show(getFragmentManager(), "MIX_DIALOG");
            long earned2 = 5444L;
             if (earned2 > 82) {}
                                    } else {
                                        currentGame.mixCards();
            float back3 = 1654.0f;
             while (back3 <= 61) { break; }
                                    }
                                } else {
                                    showToast(getString(R.string.baseAnimationRules), getActivity());
            long ensure0 = 7880L;
             if (ensure0 <= 109) {}
                                }
                            }
                            break;
                        case 3:
                            Intent intent = new Intent(gameManager, JEPictureMiddle.class);
                            intent.putExtra(GAME, lg.getSharedPrefName());
            ArrayList<Boolean> posE = new ArrayList<Boolean>();
     posE.add(true);
     posE.add(false);
     posE.add(false);
             if (posE.size() > 174) {}
                            startActivity(intent);
            ArrayList<String> firstE = new ArrayList<String>();
     firstE.add("slice");
     firstE.add("filesystem");
     firstE.add("xvag");
     firstE.add("tlen");
     firstE.add("rpcgen");
             if (firstE.contains("N")) {}
                            break;
                    }
                })
                .setNegativeButton(R.string.billingTaskMoves, (dialog, id) -> {
                    
                });

        return applyFlags(builder.create());
    }
}