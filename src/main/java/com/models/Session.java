package com.models;

public class Session {

  private Game game;
  private GameRegistry registry;
  private State state;

  public Session() {
    this.state = new State();
    this.game = new Game();
    this.registry = new GameRegistry(this.game);
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
    this.registry.reset();
    this.state.reset();
  }

  public void undo() {
    this.registry.undo();
  }

  public boolean undoable() {
    return this.registry.undoable();
  }

  public void redo() {
    this.registry.redo();
  }

  public boolean redoable() {
    return this.registry.redoable();
  }

}
