package com.controllers;

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

  public void addProposedCombination(ProposedCombination proposedCombination) {
    this.session.addProposedCombination(proposedCombination);
  }

}
