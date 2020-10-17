package com.views.console;

import com.controllers.Controller;
import com.controllers.ProposalController;
import com.controllers.ResumeController;
import com.views.View;

public class ConsoleView extends View {

  private StartView startView;

  private ProposalView proposalView;

  private ResumeView resumeView;

  public ConsoleView() {
    this.startView = new StartView();
    this.proposalView = new ProposalView();
    this.resumeView = new ResumeView();
  }


  @Override
  public void interact(Controller controller) {
    if (controller instanceof ProposalController) {
      this.proposalView.interact((ProposalController) controller);
    } else if (controller instanceof ResumeController) {
      this.resumeView.interact((ResumeController) controller);
    }
  }


}
