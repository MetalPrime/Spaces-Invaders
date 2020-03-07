package model;

import processing.core.PApplet;

public class Bullets {
	
	private PApplet app;
	private float posX;
	private float posY;
	private int size;
	
	public Bullets(PApplet app, float posX, float posY, int size) {
		this.app = app;
		this.posX = posX;
		this.posY = posY;
		this.size = size;
		
	}
	
	public void paint() {
		app.fill(255);
		app.ellipse(posX, posY, size, size);
		
		posY-=10;
	}
	
	public boolean hits(Invaders invader,float EposX, float EposY) {
		float d=PApplet.dist(posX, posY, EposX, EposY);
		
		if(d<40) {
			return true;
			
		} else {
			return false;
			
		}
	}
}
