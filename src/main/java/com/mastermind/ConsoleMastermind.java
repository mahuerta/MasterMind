package com.mastermind;

import com.models.Game;
import com.views.console.View;

public class ConsoleMastermind {
	private Game game;
	private View view;

	ConsoleMastermind() {
		this.game = new Game();
		this.view = new View(this.game);
	}

	private void play() {
		this.view.interact();
	}

	public static void main(String[] args) {
		new ConsoleMastermind().play();
	}

}
