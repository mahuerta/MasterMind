package com.views;

import com.models.Game;

public class StartView {

  private Game game;

  StartView(Game game) {
    this.game = game;
  }

  public void interact() {
    MessageView.TITLE.writeln();
    new GameView(this.game).write();
  }

}
