package main.java.test.senor;

import main.java.bo.factories.FactoryProvider;
import main.java.bo.factories.FactoryTyp;
import main.java.bo.factories.MotorFactory;
import main.java.bo.factories.SensorFactory;
import main.java.bo.factories.SensorenTyp;
import main.java.bo.sensoren.LichtSensor;
import main.java.bo.sensoren.TouchSensor;

public class SensorTest {

	public static void main(String[] args) throws InterruptedException {
		FactoryProvider factoryProvider = new FactoryProvider();
		SensorFactory sensorFactory = (SensorFactory) factoryProvider.getFactory(FactoryTyp.SensorenFactory);
		LichtSensor lichtSensor = (LichtSensor) sensorFactory.create(SensorenTyp.LichtSensor);
		TouchSensor touchSensor= (TouchSensor) sensorFactory.create(SensorenTyp.TouchSensor);
		
		while (!touchSensor.isPressed())
		{
			System.out.println("Nicht gedrückt");
		}
		
		while (!lichtSensor.isPressed())
		{
			System.out.println("Lichttest");
			Thread.sleep(1000);
		}
	
	}

}
