package main.java.geometry;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Polygon {
	protected List<Vector> vector = new ArrayList<Vector>();
	
	public Polygon(List<Vector> vectors) {
		this.vector.addAll(vectors);
	}
	
	public Iterator<Vector> getIterator() {
		return vector.iterator();
	}
	
}
