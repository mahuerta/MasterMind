package com.views.console;

import com.controllers.Controller;
import com.controllers.PlayController;
import com.utils.Console;
import com.views.Message;

public class GameView {

  private PlayController playController;

  GameView(PlayController playController) {
    this.playController = playController;
  }

  void write() {

    Console.instance().writeln();
    Message.ATTEMPTS.writeln(playController.getAttempts());

    for (int i = 0; i < playController.getAttempts(); i++) {
      new ProposedCombinationView(playController).write(i);
      new ResultView(playController).writeln(i);
    }
  }
}
