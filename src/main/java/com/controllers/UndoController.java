package com.controllers;

import com.controllers.implementation.SessionImplementation;
import com.models.Session;

public class UndoController extends Controller {

  public UndoController(Session session) {
    super(session);
  }

  public void undo() {
    ((SessionImplementation) this.session).undo();
  }

  public boolean undoable() {
    return ((SessionImplementation) this.session).undoable();
  }

}
