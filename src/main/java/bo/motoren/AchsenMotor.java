package main.java.bo.motoren;

import lejos.hardware.motor.EV3LargeRegulatedMotor;
import lejos.hardware.port.Port;
import main.java.bo.MathUtil;

public class AchsenMotor extends Motor {
	private int letztePosition;
	private static final int UMFANG = 4;
	
	public AchsenMotor(Port port) {
		super(port);
	}
	
	public void positionaendern(int position, int time) {
		int differenz = position - letztePosition;
		super.move(differenz, time, UMFANG);
		letztePosition = position;
	}

}
