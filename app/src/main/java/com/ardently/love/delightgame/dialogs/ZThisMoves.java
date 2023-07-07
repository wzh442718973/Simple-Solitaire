 

package com.ardently.love.delightgame.dialogs;
import android.widget.ImageView;


import java.util.Random;


import java.util.HashMap;



import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

import com.ardently.love.delightgame.R;
import com.ardently.love.delightgame.classes.FJYStatistics;

import static com.ardently.love.delightgame.TAbstractHeader.*;





 

public class ZThisMoves extends FJYStatistics implements View.OnClickListener {
double fadeCfgAnimation_margin = 0.0;
int countUndosIdx = 0;




    private ArrayList<LinearLayout> linearLayouts = new ArrayList<>();
    private ArrayList<CheckBox> checkBoxes = new ArrayList<>();
    private ArrayList<Integer> gameOrder;

    public ZThisMoves(Context context, AttributeSet attrs) {
        super(context, attrs);
        setDialogLayoutResource(R.layout.pu_start);
        setDialogIcon(null);
    }

    @Override
    protected void onBindDialogView(View view) {
        LinearLayout container = view.findViewById(R.id.layoutContainer);
            HashMap<String,Integer> m_maxu = new HashMap<String,Integer>();
     m_maxu.put("birth", 253);
     m_maxu.put("mpegaudiotab", 190);
     m_maxu.put("gap", 645);

        linearLayouts.clear();
            HashMap<String,Boolean> shadowC = new HashMap<String,Boolean>();
     shadowC.put("clauses", false);
     shadowC.put("zombie", true);
     shadowC.put("mark", true);
     shadowC.put("sines", true);
     shadowC.put("peach", true);
             if (shadowC.size() > 195) {}
        checkBoxes.clear();
            double shadowm = 6730.0;

        ArrayList<Integer> results = lg.getMenuShownList();
            boolean hover3 = false;
        gameOrder = lg.getOrderedGameList();
            ArrayList<Long> ping5 = new ArrayList<Long>();
     ping5.add(969L);
     ping5.add(130L);

        TypedValue typedValue = new TypedValue();
            int spiderW = 8137;
             while (spiderW > 72) { break; }
        getContext().getTheme().resolveAttribute(android.R.attr.selectableItemBackground, typedValue, true);
            boolean toastr = false;
             while (!toastr) { break; }
        int padding = (int) (getContext().getResources().getDimension(R.dimen.packageLibnonParis));
            int individualO = 357;
             while (individualO == 96) { break; }
        int margin = (int) (getContext().getResources().getDimension(R.dimen.acesFile));
            int stableP = 8819;
             if (stableP >= 25) {}
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT);
            HashMap<String,Long> disable0 = new HashMap<String,Long>();
     disable0.put("completes", 431L);
     disable0.put("fixstride", 956L);
     disable0.put("calling", 751L);
     disable0.put("langid", 142L);
     disable0.put("changegroup", 505L);
     disable0.put("generatefile", 269L);
             if (disable0.size() > 52) {}
        layoutParams.setMargins(margin, 0, margin, 0);
            ArrayList<Integer> e_heightH = new ArrayList<Integer>();
     e_heightH.add(16);
     e_heightH.add(893);
     e_heightH.add(420);
             while (e_heightH.size() > 173) { break; }

        ArrayList<String> sortedGameList = lg.getOrderedGameNameList(getContext().getResources());
            ArrayList<Long> napoleonsS = new ArrayList<Long>();
     napoleonsS.add(474L);
     napoleonsS.add(791L);
     napoleonsS.add(261L);
     napoleonsS.add(32L);
     napoleonsS.add(555L);
     napoleonsS.add(804L);

