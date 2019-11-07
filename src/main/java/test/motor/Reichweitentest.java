package main.java.test.motor;

import lejos.utility.Delay;
import main.java.bo.factories.FactoryProvider;
import main.java.bo.factories.FactoryTyp;
import main.java.bo.factories.MotorFactory;
import main.java.bo.factories.MotorTyp;
import main.java.bo.factories.SensorFactory;
import main.java.bo.factories.SensorenTyp;
import main.java.bo.motoren.AchsenMotor;
import main.java.bo.sensoren.TouchSensor;

public class Reichweitentest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FactoryProvider factoryProvider = new FactoryProvider();
		MotorFactory motorFactory = (MotorFactory) factoryProvider.getFactory(FactoryTyp.MotorFactory);
		AchsenMotor yMotor = (AchsenMotor) motorFactory.create(MotorTyp.YAchsenMotor);
		
		FactoryProvider factoryProviderSensor = new FactoryProvider();
		SensorFactory sensorFactory = (SensorFactory) factoryProviderSensor.getFactory(FactoryTyp.SensorenFactory);
		TouchSensor touchSensor= (TouchSensor) sensorFactory.create(SensorenTyp.TouchSensor);
		
		int i = -1;
		while (!touchSensor.isPressed())
		{
			yMotor.positionaendern(i, 0.5);
			System.out.println("i= " + i);
			Delay.msDelay(500);
			yMotor.stop();
			i--;
		}
		
		/*for (int y = 0; y < 16; y++) {
			yMotor.positionaendern(y, 0.5);
			System.out.println("y= " + y);
			Delay.msDelay(500);
			yMotor.stop();
			
		}*/
		
		/*i += 2;
		int anzahl = 0;
		anzahl++;
		System.out.println(anzahl);
		yMotor.positionaendern(i, 1);
		Delay.msDelay(1000);
		yMotor.stop();
		
		i++;
		while (!touchSensor.isPressed())
		{
			anzahl++;
			System.out.println(anzahl + "i= " + i);
			yMotor.positionaendern(i, 1);
			Delay.msDelay(1000);
			yMotor.stop();
			
			i++;
		}
		System.out.println(anzahl);
		Delay.msDelay(3000);*/
		

	}

}
