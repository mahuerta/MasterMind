package com.controllers;


import com.distributed.dispatchers.FrameType;
import com.distributed.dispatchers.TCPIP;
import com.models.Session;

public abstract class StartController extends AcceptorController {

	public StartController(Session session) {
		super(session);
	}
	
	public abstract void start();
	
	@Override
	public void accept(ControllerVisitor controllersVisitor) {
		controllersVisitor.visit(this);
	}

}
