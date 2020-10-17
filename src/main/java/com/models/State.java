package com.models;

public class State {

  private StateValue stateValue;

  public State() {
    this.reset();
  }

  public void reset() {
    this.stateValue = StateValue.IN_GAME;
  }

  public void next() {
    this.stateValue = StateValue.values()[this.stateValue.ordinal() + 1];
  }

  public StateValue getValueState() {
    return this.stateValue;
  }

}
