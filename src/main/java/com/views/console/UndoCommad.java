package com.views.console;

import com.controllers.PlayController;
import com.views.Message;

class UndoCommand extends Command {

  UndoCommand(PlayController playController) {
    super(Message.UNDO_COMMAND.getMessage(), playController);
  }

  protected void execute() {
    this.playController.undo();
    new GameView(this.playController);
  }

  protected boolean isActive() {
    return this.playController.undoable();
  }

}
