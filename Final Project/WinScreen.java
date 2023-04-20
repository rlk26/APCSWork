import processing.core.*;
public class WinScreen implements Scene
{
    public WinScreen(PApplet pap, PImage win)
    {
        this.pap = pap;
        this.win = win;
    }

    public void reDo(){
    }
    
    public void display()
    {
      pap.background(win);
      pap.textAlign(pap.CENTER);
      pap.fill(0);
      pap.textSize(pap.width/45);
      pap.text("WINNER!",pap.width/6,pap.height/4);
      pap.textSize(pap.width/50);
      pap.text("Press the Space Bar to Go Home",pap.width-pap.width/4,pap.height/4);
    }
    public boolean isWon() {
      return false;
    }
    public boolean isLost() {
      return false;
    }
    public void handleMouseClicked(){
    }
    public void handleKeyPressed(){
    }
    public void handleKeyReleased(){

    }
    private PImage win;

    private PApplet pap;
}
