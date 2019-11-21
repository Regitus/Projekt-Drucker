package main.java.test.roboter;

import main.java.bo.roboter.DruckerRoboter;

public class RoboterTest {
	
	public static void main(String[] args) {
		DruckerRoboter roboter = new DruckerRoboter();
<<<<<<< HEAD
//		roboter.move(0, 4);
//		roboter.move(4, 4);
		//roboter.move(4,  0);
		//roboter.move(0, 0);
		roboter.moveSync(0, 4);
		roboter.moveSync(4, 4);
=======
		System.out.println("Start - Stift 1");
		roboter.move(0.22, 0.22);
		System.out.println("Stift 2");
		roboter.move(0.44, 0);
		System.out.println("Stift 3");
		roboter.move(0.33,  0.11);
		System.out.println("Stift 4");
		roboter.move(0.11, 0.11);
		/*roboter.moveSync(2, 2);
>>>>>>> branch 'Meister' of https://github.com/Regitus/Projekt-Drucker.git
		roboter.moveSync(4, 0);
<<<<<<< HEAD
		roboter.moveSync(0, 0);
=======
		roboter.moveSync(3, 1);
		roboter.moveSync(1, 1);*/




>>>>>>> branch 'Meister' of https://github.com/Regitus/Projekt-Drucker.git
		
	}

}
