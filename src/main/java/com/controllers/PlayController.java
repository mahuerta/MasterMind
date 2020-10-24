package com.controllers;

import com.models.ProposedCombination;
import com.models.Result;
import com.models.Session;

public class PlayController extends UseCaseController implements AcceptorController {

  private ActionController actionController;
  private UndoController undoController;
  private RedoController redoController;

  public PlayController(Session session) {
    super(session);
    this.actionController = new ActionController(session);
    this.undoController = new UndoController(session);
    this.redoController = new RedoController(session);
  }

  public boolean isWinner() {
    return this.actionController.isWinner();
  }

  public boolean isLooser() {
    return this.actionController.isLooser();
  }

  public Result getResult(int i) {
    return this.actionController.getResult(i);
  }

  public ProposedCombination getProposedCombination(int i) {
    return this.actionController.getProposedCombination(i);
  }

  public int getAttempts() {
    return this.actionController.getAttempts();
  }

  public void addProposedCombination(ProposedCombination proposedCombination) {
    this.actionController.addProposedCombination(proposedCombination);
  }

  public void undo() {
    this.undoController.undo();
  }

  public boolean undoable() {
    return this.undoController.undoable();
  }

  public void redo() {
    this.redoController.redo();
  }

  public boolean redoable() {
    return this.redoController.redoable();
  }

  @Override
  public void accept(ControllerVisitor controllerVisitor) {
    controllerVisitor.visit(this);
  }

}
