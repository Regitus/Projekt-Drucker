package main.java.bo.sensoren;

import lejos.hardware.port.Port;

public abstract class Sensor {
	private Port port;

	
	public Sensor(Port port) {
		this.port = port;
	}
	
	public boolean isPressed() {
		
		return false;
	
	}

}
