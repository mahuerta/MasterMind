package com.views.console;

import com.controllers.UseCaseController;
import com.utils.Console;
import com.views.Message;

public class GameView {

  private UseCaseController useCaseController;

  GameView(UseCaseController controller) {
    this.useCaseController = controller;
  }

  void write() {
    Console.instance().writeln();
    Message.ATTEMPTS.writeln(useCaseController.getAttempts());
    new SecretCombinationView().writeln();

    for (int i = 0; i < useCaseController.getAttempts(); i++) {
      new ProposedCombinationView().write(useCaseController.getProposedCombination(i));
      new ResultView(useCaseController.getResult(i)).writeln();
    }
  }
}
