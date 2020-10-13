package com.views;

import java.util.ArrayList;

import com.models.Color;
import com.models.Error;
import com.models.ProposedCombination;
import com.utils.Console;

public class ProposedCombinationView {

	private ProposedCombination proposedCombination;

	public ProposedCombinationView(ProposedCombination proposedCombination) {
		this.proposedCombination = proposedCombination;
	}

	public ProposedCombinationView() {

	}

	public ProposedCombination read() {
		ProposedCombination proposedCombination;
		Error error;
		do {
			MessageView.PROPOSED_COMBINATION.write();
			proposedCombination = new ProposedCombination();
			error = proposedCombination.checkError(Console.instance().readString());
			new ErrorView(error).writeln();

			if (!error.isNull()) {
				proposedCombination.setColors(new ArrayList<Color>());
			}
		} while (!error.isNull());
		return proposedCombination;
	}

	public void write() {
		for (Color color : this.proposedCombination.getColors()) {
			new ColorView(color).write();
		}
	}

}
