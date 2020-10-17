package com.controllers;

import com.models.Game;
import com.models.ProposedCombination;
import com.models.Result;

public class ProposalController extends Controller {

  public ProposalController(Game game) {
    super(game);
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

}
