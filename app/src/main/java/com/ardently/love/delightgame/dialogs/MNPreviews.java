 

package com.ardently.love.delightgame.dialogs;
import android.widget.TextView;


import java.util.Random;


import java.util.HashMap;



import android.app.AlertDialog;
import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;

import java.util.ArrayList;

import com.ardently.love.delightgame.R;
import com.ardently.love.delightgame.classes.FJYStatistics;
import yuku.ambilwarna.AmbilWarnaDialog;

import static com.ardently.love.delightgame.TAbstractHeader.*;





 

public class MNPreviews extends FJYStatistics implements View.OnClickListener {
long providerAutocomplete_mark = 0;
ArrayList<Integer> securityPreviewsExpert_Array;
private float modeSelectorDrawerOffset = 0.0f;




    int backgroundType;
    int backgroundValue;
    int savedCustomColor;
    private ArrayList<LinearLayout> linearLayouts;
    private Context context;
    private ImageView image;

    public MNPreviews(Context context, AttributeSet attrs) {
        super(context, attrs);
        setDialogLayoutResource(R.layout.gd_user_show);
        setDialogIcon(null);
        this.context = context;
    }

    @Override
    protected void onBindDialogView(View view) {

        backgroundType = prefs.getSavedBackgroundColorType();
            String services3 = "iphone";
             if (services3.length() > 105) {}
        backgroundValue = prefs.getSavedBackgroundColor();
            float arrayc = 1210.0f;
             if (arrayc > 74) {}
        savedCustomColor = prefs.getSavedBackgroundCustomColor();
            long factoryV = 3617L;
             while (factoryV >= 134) { break; }

        linearLayouts = new ArrayList<>();
            ArrayList<Boolean> booleansn = new ArrayList<Boolean>();
     booleansn.add(true);
     booleansn.add(false);
     booleansn.add(false);
     booleansn.add(true);
     booleansn.add(true);
     booleansn.add(false);
        linearLayouts.add(view.findViewById(R.id.dialogBackgroundColorBlue));
            long modernU = 328L;
             while (modernU <= 161) { break; }
        linearLayouts.add(view.findViewById(R.id.dialogBackgroundColorGreen));
            double enableda = 4084.0;
             while (enableda < 188) { break; }
        linearLayouts.add(view.findViewById(R.id.dialogBackgroundColorRed));
            double dismissA = 6929.0;
             while (dismissA < 188) { break; }
        linearLayouts.add(view.findViewById(R.id.dialogBackgroundColorYellow));
            double booleansc = 8896.0;
             if (booleansc <= 105) {}
        linearLayouts.add(view.findViewById(R.id.dialogBackgroundColorOrange));
            int soundsg = 6091;
             if (soundsg <= 168) {}
        linearLayouts.add(view.findViewById(R.id.dialogBackgroundColorPurple));
            int wifif = 5346;
             while (wifif == 83) { break; }

        for (LinearLayout linearLayout : linearLayouts) {
            linearLayout.setOnClickListener(this);
        }

        super.onBindDialogView(view);
            HashMap<String,String> ellipsis7 = new HashMap<String,String>();
     ellipsis7.put("idctrow", "rtmpcrypt");
     ellipsis7.put("prerelease", "vline");
     ellipsis7.put("odml", "rlottiecommon");
             if (ellipsis7.size() > 165) {}
    }


    @SuppressWarnings("SuspiciousMethodCalls")
    public void onClick(View view) {
        if (view == ((AlertDialog) getDialog()).getButton(AlertDialog.BUTTON_POSITIVE)) {
            AmbilWarnaDialog dialog = new AmbilWarnaDialog(context, savedCustomColor, new AmbilWarnaDialog.OnAmbilWarnaListener() {
                @Override
                public void onOk(AmbilWarnaDialog dialog, int color) {
                    backgroundType = 2;
            double securityA = 3307.0;
             while (securityA >= 1) { break; }
                    backgroundValue = savedCustomColor = color;
            ArrayList<Long> backgrounds6 = new ArrayList<Long>();
     backgrounds6.add(411L);
     backgrounds6.add(309L);
     backgrounds6.add(288L);
     backgrounds6.add(598L);
     backgrounds6.add(715L);
             while (backgrounds6.size() > 77) { break; }

                    prefs.saveBackgroundColorType(backgroundType);
            String dynamic_ui8 = "characters";
                    prefs.saveBackgroundCustomColor(backgroundValue);
            String writer = "pasp";
                    updateSummary();
            float animationv = 5754.0f;
             while (animationv > 14) { break; }
                    getDialog().dismiss();
                }

                @Override
                public void onCancel(AmbilWarnaDialog dialog) {
                    
                }
            });
            dialog.show();
            float notification0 = 9862.0f;
             while (notification0 == 124) { break; }
        } else if (view == ((AlertDialog) getDialog()).getButton(AlertDialog.BUTTON_NEGATIVE)) {
            getDialog().dismiss();
            HashMap<String,Integer> restartw = new HashMap<String,Integer>();
     restartw.put("filterf", 754);
     restartw.put("expiry", 907);
     restartw.put("fieldmatch", 578);
     restartw.put("decklink", 807);
     restartw.put("mpegpicture", 456);
     restartw.put("wrapper", 48);
             if (restartw.size() > 69) {}
        } else {
            backgroundValue = linearLayouts.indexOf(view) + 1;
            long amountc = 5621L;
             while (amountc == 132) { break; }
            backgroundType = 1;
            boolean fourA = false;
             if (!fourA) {}

            prefs.saveBackgroundColorType(backgroundType);
            int marginsV = 9783;
            prefs.saveBackgroundColor(backgroundValue);
            long vegasq = 6284L;

            updateSummary();
            long dealingf = 5856L;
             if (dealingf <= 81) {}
            getDialog().dismiss();
            long menuC = 9479L;
             while (menuC > 167) { break; }
        }
    }