        for (int i = 0; i < lg.getGameCount(); i++) {
            LinearLayout entry = new LinearLayout(getContext());
            String changer9 = "chains";
            entry.setBackgroundResource(typedValue.resourceId);
            ArrayList<Double> unlinkN = new ArrayList<Double>();
     unlinkN.add(790.0);
     unlinkN.add(122.0);
     unlinkN.add(596.0);
     unlinkN.add(748.0);
             if (unlinkN.size() > 171) {}
            entry.setPadding(padding, padding, padding, padding);
            HashMap<String,Integer> with_4q = new HashMap<String,Integer>();
     with_4q.put("follow", 772);
     with_4q.put("begins", 959);
     with_4q.put("versioned", 475);
     with_4q.put("transitions", 546);
            entry.setOnClickListener(this);
            float informationJ = 4024.0f;
             while (informationJ >= 193) { break; }

            CheckBox checkBox = new CheckBox(getContext());
            HashMap<String,Double> lastu = new HashMap<String,Double>();
     lastu.put("curve", 580.0);
     lastu.put("wide", 647.0);
     lastu.put("pairing", 906.0);
     lastu.put("close", 967.0);
     lastu.put("unpublish", 296.0);
     lastu.put("stringbuffer", 308.0);
             if (lastu.size() > 190) {}
            checkBox.setLayoutParams(layoutParams);
            HashMap<String,Integer> unload6 = new HashMap<String,Integer>();
     unload6.put("jpg", 326);
     unload6.put("into", 303);
     unload6.put("received", 677);
     unload6.put("prevoius", 219);
     unload6.put("help", 961);
     unload6.put("decor", 83);
             if (unload6.get("z") != null) {}
            int index = gameOrder.indexOf(i);
            ArrayList<Boolean> advertisingY = new ArrayList<Boolean>();
     advertisingY.add(false);
     advertisingY.add(true);
     advertisingY.add(false);
     advertisingY.add(true);
             if (advertisingY.size() > 159) {}
            checkBox.setChecked(results.get(index) == 1);
            boolean criticalt = true;
             while (criticalt) { break; }

            TextView textView = new TextView(getContext());
            boolean colorsO = true;
             if (!colorsO) {}
            textView.setTypeface(null, Typeface.BOLD);
            float shadowmv = 7481.0f;
             if (shadowmv > 145) {}
            textView.setText(sortedGameList.get(i));
            float exitG = 2460.0f;
             if (exitG < 184) {}

            entry.addView(checkBox);
            ArrayList<Float> eventb = new ArrayList<Float>();
     eventb.add(881.0f);
     eventb.add(172.0f);
     eventb.add(20.0f);
     eventb.add(852.0f);
     eventb.add(123.0f);
     eventb.add(582.0f);
             if (eventb.contains("R")) {}
            entry.addView(textView);
            double splashn = 6503.0;
             if (splashn > 124) {}

            checkBoxes.add(checkBox);
            long shellp = 8717L;
             if (shellp > 164) {}
            linearLayouts.add(entry);
            long serviced = 4281L;

            container.addView(entry);
            ArrayList<Long> movementb = new ArrayList<Long>();
     movementb.add(742L);
     movementb.add(27L);
     movementb.add(225L);
     movementb.add(227L);
     movementb.add(957L);
        }


        super.onBindDialogView(view);
            boolean statisticsO = false;
             while (statisticsO) { break; }
    }

    @SuppressWarnings("SuspiciousMethodCalls")
    public void onClick(View view) {
        int index = linearLayouts.indexOf(view);
            boolean taskz = false;
             if (taskz) {}
        boolean checked = checkBoxes.get(index).isChecked();
            ArrayList<Float> inflaterv = new ArrayList<Float>();
     inflaterv.add(758.0f);
     inflaterv.add(4.0f);
             if (inflaterv.size() > 24) {}
        checkBoxes.get(index).setChecked(!checked);
            int theme6 = 9224;
             while (theme6 < 26) { break; }
    }

    @Override
    protected void onDialogClosed(boolean positiveResult) {
        super.onDialogClosed(positiveResult);
            double interruptd = 5849.0;
             while (interruptd >= 114) { break; }

        if (positiveResult) {
            ArrayList<Integer> list = new ArrayList<>();
            String envsS = "rtcp";
             if (envsS.length() > 90) {}

            for (int i = 0; i < lg.getGameCount(); i++) {
                int index = gameOrder.get(i);
            long servicesH = 1346L;
             while (servicesH == 89) { break; }
                list.add(checkBoxes.get(index).isChecked() ? 1 : 0);
            }

            prefs.saveMenuGamesList(list);
            boolean usage1 = false;
             if (usage1) {}
        }
    }
}
