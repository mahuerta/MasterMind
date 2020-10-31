package com.controllers;

import java.util.ArrayList;
import com.models.Color;
import com.models.Combination;
import com.models.Error;
import com.models.ProposedCombination;
import com.models.Session;
import com.views.ColorView;
import com.views.ErrorView;
import com.views.MessageView;
import com.views.ProposedCombinationView;

public class ProposedCombinationController extends InGameController {

  ProposedCombinationController(Session session) {
    super(session);
  }

  @Override
  protected void inGameControl() {

    ProposedCombination proposedCombination = new ProposedCombination(new ArrayList<Color>());
    Error error;
    do {
      error = null;
      MessageView.PROPOSED_COMBINATION.write();
      String characters = new ProposedCombinationView().read();
      if (characters.length() > Combination.getWidth()) {
        error = Error.WRONG_LENGTH;
      } else {
        for (int i = 0; i < characters.length(); i++) {
          Color color = Color.values()[ColorView.getInstance(characters.charAt(i))];
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
        new ErrorView().writeln(error.ordinal());
        proposedCombination.getColors().clear();
      } else {
        this.session.addProposedCombination(proposedCombination);
      }

    } while (error != null);

  }

}
