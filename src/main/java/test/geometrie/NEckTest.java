package main.java.test.geometrie;

import java.util.Iterator;

import lejos.utility.Delay;
import main.java.bo.roboter.DruckerRoboter;
import main.java.geometry.NEck;
import main.java.geometry.Vector;

public class NEckTest {
	
	public static void main(String[] args) {
		DruckerRoboter roboter = new DruckerRoboter();
		
		Vector initPosition = new Vector(5, 5, false);
		move(roboter, initPosition);
		
		NEck eck = new NEck(2, 5);
		
		Iterator<Vector> iterator = eck.getIterator();
		while(iterator.hasNext()) {
			Vector v = iterator.next();
			Vector newVector = Vector.add(initPosition, v);
			move(roboter, newVector);
		}
		
		Delay.msDelay(2000);
	}
	
	public static void move(DruckerRoboter roboter, Vector vector) {
		roboter.moveSync(vector.getX(), vector.getY(), vector.shouldDraw());
	}

}
