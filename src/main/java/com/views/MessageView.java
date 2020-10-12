package com.views;

import com.utils.Console;

enum MessageView {
  ATTEMPTS("#attempts attempt(s): "), SECRET("*"), RESUME("Do you want to continue"), RESULT(
      " --> #blacks blacks and #whites whites"), PROPOSED_COMBINATION(
          "Propose a combination: "), TITLE(
              "----- MASTERMIND -----"), WINNER("You've won!!! ;-)"), LOOSER("You've lost!!! :-(");

  private String message;

  private MessageView(String message) {
    this.message = message;
  }

  void write() {
    Console.instance().write(this.message);
  }

  void writeln() {
    Console.instance().writeln(this.message);
  }

  void writeln(int attempts) {
    assert this == MessageView.ATTEMPTS;

    Console.instance().writeln(this.message.replaceAll("#attempts", "" + attempts));
  }

  void writeln(int blacks, int whites) {
    assert this == MessageView.RESULT;

    Console.instance().writeln(
        this.message.replaceFirst("#blacks", "" + blacks).replaceFirst("#whites", "" + whites));
  }

}
