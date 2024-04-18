import java.applet.Applet;
import java.awt.*;

/*
<!DOCTYPE html>
<html>
<head>
    <title>Java Applet Example</title>
</head>
<body>
    <applet code="Java_4_RectangleWithMoyeMoye" width="300" height="200"> </applet>
</body>
</html>
*/

public class Java_4_RectangleWithMoyeMoye extends Applet
 {
    public void paint(Graphics g) 
    {
        setBackground(Color.white);

        g.setColor(Color.blue);

        int x = 100;
        int y = 100;
        int width = 400;
        int height = 200;
        g.fillRect(x, y, width, height);

        g.setColor(Color.white);
        Font font = new Font("Arial", Font.BOLD, 20);
        g.setFont(font);
        
        String text = "Moye Moye";
        FontMetrics fm = g.getFontMetrics();
        int textWidth = fm.stringWidth(text);
        int textHeight = fm.getHeight();
        int textX = x + (width - textWidth) / 2;
        int textY = y + (height - textHeight) / 2 + fm.getAscent();
        g.drawString(text, textX, textY);

        g.setColor(Color.red);
        g.drawLine(x, y, x + width, y + height);
        g.drawLine(x, y + height, x + width, y);
    }
}