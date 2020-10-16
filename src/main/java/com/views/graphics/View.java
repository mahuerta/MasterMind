package com.views.graphics;

import com.models.Game;

// TODO: Implementar solución con Biblioteca gráfica.
public class View extends com.views.View {

	public View(Game game) {
		super(game);
	}

	@Override
	protected void start() {
	}

	@Override
	protected boolean play() {return false;
	}

	@Override
	protected boolean isNewGame() {
		return false;
	}
}
