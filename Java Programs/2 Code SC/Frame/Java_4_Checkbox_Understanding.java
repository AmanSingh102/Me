import java.awt.*;

public class Java_4_Checkbox_Understanding 
{
    public static void main(String[] args) 
    {
        Frame frame = new Frame("Checkbox Understanding");
        
        Checkbox checkbox1 = new Checkbox("BCA");
        Checkbox checkbox2 = new Checkbox("MCA");
        Checkbox checkbox3 = new Checkbox("MBA");

        frame.setLayout(new FlowLayout());
        frame.add(checkbox1);
        frame.add(checkbox2);
        frame.add(checkbox3);

        frame.setSize(400, 300);
        frame.setVisible(true);
    }
}