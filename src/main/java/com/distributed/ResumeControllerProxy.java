package com.distributed;


import com.controllers.ResumeController;
import com.distributed.dispatchers.FrameType;
import com.distributed.dispatchers.TCPIP;
import com.models.Session;

public class ResumeControllerProxy extends ResumeController {
	
	private TCPIP tcpip;

	public ResumeControllerProxy(Session session, TCPIP tcpip) {
		super(session);
		this.tcpip = tcpip;
	}

	@Override
	public void resume(boolean newGame) {
		this.tcpip.send(FrameType.NEW_GAME.name());
		this.tcpip.send(newGame);	
	}

}
