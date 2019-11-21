package main.java.geometry;

public class Vector {
	
	private double x;
	private double y;
	
	public Vector(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	public double getX() {
		return x;
	}
	
	public double getY() {
		return y;
	}
	
	public static Vector minus(Vector a, Vector b) {
		double x = a.getX() - b.getX();
		double y = a.getY() - b.getY();
		return new Vector(x, y);
	}
	
	public static Vector add(Vector a, Vector b) {
		double x = a.getX() + b.getX();
		double y = a.getY() + b.getY();
		return new Vector(x, y);
	}

}
