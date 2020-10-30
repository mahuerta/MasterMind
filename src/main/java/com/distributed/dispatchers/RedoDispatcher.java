package com.distributed.dispatchers;


import com.controllers.PlayController;

public class RedoDispatcher extends Dispatcher {

  public RedoDispatcher(PlayController playController) {
    super(playController);
  }

  @Override
  public void dispatch() {
    ((PlayController) this.acceptorController).redo();
  }

}
