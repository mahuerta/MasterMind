package com.mastermind;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

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
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String proposedCombination = "";

    while (!this.isValidCombination(proposedCombination)) {
      System.out.println("Propose a combination:");
      try {
        proposedCombination = br.readLine();
      } catch (IOException e) {
        e.printStackTrace();
      }
    }
  }

  private boolean isValidCombination(String proposedCombination) {
    String[] proposedCombinationArr = proposedCombination.split("");
    if (proposedCombinationArr.length != 4) {
      System.out.println("Wrong proposed combination length");
      return false;
    } else {
      for (int i = 0; i < proposedCombinationArr.length; i++) {
        if (this.isValidColor(proposedCombinationArr[i])) {
          if (this.isRepeatedColor(proposedCombinationArr[i])) {
            System.out.println("Repeated colors");
            this.colors.removeAll(this.colors);
            return false;
          } else {
            this.colors.add(Color.valueOf(proposedCombinationArr[i].toUpperCase()));
          }
        } else {
          System.out.println("Wrong colors, they must be: " + printColors());
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

  private String printColors() {
    String colors = "";
    for (Color color : Color.values()) {
      colors += color.toString();
    }
    return colors;
  }

}
