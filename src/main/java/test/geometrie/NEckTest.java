package main.java.test.geometrie;

import java.util.Iterator;

import lejos.utility.Delay;
import main.java.bo.roboter.DruckerRoboter;
import main.java.geometry.NEck;
import main.java.geometry.Vector;

public class NEckTest {
	
	public static void main(String[] args) {
		DruckerRoboter roboter = new DruckerRoboter();
		double x = 5;
		double y = 5;
		roboter.moveSync(x, y);
		boolean first = true;
		Vector temp = null;
		
		NEck eck = new NEck(2, 5);
		Iterator<Vector> iterator = eck.getIterator();
		while(iterator.hasNext()) {
			Vector v = iterator.next();
			if(first) {
				first = false;
				temp = v;
			}
			double x1 = v.getX() + x;
			double y1 = v.getY() + y;		
			roboter.moveSync(x1, y1);
		}
		Delay.msDelay(2000);
	}

}
