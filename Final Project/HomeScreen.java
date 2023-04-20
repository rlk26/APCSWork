import processing.core.*;
import java.util.*;
public class HomeScreen implements Scene
{
    public HomeScreen(PApplet pap, PImage home, PImage homeButton)
    {
        this.pap = pap;
        this.home = home;
        this.homeButton = homeButton;
    }

    public void reDo(){
    }

    public void display()
    {

      pap.background(home);
      pap.textAlign(pap.CENTER);
      pap.textSize(pap.width/18);
      pap.fill(255);
      pap.text("Welcome to Bricks n Balls!",pap.width/2,pap.height/2-pap.height/16);
      pap.text("Click the Button Above to Begin!",pap.width/2,pap.height/2+pap.height/8);
      pap.imageMode(pap.CENTER);
      //if(mouseX<width/2-)
      pap.image(homeButton,pap.width/2,pap.height/2);
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
    private PImage home, homeButton;
    private PApplet pap;
}
