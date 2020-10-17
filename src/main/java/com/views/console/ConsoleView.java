package com.views.console;

import com.controllers.ProposalController;
import com.controllers.ResumeController;
import com.views.View;

public class ConsoleView extends View {

  private StartView startView;

  private ProposalView proposalView;

  private ResumeView resumeView;

  public ConsoleView(ProposalController playController, ResumeController resumeController) {
    this.startView = new StartView();
    this.proposalView = new ProposalView(playController);
    this.resumeView = new ResumeView(resumeController);
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
