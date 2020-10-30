package com.distributed.dispatchers;


import com.controllers.PlayController;

public class UndoDispatcher extends Dispatcher {

  public UndoDispatcher(PlayController playController) {
    super(playController);
  }

  @Override
  public void dispatch() {
    ((PlayController) this.acceptorController).undo();
  }

}
