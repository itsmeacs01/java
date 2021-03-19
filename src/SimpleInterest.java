import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleInterest implements ActionListener {
        JFrame frame;
        JButton button;
        JTextField t1,t2,t3;
        JLabel l1,l2,l3;
        JTextPane pane;

        SimpleInterest(){
            frame = new JFrame();
            frame.setSize(300,300);
            frame.setLayout(new FlowLayout());
            t1 = new JTextField(20);
            t2 = new JTextField(20);
            t3 = new JTextField(20);

            l1 = new JLabel("Principle");
            l2 = new JLabel("Time");
            l3 = new JLabel("Rate");

            pane = new JTextPane();

            button = new JButton("Calculate");
            button.addActionListener(this);

            frame.add(l1);
            frame.add(t1);
            frame.add(l2);
            frame.add(t2);
            frame.add(l3);
            frame.add(t3);
            frame.add(button);
            frame.add(pane);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            frame.setVisible(true);

        }
        public static void main(String[] args) {
            new SimpleInterest();

        }

        @Override
        public void actionPerformed(ActionEvent e) {
            Double p = Double.parseDouble(t1.getText());
            Double t = Double.parseDouble(t2.getText());
            Double r = Double.parseDouble(t3.getText());
            Double result = (p*t*r)/100;
            pane.setText(String.valueOf(result));

        }
    }
