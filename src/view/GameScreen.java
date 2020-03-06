package view;

import model.Logic;
import processing.core.PApplet;

public class GameScreen {

	private PApplet app;
	private Logic logic;

	public GameScreen(Main main, PApplet app) {
		// TODO Auto-generated constructor stub
		this.app= app;
		logic = new Logic(app);
	}

	public void paint() {
		// TODO Auto-generated method stub
		app.background(0);
		logic.paint();
	}

}
