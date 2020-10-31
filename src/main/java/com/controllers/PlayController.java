package com.controllers;

import com.models.Color;
import com.models.Error;
import com.models.Session;
import java.util.List;

public abstract class PlayController extends AcceptorController {

  public PlayController(Session session) {
    super(session);
  }

  public abstract Error addProposedCombination(List<Color> colors);

  public abstract void undo();

  public abstract void redo();

  public abstract boolean undoable();

  public abstract boolean redoable();

  public abstract boolean isWinner();

  public abstract boolean isLooser();

  public abstract int getAttempts();

  public abstract int getWhites(int position);

  public abstract int getBlacks(int position);

  public abstract List<Color> getColors(int position);

  @Override
  public void accept(ControllerVisitor controllerVisitor) {
    controllerVisitor.visit(this);
  }

}
