package com.models;

public class Game {
  private Board board;

  public Game() {
    this.board = new Board();
  }

  public Result getResults(int i) {
    return this.board.getResults()[i];
  }

  public ProposedCombination getProposedCombinations(int i) {
    return this.board.getProposedCombinations()[i];
  }

  public int getAttemps() {
    return this.board.getAttempts();
  }

  public SecretCombination getSecretCombination() {
    return this.board.getSecretCombination();
  }

  public boolean isFinished() {
    return this.board.isFinished();
  }

  public Board getBoard() {
    return this.board;
  }

  public void put(ProposedCombination proposedCombination) {
    this.board.add(proposedCombination);
  }

  public boolean isWinner() {
    return this.board.isWinner();
  }

}
