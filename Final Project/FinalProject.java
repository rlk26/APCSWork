import processing.core.*;
import java.util.*;

public class FinalProject extends PApplet {

  String gameState;


  public void settings()
  {
      size(800,800);
  }

  public void setup()
  {
    gameState = "START";
    if(gameState == "START"){
      HomeScreen.update();
      HomeScreen.display();
    }
  }

  public void draw()
  {
  }

  public void keyPressed(){

  }

  public static void main(String [] args){
    PApplet.main("FinalProject");

  }
}
