package com.distributed;


import com.controllers.StartController;
import com.distributed.dispatchers.FrameType;
import com.distributed.dispatchers.TCPIP;
import com.models.Session;

public class StartControllerProxy extends StartController {
	
	private TCPIP tcpip;

	public StartControllerProxy(Session session, TCPIP tcpip) {
		super(session);
		this.tcpip = tcpip;
	}

	@Override
	public void start() {
		this.tcpip.send(FrameType.START.name());
	}

}
