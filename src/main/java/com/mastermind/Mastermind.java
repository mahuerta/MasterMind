package com.mastermind;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Mastermind {

	static final String TITLE = "----- MASTERMIND -----";
	static MakerPlayer makerPlayer;
	static BreakerPlayer breakerPlayer;

	public static void play() {
		breakerPlayer = new BreakerPlayer();
		makerPlayer = new MakerPlayer(breakerPlayer);
		System.out.println(TITLE);
		makerPlayer.generateCombination();
		makerPlayer.printCombination();

		while (breakerPlayer.hasAttempts() && !breakerPlayer.isLooser() && !breakerPlayer.isWinner()) {
			breakerPlayer.generateCombination();
			makerPlayer.answer();
			breakerPlayer.printAttempts();
			makerPlayer.printCombination();
			breakerPlayer.printCombination();
		}
		if (breakerPlayer.isWinner()) {
			System.out.println("You've won!!! ;-)");
		} else {
			System.out.println("You've lost!!! :-(");
		}
	}

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String restart = "y";

		while (restart.equals("y")) {
			play();
			System.out.println("Do you want to continue? (y/n):");
			try {
				restart = br.readLine();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
