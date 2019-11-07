package main.java.aufgaben;

import lejos.hardware.port.MotorPort;
import lejos.hardware.port.Port;
import lejos.hardware.port.SensorPort;

public class Properties {
	public static Port XPort = MotorPort.A;
	public static Port YPort = MotorPort.A;
	public static Port StiftPort = MotorPort.A;
	public static Port LichtSensorPort = SensorPort.S1;
	public static Port TouchSensorPort = SensorPort.S2;
	public static double maxGeschwindigkeit = 1;
}
