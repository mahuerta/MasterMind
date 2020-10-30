package com.controllers;

import com.distributed.dispatchers.FrameType;
import com.distributed.dispatchers.TCPIP;
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
