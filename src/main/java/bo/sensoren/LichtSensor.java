package main.java.bo.sensoren;

import lejos.hardware.port.Port;
import lejos.hardware.sensor.EV3IRSensor;

public class LichtSensor extends Sensor{
	private EV3IRSensor sensor;

	
	public LichtSensor(Port port) {
		super(port);
		this.sensor = new EV3IRSensor(port); 
	}
	
	
	
	
	

}
