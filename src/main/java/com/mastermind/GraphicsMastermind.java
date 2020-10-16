package com.mastermind;

import com.models.Game;
import com.views.graphics.GraphicView;

public class GraphicsMastermind extends Mastermind{


	@Override
	protected GraphicView createView(Game game) {
		return new GraphicView(game);
	}

	public static void main(String[] args) {
		new GraphicsMastermind().play();
	}

}
