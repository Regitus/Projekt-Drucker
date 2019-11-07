package main.java.bo.sensoren;

import lejos.hardware.port.Port;
import lejos.hardware.port.SensorPort;
import lejos.hardware.sensor.EV3IRSensor;
import lejos.robotics.SampleProvider;

public class LichtSensor extends Sensor{
	private EV3IRSensor sensor;

	
	public LichtSensor(Port port) {
		super(port);
		this.sensor = new EV3IRSensor(port); 
	}
	
	public boolean isPressed() {
		SampleProvider sp = this.sensor.getDistanceMode();
		float [] sample = new float[sp.sampleSize()];
        sp.fetchSample(sample, 0);
        int touchValue = (int) sample[0];
		if(touchValue < 20) {
			return false;
		} else {
			return true;
		}
	}
	
	
	

}
