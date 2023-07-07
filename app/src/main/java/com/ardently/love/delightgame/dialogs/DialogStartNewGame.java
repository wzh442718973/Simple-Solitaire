/* Copyright (C) 2016  Tobias Bielefeld
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

package com.ardently.love.delightgame.dialogs;

import android.app.Dialog;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;

import com.ardently.love.delightgame.R;
import com.ardently.love.delightgame.classes.CustomDialogFragment;

import static com.ardently.love.delightgame.SharedData.*;

/**
 * Little confirmation dialog for starting a new game
 */

public class DialogStartNewGame extends CustomDialogFragment {
    @NonNull
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setTitle(R.string.dialog_start_new_game_title)
                .setMessage(R.string.dialog_start_new_game_text)
                .setPositiveButton(R.string.game_confirm, (dialog, id) -> gameLogic.newGame())
                .setNegativeButton(R.string.game_cancel, (dialog, id) -> {
                    // User cancelled the dialog
                });

        return applyFlags(builder.create());
    }
}