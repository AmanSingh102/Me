import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Calculator implements ActionListener
{
    JFrame frame;

    JTextField screen;

    JButton noOfButton[] = new JButton[10];
    JButton buttonPlus,buttonMinus,buttonDiv,buttonMulti,buttonZero,button2Zero,buttonEqual,buttonDecimal,buttonAllClear,buttonDelete,buttonRemainder;

    Font font1 = new Font("Ink.Free",Font.BOLD, 35);
    Font font2 = new Font("Ink.Free",Font.BOLD, 20);

    JPanel panel;

    char operator;
    double num1,num2,result;

    public Calculator()
    {
        frame = new JFrame();
        frame.setTitle("Calculator Application");
        frame.setSize(400, 530);

        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.getContentPane().setBackground(new Color(100, 100, 100));

        screen = new JTextField("0");
        screen.setBounds(25,25,335,50);
        screen.setFont(font1);
        screen.setEditable(false);
        screen.setHorizontalAlignment(JTextField.RIGHT);
        frame.add(screen);

        panel = new JPanel();
        panel.setBounds(25, 100, 335, 370);
        panel.setLayout(new GridLayout(5,4));
        frame.add(panel);

        for( int i = 1; i<10; i++ )
        {
            noOfButton[i] = new JButton(String.valueOf(i));
            noOfButton[i].setFont(font2);
            noOfButton[i].setBackground(new Color(40, 40, 40));
            noOfButton[i].setForeground(Color.WHITE);
            noOfButton[i].addActionListener(this);
        }

        buttonPlus = new JButton("+");
        buttonPlus.setFont(font2);
        buttonPlus.setBackground(new Color(40, 40, 40));
        buttonPlus.setForeground(Color.GREEN);
        buttonMinus = new JButton("-");
        buttonMinus.setFont(font2);
        buttonMinus.setBackground(new Color(40, 40, 40));
        buttonMinus.setForeground(Color.GREEN);
        buttonDiv = new JButton("/");
        buttonDiv.setFont(font2);
        buttonDiv.setBackground(new Color(40, 40, 40));
        buttonDiv.setForeground(Color.GREEN);
        buttonMulti = new JButton("*");
        buttonMulti.setFont(font2);
        buttonMulti.setBackground(new Color(40, 40, 40));
        buttonMulti.setForeground(Color.GREEN);
        buttonZero = new JButton("0");
        buttonZero.setFont(font2);
        buttonZero.setBackground(new Color(40, 40, 40));
        buttonZero.setForeground(Color.WHITE);
        button2Zero = new JButton("00");
        button2Zero.setFont(font2);
        button2Zero.setBackground(new Color(40, 40, 40));
        button2Zero.setForeground(Color.WHITE);
        buttonDecimal = new JButton(".");
        buttonDecimal.setFont(font2);
        buttonDecimal.setBackground(new Color(40, 40, 40));
        buttonDecimal.setForeground(Color.WHITE);
        buttonDelete = new JButton("DEL");
        buttonDelete.setFont(font2);
        buttonDelete.setBackground(new Color(40, 40, 40));
        buttonDelete.setForeground(Color.GREEN);
        buttonAllClear = new JButton("AC");
        buttonAllClear.setFont(font2);
        buttonAllClear.setBackground(new Color(40, 40, 40));
        buttonAllClear.setForeground(Color.GREEN);
        buttonEqual = new JButton("=");
        buttonEqual.setFont(font2);
        buttonEqual.setBackground(Color.ORANGE);
        buttonEqual.setForeground(Color.WHITE);
        buttonRemainder = new JButton("%");
        buttonRemainder.setFont(font2);
        buttonRemainder.setBackground(new Color(40, 40, 40));
        buttonRemainder.setForeground(Color.GREEN);

        panel.add(buttonAllClear);
        panel.add(buttonDelete);
        panel.add(buttonRemainder);
        panel.add(buttonDiv);
        panel.add(noOfButton[7]);
        panel.add(noOfButton[8]);
        panel.add(noOfButton[9]);
        panel.add(buttonMulti);
        panel.add(noOfButton[4]);
        panel.add(noOfButton[5]);
        panel.add(noOfButton[6]);
        panel.add(buttonMinus);
        panel.add(noOfButton[1]);
        panel.add(noOfButton[2]);
        panel.add(noOfButton[3]);
        panel.add(buttonPlus);
        panel.add(button2Zero);
        panel.add(buttonZero);
        panel.add(buttonDecimal);
        panel.add(buttonEqual);

        buttonZero.addActionListener(this);
        button2Zero.addActionListener(this);
        buttonDecimal.addActionListener(this);
        buttonAllClear.addActionListener(this);
        buttonDelete.addActionListener(this);
        buttonPlus.addActionListener(this);
        buttonMinus.addActionListener(this);
        buttonMulti.addActionListener(this);
        buttonDiv.addActionListener(this);
        buttonRemainder.addActionListener(this);
        buttonEqual.addActionListener(this);
        
        frame.setLayout(null);
        frame.setVisible(true);
    }
    public static void main(String[] args) 
    {
        new Calculator();        
    }

    @Override
    public void actionPerformed(ActionEvent e) 
    {
        for( int i = 1; i<10; i++ )
        {
            if( e.getSource() == noOfButton[i] )
            {
                screen.setText(screen.getText().concat(String.valueOf(i)));
            }
        } 

        if( e.getSource() == buttonZero )
        {
            screen.setText(screen.getText().concat("0"));
        }
        if( e.getSource() == button2Zero )
        {
            screen.setText(screen.getText().concat("00"));
        }
        if( e.getSource() == buttonDecimal )
        {
            screen.setText(screen.getText().concat("."));
        }
        if( e.getSource() == buttonAllClear )
        {
            screen.setText("");
        }
        if( e.getSource() == buttonDelete )
        {
            String backspace = null;
            if( screen.getText().length() > 0 )
            {
                StringBuilder stringBuilder = new StringBuilder(screen.getText());
                stringBuilder.deleteCharAt( screen.getText().length() - 1 );
                backspace = stringBuilder.toString();
                screen.setText(backspace);
            }
        }
        if( e.getSource() == buttonPlus )
        {
            num1 = Double.parseDouble(screen.getText());
            operator = '+';
            screen.setText("");
        }
        if( e.getSource() == buttonMinus )
        {
            num1 = Double.parseDouble(screen.getText());
            operator = '-';
            screen.setText("");
        }
        if( e.getSource() == buttonMulti )
        {
            num1 = Double.parseDouble(screen.getText());
            operator = '*';
            screen.setText("");
        }
        if( e.getSource() == buttonDiv )
        {
            num1 = Double.parseDouble(screen.getText());
            operator = '/';
            screen.setText("");
        }
        if( e.getSource() == buttonRemainder )
        {
            num1 = Double.parseDouble(screen.getText());
            operator = '%';
            screen.setText("");
        }
        if( e.getSource() == buttonEqual )
        {
            try
            {
                num2 = Double.parseDouble(screen.getText());

                switch( operator )
                {
                    case '+' :
                        result = num1 + num2;
                        screen.setText(String.valueOf(result));
                        break;
                    case '-' :
                        result = num1 - num2;
                        screen.setText(String.valueOf(result));
                        break;
                    case '*' :
                        result = num1 * num2;
                        screen.setText(String.valueOf(result));
                        break;
                    case '/' :
                        result = num1 / num2;
                        screen.setText(String.valueOf(result));
                        break;
                    case '%' :
                        result = num1 % num2;
                        screen.setText(String.valueOf(result));
                        break;
                }
            }
            catch( Exception exception )
            {
                JOptionPane.showMessageDialog(null,"SYNTAX ERROR >>>");
                screen.setText("");
            }    
        }
    }    
}
