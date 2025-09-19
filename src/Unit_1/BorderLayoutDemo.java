package Unit_1;

import javax.swing.*;
import java.awt.*;

public class BorderLayoutDemo {
    public static void main(String[] args) {
        JFrame frame = new JFrame("FlowLayoutDemo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);
        frame.setLocationRelativeTo(null);

        //creating layout
        BorderLayout layout = new BorderLayout(20, 20);
        frame.setLayout(layout);
        //adding components to different region
        //frame.add(new JButton("North Region"), BorderLayout.NORTH);
        JPanel panel = new JPanel();
        panel.setBackground(Color.gray);
        panel.setLayout(new FlowLayout());
        panel.add(new JButton("Button1"));
        panel.add(new JButton("Button2"));
        frame.add(panel, BorderLayout.NORTH);
        frame.add(new JButton("South Region"), BorderLayout.SOUTH);
        frame.add(new JButton("East Region"), BorderLayout.EAST);
        frame.add(new JButton("West Region"), BorderLayout.WEST);
        frame.add(new JButton("Center"), BorderLayout.CENTER);

        frame.setVisible(true);
    }
}

