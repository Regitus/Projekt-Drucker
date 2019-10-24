package main.java.threads;

import ev3dev.actuators.lego.motors.EV3LargeRegulatedMotor;
import ev3dev.sensors.ev3.EV3TouchSensor;
import example.robotics.ev3.sensor.TouchSensorExample;
import lejos.robotics.SampleProvider;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class StopClass extends Thread
{
    /**
     * Nicht funktionierend
     */
    private EV3TouchSensor touch1;
    Thread tmpThread;
    EV3LargeRegulatedMotor motor;
    private static Logger logger = LoggerFactory.getLogger(TouchSensorExample.class);
    public StopClass(EV3TouchSensor touch, Thread tt, EV3LargeRegulatedMotor motor)
    {
        touch1 = touch;
        tmpThread = tt;
        this.motor = motor;
    }

    @Override
    public void run() {
        final SampleProvider sp = touch1.getTouchMode();
        int touchValue = 0;
        while(touchValue != 1)
        {

            float [] sample = new float[sp.sampleSize()];
            sp.fetchSample(sample, 0);
            touchValue = (int) sample[0];
        }
        motor.stop();
        tmpThread.interrupt();
    }
}
