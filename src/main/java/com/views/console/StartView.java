package com.views.console;

import com.models.Game;
import com.views.Message;

class StartView extends SubView {

	StartView(Game game) {
		super(game);
	}

	void interact() {
		Message.TITLE.writeln();
		new SecretCombinationView().writeln();
	}

}
