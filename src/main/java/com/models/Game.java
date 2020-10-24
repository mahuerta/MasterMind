package com.models;

import java.util.ArrayList;
import java.util.List;

public class Game {

  private static final int MAX_LONG = 10;

  private SecretCombination secretCombination;

  private List<ProposedCombination> proposedCombinations;

  private List<Result> results;

  private int attempts;

  public Game() {
    this.reset();
  }

  public void reset() {
    this.secretCombination = new SecretCombination();
    this.proposedCombinations = new ArrayList<ProposedCombination>();
    this.results = new ArrayList<Result>();
    this.attempts = 0;
  }

  public void addProposedCombination(ProposedCombination proposedCombination) {
    this.proposedCombinations.add(proposedCombination);
    this.results.add(this.secretCombination.getResult(proposedCombination));
    this.attempts++;
  }

  public boolean isLooser() {
    return this.attempts == Game.MAX_LONG;
  }

  public boolean isWinner() {
    return this.results.get(this.attempts - 1).isWinner();
  }

  public int getAttempts() {
    return this.attempts;
  }

  public ProposedCombination getProposedCombination(int position) {
    return this.proposedCombinations.get(position);
  }

  public Result getResult(int position) {
    return this.results.get(position);
  }

  Memento createMemento() {
    Memento memento = new Memento(this.attempts);
    for (int i = 0; i < this.proposedCombinations.size(); i++) {
      memento.set(this.proposedCombinations.get(i).copy(), this.results.get(i).copy());
    }
    return memento;
  }

  public void set(Memento memento) {
    this.attempts = memento.getAttempts();
    this.proposedCombinations = new ArrayList<ProposedCombination>();
    this.results = new ArrayList<Result>();
    for (int i = 0; i < memento.getSize(); i++) {
      this.proposedCombinations.add(memento.getProposedCombination(i).copy());
      this.results.add(memento.getResult(i).copy());
    }
  }

}
