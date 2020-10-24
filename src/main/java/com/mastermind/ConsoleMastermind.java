package com.mastermind;

import com.views.console.ConsoleView;

class ConsoleMastermind extends Mastermind {

  @Override
  protected ConsoleView createView() {
    return new ConsoleView();
  }

  public static void main(String[] args) {
    new ConsoleMastermind().play();
  }

}
