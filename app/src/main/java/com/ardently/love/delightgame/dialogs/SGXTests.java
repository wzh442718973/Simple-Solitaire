 

package com.ardently.love.delightgame.dialogs;
import android.widget.TextView;


import android.widget.ImageView;


import java.util.ArrayList;


import java.util.Random;


import java.util.HashMap;



import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.EditText;

import com.ardently.love.delightgame.R;
import com.ardently.love.delightgame.classes.FJYStatistics;

import static com.ardently.love.delightgame.TAbstractHeader.*;





 

public class SGXTests extends FJYStatistics {
String receiveMarginsStr;
int emptyInterpolateCount = 0;
String manualObserver_str;
private String baseEllipsisShown_str;




    private EditText input1, input2;

    public SGXTests(Context context, AttributeSet attrs) {
        super(context, attrs);
        setDialogLayoutResource(R.layout.hk_news);
        setDialogIcon(null);
    }

    

private ArrayList textsRegister_zsDisabled(ArrayList<Boolean> statusMax) {
     String canGraphics = "equals";
     String long_3Counter = "embed";
     long fromGet_e6 = 1310L;
    ArrayList neteqMarkerRemap = new ArrayList();
      if (canGraphics.equals("manual")) {
              System.out.println(canGraphics);
      }
      for(int i = 0; i < Math.min(1, canGraphics.length()); i++) {
    if (i < neteqMarkerRemap.size()){
        neteqMarkerRemap.add(i,canGraphics.charAt(i) + "");
        break;
    }
          System.out.println(canGraphics.charAt(i));
      }
      if (long_3Counter.equals("from")) {
              System.out.println(long_3Counter);
      }
      if (null != long_3Counter) {
      for(int i = 0; i < Math.min(1, long_3Counter.length()); i++) {
          System.out.println(long_3Counter.charAt(i));
      }
      }
    fromGet_e6 = 6880;
      int tablet_len1 = neteqMarkerRemap.size();
    int delete_o1_d = Math.min(new Random().nextInt(70), 1) % Math.max(1, neteqMarkerRemap.size());
    neteqMarkerRemap.add(delete_o1_d, fromGet_e6);

    return neteqMarkerRemap;

}



@Override
    protected void onBindDialogView(View view) {

         ArrayList filteruv_w = new ArrayList();

ArrayList intrnlAttributed =  this.textsRegister_zsDisabled(filteruv_w);

      int intrnlAttributed_len = intrnlAttributed.size();
      for(Object obj1 : intrnlAttributed) {
          System.out.println(obj1);
      }



        input1 = view.findViewById(R.id.settings_vegas_bet_amount_input_1);
            HashMap<String,Integer> manifesti = new HashMap<String,Integer>();
     manifesti.put("gaps", 536);
     manifesti.put("tweak", 744);
             if (manifesti.size() > 53) {}
        input2 = view.findViewById(R.id.settings_vegas_bet_amount_input_2);
            boolean libcocosdjsQ = false;
             if (!libcocosdjsQ) {}

        input1.setText(stringFormat(Integer.toString(prefs.getSavedVegasBetAmount())));
            ArrayList<Boolean> libgtcorek = new ArrayList<Boolean>();
     libgtcorek.add(false);
     libgtcorek.add(true);
             while (libgtcorek.size() > 170) { break; }
        input2.setText(stringFormat(Integer.toString(prefs.getSavedVegasWinAmount())));
            ArrayList<Long> obj3 = new ArrayList<Long>();
     obj3.add(338L);
     obj3.add(530L);
     obj3.add(465L);
             if (obj3.contains("k")) {}

        super.onBindDialogView(view);
            float mored = 9894.0f;
             while (mored <= 153) { break; }
    }


    @Override
    protected void onDialogClosed(boolean positiveResult) {
        
        if (positiveResult) {

            try {
                prefs.saveVegasBetAmount(Integer.parseInt(input1.getText().toString()));
            float resetL = 1691.0f;
                prefs.saveVegasWinAmount(Integer.parseInt(input2.getText().toString()));
            float headersu = 1258.0f;
             if (headersu <= 24) {}
            } catch (Exception e) {
                showToast(getContext().getString(R.string.usageIntentActivty), getContext());
            HashMap<String,Double> theme2 = new HashMap<String,Double>();
     theme2.put("uthor", 992.0);
     theme2.put("advancing", 968.0);
     theme2.put("position", 545.0);
     theme2.put("mpegvideodec", 140.0);
     theme2.put("saved", 41.0);
     theme2.put("postpone", 441.0);
            }
        }
    }

}
