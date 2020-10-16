package com.views;

import com.models.Result;
import com.utils.WithConsoleView;

class ResultView extends WithConsoleView {

	private Result result;

	ResultView(Result result) {
		this.result = result;
	}

	void writeln() {
		MessageView.RESULT.writeln(this.result.getBlacks(), this.result.getWhites());
	}

}
