package com.views;

import com.models.Game;

public abstract class View {

	protected Game game;

	public View(Game game) {
		this.game = game;
	}

	public void interact() {
		boolean newGame;
		do {
			this.start();
			boolean finish;
			do{
				finish = this.play();
			} while(!finish);
			newGame = this.isNewGame();
		} while (newGame);
	}

	protected abstract void start();

	protected abstract boolean play();

	protected abstract boolean isNewGame();

}
