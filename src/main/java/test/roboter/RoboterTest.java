package main.java.test.roboter;

import main.java.bo.roboter.DruckerRoboter;

public class RoboterTest {
	
	public static void main(String[] args) {
		DruckerRoboter roboter = new DruckerRoboter();
//		roboter.move(0, 4);
//		roboter.move(4, 4);
		//roboter.move(4,  0);
		//roboter.move(0, 0);
		roboter.moveSync(0, 4);
		roboter.moveSync(4, 4);
		roboter.moveSync(4, 0);
		roboter.moveSync(0, 0);
		
	}

}
