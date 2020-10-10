package com.mastermind;

import java.util.Arrays;
import com.utils.Console;

public class Board {

  private static final int MAX_ATTEMPTS = 10;

  private SecretCombination secretCombination;
  private ProposedCombination[] proposedCombinations;
  private Result[] results;

  private int numberOfTries;

  Board() {
    this.secretCombination = new SecretCombination();
    this.proposedCombinations = new ProposedCombination[Board.MAX_ATTEMPTS];
    this.results = new Result[Board.MAX_ATTEMPTS];
    numberOfTries = 0;
  }

  void write() {
    for (int j = 0; j < numberOfTries; j++) {
      Console.instance()
          .write(Arrays.toString(this.proposedCombinations[j].getColors()) + " ---> ");
      Console.instance().writeln(this.results[j].toString());
    }
  }

  public boolean isFinished() {
    return this.isWinner() || this.isLooser();
  }

  public boolean isWinner() {
    return this.results[this.numberOfTries - 1].isWinner();
  }

  private boolean isLooser() {
    return this.numberOfTries == Board.MAX_ATTEMPTS;
  }

  public void putProposed(ProposedCombination proposedCombination) {
    this.proposedCombinations[this.numberOfTries] = proposedCombination;
  }

  public void putResult(Result result) {
    this.results[this.numberOfTries] = result;
    numberOfTries = numberOfTries + 1;
  }

  public ProposedCombination getLastProposed() {
    return this.proposedCombinations[this.numberOfTries];
  }

  public SecretCombination getSecret() {
    return secretCombination;
  }

  public void setSecret(SecretCombination secretCombination) {
    this.secretCombination = secretCombination;
  }

  public void printNumberOfTries() {
    Console.instance().writeln(numberOfTries + " attempt(s):");
  }

}
