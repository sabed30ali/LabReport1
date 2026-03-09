import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Calculator extends JFrame implements ActionListener {

    JTextField tf;
    JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b0;
    JButton add,sub,mul,div,clr,eq;

    double num1, num2, result;
    char operator;

    Calculator() {
        setTitle("Calculator");
        setSize(300, 400);
        setLayout(new BorderLayout());

        tf = new JTextField();
        tf.setFont(new Font("Arial", Font.BOLD, 20));
        add(tf, BorderLayout.NORTH);

        JPanel p = new JPanel();
        p.setLayout(new GridLayout(4, 4, 5, 5));

        b1 = new JButton("1");
        b2 = new JButton("2");
        b3 = new JButton("3");
        b4 = new JButton("4");
        b5 = new JButton("5");
        b6 = new JButton("6");
        b7 = new JButton("7");
        b8 = new JButton("8");
        b9 = new JButton("9");
        b0 = new JButton("0");

        add = new JButton("+");
        sub = new JButton("-");
        mul = new JButton("*");
        div = new JButton("/");
        eq  = new JButton("=");
        clr = new JButton("C");

        JButton[] buttons = {
            b1,b2,b3,add,
            b4,b5,b6,sub,
            b7,b8,b9,mul,
            clr,b0,eq,div
        };

        for(JButton b : buttons) {
            b.addActionListener(this);
            p.add(b);
        }

        add(p, BorderLayout.CENTER);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {

        if(e.getSource()==b1) tf.setText(tf.getText()+"1");
        if(e.getSource()==b2) tf.setText(tf.getText()+"2");
        if(e.getSource()==b3) tf.setText(tf.getText()+"3");
        if(e.getSource()==b4) tf.setText(tf.getText()+"4");
        if(e.getSource()==b5) tf.setText(tf.getText()+"5");
        if(e.getSource()==b6) tf.setText(tf.getText()+"6");
        if(e.getSource()==b7) tf.setText(tf.getText()+"7");
        if(e.getSource()==b8) tf.setText(tf.getText()+"8");
        if(e.getSource()==b9) tf.setText(tf.getText()+"9");
        if(e.getSource()==b0) tf.setText(tf.getText()+"0");

        if(e.getSource()==add) {
            num1 = Double.parseDouble(tf.getText());
            operator = '+';
            tf.setText("");
        }

        if(e.getSource()==sub) {
            num1 = Double.parseDouble(tf.getText());
            operator = '-';
            tf.setText("");
        }

        if(e.getSource()==mul) {
            num1 = Double.parseDouble(tf.getText());
            operator = '*';
            tf.setText("");
        }

        if(e.getSource()==div) {
            num1 = Double.parseDouble(tf.getText());
            operator = '/';
            tf.setText("");
        }

        if(e.getSource()==eq) {
            num2 = Double.parseDouble(tf.getText());

            switch(operator) {
                case '+': result = num1 + num2; break;
                case '-': result = num1 - num2; break;
                case '*': result = num1 * num2; break;
                case '/': result = num1 / num2; break;
            }
            tf.setText(String.valueOf(result));
        }

        if(e.getSource()==clr) {
            tf.setText("");
        }
    }

    public static void main(String[] args) {
        new Calculator();
    }
}
