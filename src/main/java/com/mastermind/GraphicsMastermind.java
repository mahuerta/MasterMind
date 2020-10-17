package com.mastermind;

import com.views.graphics.GraphicView;

public class GraphicsMastermind extends Mastermind {

  @Override
  protected GraphicView createView() {
    return new GraphicView();
  }

  public static void main(String[] args) {
    new GraphicsMastermind().play();
  }

}
