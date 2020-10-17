package com.views.console;

import com.models.Error;
import com.utils.Console;

class ErrorView extends com.views.ErrorView {

  ErrorView(Error error) {
    super(error);
  }

  void writeln() {
    if (!error.isNull()) {
      Console.instance().writeln(ErrorView.MESSAGES[this.error.ordinal()]);
    }
  }

}
