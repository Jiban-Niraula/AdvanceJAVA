package Unit_1;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//Method2:Extending the JFrame class
public class JFrame2 extends JFrame implements ActionListener {


    //constructor
    //Note: if we are creating Frame extending JFrame
    //then frame prperties should be set inside constructor
    public JFrame2(String title) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                setTitle(title);
                setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                setSize(500,500);
                setLocationRelativeTo(null);
                setLayout(new FlowLayout());
                JButton b1 = new JButton("Button 1");
                JButton b2 = new JButton("Button 2");
                add(b1);
                add(b2);
                b1.addActionListener(JFrame2.this);
            }
        });

    }
    //method to show Frame
    public void display()
    {
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JOptionPane.showMessageDialog(null,"Button Clicked");
    }
}


