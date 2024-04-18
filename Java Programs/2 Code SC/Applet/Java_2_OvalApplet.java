import java.applet.Applet;
import java.awt.*;

/* 
<!DOCTYPE html>
<html>
<head>
    <title>Oval Shape</title>
</head>
<body>
    <applet code="Java_2_OvalApplet" width="300" height="200"> </applet>
</body>
</html>
*/


public class Java_2_OvalApplet extends Applet 
{
    public void paint(Graphics g) 
    {
        g.setColor(Color.red);
        
        int x = 150;
        int y = 150;
        int width = 250;
        int height = 150;
        g.fillOval(x, y, width, height);
    }
}
