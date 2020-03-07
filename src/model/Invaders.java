package model;

import processing.core.PApplet;
import view.Characters;

public class Invaders extends Characters {

	public Invaders(PApplet app, float x, float y, int size, int movX, int movY) {
		super(app, x, y, size, movX, movY);
		// TODO Auto-generated constructor stub
		this.app = app;
		this.x = app.random(0,800);
		this.y = -10;
		this.size = size;
		this.movX = movX;
		this.movY = movY;
	}

	@Override
	public void paint() {
		// TODO Auto-generated method stub
		app.fill(0,0,255);
		app.rect(x,y,size,size);
		
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub
		y+=movY;
	}

}
