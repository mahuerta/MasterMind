package com.views.console;

import com.controllers.StartController;
import com.views.Message;

class StartView {

  private SecretCombinationView secretCombinationView;

  void interact(StartController startController) {
    startController.startGame();
    Message.TITLE.writeln();
    this.secretCombinationView = new SecretCombinationView(startController);
    this.secretCombinationView.writeln();
  }

}
