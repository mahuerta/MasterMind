package com.mastermind;

import com.utils.Console;

public class ProposedCombination extends Combination {

  public ProposedCombination() {
    super();
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

  public void read() {
    String proposedCombination = "";
    do {
      Message.PROPOSED_COMBINATION.writeln();
      proposedCombination = Console.instance().readString();
    } while (!this.isValidCombination(proposedCombination));
  }

  private boolean isValidCombination(String proposedCombination) {
    String[] proposedCombinationArr = proposedCombination.split("");
    if (proposedCombinationArr.length != 4) {
      Error.WRONG_LENGTH.writeln();
      return false;
    } else {
      for (int i = 0; i < proposedCombinationArr.length; i++) {
        if (this.isValidColor(proposedCombinationArr[i])) {
          if (this.isRepeatedColor(proposedCombinationArr[i])) {
            Error.DUPLICATED.writeln();
            this.colors.removeAll(this.colors);
            return false;
          } else {
            this.colors.add(Color.valueOf(proposedCombinationArr[i].toUpperCase()));
          }
        } else {
          Error.WRONG_CHARACTERS.writeln();
          Color.writeln();

          this.colors.removeAll(this.colors);
          return false;
        }
      }
      return true;
    }
  }

  private boolean isValidColor(String proposedColor) {
    try {
      Color.valueOf(proposedColor.toUpperCase());
      return true;
    } catch (IllegalArgumentException e) {
      return false;
    } catch (NullPointerException e) {
      return false;
    }
  }

  private boolean isRepeatedColor(String proposedColor) {
    return this.colors.contains(Color.valueOf(proposedColor.toUpperCase()));
  }

  public void write() {
    for (Color color : this.colors) {
      Console.instance().write(color.toString());
    }
  }

}
