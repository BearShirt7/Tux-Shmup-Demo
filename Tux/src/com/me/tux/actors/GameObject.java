package com.me.tux.actors;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.physics.box2d.Body;
import com.badlogic.gdx.physics.box2d.World;
import com.badlogic.gdx.scenes.scene2d.Actor;

public class GameObject extends Actor {
	private float x;
	private float y;
	private Texture image;

	public GameObject(String location) {
		image = new Texture(Gdx.files.internal(location));
		x = 0;
		y = 0;
	}
	@Override
	public void act(float delta) {
		super.act(delta);
	}
	@Override
	public void draw(SpriteBatch batch, float parentAlpha) {
		batch.draw(image, x, y, image.getWidth(), image.getHeight());
	}
	public void move(float xd, float yd) {
		x+=xd;
		y+=yd;
	}
	public void setX(float xp) {
		x = xp;
	}
	public void setY(float yp) {
		y = yp;
	}
	public float getX() {
		return x;
	}
	public float getY() {
		return y;
	}
	
	}
