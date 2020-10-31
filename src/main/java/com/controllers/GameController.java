package com.controllers;

import com.models.Color;
import com.models.ProposedCombination;
import com.models.SecretCombination;
import com.models.Session;
import com.views.ColorView;
import com.views.GameView;
import com.views.MessageView;
import com.views.ResultView;
import com.views.SecretCombinationView;

public abstract class GameController extends Controller {

  private GameView gameView;

  GameController(Session session) {
    super(session);
    this.gameView = new GameView();
  }

  @Override
  public void control() {
    this.inGameControl();
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

  protected abstract void inGameControl();

}
