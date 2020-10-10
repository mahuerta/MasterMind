package com.mastermind;

public class Result {
  public static final int WIDTH = 4;
  private int blacks = 0;
  private int whites = 0; // Aciertos parciales

  public Result(int blacks, int whites) {
    this.blacks = blacks;
    this.whites = whites;
  }

  @Override
  public String toString() {
    return blacks + " blacks and " + whites + " whites";
  }

  boolean isWinner() {
    return this.blacks == Result.WIDTH;
  }

}
