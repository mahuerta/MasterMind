package com.distributed.dispatchers;

import com.controllers.PlayController;
import com.models.Color;
import com.models.ProposedCombination;
import java.util.List;


public class ColorsDispatcher extends Dispatcher {

	public ColorsDispatcher(PlayController playController) {
		super(playController);
	}

	@Override
	public void dispatch() {
		int position = this.tcpip.receiveInt();
		ProposedCombination proposedCombination = ((PlayController) this.acceptorController).getProposedCombination(position);
		this.tcpip.send(proposedCombination.getColors().size());
		for (Color color: proposedCombination.getColors()) {
			this.tcpip.send(color);
		}
	}

}
