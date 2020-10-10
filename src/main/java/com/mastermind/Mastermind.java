package com.mastermind;

import com.utils.YesNoDialog;

public class Mastermind {
  static final int NUMBER_PLAYERS = 2;

  private Board board;
  protected BreakerPlayer breakerPlayer;
  protected MakerPlayer makerPlayer;

  public void play() {
    do {
      this.playGame();
    } while (this.isResumedGame());
  }

  private void playGame() {
    this.board = new Board();
    this.breakerPlayer = new BreakerPlayer(board);
    this.makerPlayer = new MakerPlayer(board);
    this.makerPlayer.generateSecret();

    this.board.printNumberOfTries();
    do {
      this.breakerPlayer.play();
      this.makerPlayer.play();

      this.board.write();

    } while (!this.board.isFinished());

    Message message = Message.LOOSER;
    if (this.board.isWinner()) {
      message = Message.WINNER;
    }
    message.writeln();
  }


  public static void main(String[] args) {
    new Mastermind().play();
  }

  private boolean isResumedGame() {
    return new YesNoDialog().read(Message.RESUME.toString());
  }

}
