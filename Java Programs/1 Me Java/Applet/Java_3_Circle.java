import java.applet.Applet;
import java.awt.*;

/* 
<!DOCTYPE html>
<html>
<head>
    <title>Circle Shape</title>
</head>
<body>
    <applet code="Java_3_Circle" width="300" height="200"> </applet>
</body>
</html>
*/


public class Java_3_Circle extends Applet 
{
    public void paint(Graphics g) 
    {
        g.setColor(Color.red);
        
        int x = 200;
        int y = 200;
        int width = 200;
        int height = 200;
        g.fillOval(x, y, width, height);
    }
}
