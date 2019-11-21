package main.java.bo.motoren;

import lejos.hardware.motor.EV3LargeRegulatedMotor;
import lejos.hardware.port.Port;
import lejos.robotics.RegulatedMotor;
import main.java.bo.MathUtil;

public abstract class Motor{
	private EV3LargeRegulatedMotor motor;
	private int speed;
	
	public Motor(Port port) {
		this.motor = new EV3LargeRegulatedMotor(port);
	}
	
	public void move(double differenz, double time, double umfang) {
		double gradProSekunde = MathUtil.toDegree(differenz, time, umfang);
		speed = (int) gradProSekunde;
		System.out.println("GradproSekunde: " + (int)gradProSekunde);
		motor.setSpeed((int)gradProSekunde);
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
	/**
	 * Stoppt die Bewegung
	 */
	public void stop()
	{
		this.motor.stop();
	}
	
	public void trueStop() {
		this.motor.stop(true);
	}
	
	public void floatStop() {
		this.motor.flt();
	}
	
	public void trueFloatStop() {
		this.motor.flt(true);
	}
	
	public void waitComplete() {
		this.motor.waitComplete();
	}
	
	public int getSpeed() {
		return speed;
	}
	
}
