package main.java.codeCreator;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class SwingPaint {

    JButton clearBtn, start;
    DrawArea drawArea;
    ActionListener actionListener = new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == clearBtn) {
                drawArea.clear();
            }
            if(e.getSource() == start){
                System.out.println("Starting to print");
            }
        }
    };

    public static void main(String[] args) {
        new SwingPaint().show();
    }

    public void show() {
        JFrame frame = new JFrame("Paint");
        Container content = frame.getContentPane();
        content.setLayout(new BorderLayout());
        drawArea = new DrawArea();
        content.add(drawArea, BorderLayout.CENTER);
        JPanel controls = new JPanel();
        clearBtn = new JButton("Clear");
        clearBtn.addActionListener(actionListener);
        controls.add(clearBtn);
        start = new JButton("Start");
        start.addActionListener(actionListener);
        controls.add(start);
        content.add(controls, BorderLayout.SOUTH);
        frame.setSize(CreatorProperties.pixel, CreatorProperties.pixel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}