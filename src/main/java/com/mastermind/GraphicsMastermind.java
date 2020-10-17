package com.mastermind;

import com.controllers.Logic;
import com.views.graphics.GraphicView;

public class GraphicsMastermind extends Mastermind {

  @Override
  protected GraphicView createView(Logic logic) {
    return new GraphicView(logic);
  }

  public static void main(String[] args) {
    new GraphicsMastermind().play();
  }

}
