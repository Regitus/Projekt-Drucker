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
    private int currentX, currentY, oldX, oldY;
    private double lastX = 0;
    private double lastY = 0;
    private List<CreatorVector> list = new LinkedList<>();
    private boolean draw = false;

    public DrawArea() {
        setDoubleBuffered(false);
        addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                oldX = e.getX();
                oldY = e.getY();
                draw = true;
                makeVector(e.getX(),e.getY());
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                draw = false;
                makeVector(e.getX(),e.getY());
            }
        });

        addMouseMotionListener(new MouseMotionAdapter() {
            public void mouseDragged(MouseEvent e) {
                currentX = e.getX();
                currentY = e.getY();
                makeVector(e.getX(),e.getY());

                if (g2 != null) {
                    g2.drawLine(oldX, oldY, currentX, currentY);
                    repaint();
                    oldX = currentX;
                    oldY = currentY;
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

    private void makeVector(double x, double y){
        CreatorVector vector = new CreatorVector();
        vector.setX(x);
        vector.setY(y);
        vector.setDraw(draw);
        
        vector.getRealPositions();
        double realX = vector.getRealX();
        double realY = vector.getRealY();
         
        
        if((lastX-realX) > 0.25 || (lastX-realX) < -0.25) {
        	//System.out.println(lastX +";"+realX+";" +(lastX-realX));
        	lastX = realX;
        	lastY = realY;
        	System.out.println("roboter.moveSync("+realX+","+realY+");");	
        } else if((lastY-realY) > 0.25 || (lastY-realY) < -0.25) {
        	//System.out.println(lastY +";"+realY+";" +(lastY-y));
        	lastX = realX;
        	lastY = realY;
        	System.out.println("roboter.moveSync("+realX+","+realY+");");	
        }
    }

}