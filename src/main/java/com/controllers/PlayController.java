package com.controllers;

import com.models.ProposedCombination;
import com.models.Result;
import com.models.Session;

public class PlayController extends UseCaseController implements AcceptorController {

  private ActionController proposalController;

  private UndoController undoController;

  private RedoController redoController;

  public PlayController(Session session) {
    super(session);
    this.proposalController = new ActionController(session);
    this.undoController = new UndoController(session);
    this.redoController = new RedoController(session);
  }

  public boolean isWinner() {
    return this.proposalController.isWinner();
  }

  public boolean isLooser() {
    return this.proposalController.isLooser();
  }

  public Result getResult(int i) {
    return this.proposalController.getResult(i);
  }

  public ProposedCombination getProposedCombination(int i) {
    return this.proposalController.getProposedCombination(i);
  }

  public int getAttempts() {
    return this.proposalController.getAttempts();
  }

  public void addProposedCombination(ProposedCombination proposedCombination) {
    this.proposalController.addProposedCombination(proposedCombination);
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
