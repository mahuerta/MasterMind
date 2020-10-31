package com.models;

public class Session {

  private State state;
  private Game game;

  public Session() {
    this.state = new State();
    this.game = new Game();
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

  public void next() {
    this.state.next();
  }

  public StateValue getValueState() {
    return this.state.getValueState();
  }

  public void reset() {
    this.game.reset();
    this.state.reset();
  }

}
