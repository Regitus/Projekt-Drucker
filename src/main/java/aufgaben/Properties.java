package main.java.aufgaben;

import lejos.hardware.port.MotorPort;
import lejos.hardware.port.Port;
import lejos.hardware.port.SensorPort;

public class Properties {
	public static Port XPort = MotorPort.C;
	public static Port YPort = MotorPort.B;
	public static Port StiftPort = MotorPort.A;
	public static Port LichtSensorPort = SensorPort.S2;
	public static Port TouchSensorPort = SensorPort.S1;
	public static double maxGeschwindigkeit = 1;
}
