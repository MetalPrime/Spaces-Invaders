package view;

import processing.core.PApplet;

public abstract class Characters {
	
	protected float x;
	protected float y;
	protected int size;
	protected int movX;
	protected int movY;
	protected PApplet app;
	
	public Characters(PApplet app, float x, float y, int size, int movX, int movY) {
		this.app = app;
		this.x = x;
		this.y = y;
		this.size = size;
		this.movX = movX;
		this.movY = movY;
	}
	
	public abstract void paint();
	
	public abstract void move();

	/**
	 * @return the x
	 */
	public float getX() {
		return x;
	}

	/**
	 * @param x the x to set
	 */
	public void setX(float x) {
		this.x = x;
	}

	/**
	 * @return the y
	 */
	public float getY() {
		return y;
	}

	/**
	 * @param y the y to set
	 */
	public void setY(float y) {
		this.y = y;
	}

	/**
	 * @return the size
	 */
	public int getSize() {
		return size;
	}

	/**
	 * @param size the size to set
	 */
	public void setSize(int size) {
		this.size = size;
	}

	/**
	 * @return the movX
	 */
	public int getMovX() {
		return movX;
	}

	/**
	 * @param movX the movX to set
	 */
	public void setMovX(int movX) {
		this.movX = movX;
	}

	/**
	 * @return the movY
	 */
	public int getMovY() {
		return movY;
	}

	/**
	 * @param movY the movY to set
	 */
	public void setMovY(int movY) {
		this.movY = movY;
	}

	/**
	 * @return the app
	 */
	public PApplet getApp() {
		return app;
	}

	/**
	 * @param app the app to set
	 */
	public void setApp(PApplet app) {
		this.app = app;
	}
	
	
}
