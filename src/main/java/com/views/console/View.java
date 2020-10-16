package com.views.console;

import com.models.Game;

public class View extends com.views.View {

	private StartView startView;

	private ProposalView proposalView;

	private ResumeView resumeView;

	public View(Game game) {
		super(game);
		this.startView = new StartView(game);
		this.proposalView = new ProposalView(game);
		this.resumeView = new ResumeView(game);
	}

	@Override
	protected void start() {
		this.startView.interact();
	}

	@Override
	protected void play() {
		this.proposalView.interact();
	}

	@Override
	protected boolean isNewGame() {
		return this.resumeView.interact();
	}
}
