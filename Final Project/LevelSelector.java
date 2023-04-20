import processing.core.*;
import java.util.*;
public class LevelSelector implements Scene
{
    public LevelSelector(PApplet pap, PImage one, PImage two, PImage three)
    {
        this.pap = pap;
        this.one = one;
        this.two = two;
        this.three = three;
    }

    public void reDo(){
    }
    
    public void display()
    {

      pap.background(255);
      pap.fill(0);
      pap.imageMode(pap.CENTER);
      pap.image(one,pap.width/4,pap.height/2);
      pap.image(two,pap.width/2,pap.height/2);
      pap.image(three,pap.width/4+pap.width/2,pap.height/2);
      pap.textAlign(pap.CENTER);
      pap.textSize(pap.width/18);
      pap.text("Click to choose a level",pap.width/2,pap.height/4);
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
    private PImage end;
    private PImage one, two, three;
    private PApplet pap;
}
