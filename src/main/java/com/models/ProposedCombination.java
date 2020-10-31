package com.models;

import java.util.ArrayList;
import java.util.List;

public class ProposedCombination extends Combination {


  public ProposedCombination(List<Color> colors) {
    this.colors = colors;
  }

  boolean contains(Color color, int position) {
    return this.colors.get(position) == color;
  }

  boolean contains(Color color) {
    for (int i = 0; i < this.colors.size(); i++) {
      if (this.colors.get(i) == color) {
        return true;
      }
    }
    return false;
  }

  public List<Color> getColors() {
    return this.colors;
  }

  ProposedCombination copy() {
    List<Color> colors = new ArrayList<Color>();
    for (Color color : this.colors) {
      colors.add(color);
    }
    return new ProposedCombination(colors);
  }
}
