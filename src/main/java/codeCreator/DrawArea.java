package main.java.codeCreator;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.util.LinkedList;
import java.util.List;

import javax.swing.JComponent;

/**
 * Component for drawing !
 *
 * @author sylsau
 *
 */
public class DrawArea extends JComponent {

    private Image image;
    private Graphics2D g2;
    private double currentX, currentY, oldX, oldY;
    private int currentPaintX, currentPaintY, oldPaintX, oldPaintY;
    private List<CreatorVector> list = new LinkedList<>();
    //private boolean draw = false;

    public DrawArea() {
        setDoubleBuffered(false);
        addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
            	oldPaintX = e.getX();
                oldPaintY = e.getY();
                oldX = calculateRealNumber(e.getX());
                oldY = calculateRealNumber(e.getY());
                System.out.println("//==================new Object ============");
                makeVector(oldX,oldY,false);
            }

            @Override
            public void mouseReleased(MouseEvent e) {
            	oldPaintX = e.getX();
                oldPaintY = e.getY();
                oldX = calculateRealNumber(e.getX());
                oldY = calculateRealNumber(e.getY());
                makeVector(oldX,oldY,true);
            }
        });

        addMouseMotionListener(new MouseMotionAdapter() {
            public void mouseDragged(MouseEvent e) {
            	currentX = calculateRealNumber(e.getX());
                currentY = calculateRealNumber(e.getY());
            	double xDifferenze = Math.abs(oldX-currentX);
                double yDifferenze = Math.abs(oldY-currentY);
                if( xDifferenze > 0.5 || xDifferenze < -0.5 || yDifferenze > 0.5 || yDifferenze < -0.5) {
                	currentPaintX = e.getX();
                    currentPaintY = e.getY();
                    oldX = calculateRealNumber(e.getX());
                    oldY = calculateRealNumber(e.getY());
                    makeVector(oldX, oldY,true);
                    if (g2 != null) {
                        g2.drawLine(oldPaintX, oldPaintY, currentPaintX, currentPaintY);
                        repaint();
                        oldPaintX = currentPaintX;
                        oldPaintY = currentPaintY;
                    }
                }
            }
        });
    }

    protected void paintComponent(Graphics g) {
        if (image == null) {
            image = createImage(getSize().width, getSize().height);
            g2 = (Graphics2D) image.getGraphics();
            g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            clear();
        }
        g.drawImage(image, 0, 0, null);
    }

    public void clear() {
        g2.setPaint(Color.white);
        g2.fillRect(0, 0, getSize().width, getSize().height);
        g2.setPaint(Color.black);
        repaint();
        list.clear();
    }

    private void makeVector(double x, double y, boolean draw){
        CreatorVector vector = new CreatorVector();
        vector.setX(x);
        vector.setY(y);
        vector.setDraw(draw);
        System.out.println(vector.toString());
    }
    
    private double calculateRealNumber(int pixelPosition) {
    	double cmNumber =  (CreatorProperties.paintLenght/CreatorProperties.pixel) * pixelPosition;
    	return Math.round(cmNumber*100)/100.0;
    }

}