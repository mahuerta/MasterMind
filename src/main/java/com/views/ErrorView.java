package com.views;

import com.models.Error;
import com.utils.WithConsoleView;
import com.views.console.ColorView;

public class ErrorView extends WithConsoleView {

  public static final String[] MESSAGES =
      {"Repeated colors", "Wrong colors, they must be: " + ColorView.allInitials(),
          "Wrong proposed combination length"};

  protected Error error;

  public ErrorView(Error error) {
    this.error = error;
  }

}
