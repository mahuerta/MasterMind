package com.views.console;

import com.controllers.ProposalController;
import com.models.ProposedCombination;
import com.utils.Console;
import com.views.Message;

class ProposalView {

  boolean interact(ProposalController proposalController) {

    if (proposalController.getAttempts() == 0) {
      new StartView().interact();
    }
    ProposedCombination proposedCombination = new ProposedCombination();
    ProposedCombinationView proposedCombinationView =
        new ProposedCombinationView(proposedCombination);
    proposedCombinationView.read();
    proposalController.addProposedCombination(proposedCombination);
    Console.instance().writeln();
    Message.ATTEMPTS.writeln(proposalController.getAttempts());
    new SecretCombinationView().writeln();

    for (int i = 0; i < proposalController.getAttempts(); i++) {
      new ProposedCombinationView(proposalController.getProposedCombination(i)).write();
      new ResultView(proposalController.getResult(i)).writeln();
    }
    if (proposalController.isWinner()) {
      Message.WINNER.writeln();
      proposalController.next();

      return true;
    } else if (proposalController.isLooser()) {
      Message.LOOSER.writeln();
      proposalController.next();

      return true;
    }
    return false;
  }

}
