package com.controllers;

import com.models.ProposedCombination;
import com.models.Result;
import com.models.Session;

public abstract class UseCaseController {

  protected Session session;

  UseCaseController(Session session) {
    this.session = session;
  }

  public int getAttempts() {
    return this.session.getAttempts();
  }

  public ProposedCombination getProposedCombination(int i) {
    return this.session.getProposedCombination(i);

  }

  public Result getResult(int i) {
    return this.session.getResult(i);
  }

}
