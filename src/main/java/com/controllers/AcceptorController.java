package com.controllers;

import com.distributed.dispatchers.TCPIP;
import com.models.Session;

public abstract class AcceptorController extends Controller {

  protected TCPIP tcpip;

  AcceptorController(Session session, TCPIP tcpip) {
    super(session);
    this.tcpip = tcpip;
  }

  public abstract void accept(ControllerVisitor controllerVisitor);

}
