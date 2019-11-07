package main.java.bo.roboter;

import lejos.utility.Delay;
import main.java.aufgaben.Properties;
import main.java.bo.factories.FactoryProvider;
import main.java.bo.factories.FactoryTyp;
import main.java.bo.factories.MotorFactory;
import main.java.bo.factories.MotorTyp;
import main.java.bo.factories.SensorFactory;
import main.java.bo.factories.SensorenTyp;
import main.java.bo.motoren.AchsenMotor;
import main.java.bo.motoren.StiftMotor;
import main.java.bo.sensoren.LichtSensor;
import main.java.bo.sensoren.TouchSensor;

public class DruckerRoboter {

	private AchsenMotor yAchsenMotor;
	private AchsenMotor xAchsenMotor;
	private StiftMotor stiftMotor;
	private LichtSensor lichtSensor;
	private TouchSensor touchSensor;
	
	public DruckerRoboter () {
		FactoryProvider factoryProvider = new FactoryProvider();
		MotorFactory motorFactory = (MotorFactory) factoryProvider.getFactory(FactoryTyp.MotorFactory);
		stiftMotor = (StiftMotor) motorFactory.create(MotorTyp.XAchsenMotor);
		yAchsenMotor = (AchsenMotor) motorFactory.create(MotorTyp.YAchsenMotor);
		xAchsenMotor = (AchsenMotor) motorFactory.create(MotorTyp.StiftMotor);
		SensorFactory sensorFactory = (SensorFactory) factoryProvider.getFactory(FactoryTyp.SensorenFactory);
		lichtSensor = (LichtSensor) sensorFactory.create(SensorenTyp.LichtSensor);
		touchSensor = (TouchSensor) sensorFactory.create(SensorenTyp.TouchSensor);
	}
	
	public void move(double x, double y) {
		double time;
		if(x>y) {
			time = x * Properties.maxGeschwindigkeit;
		} else {
			time = y * Properties.maxGeschwindigkeit;
		}
		yAchsenMotor.positionaendern(x, time);
		xAchsenMotor.positionaendern(y, time);
		int msTime = (int) (1000 * time);
		Delay.msDelay(msTime);
	}
	
	
}