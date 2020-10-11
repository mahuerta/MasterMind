package com.views;

import com.models.Result;

public class ResultView {

  private Result result;

  ResultView(Result result) {
    this.result = result;
  }

  void writeln() {
    Message.RESULT.writeln(this.result.getBlacks(), this.result.getWhites());
  }

}
