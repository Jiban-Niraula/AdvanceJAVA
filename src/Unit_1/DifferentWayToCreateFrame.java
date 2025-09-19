package Unit_1;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class DifferentWayToCreateFrame {
    public static void main(String[] args) {
        //Method 1: By Creating the object of frame
        JFrame frame1 = new JFrame();
        frame1.setTitle("Method 1 to Create Frame");
        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame1.setBounds(100, 100, 450, 300);
        frame1.setLayout(new FlowLayout());
        JButton button = new JButton("Button 1");
        frame1.add(button);
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
               JOptionPane.showMessageDialog(null, "Button Pressed");
            }
        });
        //frame1.setVisible(true);

        JFrame2 frame2 = new JFrame2("Method 2 to Create Frame");
        frame2.display();

    }
}

