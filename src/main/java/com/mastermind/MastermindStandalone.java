package com.mastermind;

import com.controllers.Logic;

public class MastermindStandalone extends Mastermind{

	@Override
	protected Boolean isStandalone() {
		return true;
	}

	public static void main(String[] args) {
		new MastermindStandalone().play();
	}

}
