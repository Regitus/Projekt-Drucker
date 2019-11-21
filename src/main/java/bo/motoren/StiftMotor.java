package main.java.bo.motoren;

import lejos.hardware.motor.EV3LargeRegulatedMotor;
import lejos.hardware.port.Port;
import lejos.utility.Delay;

public class StiftMotor extends Motor{
	
	private Stellung lastStellung = Stellung.OBEN;
	private static final int OBEN_POSITION = 1;
	private static final int TIME = 1;
	private static final int UMFANG = 4;
	
	public StiftMotor(Port port) {
		super(port);
	}
	
	public void positionaendern(Stellung stellung) {
		if(stellung == lastStellung) {
			return;
		}

		if(stellung == Stellung.OBEN) {
			super.getMotor().forward();
			super.move(OBEN_POSITION, 1, 4);
			lastStellung = Stellung.OBEN;
		}
		else {
			super.getMotor().backward();
			super.move(OBEN_POSITION, TIME, UMFANG+3.8);
			lastStellung = Stellung.UNTEN;
		}
		Delay.msDelay(1000);
		super.stop();
		super.waitComplete();
	}
	
}
