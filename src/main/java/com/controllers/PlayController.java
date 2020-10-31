package com.controllers;

import com.models.Session;
import com.views.MessageView;

public class PlayController extends Controller {

  private ProposedCombinationController proposedCombinationController;

  public PlayController(Session session) {
    super(session);

    MessageView.TITLE.writeln();
    MessageView.EMPTY.writeln();

    this.proposedCombinationController = new ProposedCombinationController(this.session);

  }

  @Override
  public void control() {
    this.proposedCombinationController.control();
  }


}
