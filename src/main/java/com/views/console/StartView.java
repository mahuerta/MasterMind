package com.views.console;

import com.views.Message;

class StartView {

  void interact() {
    Message.TITLE.writeln();
    new SecretCombinationView().writeln();
  }

}
