package com.models;

import java.util.List;
import com.distributed.dispatchers.FrameType;
import com.utils.TCPIP;

public class Session {

  private State state;
  private Game game;
  private Registry registry;
  private TCPIP tcpip;

  public Session(TCPIP tcpip) {
    this.state = new State();
    this.game = new Game();
    this.registry = new Registry(this.game);
    this.tcpip = tcpip;
  }

  public boolean isWinner() {
    return this.game.isWinner();
  }

  public boolean isLooser() {
    return this.game.isLooser();
  }

  public Result getResult(int i) {
    return this.game.getResult(i);
  }

  public ProposedCombination getProposedCombination(int i) {
    return this.game.getProposedCombination(i);
  }

  public int getAttempts() {
    return this.game.getAttempts();
  }

  public void addProposedCombination(List<Color> colors) {
    this.game.addProposedCombination(colors);
    this.registry.registry();
  }

  public void next() {
    this.state.next();
  }

  public StateValue getValueState() {
    if (this.tcpip == null) {
      return this.state.getValueState();
    }
    this.tcpip.send(FrameType.STATE.name());
    return StateValue.values()[this.tcpip.receiveInt()];
  }

  public void reset() {
    this.game.reset();
    this.registry.reset();
    this.state.reset();
  }

  public void undo() {
    this.registry.undo();
  }

  public boolean undoable() {
    return this.registry.undoable();
  }

  public void redo() {
    this.registry.redo();
  }

  public boolean redoable() {
    return this.registry.redoable();
  }

  public int getBlacks(int position) {
    return this.game.getBlacks(position);
  }

  public int getWhites(int position) {
    return this.game.getWhites(position);
  }

  public List<Color> getColors(int position) {
    return this.game.getColors(position);
  }

}
