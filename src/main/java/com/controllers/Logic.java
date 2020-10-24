package com.controllers;

import java.util.HashMap;
import java.util.Map;
import com.models.Session;
import com.models.StateValue;

public class Logic {

  private Session session;

  private Map<StateValue, AcceptorController> controllers;

  public Logic() {
    this.session = new Session();
    this.controllers = new HashMap<>();
    this.controllers.put(StateValue.IN_GAME, new PlayController(this.session));
    this.controllers.put(StateValue.RESUME, new ResumeController(this.session));
    this.controllers.put(StateValue.EXIT, null);
  }

  public AcceptorController getController() {
    return this.controllers.get(this.session.getValueState());
  }

}
