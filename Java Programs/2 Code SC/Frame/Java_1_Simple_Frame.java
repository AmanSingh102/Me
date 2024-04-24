import java.awt.*;

public class Java_1_Simple_Frame 
{
    public static void main(String[] args) 
    {
        Frame frame = new Frame("Aman Application");
        frame.setVisible(true);    
        frame.setSize(500, 300);
        //frame.setLayout(new FlowLayout());

        Label label = new Label("This is Label");
        frame.add(label, BorderLayout.SOUTH);

        Button button = new Button("OK");
        frame.add(button, BorderLayout.EAST);

        TextField textField = new TextField("Enter Age : ", 20);
        frame.add(textField, BorderLayout.NORTH);

        TextArea textArea = new TextArea(10,20);
        frame.add(textArea);
    }    
}