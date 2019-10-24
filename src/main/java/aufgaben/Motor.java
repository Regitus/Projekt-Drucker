package main.java.aufgaben;

import lejos.hardware.motor.*;
import lejos.hardware.port.MotorPort;
import lejos.hardware.port.Port;
import lejos.utility.Delay;

public class Motor {

    public static void move(double laenge, double seconds, Port mp) {
        EV3LargeRegulatedMotor mA = new EV3LargeRegulatedMotor(mp);
        double radius = 4 / (2 * Math.PI);
        double grad = (laenge * 180) / (Math.PI * radius);
        double gradPerSecond = grad / seconds;
        mA.setSpeed((int) gradPerSecond);
        mA.backward();
        Delay.msDelay((long)seconds * 1000);
        mA.stop();
    }


    public static void move(double x, double y, double seconds){
        EV3LargeRegulatedMotor mA = new EV3LargeRegulatedMotor(MotorPort.A);
        EV3LargeRegulatedMotor mB = new EV3LargeRegulatedMotor(MotorPort.B);
        double radius = 4 / (2 * Math.PI);

        double gradA = (x * 180) / (Math.PI * radius);
        double gradPerSecondA = gradA / seconds;

        double gradB = (y * 180) / (Math.PI * radius);
        double gradPerSecondB = gradB / seconds;


        mA.setSpeed((int) gradPerSecondA);
        mA.backward();

        mB.setSpeed((int) gradPerSecondB);
        mB.backward();

        Delay.msDelay((long)seconds * 1000);
        mA.stop();
        mB.stop();
    }

    public static void movesync(double x, double y, double seconds){
        EV3LargeRegulatedMotor mA = new EV3LargeRegulatedMotor(MotorPort.A);
        EV3LargeRegulatedMotor mB = new EV3LargeRegulatedMotor(MotorPort.B);
        EV3LargeRegulatedMotor liste[] = new EV3LargeRegulatedMotor[1];
        liste[0] = mB;
        double radius = 4 / (2 * Math.PI);

        double gradA = (x * 180) / (Math.PI * radius);
        double gradPerSecondA = gradA / seconds;

        double gradB = (y * 180) / (Math.PI * radius);
        double gradPerSecondB = gradB / seconds;


        mA.setSpeed((int) gradPerSecondA);


        mB.setSpeed((int) gradPerSecondB);

        /*
        Synchronisierung
         */
        mA.synchronizeWith(liste);  //Im Array ist mB derzeit drin
        mA.startSynchronization();  //Alles ab hier läuft gleichzeitig.
        mA.backward();
        //mB.backward();
        Delay.msDelay((long)seconds * 1000);
        mA.stop();
        //mB.stop();
        mA.endSynchronization();    //Alles läuft wieder getrennt
    }




}
