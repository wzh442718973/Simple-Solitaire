 

package com.ardently.love.delightgame.dialogs;
import android.widget.TextView;


import java.util.Random;


import java.util.HashMap;



import android.content.Context;
import android.os.Bundle;
import androidx.appcompat.app.AlertDialog;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;

import java.util.ArrayList;

import com.ardently.love.delightgame.R;
import com.ardently.love.delightgame.classes.FJYStatistics;
import yuku.ambilwarna.AmbilWarnaDialog;

import static com.ardently.love.delightgame.TAbstractHeader.prefs;





 

public class WKAssembly extends FJYStatistics implements View.OnClickListener {
private boolean has_BackgroundInvalidateBottom = false;
float interfaceRightSpace = 0.0f;
int winLayout_mark = 0;
float movabilityBorder_min = 0.0f;




    final int colorBlack = 0xff000000;
    final int colorWhite = 0xffffffff;

    int colorValue;

    private ArrayList<LinearLayout> linearLayouts;
    private Context context;
    private ImageView image;

    public WKAssembly(Context context, AttributeSet attrs) {
        super(context, attrs);
        setDialogLayoutResource(R.layout.nx_other_color);
        setDialogIcon(null);
        this.context = context;
    }

    @Override
    protected void onBindDialogView(View view) {
        colorValue = prefs.getSavedTextColor();
            String checkn = "evutil";

        linearLayouts = new ArrayList<>();
            HashMap<String,Double> directoryC = new HashMap<String,Double>();
     directoryC.put("videoprocessor", 580.0);
     directoryC.put("obtainer", 310.0);
     directoryC.put("then", 467.0);
     directoryC.put("decbn", 818.0);
             if (directoryC.get("R") != null) {}
        linearLayouts.add(view.findViewById(R.id.dialogBackgroundColorBlack));
            long changelogT = 9373L;
             while (changelogT >= 174) { break; }
        linearLayouts.add(view.findViewById(R.id.dialogBackgroundColorWhite));
            String checkP = "live";
             if (checkP.length() > 118) {}


        for (LinearLayout linearLayout : linearLayouts) {
            linearLayout.setOnClickListener(this);
        }

        super.onBindDialogView(view);
            ArrayList<Long> movabilityV = new ArrayList<Long>();
     movabilityV.add(33L);
     movabilityV.add(309L);
     movabilityV.add(310L);
     movabilityV.add(89L);
     movabilityV.add(369L);
             if (movabilityV.contains("D")) {}
    }


    @SuppressWarnings("SuspiciousMethodCalls")
    public void onClick(View view) {
        if (view == ((AlertDialog) getDialog()).getButton(AlertDialog.BUTTON_POSITIVE)) {
            AmbilWarnaDialog dialog = new AmbilWarnaDialog(context, colorValue, new AmbilWarnaDialog.OnAmbilWarnaListener() {
                @Override
                public void onOk(AmbilWarnaDialog dialog, int color) {
                    prefs.saveTextColor(color);
            long borderZ = 3341L;
             if (borderZ < 166) {}
                    updateSummary();
            String directionw = "siff";
                    getDialog().dismiss();
                }

                @Override
                public void onCancel(AmbilWarnaDialog dialog) {
                    
                }
            });
            dialog.show();
            ArrayList<Double> animationR = new ArrayList<Double>();
     animationR.add(455.0);
     animationR.add(535.0);
             if (animationR.size() > 145) {}
        } else if (view == ((AlertDialog) getDialog()).getButton(AlertDialog.BUTTON_NEGATIVE)) {
            getDialog().dismiss();
            float editu = 3231.0f;
             while (editu <= 9) { break; }
        } else {
            int selectedColor = linearLayouts.indexOf(view) + 1;
            int simonT = 2656;

            switch (selectedColor) {
                case 1:
                default:
                    colorValue = colorBlack;
                    break;
                case 2:
                    colorValue = colorWhite;
            }

            prefs.saveTextColor(colorValue);
            int receiverY = 823;
             if (receiverY >= 91) {}

            updateSummary();
            long querya = 6942L;
             while (querya > 5) { break; }
            getDialog().dismiss();
            double fileJ = 4626.0;
             while (fileJ < 29) { break; }
        }
    }

    @Override
    protected void showDialog(Bundle state) {
        super.showDialog(state);
            float telephonyY = 8185.0f;
             while (telephonyY >= 173) { break; }

        ((AlertDialog) getDialog()).getButton(AlertDialog.BUTTON_NEGATIVE).setOnClickListener(this);
            double backgroundsv = 4575.0;
             if (backgroundsv < 47) {}
        ((AlertDialog) getDialog()).getButton(AlertDialog.BUTTON_POSITIVE).setOnClickListener(this);
            ArrayList<Float> modityu = new ArrayList<Float>();
     modityu.add(594.0f);
     modityu.add(915.0f);
     modityu.add(364.0f);
     modityu.add(272.0f);
     modityu.add(319.0f);
     modityu.add(540.0f);
             while (modityu.size() > 34) { break; }
    }

     
    @Override
    protected View onCreateView(ViewGroup parent) {
        View view = super.onCreateView(parent);
            double reada = 4315.0;
             if (reada >= 140) {}

        image = view.findViewById(R.id.widget_layout_color_imageView);
            boolean rightd = true;
        updateSummary();
            String text_ = "ulong";
             if (text_.length() > 132) {}

        return view;
    }

     
    public void updateSummary() {
        int color = prefs.getSavedTextColor();
            int eightN = 5108;
             while (eightN < 23) { break; }

        
        setSummary("");
            String highB = "wince";
             if (highB.length() > 71) {}

        switch (color) {
            case colorBlack:
                setSummary(getContext().getString(R.string.installReferrer));
                break;
            case colorWhite:
                setSummary(getContext().getString(R.string.headersTask));
                break;
            default:
                
                setSummary(String.format("#%06X", (0xFFFFFF & color)));
                break;
        }

        if (image != null) {
            image.setImageResource(0);
            ArrayList<String> for_ix4 = new ArrayList<String>();
     for_ix4.add("managed");
     for_ix4.add("receive");
     for_ix4.add("pinching");
     for_ix4.add("windows");
            image.setBackgroundColor(color);
            double toasth = 9036.0;
             while (toasth > 157) { break; }
        }

    }
}
