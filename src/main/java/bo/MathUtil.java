package main.java.bo;

public class MathUtil {
	
	public static double toDegree(double length, double seconds, double umfang) {
        double grad = (length * 180) / (umfang / 2);
        double gradPerSecond = grad / seconds;
        return gradPerSecond;
	}
	
}
