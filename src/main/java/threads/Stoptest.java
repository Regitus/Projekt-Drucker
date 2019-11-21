package main.java.threads;

import lejos.hardware.port.MotorPort;
import lejos.hardware.port.SensorPort;
import lejos.hardware.sensor.EV3TouchSensor;

import lejos.hardware.motor.*;

public class Stoptest extends Thread {
	public static final EV3LargeRegulatedMotor mA = new EV3LargeRegulatedMotor(MotorPort.C);

	// Robot Configuration
	public static EV3TouchSensor touch1 = new EV3TouchSensor(SensorPort.S1);

	@Override
	public void run() {

		mA.forward();
		while (true && !this.isInterrupted()) {
			System.out.println("help!");
		}

	}

	@Override
	public void interrupt() {
		// TODO Auto-generated method stub
		super.interrupt();
		mA.stop();
		throw new RuntimeException("TouchValue = 1");
	}

}
