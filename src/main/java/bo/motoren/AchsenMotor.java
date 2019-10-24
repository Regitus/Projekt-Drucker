package main.java.bo.motoren;

import lejos.hardware.motor.EV3LargeRegulatedMotor;
import lejos.hardware.port.Port;
import main.java.bo.MathUtil;

public class AchsenMotor extends Motor {
	private int letztePosition;
	private static final int RADIUS = 4;
	
	public AchsenMotor(Port port) {
		super(port);
	}
	
	public void positionaendern(int position, int time) {
		int differenz = position - letztePosition;
		double gradProSekunde = MathUtil.toDegree(position, time, RADIUS);
		super.getMotor().setSpeed((int)gradProSekunde);
	}

}
