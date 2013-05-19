package com.me.tux;


import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Skin;
import com.badlogic.gdx.scenes.scene2d.ui.Touchpad;
import com.badlogic.gdx.scenes.scene2d.ui.Touchpad.TouchpadStyle;
import com.badlogic.gdx.scenes.scene2d.utils.Drawable;

public class Controller {
	private Touchpad pad;
	private TouchpadStyle style;
	private Drawable touchKnob;
	private Drawable touchBackground;
	private Skin skin;
	
	

	public Controller(Stage stage) {
		skin = new Skin();
		skin.add("touchBackground", new Texture("data/touchBackground.png"));
		skin.add("touchKnob", new Texture("data/touchKnob.png"));
		style = new TouchpadStyle();
		touchBackground = skin.getDrawable("touchBackground");
		touchKnob = skin.getDrawable("touchKnob");
		style.background = touchBackground;
		style.knob = touchKnob;
		pad = new Touchpad(5, style);
		pad.setBounds(15,15,100,100);
		stage.addActor(pad);
	}
	public float getKnobPercentX() {
		return pad.getKnobPercentX();
	}
	public float getKnobPercentY() {
		return pad.getKnobPercentY();
	}
	

}
