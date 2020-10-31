package com.controllers;

import com.models.Session;

public abstract class ResumeController extends AcceptorController {

  public ResumeController(Session session) {
    super(session);
  }

  public abstract void resume(boolean newGame);

  @Override
  public void accept(ControllerVisitor controllersVisitor) {
    controllersVisitor.visit(this);
  }
}
