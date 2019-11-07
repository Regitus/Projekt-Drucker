package main.java.geometry;

import java.util.List;
import java.util.ArrayList;;

public class NEck extends Polygon {
	
	public NEck(double radius, int n) {
		super(create(radius, n));
	}
	
	private static List<Vector> create(double radius, int n) {
		final double gradDistance = 360 / n;
		final Vector firstVector = new Vector(0, radius, false);
		
		List<Vector> list = new ArrayList<>();
		list.add(firstVector);
		for(int i = 1; i < n; i++) {
			double grad = gradDistance * i;
			Vector v = Matrix.getRotatedVector(grad, firstVector);
			list.add(v);
		}
		
		return list;
	}
}
