package com.mastermind;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import com.utils.Console;

public class SecretCombination extends Combination {

  SecretCombination() {
    super();

    Random random = new Random();
    List<Color> randomColorCombination = new ArrayList<Color>();

    while (randomColorCombination.size() < 4) {
      Color c = Color.values()[random.nextInt(Color.values().length)];
      if (!randomColorCombination.contains(c)) {
        randomColorCombination.add(c);
      }
    }

    this.colors = randomColorCombination;

  }

  Result getResult(ProposedCombination proposedCombination) {
    int blacks = 0;
    for (int i = 0; i < this.colors.size(); i++) {
      if (proposedCombination.contains(this.colors.get(i), i)) {
        blacks++;
      }
    }
    int whites = 0;
    for (Color color : this.colors) {
      if (proposedCombination.contains(color)) {
        whites++;
      }
    }
    return new Result(blacks, whites - blacks);
  }

  void writeln() {
    Console.instance().write("**** - ");
    this.colors.forEach(System.out::print);

    Console.instance().writeln();
  }

}
