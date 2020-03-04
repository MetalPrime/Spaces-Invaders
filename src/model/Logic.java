package model;

import processing.core.PApplet;
import view.StartScreen;

public class Logic {
	
	private PApplet app;
	private StartScreen startS;

	public Logic(PApplet app) {
		this.app = app;
		startS = new StartScreen(app);
	}
	
	public void paint() {
		startS.paint();
	}
	
}
