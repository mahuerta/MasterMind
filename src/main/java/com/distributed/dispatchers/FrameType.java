package com.distributed.dispatchers;

public enum FrameType {
  STATE, UNDO, REDO, UNDOABLE, REDOABLE, WINNER, LOOSER, ATTEMPTS, COLORS, PROPOSECOMBINATION, NEW_GAME, BLACKS, WHITES, RESULT, CLOSE;

  public static FrameType parser(String string) {
    for (FrameType frameType : FrameType.values()) {
      if (frameType.name().equals(string)) {
        return frameType;
      }
    }
    return null;
  }
}
