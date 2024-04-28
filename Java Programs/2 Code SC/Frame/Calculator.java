import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator implements ActionListener
{
    static Frame frame = new Frame("Calculator Application");

    static Label label1 = new Label("Enter 1st number ");
    static Label label2 = new Label("Enter 2nd number ");
    static Label label3 = new Label("Result");

    static TextField textField1 = new TextField();
    static TextField textField2 = new TextField();
    static TextField textField3 = new TextField();

    static Button button1 = new Button("+");
    static Button button2 = new Button("-");
    static Button button3 = new Button("*");
    static Button button4 = new Button("/");
    static Button button5 = new Button("%");

    public static void main(String[] args) 
    {
        Calculator calculator = new Calculator();
        frame.setLayout(null);

        label1.setBounds(20, 40, 110, 20);
        label2.setBounds(20, 70, 120, 20);
        label3.setBounds(20, 100, 110, 20);

        textField1.setBounds(140, 40, 100, 20);
        textField2.setBounds(140, 70, 100, 20);
        textField3.setBounds(140, 100, 100, 20);

        button1.setBounds(250, 40, 80, 20);
        button2.setBounds(250, 70, 80, 20);
        button3.setBounds(250, 100, 80, 20);
        button4.setBounds(250, 130, 80, 20);
        button5.setBounds(250, 160, 80, 20);

        frame.add(label1);
        frame.add(label2);
        frame.add(label3);

        frame.add(textField1);
        frame.add(textField2);
        frame.add(textField3);
        
        button1.addActionListener(calculator);
        button2.addActionListener(calculator);
        button3.addActionListener(calculator);
        button4.addActionListener(calculator);
        button5.addActionListener(calculator);

        frame.add(button1);
        frame.add(button2);
        frame.add(button3);
        frame.add(button4);
        frame.add(button5);

        frame.setSize(400, 220);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) 
    {
        int num1 = Integer.parseInt(textField1.getText());
        int num2 = Integer.parseInt(textField2.getText());

        String string = e.getActionCommand();

        if( string.equals("+"))
        {
            int result = num1 + num2;
            @SuppressWarnings("removal")
            Integer integer1 = new Integer(result);
            textField3.setText(integer1.toString());
        }
        else if( string.equals("-"))
        {
            int result = num1 - num2;
            @SuppressWarnings("removal")
            Integer integer1 = new Integer(result);
            textField3.setText(integer1.toString());
        }
        else if( string.equals("*"))
        {
            int result = num1 * num2;
            @SuppressWarnings("removal")
            Integer integer1 = new Integer(result);
            textField3.setText(integer1.toString());
        }
        else if( string.equals("/"))
        {
            int result = num1 / num2;
            @SuppressWarnings("removal")
            Integer integer1 = new Integer(result);
            textField3.setText(integer1.toString());
        }
        else if( string.equals("%"))
        {
            int result = num1 % num2;
            @SuppressWarnings("removal")
            Integer integer1 = new Integer(result);
            textField3.setText(integer1.toString());
        }
    }   
}