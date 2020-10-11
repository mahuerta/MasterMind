package com.models;

import java.util.ArrayList;
import java.util.List;

abstract class Combination {

  protected List<Color> colors;

  protected Combination() {
    this.colors = new ArrayList<Color>();
  }

  public List<Color> getColors() {
    return this.colors;
  }

  public void setColors(List<Color> colors) {
    this.colors = colors;
  }

}
