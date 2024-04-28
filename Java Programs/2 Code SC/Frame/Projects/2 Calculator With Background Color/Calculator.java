import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator implements ActionListener 
{
    static Frame frame = new Frame("Calculator Application");

    static Label label1 = new Label("Enter 1st number :");
    static Label label2 = new Label("Enter 2nd number :");
    static Label label3 = new Label("Result :");

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

        frame.setBackground(Color.BLACK);

        label1.setBounds(20, 40, 110, 20);
        label2.setBounds(20, 70, 120, 20);
        label3.setBounds(20, 100, 110, 20);

        label1.setForeground(Color.YELLOW);
        label2.setForeground(Color.YELLOW);
        label3.setForeground(Color.YELLOW);

        textField1.setBounds(140, 40, 100, 20);
        textField2.setBounds(140, 70, 100, 20);
        textField3.setBounds(140, 100, 100, 20);

        textField1.setForeground(Color.WHITE);
        textField2.setForeground(Color.WHITE);
        textField3.setForeground(Color.WHITE);

        textField1.setBackground(Color.DARK_GRAY);
        textField2.setBackground(Color.DARK_GRAY);
        textField3.setBackground(Color.DARK_GRAY);

        button1.setBounds(260, 40, 80, 20);
        button2.setBounds(260, 70, 80, 20);
        button3.setBounds(260, 100, 80, 20);
        button4.setBounds(260, 130, 80, 20);
        button5.setBounds(260, 160, 80, 20);

        button1.setForeground(Color.YELLOW);
        button2.setForeground(Color.YELLOW);
        button3.setForeground(Color.YELLOW);
        button4.setForeground(Color.YELLOW);
        button5.setForeground(Color.YELLOW);

        button1.setBackground(Color.BLACK);
        button2.setBackground(Color.BLACK);
        button3.setBackground(Color.BLACK);
        button4.setBackground(Color.BLACK);
        button5.setBackground(Color.BLACK);

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
        double num1 = Double.parseDouble(textField1.getText());
        double num2 = Double.parseDouble(textField2.getText());

        String string = e.getActionCommand();

        if (string.equals("+"))
        {
            double result = num1 + num2;
            textField3.setText(Double.toString(result));
        } 
        else if (string.equals("-")) 
        {
            double result = num1 - num2;
            textField3.setText(Double.toString(result));
        } 
        else if (string.equals("*")) 
        {
            double result = num1 * num2;
            textField3.setText(Double.toString(result));
        } 
        else if (string.equals("/")) 
        {
            double result = num1 / num2;
            textField3.setText(Double.toString(result));
        } 
        else if (string.equals("%")) 
        {
            double result = num1 % num2;
            textField3.setText(Double.toString(result));
        }
    }
}
