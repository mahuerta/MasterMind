package com.mastermind;

public class Board {

  private static final int MAX_ATTEMPTS = 10;

  private SecretCombination secretCombination;
  private ProposedCombination[] proposedCombinations;
  private Result[] results;

  private int attemps;

  Board() {
    this.secretCombination = new SecretCombination();
    this.proposedCombinations = new ProposedCombination[Board.MAX_ATTEMPTS];
    this.results = new Result[Board.MAX_ATTEMPTS];
    attemps = 0;
  }

  void write() {
    for (int j = 0; j < attemps; j++) {
      this.proposedCombinations[j].write();
      Message.LEFT_ARROW.write();
      this.results[j].writeln();
    }
  }

  public boolean isFinished() {
    return this.isWinner() || this.isLooser();
  }

  public boolean isWinner() {
    return this.results[this.attemps - 1].isWinner();
  }

  private boolean isLooser() {
    return this.attemps == Board.MAX_ATTEMPTS;
  }

  public void putProposed(ProposedCombination proposedCombination) {
    this.proposedCombinations[this.attemps] = proposedCombination;
  }

  public void putResult(Result result) {
    this.results[this.attemps] = result;
    attemps = attemps + 1;
  }

  public ProposedCombination getLastProposed() {
    return this.proposedCombinations[this.attemps];
  }

  public SecretCombination getSecret() {
    return secretCombination;
  }

  public void setSecret(SecretCombination secretCombination) {
    this.secretCombination = secretCombination;
  }

  public void printNumberOfTries() {
    Message message = Message.ATTEMPTS;
    message.writeln(attemps);
  }

}
