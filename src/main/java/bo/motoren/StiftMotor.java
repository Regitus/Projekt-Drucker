package main.java.bo.motoren;

import lejos.hardware.port.Port;
/**
 * Handling von dem Stiftmotor. Der Stift wird "Oben" erwartet. Das Blatt wird also nicht berührt.
 * Es gibt eine Methode, die mit einem Parameter aus der ENUM "Stellung" diese wechselt.
 * @author Doku: René
 *
 */
public class StiftMotor extends Motor{
	
	/**
	 * Speichert die Stellung in der der Stift gerade ist.
	 * Programmstart: Stellung.OBEN
	 */
	private Stellung lastStellung = Stellung.OBEN;
	
	/**
	 * Konstruktor der den Port des Motors erwartet mit dem der Stift kontrolliert wird.
	 * @param port Port an dem der Stiftmotor liegt.
	 */
	public StiftMotor(Port port) {
		super(port);
	}
	
	/**
	 * Wechselt die Position abhängig von dem Parameter
	 * @param stellung Aus dem ENUM Stellung kann hier OBEN oder UNTEN mitgegeben werden.
	 */
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
