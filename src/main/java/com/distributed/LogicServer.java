package com.distributed;

import com.controllers.Logic;
import com.distributed.dispatchers.AttemptsDispatcher;
import com.distributed.dispatchers.BlacksDispatcher;
import com.distributed.dispatchers.ResultDispatcher;
import com.distributed.dispatchers.ColorsDispatcher;
import com.distributed.dispatchers.DispatcherPrototype;
import com.distributed.dispatchers.FrameType;
import com.distributed.dispatchers.LooserDispatcher;
import com.distributed.dispatchers.ProposeCombinationDispatcher;
import com.distributed.dispatchers.RedoDispatcher;
import com.distributed.dispatchers.RedoableDispatcher;
import com.distributed.dispatchers.ResumeDispatcher;
import com.distributed.dispatchers.StartDispatcher;
import com.distributed.dispatchers.StateDispatcher;
import com.distributed.dispatchers.UndoDispatcher;
import com.distributed.dispatchers.UndoableDispatcher;
import com.distributed.dispatchers.WhitesDispatcher;
import com.distributed.dispatchers.WinnerDispatcher;

public class LogicServer extends Logic {

	public LogicServer(Boolean isStandalone) {
		super(isStandalone);
	}

	public void createDispatchers(DispatcherPrototype dispatcherPrototype) {
		dispatcherPrototype.add(FrameType.START, new StartDispatcher(this.startController));
		dispatcherPrototype.add(FrameType.STATE, new StateDispatcher(this.playController));
		dispatcherPrototype.add(FrameType.UNDO, new UndoDispatcher(this.playController));
		dispatcherPrototype.add(FrameType.REDO, new RedoDispatcher(this.playController));
		dispatcherPrototype.add(FrameType.UNDOABLE, new UndoableDispatcher(this.playController));
		dispatcherPrototype.add(FrameType.REDOABLE, new RedoableDispatcher(this.playController));
		dispatcherPrototype.add(FrameType.WINNER, new WinnerDispatcher(this.playController));
		dispatcherPrototype.add(FrameType.LOOSER, new LooserDispatcher(this.playController));
		dispatcherPrototype.add(FrameType.ATTEMPTS, new AttemptsDispatcher(this.playController));
		dispatcherPrototype.add(FrameType.COLORS, new ColorsDispatcher(this.playController));
		dispatcherPrototype.add(FrameType.PROPOSECOMBINATION, new ProposeCombinationDispatcher(this.playController));
		dispatcherPrototype.add(FrameType.BLACKS, new BlacksDispatcher(this.playController));
		dispatcherPrototype.add(FrameType.WHITES, new WhitesDispatcher(this.playController));
		dispatcherPrototype.add(FrameType.RESULT, new ResultDispatcher(this.playController));
		dispatcherPrototype.add(FrameType.NEW_GAME, new ResumeDispatcher(this.resumeController));
	}

}
