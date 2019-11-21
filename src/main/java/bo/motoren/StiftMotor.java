package main.java.bo.motoren;

//import lejos.hardware.motor.EV3LargeRegulatedMotor;
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
			super.getMotor().rotateTo(0);
			lastStellung = Stellung.OBEN;
		}
		else {
			super.getMotor().rotateTo(90);
			lastStellung = Stellung.UNTEN;
		}

	}
	
}
