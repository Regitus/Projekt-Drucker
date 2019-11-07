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
	
	public static Vector minus(Vector a, Vector b) {
		double x = a.getX() - b.getX();
		double y = a.getY() - b.getY();
		return new Vector(x, y, true);
	}

}
