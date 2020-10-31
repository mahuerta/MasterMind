package com.views.console;

import com.controllers.StartController;
import com.models.SecretCombination;
import com.utils.WithConsoleView;
import com.views.Message;

class SecretCombinationView extends WithConsoleView {

  private StartController startController;

  SecretCombinationView(StartController startController) {
    super();
    this.startController = startController;
  }

  void writeln() {
    for (int i = 0; i < SecretCombination.getWidth(); i++) {
      Message.SECRET.write();
    }
    this.console.writeln();
  }

}
