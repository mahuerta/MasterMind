package com.distributed.dispatchers;

import com.controllers.PlayController;

public class ResultDispatcher extends Dispatcher {

  public ResultDispatcher(PlayController playController) {
    super(playController);
  }

  @Override
  public void dispatch() {
    int position = this.tcpip.receiveInt();
    this.tcpip.send(((PlayController) this.acceptorController).getResult(position));
  }

}
