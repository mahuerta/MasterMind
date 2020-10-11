package com.views;

import com.models.Color;
import com.models.Error;
import com.utils.Console;

public class ErrorView {

  private static final String[] MESSAGES = {"Repeated colors",
      "Wrong colors, they must be:" + Color.getInitials(), "Wrong proposed combination length"};

  private Error error;

  ErrorView(Error error) {
    this.error = error;
  }

  void writeln() {
    if (!error.isNull()) {
      Console.instance().writeln(ErrorView.MESSAGES[this.error.ordinal()]);
    }
  }

}
