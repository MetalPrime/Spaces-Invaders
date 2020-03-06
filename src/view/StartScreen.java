package view;

import controler.StartController;
import processing.core.PApplet;
import processing.core.PConstants;

public class StartScreen {
	
	private PApplet app;
	private StartController startC;
	private int sizeX;
	private int sizeY;
	private int posX;
	private int posY;
	
	public StartScreen(PApplet app) {
		this.app = app;
		startC = new StartController();
		posX = app.width/2;
		posY = app.height*2/3;
		sizeX = 250;
		sizeY = 80;
		
	}
	
	public void paint() {
		app.background(150);
		
		app.textSize(50);
		app.textAlign(PConstants.CENTER);
		app.fill(255);
		app.text("Space Invaders", app.width*1/2,app.height*1/5);
		
		botton();
	 
		
	}
	
	public void clicked() {
		
	}
	
	public void botton() {
		app.rectMode(PConstants.CENTER);
		app.fill(250,150,15);
		app.rect(posX,posY, sizeX, sizeY);
		
		app.textSize(32);
		app.textAlign(PConstants.CENTER);
		app.fill(255);
		app.text("Iniciar Juego", posX,posY);
	}
}

