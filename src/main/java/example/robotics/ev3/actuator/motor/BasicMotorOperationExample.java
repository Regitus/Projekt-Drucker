package example.robotics.ev3.actuator.motor;

import ev3dev.actuators.lego.motors.EV3LargeRegulatedMotor;
import lejos.hardware.port.MotorPort;
import lejos.utility.Delay;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

class BasicMotorOperationExample {

    public static Logger LOGGER = LoggerFactory.getLogger(BasicMotorOperationExample.class);

    public static int DELAY = 2000; //2 Sedonds

    public static final EV3LargeRegulatedMotor mA1 = new EV3LargeRegulatedMotor(MotorPort.A);
    public static final EV3LargeRegulatedMotor mB1 = new EV3LargeRegulatedMotor(MotorPort.B);
    public static final EV3LargeRegulatedMotor mC1 = new EV3LargeRegulatedMotor(MotorPort.C);

    public static void main(String[] args) {
        testDerMotoren(mA1);
        testDerMotoren(mB1);
        testDerMotoren(mC1);
    }

    public static void testDerMotoren( EV3LargeRegulatedMotor mA){
        LOGGER.info("Starting motors on A");
        mA.setSpeed(500);
        mA.brake();

        /*
        LOGGER.info("Forward");
        mA.forward();
        LOGGER.info("Large Motor is moving: {}, at speed {}", mA.isMoving(), mA.getSpeed());
        Delay.msDelay(DELAY);*/

        LOGGER.info("Stop");
        mA.stop();
        LOGGER.info("Large Motor is moving: {}, at speed {}", mA.isMoving(), mA.getSpeed());
        Delay.msDelay(DELAY);

        LOGGER.info("Backward");
        mA.backward();
        LOGGER.info("Large Motor is moving: {}, at speed {}", mA.isMoving(), mA.getSpeed());
        Delay.msDelay(2000);

        LOGGER.info("Stop");
        mA.stop();
        LOGGER.info("Large Motor is moving: {}, at speed {}", mA.isMoving(), mA.getSpeed());
        Delay.msDelay(DELAY);
        /*
        LOGGER.info("Forward");
        mA.forward();
        Delay.msDelay(2000);
        mA.stop();
        LOGGER.info("Stop");*/
    }

}
