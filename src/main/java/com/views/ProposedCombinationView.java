package com.views;

import java.util.ArrayList;
import com.models.Color;
import com.models.Error;
import com.models.ProposedCombination;
import com.utils.Console;

public class ProposedCombinationView {

  public ProposedCombination read() {
    ProposedCombination proposedCombination;
    Error error;
    do {
      Message.PROPOSED_COMBINATION.write();
      proposedCombination = new ProposedCombination();
      error = proposedCombination.checkError(Console.instance().readString());
      new ErrorView(error).writeln();

      if (!error.isNull()) {
        proposedCombination.setColors(new ArrayList<Color>());
      }
    } while (!error.isNull());
    return proposedCombination;
  }

  public void write(ProposedCombination proposedCombination) {
    for (Color color : proposedCombination.getColors()) {
      new ColorView(color).write();
    }
  }

}
