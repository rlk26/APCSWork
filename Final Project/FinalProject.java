import processing.core.*;
import java.util.*;

public class FinalProject extends PApplet {

  //String gameState;

  PImage home;

  PImage win;

  PFont font;

  Ball b;


  ArrayList<Scene> scenes;

  int current = 0;

  public void settings()
  {
      fullScreen();

  }

  public void setup()
  {
    home = loadImage("background.jpg");
    home.resize(width,height);
    win = loadImage("win.png");
    win.resize(width,height);
    font = loadFont("font.vlw");
    textFont(font);
    scenes = new ArrayList<Scene>();
    scenes.add(new HomeScreen(this,home));
    scenes.add(new GameScreen(this));
    scenes.add(new WinScreen(this,win));
  }

  public void draw()
  {
    scenes.get(current).display();

  }

  public void keyPressed(){
      if (keyCode == ENTER)  {
          if (current == 0){
              current++;
            }
        }

        if (keyCode == SHIFT)  {
            if (current == 1){
                current++;
              }
          }
  }

  public static void main(String [] args){
    PApplet.main("FinalProject");

  }
}
