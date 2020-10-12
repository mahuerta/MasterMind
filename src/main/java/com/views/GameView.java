package com.views;

import com.models.Game;
import com.utils.Console;

public class GameView {

  private Game game;

  GameView(Game game) {
    this.game = game;
  }

  void write() {
    Console.instance().writeln();
    int attemps = this.game.getAttemps();
    MessageView.ATTEMPTS.writeln(attemps);

    new SecretCombinationView(this.game.getSecretCombination()).writeln();
    for (int i = 0; i < attemps; i++) {
      new ProposedCombinationView().write(this.game.getProposedCombinations(i));
      new ResultView(this.game.getResults(i)).writeln();
    }

  }
}
