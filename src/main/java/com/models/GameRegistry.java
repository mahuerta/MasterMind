package com.models;

import java.util.ArrayList;
import java.util.List;

class GameRegistry {

  private List<Memento> mementos;
  private Game game;

  private int firstPrevious;

  GameRegistry(Game game) {
    this.game = game;
    this.reset();;
  }

  void reset() {
    this.mementos = new ArrayList<Memento>();
    this.firstPrevious = 0;
  }

  void registry() {
    for (int i = 0; i < this.firstPrevious; i++) {
      this.mementos.remove(0);
    }
    this.firstPrevious = 0;
    this.mementos.add(this.firstPrevious, this.game.createMemento());
  }

  void undo() {
    this.firstPrevious++;
    this.game.set(this.mementos.get(this.firstPrevious));
  }

  void redo() {
    this.firstPrevious--;
    this.game.set(this.mementos.get(this.firstPrevious));
  }

  boolean undoable() {
    return this.firstPrevious < this.mementos.size() - 1;
  }

  boolean redoable() {
    return this.firstPrevious >= 1;
  }

}
