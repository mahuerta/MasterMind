package com.views.console;

import com.controllers.AcceptorController;
import com.controllers.ControllerVisitor;
import com.controllers.PlayController;
import com.controllers.ResumeController;
import com.controllers.StartController;
import com.views.View;

public class ConsoleView extends View implements ControllerVisitor {

  private StartView startView;
  private PlayView playView;
  private ResumeView resumeView;

  public ConsoleView() {
    this.startView = new StartView();
    this.playView = new PlayView();
    this.resumeView = new ResumeView();
  }

  @Override
  public void interact(AcceptorController acceptorController) {
    acceptorController.accept(this);
  }

  @Override
  public void visit(StartController startController) {
    this.startView.interact(startController);
  }

  @Override
  public void visit(PlayController playController) {
    this.playView.interact(playController);
  }

  @Override
  public void visit(ResumeController resumeController) {
    this.resumeView.interact(resumeController);
  }

}
