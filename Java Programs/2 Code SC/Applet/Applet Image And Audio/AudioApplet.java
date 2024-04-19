import java.applet.*;

/* 
<!DOCTYPE html>
<html>
<head>
    <title>Audio Player</title>
</head>
<body>
    <applet code="AudioApplet" width="300" height="200"> </applet>
</body>
</html>
*/

public class AudioApplet extends Applet
{
    public void init()
    {
        AudioClip audioClip;
        audioClip = getAudioClip(getCodeBase(),"ChipiChipi.wav");
        audioClip.play();
    }
}