package main.java.bo.roboter;

import lejos.hardware.motor.EV3LargeRegulatedMotor;
import lejos.hardware.port.MotorPort;
import lejos.hardware.port.SensorPort;
import lejos.hardware.sensor.EV3TouchSensor;
import lejos.robotics.RegulatedMotor;
import lejos.robotics.SampleProvider;
import lejos.utility.Delay;
import main.java.configuration.Properties;
import main.java.bo.factories.FactoryProvider;
import main.java.bo.factories.FactoryTyp;
import main.java.bo.factories.MotorFactory;
import main.java.bo.factories.MotorTyp;
import main.java.bo.factories.SensorFactory;
import main.java.bo.factories.SensorenTyp;
import main.java.bo.motoren.AchsenMotor;
import main.java.bo.motoren.Stellung;
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
		this.moveToBase();
		FactoryProvider factoryProvider = new FactoryProvider();
		MotorFactory motorFactory = (MotorFactory) factoryProvider.getFactory(FactoryTyp.MotorFactory);
		stiftMotor = (StiftMotor) motorFactory.create(MotorTyp.StiftMotor);
		yAchsenMotor = (AchsenMotor) motorFactory.create(MotorTyp.YAchsenMotor);
		xAchsenMotor = (AchsenMotor) motorFactory.create(MotorTyp.XAchsenMotor);
		SensorFactory sensorFactory = (SensorFactory) factoryProvider.getFactory(FactoryTyp.SensorenFactory);
		lichtSensor = (LichtSensor) sensorFactory.create(SensorenTyp.LichtSensor);
		touchSensor = (TouchSensor) sensorFactory.create(SensorenTyp.TouchSensor);
	}	
	
	public void moveSync(double x, double y, boolean draw) {
		double xDifferenz = Math.abs(x - xAchsenMotor.getPosition());
		double yDifferenz = Math.abs(y - yAchsenMotor.getPosition());
		
		double hypothenus = Math.sqrt(Math.pow(xDifferenz, 2) + Math.pow(yDifferenz, 2));
		double time = hypothenus * Properties.zeitFaktor;
		
		
		/*
		 * Liste für gesyncte Motoren, die zu yAchsen bewegt werden sollen
		 */
		EV3LargeRegulatedMotor syncListe[] = new EV3LargeRegulatedMotor[1];
		syncListe[0] = xAchsenMotor.getMotor();
		if(draw) {
			stiftMotor.positionaendern(Stellung.UNTEN);
		} else {
			stiftMotor.positionaendern(Stellung.OBEN);
		}
		
		yAchsenMotor.setzeGeschwindigkeit(x, time);
		xAchsenMotor.setzeGeschwindigkeit(y, time);
		yAchsenMotor.synchronise(syncListe);
		yAchsenMotor.sychroniseStart();
		yAchsenMotor.bewegeMotor(x, time);
		xAchsenMotor.bewegeMotor(y, time);
		yAchsenMotor.synchroniseEnd();
		int msTime = (int) (1000 * time);
		Delay.msDelay(msTime);
				
		yAchsenMotor.sychroniseStart();
		yAchsenMotor.stop();
		yAchsenMotor.waitComplete();
		xAchsenMotor.stop();
		xAchsenMotor.waitComplete();
		yAchsenMotor.synchroniseEnd();
		
	}
	
	private void moveToBase() {
		
	}
	
	
}
