package main.java.bo.motoren;

import lejos.hardware.motor.EV3LargeRegulatedMotor;
import lejos.hardware.port.Port;
import lejos.robotics.RegulatedMotor;
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
	
	/**
	 * Aufrufen bevor eine gesyncte Bewegung gemacht werden soll mit der Methode "bewegeMotor"
	 * @param position Neue Position
	 * @param time Dauer der Bewegung
	 */
	public void setzeGeschwindigkeit(double position, double time)
	{
		double differenz = position - letztePosition;
		super.move(differenz, time, UMFANG);
	}
	
	/**
	 * Nur Bewegen, am besten vorher mit setzeGeschwindigkeit den Speed festsetzen
	 * @param position Neue Position
	 * @param time Dauer der Bewegung
	 */
	public void bewegeMotor(double position, double time)
	{
		double differenz = position - letztePosition;
		if(differenz < 0) {
			super.getMotor().forward();
		}
		else {
			super.getMotor().backward();
		}
		
		letztePosition = position;
		
	}

}
