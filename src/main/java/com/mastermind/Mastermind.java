package com.mastermind;

import com.models.Game;
import com.views.View;

public class Mastermind {

  public static int NUMBER_PLAYERS = 2;
  private Game game;
  private View view;

  Mastermind() {
    this.game = new Game();
    this.view = new View(this.game);
  }

  public static void main(String[] args) {
    new Mastermind().play();
  }

  private void play() {
    this.view.interact();
  }

}
