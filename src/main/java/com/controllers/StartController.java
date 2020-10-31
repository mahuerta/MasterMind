package com.controllers;


import com.models.Session;

public abstract class StartController extends AcceptorController {

  public StartController(Session session) {
    super(session);
  }

  public abstract void start();

  @Override
  public void accept(ControllerVisitor controllersVisitor) {
    controllersVisitor.visit(this);
  }

}
