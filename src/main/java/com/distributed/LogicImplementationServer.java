package com.distributed;

import com.controllers.implementation.LogicImplementation;
import com.distributed.dispatchers.AttemptsDispatcher;
import com.distributed.dispatchers.BlacksDispatcher;
import com.distributed.dispatchers.ColorsDispatcher;
import com.distributed.dispatchers.DispatcherPrototype;
import com.distributed.dispatchers.FrameType;
import com.distributed.dispatchers.LooserDispatcher;
import com.distributed.dispatchers.ProposeCombinationDispatcher;
import com.distributed.dispatchers.RedoDispatcher;
import com.distributed.dispatchers.RedoableDispatcher;
import com.distributed.dispatchers.ResumeDispatcher;
import com.distributed.dispatchers.StateDispatcher;
import com.distributed.dispatchers.UndoDispatcher;
import com.distributed.dispatchers.UndoableDispatcher;
import com.distributed.dispatchers.WhitesDispatcher;
import com.distributed.dispatchers.WinnerDispatcher;

public class LogicImplementationServer extends LogicImplementation {

  public void createDispatchers(DispatcherPrototype dispatcherPrototype) {
    dispatcherPrototype.add(FrameType.STATE,
        new StateDispatcher(this.playControllerImplementation));
    dispatcherPrototype.add(FrameType.UNDO, new UndoDispatcher(this.playControllerImplementation));
    dispatcherPrototype.add(FrameType.REDO, new RedoDispatcher(this.playControllerImplementation));
    dispatcherPrototype.add(FrameType.UNDOABLE,
        new UndoableDispatcher(this.playControllerImplementation));
    dispatcherPrototype.add(FrameType.REDOABLE,
        new RedoableDispatcher(this.playControllerImplementation));
    dispatcherPrototype.add(FrameType.WINNER,
        new WinnerDispatcher(this.playControllerImplementation));
    dispatcherPrototype.add(FrameType.LOOSER,
        new LooserDispatcher(this.playControllerImplementation));
    dispatcherPrototype.add(FrameType.ATTEMPTS,
        new AttemptsDispatcher(this.playControllerImplementation));
    dispatcherPrototype.add(FrameType.COLORS,
        new ColorsDispatcher(this.playControllerImplementation));
    dispatcherPrototype.add(FrameType.PROPOSECOMBINATION,
        new ProposeCombinationDispatcher(this.playControllerImplementation));
    dispatcherPrototype.add(FrameType.BLACKS,
        new BlacksDispatcher(this.playControllerImplementation));
    dispatcherPrototype.add(FrameType.WHITES,
        new WhitesDispatcher(this.playControllerImplementation));
    dispatcherPrototype.add(FrameType.NEW_GAME,
        new ResumeDispatcher(this.resumeControllerImplementation));
  }

}
