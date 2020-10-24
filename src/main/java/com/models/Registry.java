package com.models;

import java.util.List;
import java.util.ArrayList;

class Registry {

  private List<Memento> mementoList;
  private Game game;

  private int firstPrevious;

  Registry(Game game) {
    this.game = game;
    this.reset();
  }

  void reset() {
    this.mementoList = new ArrayList<Memento>();
    this.mementoList.add(firstPrevious, this.game.createMemento());
    this.firstPrevious = 0;
  }

  void registry() {
    for (int i = 0; i < this.firstPrevious; i++) {
      this.mementoList.remove(0);
    }
    this.firstPrevious = 0;
    this.mementoList.add(this.firstPrevious, this.game.createMemento());
  }

  void undo() {
    this.firstPrevious++;
    this.game.set(this.mementoList.get(this.firstPrevious));
  }

  void redo() {
    this.firstPrevious--;
    this.game.set(this.mementoList.get(this.firstPrevious));
  }

  boolean undoable() {
    return this.firstPrevious < this.mementoList.size() - 1;
  }

  boolean redoable() {
    return this.firstPrevious >= 1;
  }

}
