import java.applet.Applet;
import java.awt.*;

/*

<!DOCTYPE html>
<html>
<head>
    <title>Simple Rectangle</title>
</head>
<body>
    <applet code="Java_1_RectangleApplet" width="300" height="200"> </applet>
</body>
</html>

*/

public class Java_1_RectangleApplet extends Applet 
{
    public void paint(Graphics g) {
        
        g.setColor(Color.blue);
        
        int x = 50;
        int y = 50;
        int width = 100;
        int height = 50;

        g.fillRect(x, y, width, height);
    }
}
