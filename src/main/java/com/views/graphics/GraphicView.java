package com.views.graphics;

import com.models.Game;
import com.views.View;

// TODO: Implementar solución con Biblioteca gráfica.
public class GraphicView extends View {

	public GraphicView(Game game) {
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
