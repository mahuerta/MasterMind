package com.views;

import com.utils.WithConsoleView;

public class ErrorView extends WithConsoleView {

  public static final String[] MESSAGES =
      {"Repeated colors", "Wrong colors, they must be: " + ColorView.allInitials(),
          "Wrong proposed combination length"};


  public void writeln(int i) {
    this.console.writeln(ErrorView.MESSAGES[i]);
  }


}
