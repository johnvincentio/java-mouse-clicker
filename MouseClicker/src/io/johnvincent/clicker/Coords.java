package io.johnvincent.clicker;

public class Coords {
	private int x;
	private int y;
	
	public Coords(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public int getX() {return x;}
	public int getY() {return y;}
	public boolean isValid() {
		if (x < 1) return false;
		if (y < 1) return false;
		return true;
	}
	public String toString() {
		return "("+getX()+","+getY()+")";
	}
}