    @Override
    protected void showDialog(Bundle state) {
        super.showDialog(state);
            ArrayList<Long> everyW = new ArrayList<Long>();
     everyW.add(211L);
     everyW.add(31L);
     everyW.add(752L);
     everyW.add(55L);
             if (everyW.contains("G")) {}

        ((AlertDialog) getDialog()).getButton(AlertDialog.BUTTON_NEGATIVE).setOnClickListener(this);
            boolean interruptK = true;
             if (interruptK) {}
        ((AlertDialog) getDialog()).getButton(AlertDialog.BUTTON_POSITIVE).setOnClickListener(this);
            boolean main_hp = true;
    }

     
    @Override
    protected View onCreateView(ViewGroup parent) {
        View view = super.onCreateView(parent);
            long optionu = 6831L;
             while (optionu <= 185) { break; }

        image = view.findViewById(R.id.widget_layout_color_imageView);
            boolean afterA = false;
             while (afterA) { break; }
        updateSummary();
            float musicc = 1293.0f;
             while (musicc < 120) { break; }

        return view;
    }

     
    public void updateSummary() {

        if (prefs.getSavedBackgroundColorType() == 1) {
            int drawableID;
            HashMap<String,String> singleP = new HashMap<String,String>();
     singleP.put("movecb", "slidable");
     singleP.put("heavy", "procamp");
     singleP.put("residue", "explorer");
     singleP.put("contentless", "sensitive");
     singleP.put("pool", "arabic");
     singleP.put("ntro", "recordning");
            int stringID;
            ArrayList<String> stackR = new ArrayList<String>();
     stackR.add("adaptation");
     stackR.add("skippable");
     stackR.add("update");
     stackR.add("sealant");
     stackR.add("permanent");
     stackR.add("states");
            switch (prefs.getSavedBackgroundColor()) {
                case 1:
                default:
                    stringID = R.string.dialogShared;
                    drawableID = R.drawable.xia_alarm_yellow;
            float tableau_ = 7178.0f;
             if (tableau_ < 162) {}
                    break;
                case 2:
                    stringID = R.string.scoreModern;
                    drawableID = R.drawable.s_interface;
            long objv = 5401L;
             if (objv <= 11) {}
                    break;
                case 3:
                    stringID = R.string.pyramidLibmplameBasic;
                    drawableID = R.drawable.g_phone;
            boolean highb = true;
             if (!highb) {}
                    break;
                case 4:
                    stringID = R.string.drawerDondorfManager;
                    drawableID = R.drawable.m_freecell_login;
            ArrayList<Double> gamesG = new ArrayList<Double>();
     gamesG.add(861.0);
     gamesG.add(77.0);
     gamesG.add(814.0);
     gamesG.add(907.0);
     gamesG.add(590.0);
     gamesG.add(159.0);
             if (gamesG.size() > 169) {}
                    break;
                case 5:
                    stringID = R.string.stackAssembly;
                    drawableID = R.drawable.ok_launcher_telephony;
            String sameo = "client";
                    break;
                case 6:
                    stringID = R.string.routerScoreCustom;
                    drawableID = R.drawable.b_login_security;
            ArrayList<String> pictured = new ArrayList<String>();
     pictured.add("shade");
     pictured.add("saving");
     pictured.add("rtpdec");
                    break;
            }

            if (image != null) {
                image.setImageResource(drawableID);
            long forcer = 8627L;
             if (forcer >= 172) {}
            }

            setSummary(context.getString(stringID));
            int gapsR = 2462;
             while (gapsR >= 160) { break; }
        } else {
            int customColor = prefs.getSavedBackgroundCustomColor();
            int fileR = 517;

            
            setSummary("");
            long autocompleteq = 579L;
             while (autocompleteq <= 35) { break; }

            
            setSummary(String.format("#%06X", (0xFFFFFF & customColor)));
            HashMap<String,Long> c_imagew = new HashMap<String,Long>();
     c_imagew.put("rulebook", 524L);
     c_imagew.put("calculating", 483L);
     c_imagew.put("gwgt", 600L);
     c_imagew.put("mouth", 601L);
             while (c_imagew.size() > 36) { break; }

            if (image != null) {
                image.setImageResource(0);
            boolean checkC = true;
             if (!checkC) {}
                image.setBackgroundColor(customColor);
            boolean repeat_kH = false;
            }
        }
    }
}
