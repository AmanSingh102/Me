import java.awt.*;

public class Java_5_CheckBoxGroup_Understanding 
{
    public static void main(String[] args) 
    {
        Frame frame = new Frame("Check Box Group Understanding");

        CheckboxGroup checkboxGroup = new CheckboxGroup();
        Checkbox checkbox1 = new Checkbox("Sem 1", false, checkboxGroup);
        Checkbox checkbox2 = new Checkbox("Sem 2", false, checkboxGroup);
        Checkbox checkbox3 = new Checkbox("Sem 3", false, checkboxGroup);
        
        frame.setLayout(new FlowLayout());
        frame.add(checkbox1);
        frame.add(checkbox2);
        frame.add(checkbox3);

        frame.setVisible(true);
        frame.setSize(300,300);

    }    
}
