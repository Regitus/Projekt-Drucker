package main.java.threads;

import lejos.hardware.motor.EV3LargeRegulatedMotor;
import lejos.hardware.sensor.EV3TouchSensor;
import lejos.robotics.SampleProvider;


public class StopClass extends Thread
{
    /**
     * Nicht funktionierend
     */
    private EV3TouchSensor touch1;
    Thread tmpThread;
    EV3LargeRegulatedMotor motor;
    
    public StopClass(EV3TouchSensor touch, Thread tt, EV3LargeRegulatedMotor motor)
    {
        touch1 = touch;
        tmpThread = tt;
        this.motor = motor;
    }

    @Override
    public void run() {
    	tmpThread.start();
        final SampleProvider sp = touch1.getTouchMode();
        int touchValue = 0;
        while(touchValue != 1)
        {

            float [] sample = new float[sp.sampleSize()];
            sp.fetchSample(sample, 0);
            touchValue = (int) sample[0];
        }
        System.out.println("NotStop!");
        motor.stop();
        tmpThread.interrupt();
    }
}
