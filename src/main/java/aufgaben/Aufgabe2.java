package main.java.aufgaben;

import lejos.hardware.port.MotorPort;
import lejos.hardware.port.Port;
import lejos.hardware.port.SensorPort;
import lejos.hardware.sensor.EV3TouchSensor;

import com.jcraft.jsch.*;

import lejos.hardware.motor.*;
import lejos.robotics.SampleProvider;
import lejos.utility.Delay;


public class Aufgabe2 {
    public static final EV3LargeRegulatedMotor mA = new EV3LargeRegulatedMotor(MotorPort.B);
    
    //Robot Configuration
    private static EV3TouchSensor touch1 = new EV3TouchSensor(SensorPort.S2);

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

            //LOGGER.info("Iteration: {}, Touch: {}", touchValue);

           // Delay.msDelay(HALF_SECOND);
            if(touchValue == 0){
                mA.setSpeed(200);
               // mA.stop();
                System.out.println("Forward");
                mA.forward();
                Delay.msDelay(200);
                //mA.stop();
                System.out.println("Stop");
            }
        }
        mA.setSpeed(500);
        mA.stop();
        mA.backward();
        Delay.msDelay(1000);
        mA.stop();
        //LOGGER.info("Stop");
        mA.close();
        //Motor.move(10,1, MotorPort.B);
        System.out.println("Starte Sync");
        Motor.movesync(5, 5, 5);


    }

}
