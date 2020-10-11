package com.models;

public class ProposedCombination extends Combination {

  public ProposedCombination() {
    super();
  };

  public Error checkError(String characters) {
    if (characters.length() != Result.WIDTH) {
      return Error.WRONG_LENGTH;
    }
    for (int i = 0; i < characters.length(); i++) {
      Color color = Color.getInstance(characters.charAt(i));
      if (color.isNull()) {
        return Error.WRONG_CHARACTERS;
      }
      for (int j = 0; j < i; j++) {
        if (this.colors.get(j) == color) {
          return Error.DUPLICATED;
        }
      }
      this.colors.add(color);
    }
    return Error.NULL_ERROR;
  }

  boolean contains(Color color, int position) {
    return this.colors.get(position) == color;
  }

  boolean contains(Color color) {
    for (int i = 0; i < this.colors.size(); i++) {
      if (this.colors.get(i) == color) {
        return true;
      }
    }
    return false;
  }


}
