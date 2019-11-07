package main.java.geometry;

public class Matrix {
	
	public static Vector getRotatedVector(double degree, Vector v) {
		double x = v.getX() * Math.cos(degree) - v.getY() * Math.sin(degree);
		double y = v.getX() * Math.sin(degree) + v.getY() * Math.cos(degree);
		return new Vector(x, y, true);
	}
	
}
