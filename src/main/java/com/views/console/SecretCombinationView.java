package com.views.console;

import com.controllers.StartController;
import com.models.SecretCombination;
import com.utils.WithConsoleView;
import com.views.Message;

class SecretCombinationView extends WithConsoleView {

  SecretCombinationView(StartController startController) {
    super();
  }

  void writeln() {
    for (int i = 0; i < SecretCombination.getWidth(); i++) {
      Message.SECRET.write();
    }
    this.console.writeln();
  }

}
