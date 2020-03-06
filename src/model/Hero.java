package model;

import java.util.ArrayList;

import processing.core.PApplet;
import processing.core.PConstants;
import view.Characters;

public class Hero extends Characters {
		
	private ArrayList<Bullets> bullets;
	
	public Hero(PApplet app, float x, float y, int size, int movX, int movY) {
		super(app, x, y, size, movX, movY);
		// TODO Auto-generated constructor stub
		this.app = app;
		this.x = x;
		this.y = y;
		this.size = size;
		this.movX = movX;
		this.movY = movY;

}

	@Override
	public void paint() {
		// TODO Auto-generated method stub
		app.fill(255,0,0);
		app.rect(x,y,size,size);
		
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub
		if(app.key == PConstants.RIGHT) {
			
		}
		if() {}
	}
	
}

	
