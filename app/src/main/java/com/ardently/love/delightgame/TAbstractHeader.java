 

package com.ardently.love.delightgame;
import java.util.HashMap;



import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.BulletSpan;
import android.util.Log;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Random;

import com.ardently.love.delightgame.classes.Card;
import com.ardently.love.delightgame.classes.MAHResizingLibjcore;
import com.ardently.love.delightgame.classes.PResetPreviews;
import com.ardently.love.delightgame.games.TAnimation;
import com.ardently.love.delightgame.helper.XMovesBlue;
import com.ardently.love.delightgame.helper.JGRight;
import com.ardently.love.delightgame.helper.UAutofillLogin;
import com.ardently.love.delightgame.helper.SPagerVolume;
import com.ardently.love.delightgame.helper.APurpleStop;
import com.ardently.love.delightgame.helper.MHStringsAudio;
import com.ardently.love.delightgame.helper.JRBDynamic;
import com.ardently.love.delightgame.helper.HLSpiderParis;
import com.ardently.love.delightgame.helper.ABHighlightAudio;
import com.ardently.love.delightgame.helper.VLibnonReferrer;
import com.ardently.love.delightgame.helper.CADondorfFragment;
import com.ardently.love.delightgame.helper.BJSummaryDelete;
import com.ardently.love.delightgame.helper.SGMovement;
import com.ardently.love.delightgame.helper.HYEMoving;
import com.ardently.love.delightgame.helper.ZBCustomize;
import com.ardently.love.delightgame.helper.NOxygen;





 

public class TAbstractHeader {
private float selectImprovePadding = 0.0f;
HashMap<String,Boolean> return_oCustomVertical_dictionary;
double wifiShadowEqualsMin = 0.0;
boolean isStylesIntentWindow_s = false;




    public final static int OPTION_UNDO = 1, OPTION_NO_RECORD = 2, OPTION_REVERSED_RECORD = 3;

    
    public static String GAME = "game";
    public static String RESTART_DIALOG = "dialogRestart";
    public static String WON_DIALOG = "dialogWon";


    public static TAnimation currentGame;

    public static Card[] cards;
    public static MAHResizingLibjcore[] stacks;

    public static BJSummaryDelete prefs;
    public static HYEMoving scores;

    public static ABHighlightAudio gameLogic;
    public static XMovesBlue animate;

    public static JGRight autoComplete;
    public static NOxygen timer;
    public static ZBCustomize sounds;
    public static SGMovement recordList;
    public static UAutofillLogin autoMove;
    public static VLibnonReferrer hint;
    public static JRBDynamic dealCards;

    public static PResetPreviews handlerTestIfWon;
    public static PResetPreviews handlerTestAfterMove;

    public static CADondorfFragment movingCards = new CADondorfFragment();
    public static EColor lg = new EColor();
    public static APurpleStop bitmaps = new APurpleStop();
    public static MHStringsAudio cardHighlight = new MHStringsAudio();
    public static SPagerVolume backgroundSound = new SPagerVolume();
    public static HLSpiderParis ensureMovability;

    public static int activityCounter = 0;
    public static boolean stopUiUpdates = false;
    public static boolean isDialogVisible = false;

    private static Toast toast;

     
    public static void reinitializeData(Context context) {
        
        if (!bitmaps.checkResources()) {
            bitmaps.setResources(context.getResources());
        }

        if (lg.getGameCount() == 0) {
            lg.loadAllGames();
        }

        
        if (prefs == null) {
            prefs = new BJSummaryDelete(context);
        }
    }

     
    public static void moveToStack(Card card, MAHResizingLibjcore destination) {
        moveToStack(card, destination, 0);
    }

     
    public static void moveToStack(Card card, MAHResizingLibjcore destination, int option) {
        ArrayList<Card> cards = new ArrayList<>();
        cards.add(card);

        ArrayList<MAHResizingLibjcore> destinations = new ArrayList<>();
        destinations.add(destination);

        moveToStack(cards, destinations, option);
    }

     
    public static void moveToStack(ArrayList<Card> cards, MAHResizingLibjcore destination) {
        moveToStack(cards, destination, 0);
    }

     
    public static void moveToStack(ArrayList<Card> cards, MAHResizingLibjcore destination, int option) {
        ArrayList<MAHResizingLibjcore> destinations = new ArrayList<>();

        for (int i = 0; i < cards.size(); i++)
            destinations.add(destination);

        moveToStack(cards, destinations, option);
    }

