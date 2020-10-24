package com.views.console;

import com.controllers.AcceptorController;
import com.controllers.ControllerVisitor;
import com.controllers.PlayController;
import com.controllers.ResumeController;
import com.views.View;

public class ConsoleView extends View implements ControllerVisitor {

  private PlayView playView;
  private ResumeView resumeView;

  public ConsoleView() {
    this.playView = new PlayView();
    this.resumeView = new ResumeView();
  }

  @Override
  public void interact(AcceptorController controller) {
    controller.accept(this);
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
