package model;

import java.util.ArrayList;

import processing.core.PApplet;
import view.StartScreen;

public class Logic {
	
	private PApplet app;
	private Hero hero;
	private ArrayList<Invaders> invaders;
	

	public Logic(PApplet app) {
		this.app = app;
		 hero = new Hero(app, app.width/2, app.height*1/5, 100, 10, 0);
	}
	
	public void paint() {
		hero.paint();
		
	}

	public void move() {
		// TODO Auto-generated method stub
		hero.move();
		
	}
	
}
