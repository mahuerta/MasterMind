package com.distributed.dispatchers;


import com.controllers.implementation.PlayControllerImplementation;

public class LooserDispatcher extends Dispatcher {

  public LooserDispatcher(PlayControllerImplementation playControllerImplementation) {
    super(playControllerImplementation);
  }

  @Override
  public void dispatch() {
    this.tcpip.send(((PlayControllerImplementation) this.acceptorController).isLooser());
  }

}
