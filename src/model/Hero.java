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
		
		
		bullets = new ArrayList <Bullets>(5);
		
	}

	@Override
	public void paint() {
		// TODO Auto-generated method stub
		app.fill(255,0,0);
		app.rect(x,y,size,size);
		
		for (int i=0; i<bullets.size(); i++) {
			bullets.get(i).paint();
			
		}
	}

	@Override
	public void move() {
		
		// TODO Auto-generated method stub
		if(app.keyCode == PConstants.RIGHT ) {
			x+=movX;
			System.out.println("gf");
		}
		if(app.keyCode == PConstants.LEFT) {
			x-=movX;
		}
	}
	
	public void shot() {
		
			bullets.add(new Bullets(app, x, y, 20));
			
		
	}
	
}

	
