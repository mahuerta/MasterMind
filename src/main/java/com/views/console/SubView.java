package com.views.console;

import com.controllers.Logic;

public class SubView {

  protected Logic logic;

  SubView(Logic logic) {
    assert logic != null;

    this.logic = logic;
  }

}
