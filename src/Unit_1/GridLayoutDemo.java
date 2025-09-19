package Unit_1;
import javax.swing.*;
import java.awt.*;

public class GridLayoutDemo {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Grid Layout Demo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400,400);
        frame.setLocationRelativeTo(null);

        //creating layout manager
        GridLayout layout = new GridLayout(2,3);
        frame.setLayout(layout);

        //adding components to frame
        for(int i=1;i<=6;i++)
        {
            frame.add(new Button("Button"+i));
        }


        frame.setVisible(true);
    }
}
