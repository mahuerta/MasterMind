package com.distributed.dispatchers;


import com.controllers.implementation.PlayControllerImplementation;

public class AttemptsDispatcher extends Dispatcher {

  public AttemptsDispatcher(PlayControllerImplementation playControllerImplementation) {
    super(playControllerImplementation);
  }

  @Override
  public void dispatch() {
    this.tcpip.send(((PlayControllerImplementation) this.acceptorController).getAttempts());
  }

}
