import processing.core.*;
public class WinScreen implements Scene
{
    public WinScreen(PApplet pap, PImage win)
    {
        this.pap = pap;
        this.win = win;
    }

    public void display()
    {
      pap.background(win);
      pap.textAlign(pap.CENTER);
      pap.text("WINNER!",pap.width/2,pap.height/2-pap.height/14);
      pap.textSize(pap.width/16);
      pap.text("Press the Space Bar to Go Home",pap.width/2,pap.height/2+pap.height/14);
    }
    private PImage win;

    private PApplet pap;
}
