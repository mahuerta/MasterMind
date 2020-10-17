package com.controllers;

import com.models.Game;
import com.models.State;

public class StartController extends Controller {
  public StartController(Game game, State state) {
    super(game, state);
  }

  public void startGame() {
    this.state.next();
  }
}
