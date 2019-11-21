package main.java.test.roboter;

import lejos.utility.Delay;
import main.java.bo.factories.FactoryProvider;
import main.java.bo.factories.FactoryTyp;
import main.java.bo.factories.MotorFactory;
import main.java.bo.factories.MotorTyp;
import main.java.bo.motoren.Stellung;
import main.java.bo.motoren.StiftMotor;
import main.java.bo.roboter.DruckerRoboter;

public class RoboterTest {
	
	public static void main(String[] args) {
		DruckerRoboter robotor = new DruckerRoboter();
		//==================new Object ============
		robotor.moveSync(5.64,4.0,false);
		robotor.moveSync(5.04,4.0,true);
		robotor.moveSync(4.44,4.0,true);
		robotor.moveSync(4.0,4.54,true);
		robotor.moveSync(3.93,5.14,true);
		robotor.moveSync(3.86,5.78,true);
		robotor.moveSync(3.9,6.32,true);
		robotor.moveSync(3.96,6.85,true);
		robotor.moveSync(4.17,7.36,true);
		robotor.moveSync(4.74,7.56,true);
		robotor.moveSync(5.34,7.32,true);
		robotor.moveSync(5.91,6.89,true);
		robotor.moveSync(6.18,6.28,true);
		robotor.moveSync(6.38,5.71,true);
		robotor.moveSync(6.42,5.17,true);
		robotor.moveSync(6.42,4.6,true);
		robotor.moveSync(5.91,4.17,true);
		robotor.moveSync(5.31,4.07,true);
		robotor.moveSync(4.94,3.86,true);
		//==================new Object ============
		robotor.moveSync(9.44,4.23,false);
		robotor.moveSync(9.98,4.47,true);
		robotor.moveSync(10.55,4.84,true);
		robotor.moveSync(10.99,5.41,true);
		robotor.moveSync(11.56,5.98,true);
		robotor.moveSync(11.86,6.52,true);
		robotor.moveSync(12.03,6.99,true);
		//==================new Object ============
		robotor.moveSync(9.95,6.75,false);
		robotor.moveSync(10.32,6.12,true);
		robotor.moveSync(10.68,5.44,true);
		robotor.moveSync(10.95,4.91,true);
		robotor.moveSync(11.39,4.4,true);
		robotor.moveSync(11.66,4.0,true);
		robotor.moveSync(0, 0, false);

	}

}
