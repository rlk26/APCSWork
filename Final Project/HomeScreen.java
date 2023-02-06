import processing.core.*;
import java.util.*;
public class HomeScreen implements Scene
{
    public HomeScreen(PApplet pap, PImage home)
    {
        this.pap = pap;
        this.home = home;
    }

    public void display()
    {

      pap.background(home);
      pap.textAlign(pap.CENTER);
      pap.textSize(pap.width/12);
      pap.text("Welcome to Brick Breaker",pap.width/2,pap.height/2-pap.height/16);
      pap.text("Press Enter to Begin",pap.width/2,pap.height/2+pap.height/16);
    }
    private PImage home;
    private PApplet pap;
}
