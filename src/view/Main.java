package view;

import model.Logic;
import processing.core.PApplet;

public class Main extends PApplet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PApplet.main(Main.class.getName());
	}
	
	 StartScreen startS;
	 GameScreen GameS;
	 OverScreen OverS;
	 int screens;
	
	public void settings() {
		size(800,800);
		
	}
	
	public void setup() {
		startS = new StartScreen(this);
		GameS = new GameScreen(this,this);
		OverS = new OverScreen(this);
		screens= 0;
	}
	
	public void draw() {
		switch(screens) {
		case 0:
			startS.paint();
			//System.out.println(screens);
			break;
		case 1:
			GameS.paint();
			break;
		case 2:
			OverS.paint();
			break;
		}
		
	}
	
	public void keyPressed() {
		
	}
	
	public void mouseClicked() {
		switch(screens) {
		case 0:
			if(mouseX>startS.getPosX() && mouseX<startS.getPosX()+startS.getSizeX() && 
				mouseY>startS.getPosY() && mouseY<startS.getPosY()+startS.getSizeY() ) {
				screens = 1;
				System.out.println(screens);
			}
			break;
		case 1:
			
			break;
		case 2:
			break;
		}
	}
}
