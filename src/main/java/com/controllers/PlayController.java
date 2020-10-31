package com.controllers;

import java.util.HashMap;
import java.util.Map;
import com.models.Session;
import com.utils.Command;
import com.utils.Menu;
import com.views.ActionCommand;
import com.views.MessageView;

public class PlayController extends Controller {

  private Map<Command, Controller> controllers;

  private ActionCommand actionCommand;

  private Menu menu;

  public PlayController(Session session) {
    super(session);

    MessageView.TITLE.writeln();
    this.controllers = new HashMap<Command, Controller>();

    ProposedCombinationController proposedCombinationController =
        new ProposedCombinationController(this.session);
    this.actionCommand = new ActionCommand();

    this.controllers.put(this.actionCommand, proposedCombinationController);

    this.menu = new Menu(this.controllers.keySet());

  }

  @Override
  public void control() {
    this.actionCommand.setActive(true);
    this.controllers.get(this.menu.execute()).control();
  }


}
