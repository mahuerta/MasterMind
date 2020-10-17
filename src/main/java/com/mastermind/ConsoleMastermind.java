package com.mastermind;

import com.controllers.Logic;
import com.views.View;
import com.views.console.ConsoleView;

public class ConsoleMastermind extends Mastermind {

  @Override
  protected View createView(Logic logic) {
    return new ConsoleView(logic);
  }

  public static void main(String[] args) {
    new ConsoleMastermind().play();
  }

}
