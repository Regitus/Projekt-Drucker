package main.java.bo.sensoren;

import lejos.hardware.port.Port;
import lejos.hardware.sensor.EV3TouchSensor;
import lejos.robotics.SampleProvider;

public class TouchSensor extends Sensor {
	private EV3TouchSensor sensor;
	
	public TouchSensor(Port port) {
		super(port);
		this.sensor = new EV3TouchSensor(port);
	}
	
	public boolean isPressed() {
		SampleProvider sp = this.sensor.getTouchMode();
		float [] sample = new float[sp.sampleSize()];
        sp.fetchSample(sample, 0);
        int touchValue = (int) sample[0];
		if(touchValue == 0) {
			return false;
		} else {
			return true;
		}
	}

}
