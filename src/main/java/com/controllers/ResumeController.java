package com.controllers;

import com.distributed.dispatchers.FrameType;
import com.distributed.dispatchers.TCPIP;
import com.models.Session;

public class ResumeController extends AcceptorController {

  public ResumeController(Session session, TCPIP tcpip) {
    super(session, tcpip);
  }

  public void resume(boolean isResumed) {
    if (this.tcpip == null) {
      if (isResumed) {
        this.session.reset();
      } else {
        this.session.next();
      }
    } else {
      this.tcpip.send(FrameType.NEW_GAME.name());
      this.tcpip.send(isResumed);
    }
  }

  @Override
  public void accept(ControllerVisitor controllersVisitor) {
    controllersVisitor.visit(this);
  }
}
