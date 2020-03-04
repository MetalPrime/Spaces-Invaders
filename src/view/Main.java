package view;

import model.Logic;
import processing.core.PApplet;

public class Main extends PApplet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PApplet.main(Main.class.getName());
	}
	
	 Logic logic;
	
	public void settings() {
		size(800,800);
	}
	
	public void setup() {
		logic = new Logic(this);
	}
	
	public void draw() {
		logic.paint();
	}
	
	public void keyPressed() {
		
	}
	
	public void mousePressed() {
		
	}
}
