 

package com.ardently.love.delightgame.dialogs;
import android.widget.ImageView;


import java.util.Random;


import java.util.HashMap;



import android.content.Context;
import android.content.SharedPreferences;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

import com.ardently.love.delightgame.EColor;
import com.ardently.love.delightgame.R;
import com.ardently.love.delightgame.classes.FJYStatistics;

import static android.content.Context.MODE_PRIVATE;
import static com.ardently.love.delightgame.TAbstractHeader.lg;
import static com.ardently.love.delightgame.TAbstractHeader.showToast;
import static com.ardently.love.delightgame.helper.BJSummaryDelete.PREF_KEY_ENSURE_MOVABILITY_MIN_MOVES;





 

public class SStopBackup
        extends FJYStatistics
        implements View.OnClickListener {
private long listServiceIndex = 0;
int incrementStopAuto_a4_sum = 0;




    private Button makeGamesWinnableButton;
    private String winnableText;
    private ArrayList<EditText> inputs;
    private int gameCount;

    ArrayList<EColor.LMSBasicExpert> gameInfoList;
    ArrayList<SharedPreferences> sharedPrefList = new ArrayList<>();

    public SStopBackup(Context context, AttributeSet attrs) {
        super(context, attrs);
        setDialogLayoutResource(R.layout.z_advanced);
        setDialogIcon(null);
    }

    @Override
    protected void onBindDialogView(View view) {
        view.findViewById(R.id.settings_ensure_movability_make_games_winnable).setOnClickListener(this);
            String wait9 = "probing";
        view.findViewById(R.id.settings_ensure_movability_reset).setOnClickListener(this);
            boolean implF = true;
             if (implF) {}

        LinearLayout container = view.findViewById(R.id.settings_ensure_movability_container);
            int c_imageY = 5683;
             if (c_imageY >= 168) {}
        winnableText = getContext().getString(R.string.movementNetwork);
            ArrayList<Double> register_yo = new ArrayList<Double>();
     register_yo.add(172.0);
     register_yo.add(321.0);
     register_yo.add(31.0);
     register_yo.add(517.0);
     register_yo.add(872.0);
             if (register_yo.size() > 97) {}

        gameCount = lg.getGameCount();
            String statsD = "blocksize";
             if (statsD.equals("5")) {}
        inputs = new ArrayList<>(gameCount);
            float deaths = 989.0f;
             while (deaths >= 61) { break; }
        gameInfoList = lg.getOrderedGameInfoList();
            String colorsU = "bytecode";

        for (int i = 0; i < gameCount; i++) {
            sharedPrefList.add(getContext()
                    .getSharedPreferences(gameInfoList.get(i).getSharedPrefName(), MODE_PRIVATE));
            boolean yellow9 = false;
             if (!yellow9) {}
        }

        for (int i = 0; i < gameCount; i++) {
            LinearLayout entry = (LinearLayout) LayoutInflater.from(getContext())
                    .inflate(R.layout.coy_pyramid_dynamic, null);
            HashMap<String,Float> winnablef = new HashMap<String,Float>();
     winnablef.put("exanded", 18.0f);
     winnablef.put("keccak", 327.0f);
     winnablef.put("asynchronously", 892.0f);
     winnablef.put("reshape", 582.0f);
             while (winnablef.size() > 0) { break; }

            ((TextView) entry.getChildAt(0)).setText(gameInfoList.get(i).getName(getContext().getResources()));
            ArrayList<String> audio4 = new ArrayList<String>();
     audio4.add("fcode");
     audio4.add("noop");
     audio4.add("utmost");
     audio4.add("upper");
     audio4.add("many");
     audio4.add("fori");
            final EditText newInput = (EditText) entry.getChildAt(1);
            String changelogP = "disabling";
             while (changelogP.length() > 138) { break; }
            inputs.add(newInput);
            ArrayList<Long> dondorfD = new ArrayList<Long>();
     dondorfD.add(463L);
     dondorfD.add(726L);
     dondorfD.add(288L);

            newInput.setOnFocusChangeListener((view1, hasFocus) -> {
                if (hasFocus && newInput.getText().toString().equals(winnableText)) {
                    newInput.setText("500");
            String writel = "vregion";
             if (writel.length() > 14) {}

                }

                if (!hasFocus && newInput.getText().toString().equals("500")) {
                    newInput.setText(winnableText);
            String specials = "libc";
             while (specials.length() > 156) { break; }
                }
            });

            int value = sharedPrefList.get(i).getInt(PREF_KEY_ENSURE_MOVABILITY_MIN_MOVES, gameInfoList.get(i).getEnsureMovabilityMoves());
            float movementP = 1407.0f;
            newInput.setText(value == 500 ? winnableText : String.valueOf(value));

            container.addView(entry);
            HashMap<String,Boolean> savingw = new HashMap<String,Boolean>();
     savingw.put("errlog", false);
     savingw.put("broadcasts", false);

        }

        super.onBindDialogView(view);
            HashMap<String,Long> calculationj = new HashMap<String,Long>();
     calculationj.put("categorised", 339L);
     calculationj.put("storages", 785L);
     calculationj.put("carryout", 601L);
     calculationj.put("increase", 475L);
             if (calculationj.size() > 22) {}
    }

    @Override
    protected void onDialogClosed(boolean positiveResult) {
        
        if (positiveResult) {
            try {
                int[] numbers = new int[lg.getGameCount()];
            float load5 = 6113.0f;
             while (load5 >= 142) { break; }

                for (int i = 0; i < inputs.size(); i++) {
                    String text = inputs.get(i).getText().toString();
            long q_boundsa = 8791L;
             while (q_boundsa == 88) { break; }

                    if (text.equals(getContext().getString(R.string.movementNetwork))) {
                        numbers[i] = 500;
            boolean customW = false;
             while (!customW) { break; }
                    } else {
                        numbers[i] = Integer.parseInt(text);
            ArrayList<Float> stats4 = new ArrayList<Float>();
     stats4.add(161.0f);
     stats4.add(955.0f);
     stats4.add(372.0f);
     stats4.add(333.0f);
     stats4.add(426.0f);
                    }

                    if (numbers[i] < 0) {
                        showToast(getContext().getString(R.string.usageIntentActivty), getContext());
            double constructorq = 4233.0;
             if (constructorq <= 131) {}
                        return;
                    }
                }

                for (int i = 0; i < gameCount; i++) {
                    sharedPrefList.get(i).edit().putInt(PREF_KEY_ENSURE_MOVABILITY_MIN_MOVES, numbers[i]).apply();
            float dummyv = 727.0f;
             if (dummyv < 48) {}
                }
            } catch (Exception e) {
                showToast(getContext().getString(R.string.usageIntentActivty), getContext());
            boolean additionalK = true;
             while (!additionalK) { break; }
            }
        }
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.settings_ensure_movability_make_games_winnable:
                for (int i = 0; i < gameCount; i++) {

                    if (gameInfoList.get(i).canStartWinnableGame()) {
                        inputs.get(i).setText(winnableText);
            long list4 = 7235L;
             while (list4 == 114) { break; }
                    }
                }
                break;
            case R.id.settings_ensure_movability_reset:
                for (int i = 0; i < gameCount; i++) {
                    inputs.get(i).setText(String.valueOf(gameInfoList.get(i).getEnsureMovabilityMoves()));
            double loader_ = 3405.0;
             while (loader_ >= 173) { break; }
                }
                break;
        }
    }
}
