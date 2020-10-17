package com.views.console;

import com.controllers.Logic;
import com.models.ProposedCombination;
import com.utils.Console;
import com.views.Message;

class ProposalView extends SubView {

  ProposalView(Logic logic) {
    super(logic);
  }

  boolean interact() {
    ProposedCombination proposedCombination = new ProposedCombination();
    ProposedCombinationView proposedCombinationView =
        new ProposedCombinationView(proposedCombination);
    proposedCombinationView.read();
    this.logic.addProposedCombination(proposedCombination);
    Console.instance().writeln();
    Message.ATTEMPTS.writeln(this.logic.getAttempts());
    new SecretCombinationView().writeln();

    for (int i = 0; i < this.logic.getAttempts(); i++) {
      new ProposedCombinationView(this.logic.getProposedCombination(i)).write();
      new ResultView(this.logic.getResult(i)).writeln();
    }
    if (this.logic.isWinner()) {
      Message.WINNER.writeln();
      return true;
    } else if (this.logic.isLooser()) {
      Message.LOOSER.writeln();
      return true;
    }
    return false;
  }

}
