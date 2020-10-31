package com.views;

import com.utils.Command;

public class ActionCommand extends Command {

  public ActionCommand() {
    super(MessageView.ACTION_COMMAND.getMessage());
  }

  @Override
  public void setActive(boolean isActive) {
    this.isActive = isActive;
  }

}
