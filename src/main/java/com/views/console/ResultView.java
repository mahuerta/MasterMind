package com.views.console;

import com.controllers.ProposalController;
import com.models.Result;
import com.utils.WithConsoleView;
import com.views.Message;

class ResultView extends WithConsoleView {

  private Result result;

  private ProposalController proposalController;


  ResultView(Result result) {
    this.result = result;
  }

  void writeln() {
    Message.RESULT.writeln(this.result.getBlacks(), this.result.getWhites());
  }

}
