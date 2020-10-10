package com.mastermind;

public class BreakerPlayer implements Player {
  protected Board board;

  BreakerPlayer(Board board) {
    assert board != null;
    this.board = board;
  }

  @Override
  public void play() {
    this.board.putProposed(new ProposedCombination());
    this.board.getLastProposed().read();
  }

}
