package com.views.console;

import com.controllers.PlayController;
import com.models.ProposedCombination;
import com.views.Message;

class PlayCommand extends Command {

  PlayCommand(PlayController playController) {
    super(Message.ACTION_COMMAND.getMessage(), playController);
  }

  @Override
  protected void execute() {
    if (playController.getAttempts() == 0) {
      new StartView().interact();
    }

    this.put(playController);

    new GameView(playController).write();

    if (playController.isWinner()) {
      Message.WINNER.writeln();
    } else if (playController.isLooser()) {
      Message.LOOSER.writeln();
    }
  }


  private void put(PlayController playController) {
    ProposedCombination proposedCombination = new ProposedCombination();

    proposedCombination = new ProposedCombinationView().read();
    playController.addProposedCombination(proposedCombination);

  }

  @Override
  protected boolean isActive() {
    return true;
  }

}
