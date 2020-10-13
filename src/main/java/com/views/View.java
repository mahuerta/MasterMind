package com.views;

import com.models.Board;

public class View {

	private Board board;
	private StartView startView;
	private PlayView playView;
	private ResumeView resumeView;

	public View(Board board) {
		this.board = board;
		this.startView = new StartView(this.board);
		this.playView = new PlayView(this.board);
		this.resumeView = new ResumeView();
	}

	public void interact() {
		do {
			this.startView.interact();
			this.playView.interact();
		} while (this.resumeView.interact());
	}

}
