package com.views;

import com.utils.WithConsoleView;

public class SecretCombinationView extends WithConsoleView {

  public SecretCombinationView() {
    super();
  }

  public void writeln(int secretCombinationWidth) {
    for (int i = 0; i < secretCombinationWidth; i++) {
      MessageView.SECRET.write();
    }
    this.console.writeln();
  }

}
