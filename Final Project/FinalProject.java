import processing.core.*;
import java.util.*;

public class FinalProject extends PApplet {

  String gameState;

  PImage home;

  PImage win;

  PFont font;

  Ball b;

  public void settings()
  {
      size(800,800);

  }

  public void setup()
  {
    gameState = "START";
    home = loadImage("background.jpg");
    home.resize(800,800);
    win = loadImage("win.png");
    win.resize(800,800);
    font = loadFont("font.vlw");
    textFont(font);
    PVector p = new PVector(width/2, height/2);
    PVector v = PVector.random2D();;
    v.setMag(random(3, 5));
    b = new Ball(this,p,v,20);
  }

  public void draw()
  {
    if(gameState == "START"){
      homeScreen();
    }
    if(gameState == "WIN"){
      winScreen();
    }
    if(gameState == "GAME"){
      gameScreen();
    }
  }

  public void homeScreen(){
    background(home);
    textAlign(CENTER);
    textSize(width/12);
    text("Welcome to Brick Breaker",width/2,height/2-height/16);
    text("Press Enter to Begin",width/2,height/2+height/16);

  }

  public void winScreen(){
    background(win);
    text("WINNER!",width/2,height/2-height/14);
    textSize(width/16);
    text("Press the Space Bar to Go Home",width/2,height/2+height/14);
  }
  public void gameScreen(){
    background(0);
    textSize(width/12);
    b.update();
    b.checkEdges();
    b.display();
  }

  public void keyPressed(){
    if(keyCode == ENTER && gameState == "START"){
      gameState = "GAME";
    } else if (keyCode == SHIFT){
      gameState = "WIN";
    } else if (keyCode == ' ' && gameState == "WIN"){
      gameState = "START";
    }
  }

  public static void main(String [] args){
    PApplet.main("FinalProject");

  }
}
