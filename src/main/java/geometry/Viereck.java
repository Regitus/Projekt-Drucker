package main.java.geometry;

import java.util.Arrays;
import java.util.List;

public class Viereck extends Polygon {
	
	public Viereck(Vector a, Vector b, Vector c, Vector d) {
		super(create(a,b,c,d));
	}
	
	public static List<Vector> create(Vector a, Vector b, Vector c, Vector d) {
		Vector[] vectors = {a,b,c,d};
		return Arrays.asList(vectors);
	}
	
}
