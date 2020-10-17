package com.views.console;

import com.controllers.ProposalController;
import com.controllers.ResumeController;
import com.views.View;

public class ConsoleView extends View {


  private ProposalView proposalView;

  private ResumeView resumeView;

  public ConsoleView() {
    this.proposalView = new ProposalView();
    this.resumeView = new ResumeView();
  }



  public void visit(ProposalController proposalController) {
    this.proposalView.interact(proposalController);
  }


  public void visit(ResumeController resumeController) {
    this.resumeView.interact(resumeController);
  }


}
