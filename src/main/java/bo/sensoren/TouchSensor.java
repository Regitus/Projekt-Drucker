package main.java.bo.sensoren;

import lejos.hardware.port.Port;
import lejos.hardware.sensor.EV3TouchSensor;

public class TouchSensor extends Sensor {
	private EV3TouchSensor sensor;
	
	public TouchSensor(Port port) {
		super(port);
		this.sensor = new EV3TouchSensor(port);
	}

}
