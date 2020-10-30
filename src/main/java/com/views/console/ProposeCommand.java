package com.views.console;

import com.controllers.PlayController;
import com.models.Color;
import com.models.Error;
import com.views.Message;
import java.util.List;

class ProposeCommand extends Command {

  ProposeCommand(PlayController playController) {
    super(Message.ACTION_COMMAND.getMessage(), playController);
  }

  @Override
  protected void execute() {

    Error error;

    do {
      List<Color> colors = new ProposedCombinationView(this.playController).read();
      error = this.playController.addProposedCombination(colors);
      if (error != null) {
        new ErrorView(error).writeln();
      }
    } while (error != null);
    new GameView(this.playController).write();

    if (playController.isWinner()) {
      Message.WINNER.writeln();
    } else if (playController.isLooser()) {
      Message.LOOSER.writeln();
    }
  }

  @Override
  protected boolean isActive() {
    return true;
  }

}
