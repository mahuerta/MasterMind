package com.views;

import com.utils.WithConsoleView;

public class ColorView extends WithConsoleView {

  private static final char[] INITIALS = {'r', 'b', 'y', 'g', 'o', 'p'};

  public static String allInitials() {
    String result = "";
    for (char character : ColorView.INITIALS) {
      result += character;
    }
    return result;
  }

  public static Integer getInstance(char character) {
    for (int i = 0; i < ColorView.INITIALS.length; i++) {
      if (ColorView.INITIALS[i] == character) {
        return i;
      }
    }
    return null;
  }

  public void write(int i) {
    this.console.write(ColorView.INITIALS[i]);
  }

}
