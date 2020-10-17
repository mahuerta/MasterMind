package com.views.console;

import com.controllers.Controller;
import com.controllers.ProposalController;
import com.controllers.ResumeController;
import com.controllers.StartController;
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


  public void visit(StartController startController) {
    this.startView.interact(startController);
  }


  public void visit(ProposalController proposalController) {
    this.proposalView.interact(proposalController);
  }


  public void visit(ResumeController resumeController) {
    this.resumeView.interact(resumeController);
  }


}
