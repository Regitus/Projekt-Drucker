package main.java.codeCreator;

public class CreatorVector {
    private double x;
    private double y;
    private boolean draw;

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

    public String toString(){
        double realX = (CreatorProperties.paintLenght/CreatorProperties.pixel) * x;
        double realY = (CreatorProperties.paintLenght/CreatorProperties.pixel) * y;
        realX = Math.round(realX*100)/100.0;
        realY = Math.round(realY*100)/100.0;
        if(realX <16 && realY <15){
            //return "roboter.move("+realX+","+realY+","+ draw+");";
            return "roboter.moveSync("+realX+","+realY+");";
        } else {
            return "";
        }
    }
}
