package controler;

import processing.core.PApplet;

public class StartController {
	
	private PApplet app;
	private int posX;
	private int posY;
	private int sizeX;
	private int sizeY;
	
	
public StartController(PApplet app) {
	this.app = app;
}	

public int changeScreen(int posX,int posY,int sizeX,int sizeY) {
	this.posX = posX;
	this.posY = posY;
	this.sizeX = sizeX;
	this.sizeY = sizeY;
	int valor=0;
	if(app.mouseX>posX && app.mouseX<posX+sizeX && 
			app.mouseX>posY && app.mouseX<posY+sizeY ) {
		
	}
	return valor;
}

}


