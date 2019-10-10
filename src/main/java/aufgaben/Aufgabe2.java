package aufgaben;

import ev3dev.actuators.lego.motors.EV3LargeRegulatedMotor;
import ev3dev.sensors.Battery;
import ev3dev.sensors.ev3.EV3TouchSensor;
import example.robotics.ev3.sensor.TouchSensorExample;
import lejos.hardware.port.MotorPort;
import lejos.hardware.port.Port;
import lejos.hardware.port.SensorPort;
import lejos.robotics.SampleProvider;
import lejos.utility.Delay;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Aufgabe2 {
    public static final EV3LargeRegulatedMotor mA = new EV3LargeRegulatedMotor(MotorPort.B);
    public static Logger LOGGER = LoggerFactory.getLogger(TouchSensorExample.class);

    //Robot Configuration
    private static EV3TouchSensor touch1 = new EV3TouchSensor(SensorPort.S4);

    //Configuration
    private static int HALF_SECOND = 500;

    public static void main(String[] args) {

        final SampleProvider sp = touch1.getTouchMode();
        int touchValue = 0;

        //Control loop
        final int iteration_threshold = 20;
        while (touchValue != 1){

            float [] sample = new float[sp.sampleSize()];
            sp.fetchSample(sample, 0);
            touchValue = (int) sample[0];

            //LOGGER.info("Iteration: {}, Touch: {}", i, touchValue);

           // Delay.msDelay(HALF_SECOND);
            if(touchValue == 0){
                mA.setSpeed(200);
                //mA.brake();
                LOGGER.info("Forward");
                mA.forward();
                Delay.msDelay(200);
                //mA.stop();
                LOGGER.info("Stop");
            }
        }
        mA.setSpeed(500);
        mA.brake();
        mA.backward();
        Delay.msDelay(2000);
        mA.stop();
        LOGGER.info("Stop");

        LOGGER.info("Battery voltage: {}", Battery.getInstance().getVoltage());
        move(10);

    }

    public static void move(int cm){
        EV3LargeRegulatedMotor mA = new EV3LargeRegulatedMotor(MotorPort.B);
        double umfang = 12;
        double gradPerSec = 360/(umfang);
        double umdrehungen = cm / umfang;
        double gradGesamt = umdrehungen * 360;
        mA.setSpeed((int)gradPerSec);
        Delay.msDelay( (long)(gradGesamt/gradPerSec*1000));
    }

}
