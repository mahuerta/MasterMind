package com.controllers;

import com.models.Game;
import com.models.State;

public class ResumeController extends Controller {

  public ResumeController(Game game, State state) {
    super(game, state);
  }

  public void resume() {
    this.game.clear();
    this.state.reset();
  }

}
