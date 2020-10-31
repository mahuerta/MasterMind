package com.distributed;


import com.distributed.dispatchers.FrameType;
import com.distributed.dispatchers.TCPIP;
import com.models.Session;
import com.models.StateValue;

public class SessionProxy implements Session {

  private TCPIP tcpip;

  public SessionProxy(TCPIP tcpip) {
    this.tcpip = tcpip;
  }


  public StateValue getValueState() {
    this.tcpip.send(FrameType.STATE.name());
    return StateValue.values()[this.tcpip.receiveInt()];
  }

}
