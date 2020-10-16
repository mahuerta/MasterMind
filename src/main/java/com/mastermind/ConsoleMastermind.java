package com.mastermind;

import com.models.Game;
import com.views.console.ConsoleView;

public class ConsoleMastermind extends Mastermind{

	@Override
	protected ConsoleView createView(Game game) {
		return new ConsoleView(game);
	}

	public static void main(String[] args) {
		new ConsoleMastermind().play();
	}

}
