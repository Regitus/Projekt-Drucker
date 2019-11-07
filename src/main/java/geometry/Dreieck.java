package main.java.geometry;

import java.util.Arrays;
import java.util.List;

public class Dreieck extends Polygon {
	
	public Dreieck(Vector a, Vector b, Vector c) {
		super(create(a, b, c));
	}
	
	public static List<Vector> create(Vector a, Vector b, Vector c) {
		Vector[] vectors = {a, b, c};		
		return Arrays.asList(vectors);
	}
	
}
