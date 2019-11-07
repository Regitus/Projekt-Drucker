package main.java.bo.motoren;

import lejos.hardware.motor.EV3LargeRegulatedMotor;
import lejos.hardware.port.Port;
import main.java.bo.MathUtil;

public class AchsenMotor extends Motor {
	private double letztePosition = 0;
	private static final int UMFANG = 4;
	
	public AchsenMotor(Port port) {
		super(port);
	}
	
	public void positionaendern(double position, double time) {
		double differenz = position - letztePosition;
		if(differenz < 0) {
			super.getMotor().forward();
		}
		else {
			super.getMotor().backward();
		}
		differenz = Math.abs(differenz);
		
		super.move(differenz, time, UMFANG);
		letztePosition = position;
	}
	
	public double getPosition() {
		return letztePosition;
	}

}
