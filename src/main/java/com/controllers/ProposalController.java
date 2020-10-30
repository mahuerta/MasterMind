package com.controllers;

import java.util.List;
import com.models.Color;
import com.models.Combination;
import com.models.Error;
import com.models.ProposedCombination;
import com.models.Result;
import com.models.Session;

public class ProposalController extends Controller {

  public ProposalController(Session session) {
    super(session);
  }

  public boolean isWinner() {
    return this.session.isWinner();
  }

  public boolean isLooser() {
    return this.session.isLooser();
  }

  public Result getResult(int i) {
    return this.session.getResult(i);
  }

  public ProposedCombination getProposedCombination(int i) {
    return this.session.getProposedCombination(i);
  }

  public int getAttempts() {
    return this.session.getAttempts();
  }

  public Error addProposedCombination(List<Color> colors) {
    Error error = null;
    if (colors.size() != Combination.getWidth()) {
      error = Error.WRONG_LENGTH;
    } else {
      for (int i = 0; i < colors.size(); i++) {
        if (colors.get(i) == null) {
          error = Error.WRONG_CHARACTERS;
        } else {
          for (int j = i + 1; j < colors.size(); j++) {
            if (colors.get(i) == colors.get(j)) {
              error = Error.DUPLICATED;
            }
          }
        }
      }
    }

    if (error == null) {
      this.session.addProposedCombination(colors);
      if (this.session.isWinner() || this.session.isLooser()) {
        this.session.next();
      }
    }

    return error;
  }


  int getBlacks(int position) {
    return this.session.getBlacks(position);
  }

  int getWhites(int position) {
    return this.session.getWhites(position);
  }

  List<Color> getColors(int position) {
    return this.session.getColors(position);
  }

}
