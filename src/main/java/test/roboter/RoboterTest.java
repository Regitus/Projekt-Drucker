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
		
		FactoryProvider factoryProvider = new FactoryProvider();
		MotorFactory motorFactory = (MotorFactory) factoryProvider.getFactory(FactoryTyp.MotorFactory);
		StiftMotor stiftMotor = (StiftMotor) motorFactory.create(MotorTyp.StiftMotor);
		
		for(int i = 0; i<30; i++) {
			//stiftMotor.positionaendern(Stellung.UNTEN);
			stiftMotor.positionaendern(Stellung.OBEN);
			System.out.println(i);
		}
	
		
	}

}
