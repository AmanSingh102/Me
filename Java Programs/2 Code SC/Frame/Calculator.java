import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator implements ActionListener
{
    static Frame frame = new Frame("Calculator Application");

    static TextField textField1 = new TextField();
    static TextField textField2 = new TextField();
    static TextField textField3 = new TextField();

    static Button button1 = new Button("Addition");
    static Button button2 = new Button("Subtraction");
    static Button button3 = new Button("Multiplication");
    static Button button4 = new Button("Division");
    static Button button5 = new Button("Module");

    public static void main(String[] args) 
    {
        Calculator calculator = new Calculator();
        frame.setLayout(new FlowLayout());

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

        frame.setSize(300, 200);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) 
    {
        int num1 = Integer.parseInt(textField1.getText());
        int num2 = Integer.parseInt(textField2.getText());

        String string = e.getActionCommand();

        if( string.equals("Addition"))
        {
            int result = num1 + num2;
            @SuppressWarnings("removal")
            Integer integer1 = new Integer(result);
            textField3.setText(integer1.toString());
        }
        else if( string.equals("Subtraction"))
        {
            int result = num1 - num2;
            @SuppressWarnings("removal")
            Integer integer1 = new Integer(result);
            textField3.setText(integer1.toString());
        }
        else if( string.equals("Multiplication"))
        {
            int result = num1 * num2;
            @SuppressWarnings("removal")
            Integer integer1 = new Integer(result);
            textField3.setText(integer1.toString());
        }
        else if( string.equals("Division"))
        {
            int result = num1 / num2;
            @SuppressWarnings("removal")
            Integer integer1 = new Integer(result);
            textField3.setText(integer1.toString());
        }
        else if( string.equals("Module"))
        {
            int result = num1 % num2;
            @SuppressWarnings("removal")
            Integer integer1 = new Integer(result);
            textField3.setText(integer1.toString());
        }
    }   
}