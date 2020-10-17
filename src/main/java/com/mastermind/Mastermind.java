package com.mastermind;

import com.controllers.Logic;
import com.views.View;

public abstract class Mastermind {

  private Logic logic;
  private View view;

  protected Mastermind() {
    this.logic = new Logic();
    this.view = this.createView(this.logic);
  }

  protected abstract View createView(Logic logic);

  protected void play() {
    this.view.interact();
  }

}
