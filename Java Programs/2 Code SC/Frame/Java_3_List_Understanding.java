import java.awt.*;

public class Java_3_List_Understanding
{
    public static void main(String[] args)
     {
        Frame frame = new Frame("List Example");

        List list = new List(4);

        list.add("Computer Architecture");
        list.add("Java");
        list.add("Mathematics");
        list.add("Environmental Studies");

        frame.add(list);
        frame.setLayout(new FlowLayout());

        frame.setSize(300, 200);
        frame.setVisible(true);
    }
}