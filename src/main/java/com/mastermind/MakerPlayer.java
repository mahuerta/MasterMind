package com.mastermind;

public class MakerPlayer {
	private SecretCombination secretCombination;
	private BreakerPlayer breakerPlayer;

	public MakerPlayer(BreakerPlayer breakerPlayer) {
		this.breakerPlayer = breakerPlayer;
	}

	public SecretCombination generateCombination() {
		this.secretCombination = new SecretCombination();
		return this.secretCombination;
	}

	public void answer() {
		this.secretCombination.calculateResult(this.breakerPlayer.getLastCombination());
		this.breakerPlayer.addAttempts();
	}

	public void printCombination() {
		this.secretCombination.print();
	}
}
