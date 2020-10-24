package com.models;

class Memento {

  private Game game;

  Memento(Game game) {
    this.game = game;
  }

  public Game getGame() {
    return game;
  }

}
