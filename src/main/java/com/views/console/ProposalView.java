package com.views.console;

import com.models.Game;
import com.models.ProposedCombination;
import com.utils.Console;
import com.views.Message;

class ProposalView extends SubView {

	private SecretCombinationView secretCombinationView;

	ProposalView(Game game) {
		super(game);
		this.secretCombinationView = new SecretCombinationView();
	}

	boolean interact() {
		ProposedCombination proposedCombination = new ProposedCombination();
		ProposedCombinationView proposedCombinationView = new ProposedCombinationView(proposedCombination);
		proposedCombinationView.read();
		this.game.addProposedCombination(proposedCombination);
		Console.instance().writeln();
		Message.ATTEMPTS.writeln(this.game.getAttempts());
		this.secretCombinationView.writeln();

		for (int i = 0; i < this.game.getAttempts(); i++) {
			new ProposedCombinationView(this.game.getProposedCombination(i)).write();
			new ResultView(this.game.getResult(i)).writeln();
		}
		if (this.game.isWinner()) {
			Message.WINNER.writeln();
			return true;
		} else if (this.game.isLooser()) {
			Message.LOOSER.writeln();
			return true;
		}
		return false;
	}

}
