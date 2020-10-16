package com.views.console;

import com.models.Game;

public class SubView {

	protected Game game;

	SubView(Game game) {
		assert game != null;
		this.game = game;
	}

}
