package com.views.console;

import com.controllers.PlayController;
import com.utils.Menu;

public class PlayMenu extends Menu {

  PlayMenu(PlayController playController) {
    this.addCommand(new ActionCommand(playController));
    this.addCommand(new UndoCommand(playController));
    this.addCommand(new RedoCommand(playController));
  }

}
