import java.awt.*;
import java.awt.event.*;

public class KeyboardEventDemo extends Frame implements KeyListener 
{
    TextField textField;
    Label label;

    public KeyboardEventDemo() 
    {
        textField = new TextField();
        textField.addKeyListener(this);
        
        label = new Label();
        label.setAlignment(Label.CENTER);
        label.setSize(400, 100);

        this.setLayout(new BorderLayout());
        this.add(textField, BorderLayout.NORTH);
        this.add(label, BorderLayout.CENTER);

        this.setSize(400, 400);
        this.setVisible(true);
    }

    public static void main(String[] args) 
    {
        new KeyboardEventDemo();
    }

    @Override
    public void keyTyped(KeyEvent e) 
    {
        label.setText("Key Typed: " + e.getKeyChar());
    }
    @Override
    public void keyPressed(KeyEvent e) 
    {
        label.setText("Key Pressed: " + e.getKeyChar());
    }
    @Override
    public void keyReleased(KeyEvent e) 
    {
        label.setText("Key Released: " + e.getKeyChar());
    }
}