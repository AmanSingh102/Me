import java.awt.*;
import java.awt.event.*;

public class CounterApp extends Frame implements ActionListener 
{
    private Label labelCounter;
    private TextField textfieldCounter;
    private Button buttonCount;
    private int count = 0;

 public CounterApp() 
 {
    setLayout(new FlowLayout());

    labelCounter = new Label("Counter : ");
    add(labelCounter);

    textfieldCounter = new TextField(count + "", 10);
    textfieldCounter.setEditable(false);
    add(textfieldCounter);

    buttonCount = new Button("Count");
    add(buttonCount);
    buttonCount.addActionListener(this);

    setTitle("AWT Counter Application");
    setSize(350, 100);
    setVisible(true);
 }

    public static void main(String[] args) 
    {
        CounterApp app = new CounterApp();
    }
    
    @Override
    public void actionPerformed( ActionEvent evt ) 
    {
        ++count;
        textfieldCounter.setText(count + "");
    }  
}
