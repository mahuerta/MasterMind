package com.views;

import com.models.Game;
import com.models.ProposedCombination;

public class PlayView {
  private Game game;

  PlayView(Game game) {
    this.game = game;
  }

  public void interact() {

    do {
      this.playGame();
      new GameView(this.game).write();
    } while (!this.game.isFinished());
    Message message = Message.LOOSER;
    if (this.game.isWinner()) {
      message = Message.WINNER;
    }
    message.writeln();
  }

  private void playGame() {
    ProposedCombination proposedCombination = new ProposedCombinationView().read();
    this.game.put(proposedCombination);
  }

}
