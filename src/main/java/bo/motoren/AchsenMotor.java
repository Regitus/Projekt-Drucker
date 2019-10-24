package main.java.bo.motoren;

import lejos.hardware.motor.EV3LargeRegulatedMotor;
import lejos.hardware.port.Port;

public class AchsenMotor extends Motor {
	private int letztePosition;
	
	
	public AchsenMotor(Port port) {
		super(port);
	}
	
	public void positionÄndern(int position, int time) {
		
	}



}
