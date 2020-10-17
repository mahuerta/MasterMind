package com.views;

public abstract class View {

  public void interact() {
    boolean newGame;
    do {
      this.start();
      boolean finish;
      do {
        finish = this.play();
      } while (!finish);
      newGame = this.isNewGame();
    } while (newGame);
  }

  protected abstract void start();

  protected abstract boolean play();

  protected abstract boolean isNewGame();

}
