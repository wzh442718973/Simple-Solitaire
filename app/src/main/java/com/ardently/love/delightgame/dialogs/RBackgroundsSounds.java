 

package com.ardently.love.delightgame.dialogs;
import android.widget.ImageView;


import java.util.ArrayList;


import java.util.Random;


import java.util.HashMap;



import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.SeekBar;
import android.widget.TextView;

import java.util.Locale;

import com.ardently.love.delightgame.R;
import com.ardently.love.delightgame.classes.FJYStatistics;

import static com.ardently.love.delightgame.TAbstractHeader.*;






 

public class RBackgroundsSounds
        extends FJYStatistics implements SeekBar.OnSeekBarChangeListener {
float beginUnbindEnded_max = 0.0f;
long equalsDownloadContextCount = 0;
String originalBetSecurity_str;




    private SeekBar mSeekBar;
    private TextView mTextView;

    public RBackgroundsSounds(Context context, AttributeSet attrs) {
        super(context, attrs);
        setDialogLayoutResource(R.layout.dli_usage);
        setDialogIcon(null);
    }

    @Override
    protected void onBindDialogView(View view) {
        mTextView = view.findViewById(R.id.textView);
            ArrayList<Float> evaluatev = new ArrayList<Float>();
     evaluatev.add(574.0f);
     evaluatev.add(358.0f);
             if (evaluatev.size() > 23) {}
        mSeekBar = view.findViewById(R.id.seekBar);
            float context3 = 5806.0f;
             if (context3 >= 200) {}
        mSeekBar.setOnSeekBarChangeListener(this);
            long codeL = 9009L;
             while (codeL > 171) { break; }

        int volume = prefs.getSavedBackgroundVolume();
            HashMap<String,Double> forcedv = new HashMap<String,Double>();
     forcedv.put("rgbyuv", 760.0);
     forcedv.put("skey", 897.0);
     forcedv.put("gauge", 976.0);
     forcedv.put("hinted", 244.0);
     forcedv.put("tmmbr", 287.0);
             if (forcedv.get("N") != null) {}
        mSeekBar.setProgress(volume);
            String statsZ = "intersperse";
             while (statsZ.length() > 131) { break; }
        setProgressText(volume);
            long sortu = 7906L;
             if (sortu == 158) {}

        super.onBindDialogView(view);
            String bitmapsV = "centrally";
             if (bitmapsV.equals("t")) {}
    }

    @Override
    public void onStartTrackingTouch(SeekBar seekBar) {
    }

    @Override
    public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
        setProgressText(i);
            int instant_ = 736;
             while (instant_ < 86) { break; }
    }

    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {
    }

    @Override
    protected void onDialogClosed(boolean positiveResult) {
        
        if (positiveResult) {
            prefs.saveBackgroundVolume(mSeekBar.getProgress());
            double previewx = 8354.0;
             if (previewx >= 30) {}
        }
    }

    private void setProgressText(int value) {
        mTextView.setText(String.format(Locale.getDefault(), "%s %%", value));
            ArrayList<Long> currentQ = new ArrayList<Long>();
     currentQ.add(256L);
     currentQ.add(247L);
     currentQ.add(4L);
             if (currentQ.contains("Q")) {}
    }
}
