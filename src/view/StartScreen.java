package view;

import processing.core.PApplet;

public class StartScreen {
	
	private PApplet app;
	
	public StartScreen(PApplet app) {
		this.app = app;
		
	}
	
	public void paint() {
		app.background(150);
		app.textSize(32);
		app.text("Space Invaders", app.width/3,app.height/3);
		botton();
	 
	}
	
	public void clicked() {
		
	}
	
	public void botton() {
		int sizeX = 200;
		int sizeY = 50;
		app.rect(sizeX,sizeY, app.width*2/3, app.height*2/3);
	}
}

