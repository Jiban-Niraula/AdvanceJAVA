package Unit_1;
import javax.swing.*;
import java.awt.*;
import java.util.Objects;

public class OptimalFrameSize {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Optimal Frame Size");
        frame.setSize(300,400);
        frame.setLocationRelativeTo(null);
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension screenSize = toolkit.getScreenSize();
        JLabel label = new JLabel("Width: " + screenSize.width + " Height: " + screenSize.height);
        label.setSize(500,100);
        label.setLocation(20, 20);
        //adding label to frame
        frame.add(label);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        //setting frame icon image
        //setting JFrame icon
        frame.setIconImage(Toolkit.getDefaultToolkit().getImage(OptimalFrameSize.class.getResource("/images/1.jpeg")));
        //or
        //frame.setIconImage(new ImageIcon("resources/images/instagram.png").getImage());

        frame.setVisible(true);
    }
}
