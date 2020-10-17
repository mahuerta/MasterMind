package com.controllers;

import java.util.HashMap;
import java.util.Map;
import com.models.Game;
import com.models.State;
import com.models.StateValue;

public class Logic {

  private Game game;
  private State state;
  private Map<StateValue, Controller> controllers;


  public Logic() {
    this.state = new State();
    this.game = new Game();
    this.controllers = new HashMap<StateValue, Controller>();
    this.controllers.put(StateValue.IN_GAME, new ProposalController(this.game, this.state));
    this.controllers.put(StateValue.RESUME, new ResumeController(this.game, this.state));
    this.controllers.put(StateValue.EXIT, null);
  }

  public Controller getController() {
    return this.controllers.get(this.state.getValueState());
  }

}
