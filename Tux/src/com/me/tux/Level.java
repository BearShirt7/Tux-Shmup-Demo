package com.me.tux;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.scenes.scene2d.Actor;

public class Level extends Actor {
	Texture texture;
	float x;
	float y;

	public Level() {
		x = 0;
		y = 0;
		texture = new Texture(Gdx.files.internal("data/h.jpg"));
		
	}
	public void draw(SpriteBatch batch, float parentAlpha) {
		batch.draw(texture, x, y, texture.getWidth(), texture.getHeight());
	}

}
