import java.applet.*;
import java.awt.*;

/* 
<!DOCTYPE html>
<html>
<head>
    <title>Circle Shape</title>
</head>
<body>
    <applet code="Circle" width="300" height="200"> </applet>
</body>
</html>
*/

public class Circle extends Applet
{
    public void paint( Graphics graphics )
    {
        graphics.setColor(Color.green);
        graphics.fillOval(100, 50, 100, 100);
    }
}
