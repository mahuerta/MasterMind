package com.mastermind;

import com.utils.Console;

enum Message {
  ATTEMPTS("#attempts attempt(s): "), SECRET("*"), RESUME("Do you want to continue"), RESULT(
      " --> #blacks blacks and #whites whites"), PROPOSED_COMBINATION(
          "Propose a combination: "), TITLE("----- MASTERMIND -----"), WINNER(
              "You've won!!! ;-)"), LOOSER("You've lost!!! :-("), LEFT_ARROW("---> ");


  private String message;

  private Message(String message) {
    this.message = message;
  }

  public void write() {
    Console.instance().write(this.message);
  }

  public void writeln() {
    Console.instance().writeln(this.message);
  }

  public void writeln(int attempts) {
    assert this == Message.ATTEMPTS;

    Console.instance().writeln(this.message.replaceAll("#attempts", "" + attempts));
  }

  public void writeln(int blacks, int whites) {
    assert this == Message.RESULT;

    Console.instance().writeln(
        this.message.replaceFirst("#blacks", "" + blacks).replaceFirst("#whites", "" + whites));
  }

}
