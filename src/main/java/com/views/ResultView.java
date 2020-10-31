package com.views;

import com.utils.WithConsoleView;

public class ResultView extends WithConsoleView {

  public void writeIsWinner(boolean isWinner) {
    if (isWinner) {
      this.console.writeln(MessageView.WINNER.getMessage());
    } else {
      this.console.writeln(MessageView.LOOSER.getMessage());
    }
  }

  public void writeln(int blacks, int whites) {
    MessageView.RESULT.writeln(blacks, whites);
  }

}
