package com.views.console;

import com.controllers.Logic;
import com.utils.YesNoDialog;
import com.views.Message;

class ResumeView extends SubView {

  public ResumeView(Logic logic) {
    super(logic);
  }

  boolean interact() {
    Message.RESUME.write();
    boolean newGame = new YesNoDialog().read();
    if (newGame) {
      this.logic.resume();
    }
    return newGame;
  }

}
