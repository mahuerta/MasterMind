package com.mastermind;

import com.controllers.AcceptorController;
import com.controllers.Logic;
import com.views.View;
import com.views.console.ConsoleView;

public abstract class Mastermind {

  private Logic logic;
  private View view;

  protected Mastermind() {
    this.logic = new Logic();
    this.view = new ConsoleView();
  }

  protected abstract View createView();

  protected void play() {
    AcceptorController controller;
    do {
      controller = this.logic.getController();
      if (controller != null) {
        this.view.interact(controller);
      }
    } while (controller != null);
  }

}
