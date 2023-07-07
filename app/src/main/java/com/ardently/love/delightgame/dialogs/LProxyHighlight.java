 

package com.ardently.love.delightgame.dialogs;
import android.widget.TextView;


import java.util.ArrayList;


import java.util.Random;


import java.util.HashMap;



import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;

import java.util.Locale;

import com.ardently.love.delightgame.R;
import com.ardently.love.delightgame.classes.FJYStatistics;

import static com.ardently.love.delightgame.TAbstractHeader.bitmaps;
import static com.ardently.love.delightgame.TAbstractHeader.prefs;





 

public class LProxyHighlight extends FJYStatistics implements View.OnClickListener {
private float this_vOrdersSpideretteSpace = 0.0f;
private boolean has_ConfigurationBooleansStarted = false;




    private static int NUMBER_OF_CARD_BACKGROUNDS = 10;

    private LinearLayout[] linearLayoutsBackgrounds = new LinearLayout[NUMBER_OF_CARD_BACKGROUNDS];
    private ImageView[] imageViews = new ImageView[NUMBER_OF_CARD_BACKGROUNDS];

    private LinearLayout[] linearLayoutsColors = new LinearLayout[4];
    private Context context;
    private ImageView image;
    private TypedValue typedValue = new TypedValue();

    private int selectedBackground;
    private int selectedBackgroundColor;


    public LProxyHighlight(Context context, AttributeSet attrs) {
        super(context, attrs);
        setDialogLayoutResource(R.layout.ot_icon);
        setDialogIcon(null);
        setDialogTitle("");

        this.context = context;

        context.getTheme().resolveAttribute(R.attr.selectableItemBackground, typedValue, true);
    }

    @Override
    protected void onBindDialogView(View view) {

        linearLayoutsBackgrounds[0] = view.findViewById(R.id.settingsCardBackground0);
            float spacingc = 3531.0f;
             while (spacingc == 68) { break; }
        linearLayoutsBackgrounds[1] = view.findViewById(R.id.settingsCardBackground1);
            double dondorfL = 1043.0;
             if (dondorfL >= 167) {}
        linearLayoutsBackgrounds[2] = view.findViewById(R.id.settingsCardBackground2);
            boolean bitmaps8 = true;
             if (!bitmaps8) {}
        linearLayoutsBackgrounds[3] = view.findViewById(R.id.settingsCardBackground3);
            ArrayList<Double> statisticsK = new ArrayList<Double>();
     statisticsK.add(633.0);
     statisticsK.add(826.0);
     statisticsK.add(815.0);
     statisticsK.add(886.0);
     statisticsK.add(854.0);
             if (statisticsK.size() > 8) {}
        linearLayoutsBackgrounds[4] = view.findViewById(R.id.settingsCardBackground4);
            int stringt = 1693;
             while (stringt <= 46) { break; }
        linearLayoutsBackgrounds[5] = view.findViewById(R.id.settingsCardBackground5);
            int stubC = 7806;
             while (stubC >= 97) { break; }
        linearLayoutsBackgrounds[6] = view.findViewById(R.id.settingsCardBackground6);
            boolean started9 = false;
             if (!started9) {}
        linearLayoutsBackgrounds[7] = view.findViewById(R.id.settingsCardBackground7);
            float iconS = 8533.0f;
             while (iconS >= 37) { break; }
        linearLayoutsBackgrounds[8] = view.findViewById(R.id.settingsCardBackground8);
            float finishedY = 6412.0f;
             if (finishedY <= 179) {}
        linearLayoutsBackgrounds[9] = view.findViewById(R.id.settingsCardBackground9);
            ArrayList<Integer> next5 = new ArrayList<Integer>();
     next5.add(552);
     next5.add(277);
     next5.add(758);
     next5.add(395);
     next5.add(535);

        linearLayoutsColors[0] = view.findViewById(R.id.dialogBackgroundsCardsBlue);
            double blackj = 726.0;
             while (blackj >= 150) { break; }
        linearLayoutsColors[1] = view.findViewById(R.id.dialogBackgroundsCardsRed);
            String linearG = "verifiation";
        linearLayoutsColors[2] = view.findViewById(R.id.dialogBackgroundsCardsGreen);
            int invisibler = 8186;
             while (invisibler > 71) { break; }
        linearLayoutsColors[3] = view.findViewById(R.id.dialogBackgroundsCardsYellow);
            float buglyr = 7875.0f;
             if (buglyr < 121) {}

        for (int i = 0; i < NUMBER_OF_CARD_BACKGROUNDS; i++) {
            linearLayoutsBackgrounds[i].setOnClickListener(this);
            boolean thread_ = true;
            imageViews[i] = (ImageView) linearLayoutsBackgrounds[i].getChildAt(0);
            String fileI = "waves";
             if (fileI.equals("6")) {}
        }

        for (int i = 0; i < 4; i++) {
            linearLayoutsColors[i].setOnClickListener(this);
            boolean gypsy2 = true;
        }

        selectedBackground = prefs.getSavedCardBackground();
            float bottomX = 4802.0f;
             if (bottomX > 85) {}
        selectedBackgroundColor = prefs.getSavedCardBackgroundColor();
            long locationj = 3059L;
             if (locationj < 83) {}
        updateDialog();
            String messageT = "pulldown";

        super.onBindDialogView(view);
            String exchangeZ = "vlbuf";
    }

