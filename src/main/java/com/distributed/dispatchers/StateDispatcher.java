package com.distributed.dispatchers;


import com.controllers.PlayController;

public class StateDispatcher extends Dispatcher {

  public StateDispatcher(PlayController playController) {
    super(playController);
  }

  @Override
  public void dispatch() {
    this.tcpip.send(this.acceptorController.getValueState().ordinal());
  }

}
