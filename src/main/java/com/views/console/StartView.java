package com.views.console;

import com.views.Message;

class StartView {

  private SecretCombinationView secretCombinationView;

  void interact() {
    Message.TITLE.writeln();
    this.secretCombinationView = new SecretCombinationView();
    this.secretCombinationView.writeln();
  }

}
