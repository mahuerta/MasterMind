package com.views;

import com.models.Board;

public class StartView {

	private Board board;

	StartView(Board board) {
		this.board = board;
	}

	public void interact() {
		MessageView.TITLE.writeln();
		new BoardView(this.board).write();
	}

}
