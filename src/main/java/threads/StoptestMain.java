package main.java.threads;

import lejos.hardware.port.MotorPort;
import lejos.hardware.port.Port;
import lejos.hardware.port.SensorPort;
import lejos.hardware.sensor.EV3TouchSensor;

import com.jcraft.jsch.*;

import lejos.hardware.motor.*;
import lejos.robotics.SampleProvider;
import lejos.utility.Delay;


public class StoptestMain {


    public static void main(String[] args) {

    	
    	Stoptest st = new Stoptest();
    	
    	StopClass stopClass = new StopClass(st.touch1, new Thread(st), st.mA);
    	stopClass.start();
    	
       // Motor.movesync(5, 5, 5);


    }

}
