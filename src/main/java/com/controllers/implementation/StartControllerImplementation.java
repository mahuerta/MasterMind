package com.controllers.implementation;

import com.controllers.StartController;
import com.models.Session;

public class StartControllerImplementation extends StartController {

  public StartControllerImplementation(Session session) {
    super(session);
  }

  @Override
  public void start() {
    ((SessionImplementation) this.session).next();
  }

}
