import processing.core.*;
import java.util.*;
public class EndScreen implements Scene
{
    public EndScreen(PApplet pap, PImage end)
    {
        this.pap = pap;
        this.end = end;
    }

    public void display()
    {

      pap.background(end);
      pap.textAlign(pap.CENTER);
      pap.textSize(pap.width/18);
      //pap.text("GAME OVER",pap.width/2,pap.height/2-pap.height/16);
      pap.text("Press SHIFT to play againn",pap.width/2,pap.height/2+pap.height/16);
    }
    private PImage end;
    private PApplet pap;
}
