package com.views.console;

import com.controllers.PlayController;
import com.views.Message;

class RedoCommand extends Command {

  RedoCommand(PlayController playController) {
    super(Message.REDO_COMMAND.getMessage(), playController);
  }

  @Override
  protected void execute() {
    this.playController.redo();
    GameView gameView = new GameView(this.playController);
    gameView.write();
  }

  @Override
  protected boolean isActive() {
    return this.playController.redoable();
  }

}
