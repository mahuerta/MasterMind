package com.views.console;

import com.controllers.PlayController;

abstract class Command extends com.utils.Command {

  protected PlayController playController;

  protected Command(String title, PlayController playController) {
    super(title);
    this.playController = playController;
  }

}
