package main.java.test.motor;

import main.java.bo.factories.FactoryProvider;
import main.java.bo.factories.FactoryTyp;
import main.java.bo.factories.MotorFactory;
import main.java.bo.factories.MotorTyp;
import main.java.bo.motoren.AchsenMotor;
import main.java.bo.motoren.StiftMotor;

public class MotorTest {

	public static void main(String[] args) {
		FactoryProvider factoryProvider = new FactoryProvider();
		MotorFactory motorFactory = (MotorFactory) factoryProvider.getFactory(FactoryTyp.MotorFactory);
		StiftMotor stiftMotor = (StiftMotor) motorFactory.create(MotorTyp.XAchsenMotor);
		AchsenMotor yMotor = (AchsenMotor) motorFactory.create(MotorTyp.YAchsenMotor);
		AchsenMotor xMotor = (AchsenMotor) motorFactory.create(MotorTyp.StiftMotor);
	}

}
