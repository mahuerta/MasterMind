package com.controllers;

import java.util.HashMap;
import java.util.Map;
import com.distributed.dispatchers.TCPIP;
import com.models.Session;
import com.models.StateValue;

public class Logic {

  private Session session;

  private Map<StateValue, AcceptorController> controllers;

  protected PlayController playController;

  protected ResumeController resumeController;

  private TCPIP tcpip;


  public Logic(Boolean isStandAlone) {
    if (isStandAlone) {
      this.tcpip = null;
    } else {
      this.tcpip = TCPIP.createClientSocket();
    }

    this.session = new Session(this.tcpip);
    this.controllers = new HashMap<StateValue, AcceptorController>();
    this.playController = new PlayController(this.session, this.tcpip);
    this.controllers.put(StateValue.IN_GAME, this.playController);
    this.resumeController = new ResumeController(this.session, this.tcpip);
    this.controllers.put(StateValue.RESUME, this.resumeController);
    this.controllers.put(StateValue.EXIT, null);
  }

  public AcceptorController getController() {
    return this.controllers.get(this.session.getValueState());
  }

  public void close() {
    this.tcpip.close();
  }
}
