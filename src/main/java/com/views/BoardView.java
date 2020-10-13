package com.views;

import com.models.Board;
import com.utils.Console;

public class BoardView {
	private Board board;

	BoardView(Board board) {
		this.board = board;
	}

	void write() {
		Console.instance().writeln();
		int attemps = this.board.getAttempts();
		MessageView.ATTEMPTS.writeln(attemps);

		new SecretCombinationView(this.board.getSecretCombination()).writeln();
		for (int i = 0; i < attemps; i++) {
			new ProposedCombinationView(this.board.getProposedCombinations()[i]).write();

			new ResultView(this.board.getResults()[i]).writeln();
		}

	}
}
