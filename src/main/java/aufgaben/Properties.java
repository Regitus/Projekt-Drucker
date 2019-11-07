package main.java.aufgaben;

import lejos.hardware.port.MotorPort;
import lejos.hardware.port.Port;
import lejos.hardware.port.SensorPort;
/**
 * Klasse mit Variabeln für Ports. Anpassen bei anderen Geräten 
 * 
 *
 */
public class Properties {
	public static Port XPort = MotorPort.C;
	public static Port YPort = MotorPort.B;
	public static Port StiftPort = MotorPort.A;
<<<<<<< HEAD
	public static Port LichtSensorPort = SensorPort.S1;
	public static Port TouchSensorPort = SensorPort.S2;
	public static double maxGeschwindigkeit = 1;
=======
	public static Port LichtSensorPort = SensorPort.S2;
	public static Port TouchSensorPort = SensorPort.S1;
>>>>>>> branch 'Meister' of https://github.com/Regitus/Projekt-Drucker.git
}
