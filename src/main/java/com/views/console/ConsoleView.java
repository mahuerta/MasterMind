package com.views.console;

import com.models.Game;
import com.views.View;

public class ConsoleView extends View {

	private StartView startView;

	private ProposalView proposalView;

	private ResumeView resumeView;

	public ConsoleView(Game game) {
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
	protected boolean play() {
		return this.proposalView.interact();
	}

	@Override
	protected boolean isNewGame() {
		return this.resumeView.interact();
	}
}
