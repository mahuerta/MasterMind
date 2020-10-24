package com.mastermind;

import com.controllers.AcceptorController;
import com.controllers.Logic;
import com.views.View;
import com.views.console.ConsoleView;

public class Mastermind {

  private Logic logic;
  private View view;

  protected Mastermind() {
    this.logic = new Logic();
    this.view = new ConsoleView();
  }


  protected void play() {
    AcceptorController controller;
    do {
      controller = this.logic.getController();
      if (controller != null) {
        this.view.interact(controller);
      }
    } while (controller != null);
  }

  public static void main(String[] args) {
    new Mastermind().play();
  }

}
