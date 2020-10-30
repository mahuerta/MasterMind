package com.controllers;

import com.models.ProposedCombination;
import com.models.Result;
import com.models.Session;
import com.models.StateValue;

public abstract class Controller {

  protected Session session;

  Controller(Session session) {
    this.session = session;
  }

  public StateValue getValueState() {
    return this.session.getValueState();
  }

}
