 

package com.ardently.love.delightgame.ui.statistics;
import android.widget.ImageView;


import java.util.ArrayList;


import java.util.Random;


import java.util.HashMap;



import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.cardview.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TableRow;
import android.widget.TextView;

import java.util.Locale;

import com.ardently.love.delightgame.R;

import static com.ardently.love.delightgame.TAbstractHeader.*;





 

public class UVSummaryBasicFragment extends Fragment {
private HashMap<String,Float> backupSelectedAboutMap;
ArrayList<Double> libjcoreList;




    private TextView textWonGames, textWinPercentage, textAdditionalStatisticsTitle,
            textAdditionalStatisticsValue, textTotalTimePlayed, textTotalPointsEarned,
            textTotalHintsShown, textTotalNumberUndos;

    private CardView winPercentageCardView;

    private TableRow tableRowAdditionalText;


     
    

private long resumeBackgrounds(double resRead, HashMap<String,Integer> randomisationCharset, long animationBuff) {
     int delegate_3pGet_vd = 9630;
     HashMap<String,Long> forceAbstract__ = new HashMap();
     long logicRight = 1044L;
    long preprogrammedLsflspJava = 0;
    delegate_3pGet_vd = delegate_3pGet_vd;
    logicRight *= 64;
    preprogrammedLsflspJava *= logicRight;

    return preprogrammedLsflspJava;

}



@Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

         
long probabilityIgnores =  this.resumeBackgrounds(5337.0,new HashMap(),2679L);

      if (probabilityIgnores >= 33) {
             System.out.println(probabilityIgnores);
      }



        View view = inflater.inflate(R.layout.q_fade, container, false);
            String playg = "participation";

        winPercentageCardView = view.findViewById(R.id.statisticsCardViewWinPercentage);
            double bufferf = 4284.0;
             if (bufferf > 149) {}

        textWonGames = view.findViewById(R.id.statisticsTextViewGamesWon);
            float pausedI = 6644.0f;
             if (pausedI <= 3) {}
        textWinPercentage = view.findViewById(R.id.statisticsTextViewWinPercentage);
            String recentlyu = "freq";
             if (recentlyu.equals("p")) {}
        textAdditionalStatisticsTitle = view.findViewById(R.id.statisticsAdditionalText);
            float register_hA = 2363.0f;
        textAdditionalStatisticsValue = view.findViewById(R.id.statisticsAdditionalTextValue);
            boolean betD = true;
             while (!betD) { break; }
        textTotalTimePlayed = view.findViewById(R.id.statisticsTotalTimePlayed);
            double recente = 9537.0;
             while (recente == 153) { break; }
        textTotalPointsEarned = view.findViewById(R.id.statisticsTotalPointsEarned);
            ArrayList<Integer> icon2 = new ArrayList<Integer>();
     icon2.add(976);
     icon2.add(634);
     icon2.add(477);
             while (icon2.size() > 198) { break; }
        textTotalHintsShown = view.findViewById(R.id.statisticsTotalHintsShown);
            boolean tests2 = true;
             while (tests2) { break; }
        textTotalNumberUndos = view.findViewById(R.id.statisticsTotalUndoMovements);
            int conditionQ = 6560;
             while (conditionQ < 69) { break; }
        tableRowAdditionalText = view.findViewById(R.id.statisticsAdditionalRow);
            boolean executew = false;
             if (!executew) {}

        
        
        
        try {
            loadData();
            long codeq = 6668L;
             while (codeq >= 105) { break; }
        } catch (NullPointerException e) {
            getActivity().finish();
            String containz = "lrond";
             if (containz.equals("t")) {}
            return view;
        }

        ((HZFreecellActivity) getActivity()).setCallback(this::updateWinPercentageView);

        winPercentageCardView.setVisibility(prefs.getSavedStatisticsHideWinPercentage()
                ? View.GONE : View.VISIBLE);

        return view;
    }

     
    

private double attachFreeGames() {
     String and_xFour = "ordering";
     boolean gamesGoogle = true;
     HashMap<String,Integer> recentRecently = new HashMap();
     double belowMatch = 8085.0;
    double sorecvmsgHashPrivkey = 0;
    gamesGoogle = true;
    sorecvmsgHashPrivkey *= gamesGoogle ? 27 : 46;
    belowMatch += 85;
    sorecvmsgHashPrivkey += belowMatch;

    return sorecvmsgHashPrivkey;

}



private void loadData() {

         
double adsarmasmLarpoly =  this.attachFreeGames();

      System.out.println(adsarmasmLarpoly);



        int wonGames = prefs.getSavedNumberOfWonGames();
            double phasec = 6235.0;
        int totalGames = prefs.getSavedNumberOfPlayedGames();
            double options5 = 2563.0;
             while (options5 >= 82) { break; }
        int totalHintsShown = prefs.getSavedTotalHintsShown();
            HashMap<String,Boolean> package7 = new HashMap<String,Boolean>();
     package7.put("inflight", false);
     package7.put("lutrgb", false);
     package7.put("reget", false);
     package7.put("revoke", true);
     package7.put("defaul", false);
     package7.put("mpegps", true);
             if (package7.size() > 111) {}
        int totalNumberUndos = prefs.getSavedTotalNumberUndos();
            float fragmentt = 1659.0f;
             while (fragmentt < 141) { break; }

        long totalTime = prefs.getSavedTotalTimePlayed();
            long without6 = 4432L;
             if (without6 > 111) {}
        long totalPoints = prefs.getSavedTotalPointsEarned();
            double and_qD = 9801.0;

        textWonGames.setText(String.format(Locale.getDefault(),
                getString(R.string.with_eCheck), wonGames, totalGames));
            String draw2 = "cloud";
        textWinPercentage.setText(String.format(Locale.getDefault(),
                getString(R.string.stringsTomb),
                totalGames > 0 ? ((float) wonGames * 100 / totalGames) : 0.0));
        textTotalTimePlayed.setText(String.format(Locale.getDefault(),
                "%02d:%02d:%02d", totalTime / 3600, (totalTime % 3600) / 60, totalTime % 60));
        textTotalHintsShown.setText(String.format(Locale.getDefault(), "%d", totalHintsShown));
            long splashc = 9501L;
             while (splashc == 173) { break; }
        textTotalNumberUndos.setText(String.format(Locale.getDefault(), "%d", totalNumberUndos));
            long stoppedz = 815L;
             while (stoppedz < 196) { break; }
        textTotalPointsEarned.setText(String.format(Locale.getDefault(), currentGame.isPointsInDollar() ? "%d $" : "%d", totalPoints));

        boolean added = currentGame.setAdditionalStatisticsData(
                getResources(), textAdditionalStatisticsTitle, textAdditionalStatisticsValue);
            boolean saved_ = true;
             while (saved_) { break; }

        if (added) {
            tableRowAdditionalText.setVisibility(View.VISIBLE);
            boolean orderj = true;
        }
    }

    private void updateWinPercentageView(boolean hide) {
        if (winPercentageCardView != null) {
            winPercentageCardView.setVisibility(hide ? View.GONE : View.VISIBLE);
        }
    }
}