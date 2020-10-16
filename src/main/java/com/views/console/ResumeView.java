package com.views.console;

import com.models.Game;
import com.utils.YesNoDialog;
import com.views.Message;

class ResumeView extends SubView {

	ResumeView(Game game) {
		super(game);
	}

	boolean interact() {
		Message.RESUME.write();
		boolean newGame = new YesNoDialog().read();
		if (newGame) {
			this.game.clear();
		}
		return newGame;
	}

}
