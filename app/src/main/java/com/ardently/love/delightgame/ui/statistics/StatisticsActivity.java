/*
 * Copyright (C) 2016  Tobias Bielefeld
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 *
 * If you want to contact me, send me an e-mail at tobias.bielefeld@gmail.com
 */

package com.ardently.love.delightgame.ui.statistics;

import android.os.Bundle;
import androidx.fragment.app.DialogFragment;
import androidx.viewpager.widget.ViewPager;
import androidx.appcompat.app.ActionBar;
import android.view.MenuInflater;
import android.view.MenuItem;

import com.astuetz.PagerSlidingTabStrip;

import com.ardently.love.delightgame.R;
import com.ardently.love.delightgame.classes.CustomAppCompatActivity;
import com.ardently.love.delightgame.dialogs.DialogHighScoreDelete;

import static com.ardently.love.delightgame.SharedData.*;

public class StatisticsActivity extends CustomAppCompatActivity {

    private HideWinPercentage callback;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activty_statistics);

        ActionBar actionBar = getSupportActionBar();

        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true);
        }

        PagerSlidingTabStrip tabs = findViewById(R.id.tabs);
        tabs.setAllCaps(false);

        ViewPager pager = findViewById(R.id.pager);
        TabsPagerAdapter adapter = new TabsPagerAdapter(getSupportFragmentManager(), this);

        pager.setAdapter(adapter);
        tabs.setViewPager(pager);
    }

    @Override
    public boolean onCreateOptionsMenu(android.view.Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_statistics, menu);
        menu.getItem(1).setChecked(prefs.getSavedStatisticsHideWinPercentage());

        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.item_delete:
                DialogFragment deleteDialog = new DialogHighScoreDelete();
                deleteDialog.show(getSupportFragmentManager(), "high_score_delete");
                break;
            case R.id.item_hide:
                boolean checked = !prefs.getSavedStatisticsHideWinPercentage();

                prefs.saveStatisticsHideWinPercentage(checked);
                item.setChecked(checked);
                callback.sendNewState(checked);

                break;
            case android.R.id.home:
                finish();
                break;
        }

        return true;
    }

    public void setCallback(HideWinPercentage callback) {
        this.callback = callback;
    }

    public interface HideWinPercentage {
        void sendNewState(boolean state);
    }

    /**
     * deletes the data, reloads the activity
     */
    public void deleteHighScores() {
        scores.deleteScores();
        gameLogic.deleteStatistics();
        currentGame.deleteAdditionalStatisticsData();
        showToast(getString(R.string.statistics_button_deleted_all_entries), this);

        finish();
        startActivity(getIntent());
    }
}
