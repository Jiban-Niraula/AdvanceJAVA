package Unit_1;

import javax.swing.*;
import java.awt.*;

public class GridBagLayout{
    public static void main(String[] args) {
        JFrame frame = new JFrame("GridBagLayoutDemo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        frame.setLocationRelativeTo(null);

        frame.setLayout(new java.awt.GridBagLayout());

        GridBagConstraints c = new GridBagConstraints();
        c.gridy=0;c.gridx=0;
        frame.add(new JButton("Button 1"), c);
        c.gridy=0;c.gridx=1;
        c.gridheight=2;
        c.fill = GridBagConstraints.BOTH;
        frame.add(new JButton("Button 2"), c);
        c.gridy=1;c.gridx=0;
        c.gridheight=1;

        frame.add(new JButton("Button 3"), c);

        c.gridy=2;c.gridx=0;
        c.gridwidth=2;
        c.fill = GridBagConstraints.BOTH;
        frame.add(new JButton("Button 4"), c);


        frame.setVisible(true);
    }
}