package com.controllers;

import java.util.ArrayList;
import com.models.Color;
import com.models.Combination;
import com.models.Error;
import com.models.ProposedCombination;
import com.models.SecretCombination;
import com.models.Session;
import com.views.ColorView;
import com.views.ErrorView;
import com.views.GameView;
import com.views.MessageView;
import com.views.ProposedCombinationView;
import com.views.ResultView;
import com.views.SecretCombinationView;

public class GameController extends Controller {

  private GameView gameView;

  GameController(Session session) {
    super(session);
    MessageView.TITLE.writeln();
    MessageView.EMPTY.writeln();
    this.gameView = new GameView();
  }

  @Override
  public void control() {
    this.addProposedCombination();
    this.writeBoard();
    if (this.session.isLooser() || this.session.isWinner()) {
      this.gameView.writeWinnerResult(this.session.isWinner());
      this.session.next();
    }
  }

  private void writeBoard() {
    this.gameView.writeLnSeparator();
    MessageView.ATTEMPTS.writeln(session.getAttempts());

    new SecretCombinationView().writeln(SecretCombination.getWidth());

    for (int i = 0; i < session.getAttempts(); i++) {
      writeProposedCombination(session.getProposedCombination(i));
      new ResultView().writeln(session.getResult(i).getBlacks(), session.getResult(i).getWhites());
    }

    this.gameView.writeLnSeparator();
  }

  private void writeProposedCombination(ProposedCombination proposedCombination) {
    for (Color color : proposedCombination.getColors()) {
      writeColor(color);
    }
  }

  private void writeColor(Color color) {
    new ColorView().write(color.ordinal());
  }

  private void addProposedCombination() {
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
          Integer instance = ColorView.getInstance(characters.charAt(i));
          if (instance == null) {
            error = Error.WRONG_CHARACTERS;
          } else {
            Color color = Color.values()[ColorView.getInstance(characters.charAt(i))];

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
