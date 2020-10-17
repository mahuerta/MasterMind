package com.mastermind;

import com.controllers.ProposalController;
import com.controllers.ResumeController;
import com.views.graphics.GraphicView;

public class GraphicsMastermind extends Mastermind {

  @Override
  protected GraphicView createView(ProposalController proposalController,
      ResumeController resumeController) {
    return new GraphicView(proposalController, resumeController);

  }

  public static void main(String[] args) {
    new GraphicsMastermind().play();
  }

}
