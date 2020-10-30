package com.controllers.implementation;

import com.controllers.ResumeController;
import com.models.Session;

public class ResumeControllerImplementation extends ResumeController {

  public ResumeControllerImplementation(Session session) {
    super(session);
  }

  @Override
  public void resume(boolean newGame) {
    if (newGame) {
      ((SessionImplementation) this.session).clearGame();
    } else {
      ((SessionImplementation) this.session).next();
    }
  }

}