    public static void moveToStack(ArrayList<Card> cards, ArrayList<MAHResizingLibjcore> destinations) {
        moveToStack(cards, destinations, 0);
    }

     
    public static void moveToStack(ArrayList<Card> cards, ArrayList<MAHResizingLibjcore> destinations, int option) {

        if (!stopUiUpdates) {
            if (option == OPTION_UNDO) {
                scores.undo(cards, destinations);
            } else if (option == 0) {
                scores.move(cards, destinations);
                recordList.add(cards);
            } else if (option == OPTION_REVERSED_RECORD) {
                
                ArrayList<Card> cardsReversed = new ArrayList<>();

                for (int i = 0; i < cards.size(); i++) {
                    cardsReversed.add(cards.get(cards.size() - 1 - i));
                }

                recordList.add(cardsReversed);
                scores.move(cards, destinations);
            }
            
        }


        for (int i = 0; i < cards.size(); i++) {
            
            if (cards.get(i).getStack() == destinations.get(i)) {
                cards.get(i).flip();
            }
        }

        for (int i = 0; i < cards.size(); i++) {
            if (cards.get(i).getStack() != destinations.get(i)) {
                cards.get(i).removeFromCurrentStack();
                destinations.get(i).addCard(cards.get(i));
            }
        }

        for (MAHResizingLibjcore stack : destinations) {
            stack.updateSpacing();
        }

        for (Card card : cards) {
            card.bringToFront();
        }

        
        if (option == 0 && !stopUiUpdates) {
            handlerTestAfterMove.sendDelayed();
        }
    }

     
    public static void logText(String text) {
        Log.e("hey", text);
    }

    public static int min(int value1, int value2) {
        return value1 < value2 ? value1 : value2;
    }

    public static float min(float value1, float value2) {
        return value1 < value2 ? value1 : value2;
    }

    public static int max(int value1, int value2) {
        return value1 > value2 ? value1 : value2;
    }

    public static float max(float value1, float value2) {
        return value1 > value2 ? value1 : value2;
    }

    public static boolean leftHandedModeEnabled() {
        return prefs.getSavedLeftHandedMode();
    }

    public static boolean isLargeTablet(Context context) {
        return prefs.getSavedForcedTabletLayout() || ((context.getResources().getConfiguration().screenLayout
                & Configuration.SCREENLAYOUT_SIZE_MASK) >= Configuration.SCREENLAYOUT_SIZE_LARGE);
    }

    public static String stringFormat(String text) {
        return String.format(Locale.getDefault(), "%s", text);
    }

    public static int max(ArrayList<Integer> list) {
        int max = 0;

        for (int value : list) {
            if (value > max) {
                max = value;
            }
        }

        return max;
    }

    public static int min(ArrayList<Integer> list) {
        int min = list.get(0);

        for (int value : list) {
            if (value < min) {
                min = value;
            }
        }

        return min;
    }

    public static Random getPrng() {
        return new Random();


         


        
    }

     
    @SuppressLint("ShowToast")
    public static void showToast(String text, Context context) {
        if (toast == null) {
            toast = Toast.makeText(context, text, Toast.LENGTH_LONG);
        } else
            toast.setText(text);

        toast.show();
    }

     
    static public CharSequence createBulletParagraph(CharSequence[] strings) {

        SpannableString spanns[] = new SpannableString[strings.length];

        
        for (int i = 0; i < strings.length; i++) {
            spanns[i] = new SpannableString(strings[i] + (i < strings.length - 1 ? "\n" : ""));
            spanns[i].setSpan(new BulletSpan(15), 0, strings[i].length(), 0);
        }

        
        return TextUtils.concat(spanns);
    }
}