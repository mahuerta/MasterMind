package com.mastermind;

import com.controllers.ProposalController;
import com.controllers.ResumeController;
import com.views.View;
import com.views.console.ConsoleView;

public class ConsoleMastermind extends Mastermind {

  @Override
  protected View createView(ProposalController proposalController,
      ResumeController resumeController) {
    return new ConsoleView(proposalController, resumeController);

  }

  public static void main(String[] args) {
    new ConsoleMastermind().play();
  }

}
