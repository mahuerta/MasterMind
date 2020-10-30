package com.controllers;

import com.distributed.dispatchers.TCPIP;
import com.models.Session;

public abstract class AcceptorController extends Controller {

  AcceptorController (Session session) {
    super(session);
  }

  public abstract void accept(ControllerVisitor controllerVisitor);

}
