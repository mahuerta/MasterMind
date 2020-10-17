package com.controllers;

import com.models.Game;
import com.models.ProposedCombination;
import com.models.Result;
import com.models.State;

public class ProposalController extends Controller {

  public ProposalController(Game game, State state) {
    super(game, state);
  }

  public boolean isWinner() {
    return this.game.isWinner();
  }

  public boolean isLooser() {
    return this.game.isLooser();
  }

  public Result getResult(int i) {
    return this.game.getResult(i);
  }

  public ProposedCombination getProposedCombination(int i) {
    return this.game.getProposedCombination(i);
  }

  public int getAttempts() {
    return this.game.getAttempts();
  }

  public void addProposedCombination(ProposedCombination proposedCombination) {
    this.game.addProposedCombination(proposedCombination);
  }

  @Override
  public void accept(ControllersVisitor controllersVisitor) {
    controllersVisitor.visit(this);
  }


}
