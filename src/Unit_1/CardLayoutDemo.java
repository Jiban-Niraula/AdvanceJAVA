package Unit_1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CardLayoutDemo {
    public static void main(String[] args) {
        JFrame frame = new JFrame("CardLayout Demo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600,400);
        frame.setLocationRelativeTo(null);
        frame.setLayout(new BorderLayout());
        //adding panel and buttons for navigating cards
        JPanel panelFooter=new JPanel();
        panelFooter.setBackground(Color.gray);
        JButton btnLast=new JButton("Last");
        JButton btnNext=new JButton("Next");

        JButton btnPrevious=new JButton("Previous");
        JButton btnFirst=new JButton("First");
        panelFooter.add(btnFirst);
        panelFooter.add(btnPrevious);
        panelFooter.add(btnNext);
        panelFooter.add(btnLast);

        //now adding panelfooter to frame's south region
        frame.add(panelFooter, BorderLayout.SOUTH);

        //Now adding Container panel andd cards on center region
        JPanel containerPanel=new JPanel();
        //applying cardLayout to container
        CardLayout cardLayout=new CardLayout();
        containerPanel.setLayout(cardLayout);
        //card1-------
        JPanel card1=new JPanel();
        card1.setBackground(Color.green);
        card1.add(new JLabel("Card 1"));
        containerPanel.add(card1, "card1");
        //card2--------
        JPanel card2=new JPanel();
        card2.setBackground(Color.blue);
        card2.add(new JLabel("Card 2"));
        containerPanel.add(card2, "card2");

        //card3--------
        JPanel card3=new JPanel();
        card3.setBackground(Color.pink);
        card3.add(new JLabel("Card 3"));
        containerPanel.add(card3, "card3");

        //card4--------
        JPanel card4=new JPanel();
        card4.setBackground(Color.orange);
        card4.add(new JLabel("Card 4"));
        containerPanel.add(card4, "card4");

        //adding ContainerPanel to center region
        frame.add(containerPanel, BorderLayout.CENTER);

        //
        btnNext.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                cardLayout.next(containerPanel);
            }
        });
        btnFirst.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                cardLayout.first(containerPanel);
            }
        });
        btnPrevious.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                cardLayout.previous(containerPanel);
            }
        });
        btnLast.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(containerPanel, "card4");
                //cardLayout.last(containerPanel);
            }
        });


        frame.setVisible(true);
    }
}
