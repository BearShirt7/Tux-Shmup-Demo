package com.me.tux;

import com.badlogic.gdx.Game;
import com.me.tux.screens.GameScreen;

public class Tux extends Game {
	
	@Override
	public void create() {
		setScreen(new GameScreen(this));
		
	}
}