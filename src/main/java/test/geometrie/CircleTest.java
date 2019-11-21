package main.java.test.geometrie;

import java.util.Iterator;

import lejos.utility.Delay;
import main.java.bo.roboter.DruckerRoboter;
import main.java.geometry.Circle;
import main.java.geometry.Vector;

public class CircleTest {
	public static void main(String[] args) {
		DruckerRoboter roboter = new DruckerRoboter();
		
		Vector initPosition = new Vector(5, 5);
		move(roboter, initPosition, false);
		
		Circle eck = new Circle(2);	
		Iterator<Vector> iterator = eck.getIterator();
		
		Vector v = iterator.next();
		move(roboter, Vector.add(v, initPosition), false);
		
		while(iterator.hasNext()) {
			v = iterator.next();
			Vector newVector = Vector.add(initPosition, v);
			move(roboter, newVector, true);
		}
		
		Delay.msDelay(2000);
	}
	
	public static void move(DruckerRoboter roboter, Vector vector, boolean draw) {
		roboter.moveSync(vector.getX(), vector.getY(), draw);
	}
}
