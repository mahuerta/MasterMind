package com.views;

import com.models.Result;

public class ResultView {

  private Result result;

  ResultView(Result result) {
    this.result = result;
  }

  void writeln() {
    MessageView.RESULT.writeln(this.result.getBlacks(), this.result.getWhites());
  }

}
