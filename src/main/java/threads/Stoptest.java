package main.java.threads;

import lejos.hardware.port.MotorPort;
import lejos.hardware.port.Port;
import lejos.hardware.port.SensorPort;
import lejos.hardware.sensor.EV3TouchSensor;

import com.jcraft.jsch.*;

import lejos.hardware.motor.*;
import lejos.robotics.SampleProvider;
import lejos.utility.Delay;


public class Stoptest extends Thread{
    public static final EV3LargeRegulatedMotor mA = new EV3LargeRegulatedMotor(MotorPort.C);
    
    //Robot Configuration
    public static EV3TouchSensor touch1 = new EV3TouchSensor(SensorPort.S2);

    //Configuration
    private static int HALF_SECOND = 500;
    
    @Override
    public void run()
    {
    	while(true)
    		{
    	mA.rotate(90);
    		}
    }

}
