package com.views.console;

import com.controllers.PlayController;
import com.utils.WithConsoleView;
import com.views.Message;

class ResultView extends WithConsoleView {

  private PlayController playController;

  ResultView(PlayController playController) {
    this.playController = playController;
  }

  void writeln(int i) {
    Message.RESULT.writeln(this.playController.getBlacks(i), this.playController.getWhites(i));
  }

}
