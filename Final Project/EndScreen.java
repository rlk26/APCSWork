import processing.core.*;
import java.util.*;
public class EndScreen implements Scene
{
    public EndScreen(PApplet pap, PImage end)
    {
        this.pap = pap;
        this.end = end;
    }

    public void reDo(){
    }
    public void display()
    {

      pap.background(end);
      pap.textAlign(pap.CENTER);
      pap.textSize(pap.width/18);
      //pap.text("GAME OVER",pap.width/2,pap.height/2-pap.height/16);
      pap.text("Press Z to play again",pap.width/2,pap.height/2+pap.height/4);
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

    public void saveHighScore(){

    }
    private PImage end;
    private PApplet pap;
}
