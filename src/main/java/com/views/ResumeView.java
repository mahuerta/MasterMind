package com.views;

import com.utils.YesNoDialog;

public class ResumeView {


  boolean interact() {
    return new YesNoDialog().read(MessageView.RESUME.toString());
  }

}
