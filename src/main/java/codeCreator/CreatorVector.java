package main.java.codeCreator;

public class CreatorVector {
    private double x;
    private double y;
    private boolean draw;
    private double realX;
    private double realY;
    
    
    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public boolean isDraw() {
        return draw;
    }

    public void setDraw(boolean draw) {
        this.draw = draw;
    }
    
    public double getRealX() {
    	return realX;
    }
    
    public double getRealY() {
    	return realY;
    }

    public void getRealPositions(){
        realX = (CreatorProperties.paintLenght/CreatorProperties.pixel) * x;
        realY = (CreatorProperties.paintLenght/CreatorProperties.pixel) * y;
        realX = Math.round(realX*100)/100.0;
        realY = Math.round(realY*100)/100.0;
    }
}
