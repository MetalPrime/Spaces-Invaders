package model;


import processing.core.PApplet;

public class Logic {
	
	private PApplet app;
	private Hero hero;
	private Invaders[] is; 

	public Logic(PApplet app) {
		this.app = app;
		 hero = new Hero(app, app.width/2, app.height*4/5, 100, 10, 0);
		 is = new Invaders[60];
		 for(int i= 0; i< is.length;i++) {
			 is[i] = new Invaders(app, 0, 0, 20, 0, 15);
		 }
	}
	
	public void paint() {
		hero.paint();
		 for(int i= 0; i< is.length;i++) {
			 is[i].paint();
			 is[i].move();
		 }
	}

	public void move() {
		// TODO Auto-generated method stub
		hero.move();
		
	}
	
	public void pressed() {
		hero.shot();
	}
	
}
