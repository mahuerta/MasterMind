package com.distributed;


import com.controllers.Logic;
import com.mastermind.Mastermind;

public class MastermindClient extends Mastermind {

  private LogicProxy logicProxy;

  @Override
  protected Logic createLogic() {
    this.logicProxy = new LogicProxy();
    return this.logicProxy;
  }

  @Override
  protected void play() {
    super.play();
    this.logicProxy.close();
  }

  public static void main(String[] args) {
    new MastermindClient().play();
  }

}
