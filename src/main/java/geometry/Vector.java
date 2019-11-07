package main.java.geometry;

public class Vector {
	
	private double x;
	private double y;
	private boolean draw;
	
	public Vector(double x, double y, boolean draw) {
		this.x = x;
		this.y = y;
		this.draw = draw;
	}
	
	public double getX() {
		return x;
	}
	
	public double getY() {
		return y;
	}
	
	public boolean shouldDraw() {
		return draw;
	}

}
