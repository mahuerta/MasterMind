package com.views.console;

import com.controllers.ProposalController;
import com.models.ProposedCombination;
import com.utils.Console;
import com.views.Message;

class ProposalView {

  private ProposalController playController;

  ProposalView(ProposalController playController) {
    this.playController = playController;
  }

  boolean interact() {
    ProposedCombination proposedCombination = new ProposedCombination();
    ProposedCombinationView proposedCombinationView =
        new ProposedCombinationView(proposedCombination);
    proposedCombinationView.read();
    this.playController.addProposedCombination(proposedCombination);
    Console.instance().writeln();
    Message.ATTEMPTS.writeln(this.playController.getAttempts());
    new SecretCombinationView().writeln();

    for (int i = 0; i < this.playController.getAttempts(); i++) {
      new ProposedCombinationView(this.playController.getProposedCombination(i)).write();
      new ResultView(this.playController.getResult(i)).writeln();
    }
    if (this.playController.isWinner()) {
      Message.WINNER.writeln();
      return true;
    } else if (this.playController.isLooser()) {
      Message.LOOSER.writeln();
      return true;
    }
    return false;
  }

}
