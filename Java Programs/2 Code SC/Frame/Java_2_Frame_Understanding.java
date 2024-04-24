import java.awt.*;

public class Java_2_Frame_Understanding {

    public static void main(String[] args) 
    {
        Frame frame = new Frame("Frame Understanding");

        Label label = new Label("Enter text:");
        TextField textField = new TextField(20);
        Button button = new Button("Click me!");
        TextArea textArea = new TextArea(10, 30);

        frame.setLayout(new FlowLayout());
        frame.add(label);
        frame.add(textField);
        frame.add(button);
        frame.add(textArea);

        frame.setSize(400, 300);
        frame.setVisible(true);
    }
}