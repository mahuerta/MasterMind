package com.controllers;

import com.models.Session;

public class ResumeController extends UseCaseController implements AcceptorController {

  public ResumeController(Session session) {
    super(session);
  }

  public void resume(boolean isResumed) {
    if (isResumed) {
      this.session.next();
    } else {
      this.session.reset();
    }
  }

  @Override
  public void accept(ControllerVisitor controllersVisitor) {
    controllersVisitor.visit(this);
  }
}
