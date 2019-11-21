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
		robotor.moveSync(1.98,2.62,false);
		robotor.moveSync(2.05,3.16,true);
		robotor.moveSync(2.12,3.7,true);
		robotor.moveSync(2.12,4.27,true);
		robotor.moveSync(2.12,4.84,true);
		robotor.moveSync(2.12,5.38,true);
		robotor.moveSync(2.08,5.91,true);
		robotor.moveSync(1.92,6.42,true);
		robotor.moveSync(1.61,6.96,true);
		robotor.moveSync(1.18,7.49,true);
		robotor.moveSync(1.01,7.63,true);
		//==================new Object ============
		robotor.moveSync(1.18,3.23,false);
		robotor.moveSync(1.58,2.72,true);
		robotor.moveSync(2.15,2.45,true);
		robotor.moveSync(2.69,2.32,true);
		robotor.moveSync(3.26,2.32,true);
		robotor.moveSync(3.8,2.49,true);
		robotor.moveSync(4.07,3.02,true);
		robotor.moveSync(4.1,3.56,true);
		robotor.moveSync(4.07,4.1,true);
		robotor.moveSync(3.76,4.64,true);
		robotor.moveSync(3.23,5.14,true);
		robotor.moveSync(2.72,5.24,true);
		robotor.moveSync(2.69,5.75,true);
		robotor.moveSync(3.02,6.28,true);
		robotor.moveSync(3.43,6.82,true);
		robotor.moveSync(3.73,7.36,true);
		robotor.moveSync(3.73,7.36,true);
		//==================new Object ============
		robotor.moveSync(4.47,6.42,false);
		robotor.moveSync(5.01,6.59,true);
		robotor.moveSync(5.54,6.59,true);
		robotor.moveSync(6.08,6.42,true);
		robotor.moveSync(6.42,5.91,true);
		robotor.moveSync(6.25,5.38,true);
		robotor.moveSync(5.68,5.28,true);
		robotor.moveSync(5.17,5.48,true);
		robotor.moveSync(4.74,6.01,true);
		robotor.moveSync(4.7,6.55,true);
		robotor.moveSync(4.91,7.09,true);
		robotor.moveSync(5.44,7.56,true);
		robotor.moveSync(5.95,7.73,true);
		robotor.moveSync(6.25,7.76,true);
		//==================new Object ============
		robotor.moveSync(7.32,5.78,false);
		robotor.moveSync(7.32,6.32,true);
		robotor.moveSync(7.32,6.89,true);
		robotor.moveSync(7.26,7.43,true);
		robotor.moveSync(7.22,6.92,true);
		robotor.moveSync(7.46,6.35,true);
		robotor.moveSync(8.0,5.95,true);
		robotor.moveSync(8.53,6.15,true);
		robotor.moveSync(9.04,6.55,true);
		robotor.moveSync(9.17,7.09,true);
		robotor.moveSync(9.21,7.59,true);
		//==================new Object ============
		robotor.moveSync(9.88,6.75,false);
		robotor.moveSync(10.45,6.79,true);
		robotor.moveSync(11.05,6.55,true);
		robotor.moveSync(11.56,6.15,true);
		robotor.moveSync(11.16,5.64,true);
		robotor.moveSync(10.62,5.61,true);
		robotor.moveSync(10.11,5.85,true);
		robotor.moveSync(9.84,6.38,true);
		robotor.moveSync(9.81,6.92,true);
		robotor.moveSync(10.01,7.46,true);
		robotor.moveSync(10.55,7.73,true);
		robotor.moveSync(11.09,7.83,true);
		robotor.moveSync(11.22,7.8,true);
		//==================new Object ============
		robotor.moveSync(10.55,4.97,false);
		robotor.moveSync(10.95,4.4,true);
		robotor.moveSync(11.42,3.9,true);
		robotor.moveSync(11.76,3.6,true);

	}

}
