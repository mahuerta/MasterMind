package com.mastermind;

import com.utils.Console;

public enum Color {
  R, // Red
  B, // Blue
  Y, // Yellow
  G, // Green
  O, // Orange
  P; // Purple

  public static String getColorsCombination() {
    String colors = "";
    for (Color color : Color.values()) {
      colors += color.toString();
    }
    return colors;
  }

  public static void writeln() {
    String colors = "";
    for (Color color : Color.values()) {
      colors += color.toString();
    }

    Console.instance().write(colors);

  }
}
