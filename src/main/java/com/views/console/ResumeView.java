package com.views.console;

import com.controllers.ResumeController;
import com.utils.YesNoDialog;
import com.views.Message;

class ResumeView {

  boolean interact(ResumeController resumeController) {
    boolean isResumed = new YesNoDialog().read(Message.RESUME.toString());
    if (isResumed) {
      resumeController.resume();
    } else {
      resumeController.next();
    }
    return isResumed;
  }

}
