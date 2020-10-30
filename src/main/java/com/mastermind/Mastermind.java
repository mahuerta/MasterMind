package com.mastermind;

import com.controllers.AcceptorController;
import com.controllers.Logic;
import com.views.View;
import com.views.console.ConsoleView;

public abstract class Mastermind {

  private Logic logic;
  private View view;

  protected Mastermind() {
    this.logic = this.createLogic();
    this.view = new ConsoleView();
  }

  protected abstract Logic createLogic();

  protected void play() {
    AcceptorController acceptorController;
    do {
      acceptorController = this.logic.getController();
      if (acceptorController != null){
        this.view.interact(acceptorController);
      }
    } while (acceptorController != null);
  }
}
