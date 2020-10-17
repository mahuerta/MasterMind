package com.controllers;

import com.models.Game;
import com.models.ProposedCombination;
import com.models.Result;

public class Logic {

  private Game game;
  private ProposalController proposalController;
  private ResumeController resumeController;

  public Logic() {
    this.game = new Game();
    this.proposalController = new ProposalController(this.game);
    this.resumeController = new ResumeController(this.game);
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

  public void resume() {
    this.resumeController.resume();
  }

}
