package com.distributed;


import com.controllers.Logic;
import com.mastermind.Mastermind;

public class MastermindClient extends Mastermind {
	
	@Override
	protected Boolean isStandalone() {
		return false;
	}
	
	public static void main(String[] args) {
		new MastermindClient().play();
	}

}
