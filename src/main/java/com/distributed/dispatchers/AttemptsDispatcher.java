package com.distributed.dispatchers;

import com.controllers.PlayController;

public class AttemptsDispatcher extends Dispatcher {

	public AttemptsDispatcher(PlayController playController) {
		super(playController);
	}

	@Override
	public void dispatch() {
		this.tcpip.send(((PlayController)this.acceptorController).getAttempts());
	}

}
