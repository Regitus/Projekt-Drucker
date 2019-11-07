package main.java.test.motor;

import lejos.utility.Delay;
import main.java.bo.factories.FactoryProvider;
import main.java.bo.factories.FactoryTyp;
import main.java.bo.factories.MotorFactory;
import main.java.bo.factories.MotorTyp;
import main.java.bo.motoren.AchsenMotor;
import main.java.bo.motoren.Stellung;
import main.java.bo.motoren.StiftMotor;

public class MotorTest {

	public static void main(String[] args) {
		FactoryProvider factoryProvider = new FactoryProvider();
		MotorFactory motorFactory = (MotorFactory) factoryProvider.getFactory(FactoryTyp.MotorFactory);
		//StiftMotor stiftMotor = (StiftMotor) motorFactory.create(MotorTyp.StiftMotor);
		AchsenMotor yMotor = (AchsenMotor) motorFactory.create(MotorTyp.YAchsenMotor);
		//AchsenMotor xMotor = (AchsenMotor) motorFactory.create(MotorTyp.XAchsenMotor);
		//stiftMotor.positionaendern(Stellung.OBEN);
		double time = 0.5;
		
		yMotor.positionaendern(5, time);
		//xMotor.positionaendern(1, 1);
		Delay.msDelay((long) (time * 1000));
		yMotor.stop();
		/*yMotor.positionaendern(0, time);
		Delay.msDelay((long) (time * 1000));
		yMotor.stop();*/
		
	}

}
