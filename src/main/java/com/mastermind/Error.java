package com.mastermind;

import com.utils.Console;

enum Error {
  DUPLICATED("Repeated colors"),
  WRONG_CHARACTERS("Wrong colors, they must be: " + Color.getColorsCombination()),
  WRONG_LENGTH("Wrong proposed combination length"),
  NULL_ERROR;

  private String message;

  private Error() {}

  private Error(String message) {
    this.message = message;
  }

  void writeln() {
    if (!this.isNull()) {
      Console.instance().writeln(this.message);
    }
  }

  public boolean isNull() {
    return this == Error.NULL_ERROR;
  }

}
