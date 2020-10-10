package com.mastermind;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class SecretCombination extends Combination {

	public SecretCombination() {
		this.combination = this.createRandomCombination();
	}

	public void calculateResult(
			ProposedCombination proposedCombination) {
		Integer blacks = proposedCombination.calculateBlacks(this);
		Integer whites = proposedCombination.calculateWhites(this) - blacks;

		proposedCombination.setResult(new Result(blacks, whites));
	}

	public void print() {
		System.out.println(this.combination.toString().replaceAll("[A-Z]", "*"));
	}

	private List<Color> createRandomCombination() {
		Random random = new Random();
		List<Color> randomCombination = new ArrayList<Color>();

		while (randomCombination.size() < 4) {
			Color c = Color.values()[random.nextInt(
					Color.values().length)];
			if (!randomCombination.contains(c)) {
				randomCombination.add(c);
			}
		}
		return randomCombination;
	}
}
