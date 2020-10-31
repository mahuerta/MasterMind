package com.views;

import com.utils.YesNoDialog;

public class ResumeView {

  public boolean read() {
    return new YesNoDialog().read(MessageView.RESUME.toString());
  }

}
