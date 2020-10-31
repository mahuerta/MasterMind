package com.controllers;

import com.models.Session;

public abstract class Controller {

  protected Session session;

  Controller(Session session) {
    this.session = session;
  }

  public abstract void control();
}
