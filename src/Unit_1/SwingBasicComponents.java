import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


//Create a swing application to find factorial of user entered number
//and show the result in a label.

public class SwingBasicComponents {
    public static void main(String[] args) {
        //creating frame and setting properties
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("SwingBasicComponents");
        frame.setSize(600, 400);
        frame.setLocationRelativeTo(null);
        frame.setLayout(new FlowLayout());
        //Swing Form Controls/Components/Widgets
        //1.JLabel: used to display the label text
        JLabel label = new JLabel("Number");
        frame.add(label);
        //2.JTextField: used for single line user input
        JTextField textField = new JTextField();
        textField.setPreferredSize(new Dimension(200,30));
        textField.setText("");//setting initial content of JTextField
        frame.add(textField);

        JLabel labelResult=new JLabel("Result:-");
        frame.add(labelResult);

        //4.JTextArea: used for multiline line user input
        JTextArea textArea = new JTextArea();
        textArea.setPreferredSize(new Dimension(200,100));
        JScrollPane scrollPane = new JScrollPane(textArea);
        scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        scrollPane.setPreferredSize(new Dimension(200,100));
        frame.add(scrollPane);

        //5. JPasswordField: used for single line masked input
        JPasswordField passwordField = new JPasswordField();
        passwordField.setPreferredSize(new Dimension(200,30));
        frame.add(passwordField);

        //6.JCheckBox : used for multiple choice input
        JCheckBox checkDancing = new JCheckBox("Dancing");
        checkDancing.setSelected(true);
        frame.add(checkDancing);
        JCheckBox checkSinging = new JCheckBox("Singing");
        frame.add(checkSinging);


        //3. JButton : used for button
        JButton button = new JButton("Click Me");
        frame.add(button);
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                //reading user input from JTextField
               int number = Integer.parseInt(textField.getText());
               //logic to calculate factorial
                long fact=1;
                for(int i=number ; i>0; i--)
                {
                    fact*=i;
                }
                labelResult.setText("Factorial:"+String.valueOf(fact));
            }
        });



        //showing the Frame
        frame.setVisible(true);
    }
}