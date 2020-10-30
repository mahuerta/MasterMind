package com.controllers;


import com.distributed.dispatchers.FrameType;
import com.distributed.dispatchers.TCPIP;
import com.models.Session;

public class StartController extends AcceptorController {

	public StartController(Session session, TCPIP tcpip) {
		super(session, tcpip);
	}
	
	public void start() {
		if (this.tcpip == null) {
			this.session.next();	
		} else {
			this.tcpip.send(FrameType.START.name());
		}
	}
	
	@Override
	public void accept(ControllerVisitor controllersVisitor) {
		controllersVisitor.visit(this);
	}

}
