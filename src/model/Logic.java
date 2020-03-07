package model;


import java.util.ArrayList;

import processing.core.PApplet;

public class Logic {
	
	private PApplet app;
	private Hero hero;
	private Invaders[] is;
	private ArrayList<Bullets> bullets;

	public Logic(PApplet app) {
		this.app = app;
		 hero = new Hero(app, app.width/2, app.height*4/5, 100, 10, 0);
		 bullets = new ArrayList <Bullets>();
		 is = new Invaders[10];
		 for(int i= 0; i< is.length;i++) {
			 is[i] = new Invaders(app, 50+(i*75), (float) 0.15, 35, 3, 40);
		 }
	}
	
	public void paint() {
		hero.paint();
		
		for (int i=0; i<bullets.size(); i++) {
			bullets.get(i).paint();
			 for(int j= 0; j< is.length;j++) {
					if(bullets.get(i).hits(is[i],is[i].getX(),is[i].getY())) {
				System.out.println("fdfda");
				
				is[j].setX(-50);
					}
					
			 }
		}
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
		
		bullets.add(new Bullets(app, hero.getX(), hero.getY(), 20));
	}
	
}
