package main.java.threads;


public class StoptestMain {


    public static void main(String[] args) {

    	
    	Stoptest st = new Stoptest();
    	
    	StopClass stopClass = new StopClass(st.touch1, st, st.mA);
    	stopClass.start();
    	
       // Motor.movesync(5, 5, 5);


    }

}
