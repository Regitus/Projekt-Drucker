package main.java.test.roboter;

import main.java.bo.roboter.DruckerRoboter;

public class RoboterTest {
	
	public static void main(String[] args) {
		DruckerRoboter roboter = new DruckerRoboter();
		roboter.move(2, 2);
		roboter.move(4, 0);
		roboter.move(3,  1);
		roboter.move(1, 1);
		/*roboter.moveSync(2, 2);
		roboter.moveSync(4, 0);
		roboter.moveSync(3, 1);
		roboter.moveSync(1, 1);*/
		
	}

}
