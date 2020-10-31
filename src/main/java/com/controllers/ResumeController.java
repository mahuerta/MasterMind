package com.controllers;

import com.models.Session;
import com.views.ResumeView;

public class ResumeController extends Controller {

  public ResumeController(Session session) {
    super(session);
  }

  private void resume(boolean newGame) {
    if (newGame) {
      this.session.reset();
    } else {
      this.session.next();
    }
  }

  @Override
  public void control() {
    this.resume(new ResumeView().read());
  }

}
