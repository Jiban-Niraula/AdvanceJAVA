package Unit_1;
import javax.swing.*;
import java.awt.*;

public class FlowLayoutDemo {
    public static void main(String[] args) {
        JFrame frame = new JFrame("FlowLayoutDemo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);
        frame.setLocationRelativeTo(null);
        //creating flowlayout
        FlowLayout layout = new FlowLayout(FlowLayout.RIGHT);
        //assigning it to frame
        frame.setLayout(layout);
        //adding components to frame
        for(int i=1; i<=8;i++)
        {
            frame.add(new JButton("Button "+i));
        }

        frame.setVisible(true);
    }
}
