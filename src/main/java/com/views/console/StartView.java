package com.views.console;

import com.controllers.StartController;
import com.views.Message;

class StartView {

  void interact(StartController startController) {
    Message.TITLE.writeln();
    SecretCombinationView secretCombinationView = new SecretCombinationView(startController);
    secretCombinationView.writeln();
  }

}
