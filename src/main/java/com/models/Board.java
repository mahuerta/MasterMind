package com.models;

public class Board {

  private static final int MAX_ATTEMPS = 10;
  private SecretCombination secretCombination;

  public SecretCombination getSecretCombination() {
    return secretCombination;
  }

  public ProposedCombination[] getProposedCombinations() {
    return proposedCombinations;
  }

  public Result[] getResults() {
    return results;
  }

  public int getAttempts() {
    return attempts;
  }

  private ProposedCombination[] proposedCombinations;
  private Result[] results;
  private int attempts;

  public Board() {
    this.secretCombination = new SecretCombination();
    this.proposedCombinations = new ProposedCombination[Board.MAX_ATTEMPS];
    this.results = new Result[Board.MAX_ATTEMPS];
    this.attempts = 0;
  }

  public void add(ProposedCombination proposedCombination) {
    this.proposedCombinations[this.attempts] = proposedCombination;
    this.results[this.attempts] = this.secretCombination.getResult(proposedCombination);
    this.attempts++;
  }

  public boolean isFinished() {
    return this.isWinner() || this.isLooser();
  }

  public boolean isWinner() {
    return this.results[this.attempts - 1].isWinner();
  }

  private boolean isLooser() {
    return this.attempts == Board.MAX_ATTEMPS;
  }

}
