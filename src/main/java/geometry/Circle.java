package main.java.geometry;

public class Circle extends NEck {
	
	private static final int edgesPerRadius = 10;
	
	public Circle(double radius) {
		super(radius, NumberOfEdges(radius));
	}
	
	private static int NumberOfEdges(double radius) {
		return (int) (edgesPerRadius * radius);
	}
	
}
