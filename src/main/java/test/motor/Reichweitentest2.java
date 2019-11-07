package main.java.test.motor;

import lejos.utility.Delay;
import main.java.bo.factories.FactoryProvider;
import main.java.bo.factories.FactoryTyp;
import main.java.bo.factories.MotorFactory;
import main.java.bo.factories.MotorTyp;
import main.java.bo.factories.SensorFactory;
import main.java.bo.factories.SensorenTyp;
import main.java.bo.motoren.AchsenMotor;
import main.java.bo.sensoren.LichtSensor;
import main.java.bo.sensoren.TouchSensor;

public class Reichweitentest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FactoryProvider factoryProvider = new FactoryProvider();
		MotorFactory motorFactory = (MotorFactory) factoryProvider.getFactory(FactoryTyp.MotorFactory);
		AchsenMotor xMotor = (AchsenMotor) motorFactory.create(MotorTyp.XAchsenMotor);
		
		FactoryProvider factoryProviderSensor = new FactoryProvider();
		SensorFactory sensorFactory = (SensorFactory) factoryProviderSensor.getFactory(FactoryTyp.SensorenFactory);
		LichtSensor lichtSens= (LichtSensor) sensorFactory.create(SensorenTyp.LichtSensor);
		
		int i = -1;
		while (lichtSens.isPressed())
		{
			xMotor.positionaendern(i, 1);
			System.out.println("i= " + i);
			Delay.msDelay(1000);
			xMotor.stop();
			i--;
		}
		
		
		

	}

}
