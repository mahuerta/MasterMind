package com.views.console;

import com.controllers.PlayController;
import com.models.Color;
import com.models.Combination;
import com.models.Error;
import com.models.ProposedCombination;
import com.utils.WithConsoleView;
import com.views.Message;
import java.util.ArrayList;
import java.util.List;

class ProposedCombinationView extends WithConsoleView {

  private PlayController playController;

  ProposedCombinationView(PlayController playController) {
    this.playController = playController;
  }
    void write(int i) {
    for (Color color : this.playController.getColors(i)) {
      new ColorView(color).write();
    }
  }

  public List<Color> read() {
    List<Color> colors = new ArrayList<Color>();
    Error error;
    do {
      error = null;
      Message.PROPOSED_COMBINATION.write();
      String characters = this.console.readString();
      if (characters.length() > Combination.getWidth()) {
        error = Error.WRONG_LENGTH;
      } else {

        for (int i = 0; i < characters.length(); i++) {
          Color color = ColorView.getInstance(characters.charAt(i));
          if (color == null) {
            error = Error.WRONG_CHARACTERS;
          } else {

            if (colors.contains(color)) {
              error = Error.DUPLICATED;
            } else {
              colors.add(color);
            }
          }
        }
      }
      if (error != null) {
        new ErrorView(error).writeln();
        colors.clear();
      }
    } while (error != null);

    return colors;
  }

}
