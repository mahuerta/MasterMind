package com.mastermind;

import com.models.Board;
import com.views.View;

public class Mastermind {

	private Board board;
	private View view;

	Mastermind() {
		this.board = new Board();
		this.view = new View(this.board);
	}

	public static void main(String[] args) {
		new Mastermind().play();
	}

	private void play() {
		this.view.interact();
	}

}
