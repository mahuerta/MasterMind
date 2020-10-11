package com.models;

public enum Error {
  DUPLICATED, WRONG_CHARACTERS, WRONG_LENGTH, NULL_ERROR;

  public boolean isNull() {
    return this == Error.NULL_ERROR;
  }

}
