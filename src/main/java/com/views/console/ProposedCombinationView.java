package com.views.console;

import com.models.Color;
import com.models.Combination;
import com.models.Error;
import com.models.ProposedCombination;
import com.utils.WithConsoleView;
import com.views.Message;

class ProposedCombinationView extends WithConsoleView {

  private ProposedCombination proposedCombination;

  ProposedCombinationView(ProposedCombination proposedCombination) {
    this.proposedCombination = proposedCombination;
  }

  void write() {
    for (Color color : this.proposedCombination.getColors()) {
      new ColorView(color).write();
    }
  }

  void read() {
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
            if (this.proposedCombination.getColors().contains(color)) {
              error = Error.DUPLICATED;
            } else {
              this.proposedCombination.getColors().add(color);
            }
          }
        }
      }
      if (error != null) {
        new ErrorView(error).writeln();
        this.proposedCombination.getColors().clear();
      }
    } while (error != null);
  }

}