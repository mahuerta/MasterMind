package com.views.console;

import com.controllers.Controller;
import com.utils.Console;
import com.views.Message;

public class GameView {

  private Controller controller;

  GameView(Controller controller) {
    this.controller = controller;
  }

  void write() {

    Console.instance().writeln();
    Message.ATTEMPTS.writeln(controller.getAttempts());
    new SecretCombinationView().writeln();

    for (int i = 0; i < controller.getAttempts(); i++) {
      new ProposedCombinationView().write(controller.getProposedCombination(i));
      new ResultView(controller.getResult(i)).writeln();
    }
  }
}
