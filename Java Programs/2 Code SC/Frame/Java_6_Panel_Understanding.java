import java.awt.*;

public class Java_6_Panel_Understanding 
{
    public static void main(String[] args)
     {
        Frame frame = new Frame("Panel Understanding");

        Panel panel = new Panel();
        panel.setLayout(new FlowLayout());

        Button button1 = new Button("Button 1");
        Button button2 = new Button("Button 2");
        Label label = new Label("This is a label");

        panel.add(button1);
        panel.add(button2);
        panel.add(label);

        frame.add(panel);
        frame.setSize(300, 200);
        frame.setVisible(true);
    }
}