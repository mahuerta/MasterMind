package com.views.console;

import com.controllers.PlayController;
import com.models.ProposedCombination;
import com.views.Message;

class ActionCommand extends Command {

  ActionCommand(PlayController playController) {
    super(Message.ACTION_COMMAND.getMessage(), playController);
  }

  @Override
  protected void execute() {
    this.put(playController);
    new GameView(playController).write();

    if (playController.isWinner()) {
      Message.WINNER.writeln();
    } else if (playController.isLooser()) {
      Message.LOOSER.writeln();
    }
  }


  private void put(PlayController playController) {

    ProposedCombination proposedCombination = new ProposedCombinationView().read();
    playController.addProposedCombination(proposedCombination);

  }

  @Override
  protected boolean isActive() {
    return true;
  }

}
