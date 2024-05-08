import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Calculator implements ActionListener
{
    static JFrame frame = new JFrame("Calculator");
    
    static JLabel label1 = new JLabel("Enter 1st number : ");
    static JLabel label2 = new JLabel("Enter 2nd number : ");
    static JLabel label3 = new JLabel("Result : ");

    static JTextField textField1 = new JTextField();
    static JTextField textField2 = new JTextField();
    static JTextField textField3 = new JTextField();

    static JButton button1 = new JButton("+");
    static JButton button2 = new JButton("-");
    static JButton button3 = new JButton("*");
    static JButton button4 = new JButton("/");
    static JButton button5 = new JButton("%");

    public static void main(String[] args) 
    {
        Calculator calculator = new Calculator();
        frame.setLayout(null);

        Container container = frame.getContentPane();
        container.setBackground(Color.BLACK);

        label1.setBounds(20, 40, 110, 20);
        label2.setBounds(20, 70, 110, 20);
        label3.setBounds(20, 100, 110, 20);

        label1.setForeground(Color.YELLOW);
        label2.setForeground(Color.YELLOW);
        label3.setForeground(Color.YELLOW);

        container.add(label1);
        container.add(label2);
        container.add(label3);

        textField1.setBounds(140, 40, 100, 20);
        textField2.setBounds(140, 70, 100, 20);
        textField3.setBounds(140, 100, 100, 20);

        textField1.setBackground(Color.DARK_GRAY);
        textField2.setBackground(Color.DARK_GRAY);
        textField3.setBackground(Color.DARK_GRAY);

        textField1.setForeground(Color.WHITE);
        textField2.setForeground(Color.WHITE);
        textField3.setForeground(Color.WHITE);

        container.add(textField1);        
        container.add(textField2);
        container.add(textField3);

        button1.setBounds(260, 40, 80, 20);
        button2.setBounds(260, 70, 80, 20);
        button3.setBounds(260, 100, 80, 20);
        button4.setBounds(260, 130, 80, 20);
        button5.setBounds(260, 160, 80, 20);

        button1.setBackground(Color.BLACK);
        button2.setBackground(Color.BLACK);
        button3.setBackground(Color.BLACK);
        button4.setBackground(Color.BLACK);
        button5.setBackground(Color.BLACK);

        button1.setForeground(Color.YELLOW);
        button2.setForeground(Color.YELLOW);
        button3.setForeground(Color.YELLOW);
        button4.setForeground(Color.YELLOW);
        button5.setForeground(Color.YELLOW);

        button1.addActionListener(calculator);
        button2.addActionListener(calculator);
        button3.addActionListener(calculator);
        button4.addActionListener(calculator);
        button5.addActionListener(calculator);

        container.add(button1);
        container.add(button2);
        container.add(button3);
        container.add(button4);
        container.add(button5);

        frame.setSize(400, 250);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) 
    {
        double num1 = Double.parseDouble(textField1.getText());
        double num2 = Double.parseDouble(textField2.getText());

        String string = e.getActionCommand();

        if( string.equals("+"))
        {
            double result = num1 + num2;
            textField3.setText(Double.toString(result));
        }
        else if( string.equals("-"))
        {
            double result = num1 - num2;
            textField3.setText(Double.toString(result));
        }
        else if( string.equals("*"))
        {
            double result = num1 * num2;
            textField3.setText(Double.toString(result));
        }
        else if( string.equals("/"))
        {
            double result = num1 / num2;
            textField3.setText(Double.toString(result));
        }
        else if( string.equals("%"))
        {
            double result = num1 % num2;
            textField3.setText(Double.toString(result));
        }
    }
}