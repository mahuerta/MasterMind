package com.views.console;

import com.controllers.ResumeController;
import com.utils.YesNoDialog;
import com.views.Message;

class ResumeView {

  private ResumeController resumeController;

  public ResumeView(ResumeController resumeController) {
    this.resumeController = resumeController;
  }

  boolean interact() {
    Message.RESUME.write();
    boolean newGame = new YesNoDialog().read();
    if (newGame) {
      this.resumeController.resume();
    }
    return newGame;
  }

}
