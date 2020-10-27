package com.utils;

import java.util.ArrayList;
import java.util.List;

public abstract class Menu {

  private static final String OPTION = "----- Choose one option -----";
  private List<Command> commands;

  public Menu() {
    this.commands = new ArrayList<Command>();
  }

  public void execute() {
    ArrayList<Command> commands = new ArrayList<Command>();
    for (int i = 0; i < this.commands.size(); i++) {
      if (this.commands.get(i).isActive()) {
        commands.add(this.commands.get(i));
      }
    }
    int option;
    Console console = Console.instance();
    boolean error;
    do {
      error = false;
      console.writeln();
      console.writeln(Menu.OPTION);
      for (int i = 0; i < commands.size(); i++) {
        console.writeln((i + 1) + ") " + commands.get(i).getTitle());
      }
      option = console.readInt("") - 1;
      if (!new ClosedInterval(0, commands.size() - 1).isIncluded(option)) {
        error = true;
      }
    } while (error);
    commands.get(option).execute();
  }

  protected void addCommand(Command command) {
    this.commands.add(command);
  }

}
