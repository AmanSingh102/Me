import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Calculator implements ActionListener
{
    static JFrame frame = new JFrame("Calculator");

    static JTextField textScreen = new JTextField("0");

    static JPanel panel = new JPanel();

    static JButton button1 = new JButton("AC");
    static JButton button2 = new JButton("DEL");
    static JButton button3 = new JButton("%");
    static JButton button4 = new JButton("/");

    static JButton button5 = new JButton("7");
    static JButton button6 = new JButton("8");
    static JButton button7 = new JButton("9");
    static JButton button8 = new JButton("*");

    static JButton button9 = new JButton("4");
    static JButton button10 = new JButton("5");
    static JButton button11 = new JButton("6");
    static JButton button12 = new JButton("-");

    static JButton button13 = new JButton("1");
    static JButton button14 = new JButton("2");
    static JButton button15 = new JButton("3");
    static JButton button16 = new JButton("+");

    static JButton button17 = new JButton("00");
    static JButton button18 = new JButton("0");
    static JButton button19 = new JButton(".");
    static JButton button20 = new JButton("=");
    
    static Font font1 = new Font("Ink.Free",Font.BOLD, 35);
    static Font font2 = new Font("Ink.Free",Font.BOLD, 20);

    char operator;
    double num1,num2,result;

    public static void main(String[] args) 
    {
        Calculator calculator = new Calculator();

        frame.setSize(400, 530);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container container = frame.getContentPane();
        container.setBackground(Color.DARK_GRAY);

        textScreen.setBounds(25,25,335,50);
        textScreen.setFont(font1);
        textScreen.setEditable(false);
        textScreen.setHorizontalAlignment(JTextField.RIGHT);
        container.add(textScreen);

        panel.setBounds(25, 100, 335, 370);
        panel.setLayout(new GridLayout(5,4));
        container.add(panel);

        button1.setBackground(new Color(40, 40, 40));
        button1.setForeground(Color.GREEN);
        button1.setFont(font2);
        panel.add(button1);
        button2.setBackground(new Color(40, 40, 40));
        button2.setForeground(Color.GREEN);
        button2.setFont(font2);
        panel.add(button2);
        button3.setBackground(new Color(40, 40, 40));
        button3.setForeground(Color.GREEN);
        button3.setFont(font2);
        panel.add(button3);
        button4.setBackground(new Color(40, 40, 40));
        button4.setForeground(Color.GREEN);
        button4.setFont(font2);
        panel.add(button4);
        button5.setBackground(new Color(40, 40, 40));
        button5.setForeground(Color.WHITE);
        button5.setFont(font2);
        panel.add(button5);
        button6.setBackground(new Color(40, 40, 40));
        button6.setForeground(Color.WHITE);
        button6.setFont(font2);
        panel.add(button6);
        button7.setBackground(new Color(40, 40, 40));
        button7.setForeground(Color.WHITE);
        button7.setFont(font2);
        panel.add(button7);
        button8.setBackground(new Color(40, 40, 40));
        button8.setForeground(Color.GREEN);
        button8.setFont(font2);
        panel.add(button8);
        button9.setBackground(new Color(40, 40, 40));
        button9.setForeground(Color.WHITE);
        button9.setFont(font2);
        panel.add(button9);
        button10.setBackground(new Color(40, 40, 40));
        button10.setForeground(Color.WHITE);
        button10.setFont(font2);
        panel.add(button10);
        button11.setBackground(new Color(40, 40, 40));
        button11.setForeground(Color.WHITE);
        button11.setFont(font2);
        panel.add(button11);
        button12.setBackground(new Color(40, 40, 40));
        button12.setForeground(Color.GREEN);
        button12.setFont(font2);
        panel.add(button12);
        button13.setBackground(new Color(40, 40, 40));
        button13.setForeground(Color.WHITE);
        button13.setFont(font2);
        panel.add(button13);
        button14.setBackground(new Color(40, 40, 40));
        button14.setForeground(Color.WHITE);
        button14.setFont(font2);
        panel.add(button14);
        button15.setBackground(new Color(40, 40, 40));
        button15.setForeground(Color.WHITE);
        button15.setFont(font2);
        panel.add(button15);
        button16.setBackground(new Color(40, 40, 40));
        button16.setForeground(Color.GREEN);
        button16.setFont(font2);
        panel.add(button16);
        button17.setBackground(new Color(40, 40, 40));
        button17.setForeground(Color.WHITE);
        button17.setFont(font2);
        panel.add(button17);
        button18.setBackground(new Color(40, 40, 40));
        button18.setForeground(Color.WHITE);
        button18.setFont(font2);
        panel.add(button18);
        button19.setBackground(new Color(40, 40, 40));
        button19.setForeground(Color.WHITE);
        button19.setFont(font2);
        panel.add(button19);
        button20.setBackground(new Color(40, 40, 40));
        button20.setForeground(Color.WHITE);
        button20.setBackground(Color.ORANGE);
        button20.setFont(font2);
        panel.add(button20);   

        button1.addActionListener(calculator);
        button2.addActionListener(calculator);
        button3.addActionListener(calculator);
        button4.addActionListener(calculator);
        button5.addActionListener(calculator);
        button6.addActionListener(calculator);
        button7.addActionListener(calculator);
        button8.addActionListener(calculator);
        button9.addActionListener(calculator);
        button10.addActionListener(calculator);
        button11.addActionListener(calculator);
        button12.addActionListener(calculator);
        button13.addActionListener(calculator);
        button14.addActionListener(calculator);
        button15.addActionListener(calculator);
        button16.addActionListener(calculator);
        button17.addActionListener(calculator);
        button18.addActionListener(calculator);
        button19.addActionListener(calculator);
        button20.addActionListener(calculator);

        frame.setLayout(null);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) 
    {
        if( e.getSource() == button1 )
        {
            textScreen.setText("");
        }
        if( e.getSource() == button2 )
        {
            String backspace = null;
            if( textScreen.getText().length() > 0 )
            {
                StringBuilder stringBuilder = new StringBuilder(textScreen.getText());
                stringBuilder.deleteCharAt( textScreen.getText().length() - 1 );
                backspace = stringBuilder.toString();
                textScreen.setText(backspace);
            }
        }
        if( e.getSource() == button3 )
        {
            num1 = Double.parseDouble(textScreen.getText());
            operator = '%';
            textScreen.setText("");
        }
        if( e.getSource() == button4 )
        {
            num1 = Double.parseDouble(textScreen.getText());
            operator = '/';
            textScreen.setText("");
        }
        if( e.getSource() == button5 )
        {
            textScreen.setText(textScreen.getText().concat("7"));
        }
        if( e.getSource() == button6 )
        {
            textScreen.setText(textScreen.getText().concat("8"));
        }
        if( e.getSource() == button7 )
        {
            textScreen.setText(textScreen.getText().concat("9"));
        }
        if( e.getSource() == button8 )
        {
            num1 = Double.parseDouble(textScreen.getText());
            operator = '*';
            textScreen.setText("");
        }
        if( e.getSource() == button9 )
        {
            textScreen.setText(textScreen.getText().concat("4"));
        }
        if( e.getSource() == button10 )
        {
            textScreen.setText(textScreen.getText().concat("5"));
        }
        if( e.getSource() == button11 )
        {
            textScreen.setText(textScreen.getText().concat("6"));
        }
        if( e.getSource() == button12 )
        {
            num1 = Double.parseDouble(textScreen.getText());
            operator = '-';
            textScreen.setText("");
        }
        if( e.getSource() == button13 )
        {
            textScreen.setText(textScreen.getText().concat("1"));
        }
        if( e.getSource() == button14 )
        {
            textScreen.setText(textScreen.getText().concat("2"));
        }
        if( e.getSource() == button15 )
        {
            textScreen.setText(textScreen.getText().concat("3"));
        }
        if( e.getSource() == button16 )
        {
            num1 = Double.parseDouble(textScreen.getText());
            operator = '+';
            textScreen.setText("");
        }
        if( e.getSource() == button17 )
        {
            textScreen.setText(textScreen.getText().concat("00"));
        }
        if( e.getSource() == button18 )
        {
            textScreen.setText(textScreen.getText().concat("0"));
        }
        if( e.getSource() == button19 )
        {
            textScreen.setText(textScreen.getText().concat("."));
        }
        if( e.getSource() == button20 )
        {
            try
            {
                num2 = Double.parseDouble(textScreen.getText());

                switch( operator )
                {
                    case '+' :
                        result = num1 + num2;
                        textScreen.setText(String.valueOf(result));
                        break;
                    case '-' :
                        result = num1 - num2;
                        textScreen.setText(String.valueOf(result));
                        break;
                    case '*' :
                        result = num1 * num2;
                        textScreen.setText(String.valueOf(result));
                        break;
                    case '/' :
                        result = num1 / num2;
                        textScreen.setText(String.valueOf(result));
                        break;
                    case '%' :
                        result = num1 % num2;
                        textScreen.setText(String.valueOf(result));
                        break;
                }
            }
            catch( Exception exception )
            {
                JOptionPane.showMessageDialog(null,"SYNTAX ERROR >>>");
                textScreen.setText("");
            }    
        }
    }
}