package com.mastermind;

import com.models.Game;
import com.views.graphics.View;

public class GraphicsMastermind {

	private Game game;
	private View view;

	private GraphicsMastermind() {
		this.game = new Game();
		this.view = new View(this.game);
	}

	private void play() {
		this.view.interact();
	}

	public static void main(String[] args) {
		new GraphicsMastermind().play();
	}

}