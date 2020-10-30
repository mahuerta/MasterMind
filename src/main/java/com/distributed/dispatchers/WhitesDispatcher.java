package com.distributed.dispatchers;


import com.controllers.PlayController;

public class WhitesDispatcher extends Dispatcher {

	public WhitesDispatcher(PlayController playController) {
		super(playController);
	}

	@Override
	public void dispatch() {
		int position = this.tcpip.receiveInt();
		this.tcpip.send(((PlayController)this.acceptorController).getWhites(position));
	}

}
