package Swings;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ImageButtonDemo {

    public static void main(String[] args) {

        JFrame frame = new JFrame("Image Button Example");
        frame.setSize(400, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());

        // Load images (make sure images are in project folder)
        ImageIcon clockIcon = new ImageIcon("clock.png");
        ImageIcon hourglassIcon = new ImageIcon("hourglass.png");

        // Buttons with images
        JButton btnClock = new JButton("Digital Clock", clockIcon);
        JButton btnHourGlass = new JButton("Hour Glass", hourglassIcon);

        // Action Listener
        btnClock.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("Digital Clock is pressed");
            }
        });

        btnHourGlass.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("Hour Glass is pressed");
            }
        });

        // Add to frame
        frame.add(btnClock);
        frame.add(btnHourGlass);

        frame.setVisible(true);
    }
}
 