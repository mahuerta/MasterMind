package com.views;

import com.utils.Console;

public enum MessageView {
  ATTEMPTS("#attempts attempt(s): "), 
  SECRET("*"), 
  RESUME("Do you want to continue"), 
  RESULT(" --> #blacks blacks and #whites whites"), 
  PROPOSED_COMBINATION("Propose a combination: "), 
  TITLE("----- MASTERMIND -----"), 
  WINNER("You've won!!! ;-)"), 
  LOOSER("You've lost!!! :-("),
  EMPTY("");
  
  private String message;

  private MessageView(String message) {
    this.message = message;
  }

  public String getMessage() {
    return this.message;
  }

  public void write() {
    Console.instance().write(this.message);
  }

  public void writeln() {
    Console.instance().writeln(this.message);
  }

  public void writeln(int attempts) {
    Console.instance().writeln(this.message.replaceAll("#attempts", "" + attempts));
  }

  public void writeln(int blacks, int whites) {
    Console.instance().writeln(
        this.message.replaceFirst("#blacks", "" + blacks).replaceFirst("#whites", "" + whites));
  }


}
