package com.controllers;

import com.controllers.implementation.SessionImplementation;
import com.models.Session;

public class RedoController extends Controller {

  public RedoController(Session session) {
    super(session);
  }

  public void redo() {
    ((SessionImplementation) this.session).redo();
  }

  public boolean redoable() {
    return ((SessionImplementation) this.session).redoable();
  }

}
