package view;

import model.Logic;
import processing.core.PApplet;

public class Main extends PApplet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PApplet.main(Main.class.getName());
	}
	
	 StartScreen startS;
	 int screens;
	
	public void settings() {
		size(800,800);
		
	}
	
	public void setup() {
		startS = new StartScreen(this);
		screens= 0;
	}
	
	public void draw() {
		switch(screens) {
		case 0:
			startS.paint();
			break;
		case 1:
			
			break;
		case 2:
			break;
		}
		
	}
	
	public void keyPressed() {
		
	}
	
	public void mousePressed() {
		
	}
}
