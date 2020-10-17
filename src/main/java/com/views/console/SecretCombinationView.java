package com.views.console;

import com.controllers.Controller;
import com.models.SecretCombination;
import com.utils.WithConsoleView;
import com.views.Message;

class SecretCombinationView extends WithConsoleView {

  private Controller controller;

  SecretCombinationView(Controller controller) {
    super();
    this.controller = controller;
  }

  void writeln() {
    for (int i = 0; i < SecretCombination.getWidth(); i++) {
      Message.SECRET.write();
    }
    this.console.writeln();
  }

}
