package com.views.console;

import com.controllers.PlayController;

class PlayView {

  void interact(PlayController playController) {
    new PlayMenu(playController).execute();
  }

}

