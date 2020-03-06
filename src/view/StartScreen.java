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
		startC = new StartController(app);
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
	
/*	public void clicked(int posX,int posY,int sizeX,int sizeY) {
		this.posX = posX;
		this.posY = posY;
		this.sizeX = sizeX;
		this.sizeY = sizeY;
		if(app.mouseX>posX && app.mouseX<posX+sizeX && 
				app.mouseX>posY && app.mouseX<posY+sizeY ) {
	
		}
	}
	
*/
	public void botton() {
		app.rectMode(PConstants.CENTER);
		app.fill(250,150,15);
		app.rect(posX,posY, sizeX, sizeY);
		
		app.textSize(32);
		app.textAlign(PConstants.CENTER);
		app.fill(255);
		app.text("Iniciar Juego", posX,posY);
	}

	/**
	 * @return the startC
	 */
	public StartController getStartC() {
		return startC;
	}

	/**
	 * @param startC the startC to set
	 */
	public void setStartC(StartController startC) {
		this.startC = startC;
	}

	/**
	 * @return the sizeX
	 */
	public int getSizeX() {
		return sizeX;
	}

	/**
	 * @param sizeX the sizeX to set
	 */
	public void setSizeX(int sizeX) {
		this.sizeX = sizeX;
	}

	/**
	 * @return the sizeY
	 */
	public int getSizeY() {
		return sizeY;
	}

	/**
	 * @param sizeY the sizeY to set
	 */
	public void setSizeY(int sizeY) {
		this.sizeY = sizeY;
	}

	/**
	 * @return the posX
	 */
	public int getPosX() {
		return posX;
	}

	/**
	 * @param posX the posX to set
	 */
	public void setPosX(int posX) {
		this.posX = posX;
	}

	/**
	 * @return the posY
	 */
	public int getPosY() {
		return posY;
	}

	/**
	 * @param posY the posY to set
	 */
	public void setPosY(int posY) {
		this.posY = posY;
	}
}

