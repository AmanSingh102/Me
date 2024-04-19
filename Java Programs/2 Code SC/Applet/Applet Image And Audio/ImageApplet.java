import java.applet.*;
import java.awt.*;

/* 
<!DOCTYPE html>
<html>
<head>
    <title>Image Applet</title>
</head>
<body>
    <applet code="ImageApplet" width="300" height="200"> </applet>
</body>
</html>
*/

public class ImageApplet extends Applet 
{
    public void paint( Graphics graphics )
    {
        Image img;
        img = getImage(getCodeBase(), "image.png");
        graphics.drawImage(img, 0, 0, this);
    }   
}
