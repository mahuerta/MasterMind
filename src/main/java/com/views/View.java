package com.views;

import com.controllers.Controller;
import com.controllers.ControllersVisitor;

public abstract class View implements ControllersVisitor {

  public void interact(Controller controller){
    controller.accept(this);
  }

}
