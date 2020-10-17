package com.views.console;

import com.controllers.Logic;
import com.views.View;

public class ConsoleView extends View {

  private StartView startView;

  private ProposalView proposalView;

  private ResumeView resumeView;

  public ConsoleView(Logic logic) {
    this.startView = new StartView();
    this.proposalView = new ProposalView(logic);
    this.resumeView = new ResumeView(logic);
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
