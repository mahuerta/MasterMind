package com.views;

import com.models.Color;
import com.utils.Console;

public class ColorView {

  private Color color;

  public ColorView(Color color) {
    this.color = color;
  }

  public void write() {
    new Console().write(this.color.getInitial());
  }

  public void writeInitials() {
    new Console().write(Color.getInitials());
  }
}
