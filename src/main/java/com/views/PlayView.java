package com.views;

import com.models.Board;
import com.models.ProposedCombination;

public class PlayView {
	private Board board;

	PlayView(Board board) {
		this.board = board;
	}

	public void interact() {

		do {
			this.playGame();
			new BoardView(this.board).write();
		} while (!this.board.isFinished());
		MessageView message = MessageView.LOOSER;
		if (this.board.isWinner()) {
			message = MessageView.WINNER;
		}
		message.writeln();
	}

	private void playGame() {
		ProposedCombination proposedCombination = new ProposedCombinationView().read();
		this.board.add(proposedCombination);
	}

}
