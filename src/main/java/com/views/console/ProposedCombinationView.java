package com.views.console;

import com.models.Color;
import com.models.Combination;
import com.models.Error;
import com.models.ProposedCombination;
import com.utils.WithConsoleView;
import com.views.Message;
import java.util.ArrayList;

class ProposedCombinationView extends WithConsoleView {

  void write(ProposedCombination proposedCombination) {
    for (Color color : proposedCombination.getColors()) {
      new ColorView(color).write();
    }
  }

  public ProposedCombination read() {
    ProposedCombination proposedCombination = new ProposedCombination(new ArrayList<Color>());
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
            if (proposedCombination.getColors().contains(color)) {
              error = Error.DUPLICATED;
            } else {
              proposedCombination.getColors().add(color);
            }
          }
        }
      }
      if (error != null) {
        new ErrorView(error).writeln();
        proposedCombination.getColors().clear();
      }
    } while (error != null);

    return proposedCombination;
  }

}
