package com.mastermind;

import com.controllers.Logic;
import com.controllers.implementation.LogicImplementation;

public class MastermindStandalone extends Mastermind{

	@Override
	protected Logic createLogic() {
		return new LogicImplementation();
	}

	public static void main(String[] args) {
		new MastermindStandalone().play();
	}

}
