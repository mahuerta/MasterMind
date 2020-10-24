package com.controllers;

public interface ControllerVisitor {

  void visit(PlayController playController);

  void visit(ResumeController continueController);

}
