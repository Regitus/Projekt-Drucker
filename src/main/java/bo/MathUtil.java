package main.java.bo;

public class MathUtil {
	
	public static double toDegree(double length, double seconds, double radius) {
        double grad = (length * 180) / (Math.PI * radius);
        double gradPerSecond = grad / seconds;
        return gradPerSecond;
	}
	
}
