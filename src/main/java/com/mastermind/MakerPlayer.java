package com.mastermind;

public class MakerPlayer implements Player {
  protected Board board;

  public MakerPlayer(Board board) {
    assert board != null;
    this.board = board;
  }

  @Override
  public void play() {
    ProposedCombination proposed = this.board.getLastProposed();
    SecretCombination secret = this.board.getSecret();

    Result result = getResponse(proposed, secret);
    this.board.putResult(result);
  }

  public void generateSecret() {
    SecretCombination secret = new SecretCombination();
    this.board.setSecret(secret);
    secret.writeln();
  }

  protected Result getResponse(ProposedCombination proposed, SecretCombination secret) {
    return secret.getResult(proposed);
  }

}
