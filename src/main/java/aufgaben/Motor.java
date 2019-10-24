package aufgaben;

import ev3dev.actuators.lego.motors.EV3LargeRegulatedMotor;
import lejos.hardware.port.MotorPort;
import lejos.utility.Delay;

public class Motor {

    public static void move(double laenge, double seconds) {
        EV3LargeRegulatedMotor mA = new EV3LargeRegulatedMotor(MotorPort.B);
        double radius = 12 / (2 * Math.PI);
        double grad = (laenge * 180) / (Math.PI * radius);
        double gradPerSecond = grad / seconds;
        mA.setSpeed((int) gradPerSecond);
        Delay.msDelay((long)seconds * 1000);
    }

}
