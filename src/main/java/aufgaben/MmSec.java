package main.java.aufgaben;

import lejos.hardware.port.SensorPort;
import lejos.hardware.sensor.EV3TouchSensor;

public class MmSec
{
    //public static final EV3LargeRegulatedMotor mA = new EV3LargeRegulatedMotor(MotorPort.B);
    //public static Logger LOGGER = LoggerFactory.getLogger(TouchSensorExample.class);

    //Robot Configuration
    private static EV3TouchSensor touch1 = new EV3TouchSensor(SensorPort.S2);

    //Configuration
    private static int HALF_SECOND = 500;

    public static void main(String[] args) {
        //Motor.move(2,5, MotorPort.B);
        Motor.movesync(5,5,5);
    }
}
