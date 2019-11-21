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
        return "robotor.moveSync("+getX()+","+getY()+","+isDraw()+");";
    }
}
