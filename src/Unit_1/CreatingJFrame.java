package Unit_1;
import javax.swing.*; //import all classes of javax.swing package
import java.awt.*;

public class CreatingJFrame {
    public static void main(String[] args) {
        EventQueue.invokeLater(()->{
            JFrame frame = new JFrame("First JFrame from cons.");
            //frame.setTitle("First Jframe");
            //frame.setSize(300,400);
            //frame.setLocation(20,30);
            frame.setBounds(300,200,500,200);
            //frame.setLocationRelativeTo(null);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setResizable(false);
            frame.setVisible(true);
        });

        SwingUtilities.invokeLater(()->{

        });
        //lsdkjflk

    }
}