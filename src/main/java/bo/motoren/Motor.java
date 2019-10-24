package main.java.bo.motoren;

import lejos.hardware.motor.EV3LargeRegulatedMotor;
import lejos.hardware.port.Port;
import lejos.robotics.RegulatedMotor;

public abstract class Motor{
	private EV3LargeRegulatedMotor motor;

	public Motor(Port port) {
		this.motor = new EV3LargeRegulatedMotor(port);
	}
	
	public void move(int position, int time) {
		
	}
	
	public EV3LargeRegulatedMotor getMotor() {
		return motor;
	}
	
	public void synchronise(RegulatedMotor[] syncList) {
		this.motor.synchronizeWith(syncList);
	}
	
	public void sychroniseStart() {
		this.motor.startSynchronization();
	}

	public void synchroniseEnd() {
		this.motor.endSynchronization();
	}
	
}
