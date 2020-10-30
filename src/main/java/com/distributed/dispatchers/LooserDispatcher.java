package com.distributed.dispatchers;


import com.controllers.PlayController;

public class LooserDispatcher extends Dispatcher {

	public LooserDispatcher(PlayController playController) {
		super(playController);
	}

	@Override
	public void dispatch() {
		this.tcpip.send(((PlayController)this.acceptorController).isLooser());
	}

}