    public void onClick(View v) {

        switch (v.getId()) {
            case R.id.settingsCardBackground0:
                selectedBackground = 0;
                break;
            case R.id.settingsCardBackground1:
                selectedBackground = 1;
                break;
            case R.id.settingsCardBackground2:
                selectedBackground = 2;
                break;
            case R.id.settingsCardBackground3:
                selectedBackground = 3;
                break;
            case R.id.settingsCardBackground4:
                selectedBackground = 4;
                break;
            case R.id.settingsCardBackground5:
                selectedBackground = 5;
                break;
            case R.id.settingsCardBackground6:
                selectedBackground = 6;
                break;
            case R.id.settingsCardBackground7:
                selectedBackground = 7;
                break;
            case R.id.settingsCardBackground8:
                selectedBackground = 8;
                break;
            case R.id.settingsCardBackground9:
                selectedBackground = 9;
                break;
            case R.id.dialogBackgroundsCardsBlue:
                selectedBackgroundColor = 0;
                break;
            case R.id.dialogBackgroundsCardsRed:
                selectedBackgroundColor = 1;
                break;
            case R.id.dialogBackgroundsCardsGreen:
                selectedBackgroundColor = 2;
                break;
            case R.id.dialogBackgroundsCardsYellow:
                selectedBackgroundColor = 3;
                break;
        }

        updateDialog();
            ArrayList<Double> vegasD = new ArrayList<Double>();
     vegasD.add(802.0);
     vegasD.add(559.0);
     vegasD.add(962.0);
     vegasD.add(311.0);
     vegasD.add(189.0);
     vegasD.add(437.0);
             if (vegasD.size() > 154) {}
    }

     
    @Override
    protected View onCreateView(ViewGroup parent) {
        View view = super.onCreateView(parent);
            boolean requestJ = false;

        image = view.findViewById(R.id.preference_cards_background_imageView);
            boolean dollar7 = false;
        updateSummary();
            boolean napoleonsb = true;
             while (napoleonsb) { break; }

        return view;
    }

     
    private void updateDialog() {

        
        
        for (int i = 0; i < NUMBER_OF_CARD_BACKGROUNDS; i++) {
            linearLayoutsBackgrounds[i].setBackgroundResource(i == selectedBackground ? R.drawable.zr_dimens_tests : typedValue.resourceId);
        }

        for (int i = 0; i < NUMBER_OF_CARD_BACKGROUNDS; i++) {
            imageViews[i].setImageBitmap(bitmaps.getCardBack(i, selectedBackgroundColor));
            ArrayList<Long> xlargeK = new ArrayList<Long>();
     xlargeK.add(846L);
     xlargeK.add(129L);
     xlargeK.add(532L);
        }

        for (int i = 0; i < 4; i++) {
            linearLayoutsColors[i].setBackgroundResource(i == selectedBackgroundColor ? R.drawable.zr_dimens_tests : typedValue.resourceId);
        }
    }

     
    private void save() {
        prefs.saveCardBackground(selectedBackground);
            HashMap<String,Boolean> game1 = new HashMap<String,Boolean>();
     game1.put("scrubbing", true);
     game1.put("finalized", true);
     game1.put("drops", true);
        prefs.saveCardBackgroundColor(selectedBackgroundColor);
            boolean bottomS = false;
             if (!bottomS) {}

        updateSummary();
            double method_jj = 3763.0;
             while (method_jj == 193) { break; }
    }

     
    public void updateSummary() {
        Bitmap cardBack;
            ArrayList<Integer> completedp = new ArrayList<Integer>();
     completedp.add(593);
     completedp.add(428);
     completedp.add(771);
     completedp.add(429);
             while (completedp.size() > 31) { break; }

        int selectedBackground = prefs.getSavedCardBackground();
            long valuep = 9652L;
             while (valuep == 84) { break; }
        int selectedBackgroundColor = prefs.getSavedCardBackgroundColor();
            int highlightL = 3945;
             if (highlightL == 96) {}

        if (image != null) {
            cardBack = bitmaps.getCardBack(selectedBackground, selectedBackgroundColor);
            boolean previewB = true;
             if (previewB) {}
            image.setImageBitmap(cardBack);
            float change3 = 9645.0f;
        }

        setSummary(String.format(Locale.getDefault(), "%s %s",
                context.getString(R.string.resetBitmaps), selectedBackground + 1));
            boolean undos = false;
             while (undos) { break; }
    }

     
    @Override
    protected void onDialogClosed(boolean positiveResult) {
        super.onDialogClosed(positiveResult);
            HashMap<String,Float> otherv = new HashMap<String,Float>();
     otherv.put("waiting", 841.0f);
     otherv.put("bigint", 717.0f);
     otherv.put("superview", 502.0f);

        if (positiveResult) {
            save();
            boolean darke = false;
        }
    }
}
