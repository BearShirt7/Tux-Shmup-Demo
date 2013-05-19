package com.me.tux.screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.Camera;
import com.badlogic.gdx.graphics.GL10;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.me.tux.Controller;
import com.me.tux.Level;
import com.me.tux.Tux;
import com.me.tux.actors.GameObject;

public class GameScreen implements Screen {
	Stage stage;
	Tux game;
	Stage staticStage;
	GameObject ship;
	Level level;
	Controller cont;
	public static final float WORLD_WIDTH = 15;
	public static final float WORLD_HEIGTH = 25;

	public GameScreen(Tux game) {
		this.game = game;
		level = new Level();
		stage = new Stage();
		cont = new Controller(stage);
		staticStage = new Stage();
		ship = new GameObject("data/ship.png");
		Gdx.input.setInputProcessor(stage);
		stage.addActor(ship);
		staticStage.addActor(level);
	}

	@Override
	public void render(float delta) {
		Camera cam = staticStage.getCamera();
		Gdx.gl.glClearColor(1f,0f,1f,1);
		Gdx.gl.glClear(GL10.GL_COLOR_BUFFER_BIT);
		cam.translate(1f, 0, 0);
		if(cam.position.x >= 1280) {
			cam.position.x = 480;
		}
        ship.setX(ship.getX() + cont.getKnobPercentX()*ship.Speed());
        ship.setY(ship.getY() + cont.getKnobPercentY()*ship.Speed());
		staticStage.act(delta);
		stage.act(delta); //call everything's act method
		staticStage.draw();
		stage.draw();
		

	}

	@Override
	public void resize(int width, int height) {
		// TODO Auto-generated method stub

	}

	@Override
	public void show() {

		

	}

	@Override
	public void hide() {
		// TODO Auto-generated method stub

	}

	@Override
	public void pause() {
		// TODO Auto-generated method stub

	}

	@Override
	public void resume() {
		// TODO Auto-generated method stub

	}

	@Override
	public void dispose() {
		// TODO Auto-generated method stub

	}

}
