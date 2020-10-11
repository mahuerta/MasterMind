package com.views;

import java.util.List;
import com.models.Color;
import com.models.SecretCombination;
import com.utils.Console;

public class SecretCombinationView {
  private SecretCombination secretCombination;

  SecretCombinationView(SecretCombination secretCombination) {
    this.secretCombination = secretCombination;
  }

  void writeln() {
    Console.instance().write("**** - ");
    List<Color> colors = this.secretCombination.getColors();
    for (Color color : colors) {
      new ColorView(color).write();
    }
    Console.instance().writeln();
  }
}
