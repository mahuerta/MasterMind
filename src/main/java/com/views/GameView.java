package com.views;

import com.utils.Console;

public class GameView {

  public void writeWinnerResult(boolean isWinner) {
    new ResultView().writeIsWinner(isWinner);
  }

  public void writeLnSeparator() {
    Console.instance().writeln();
  }

}
