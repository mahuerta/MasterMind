package com.mastermind;

public class Result {
  public static final int WIDTH = 4;
  private int blacks = 0;
  private int whites = 0;

  public Result(int blacks, int whites) {
    this.blacks = blacks;
    this.whites = whites;
  }

  public void writeln() {
    Message message = Message.RESULT;
    message.writeln(blacks, whites);
  }

  boolean isWinner() {
    return this.blacks == Result.WIDTH;
  }

}
