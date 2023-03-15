import processing.core.*;
import java.util.*;
public class LevelSelector implements Scene
{
    public LevelSelector(PApplet pap, PImage one, PImage two, PImage three)
    {
        this.pap = pap;
    }

    public void display()
    {

      pap.background(0);
      pap.fill(255);
      pap.textAlign(pap.CENTER);
      pap.textSize(pap.width/18);
      pap.image(one,pap.width/4,pap.height/2);
      pap.image(two,pap.width/2,pap.height/2);
      pap.image(three,pap.width/4+pap.width/2,pap.height/2);
      pap.text("Press Z to play again",pap.width/2,pap.height/4);
    }
    private PImage end;
    private PImage one, two, three;
    private PApplet pap;
}
