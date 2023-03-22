import processing.core.*;
import java.util.*;

public class FinalProject extends PApplet {

  //String gameState;

  PImage home;

  PImage win;

  PImage end;

  PFont font;

  Ball b;

  PImage one, two, three;


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
    end = loadImage("end.png");
    end.resize(width,height);
    font = loadFont("Phosphate-Inline-48.vlw");
    one = loadImage("one.png");
    one.resize(width/5,width/5);
    two = loadImage("two.png");
    two.resize(width/5,width/5);
    three = loadImage("three.png");
    three.resize(width/5,width/5);
    textFont(font);
    scenes = new ArrayList<Scene>();
    scenes.add(new HomeScreen(this,home));
    scenes.add(new LevelSelector(this, one, two, three));
    scenes.add(new GameScreen(this));
    scenes.add(new WinScreen(this,win));
    scenes.add(new EndScreen(this,end));
    scenes.add(new GameScreen2(this));
    scenes.add(new GameScreen3(this));
  }

  public void draw()
  {
    scenes.get(current).display();
    if(current == 2 || current == 5){
    if(GameScreen.b.checkBottom(GameScreen.plat)==true){
      current += 2;
    }
    if(GameScreen.b.checkWin()==true){
      current++;
    }
    if(GameScreen2.b.checkBottom(GameScreen2.plat)==true){
      current--;
    }
    if(GameScreen2.b.checkWin()==true){
      current -= 1;
    }
  }
    if(current == 0){
      GameScreen.b.life = 3;
      GameScreen2.b.life = 3;
    }
  }

  public void keyPressed(){
    if (keyCode == ENTER)  {
      if (current == 0){
        current++;
      }
  }
    if(keyCode == ' '){
      if(current == 3){
        current = 0;
      }
    }
    if(current == 4){
      if(keyCode == 'z' || keyCode == 'Z'){
        current = 0;
      }
    }

    if(current == 2 || current == 5){
      if(keyCode == LEFT){
      GameScreen.plat.vx += -width/90;
      GameScreen2.plat.vx += -width/80;
      }
      else if(keyCode == RIGHT){
      GameScreen.plat.vx += width/90;
      GameScreen2.plat.vx += width/80;
      }
      else {
       GameScreen.plat.vx = 0;
       GameScreen2.plat.vx = 0;
      }
    }
  }

  public void keyReleased(){
    if(current == 2 || current == 5){
      if(keyCode == LEFT){
      GameScreen.plat.vx = 0;
      GameScreen2.plat.vx = 0;
      }
      else if(keyCode == RIGHT){
      GameScreen.plat.vx = 0;
      GameScreen2.plat.vx = 0;
      }
    }
  }
  public void mouseClicked(){
    if(current == 1){
    if(dist(width/4,height/2,mouseX,mouseY)<width/8){
      //System.out.println("lalal");
      current++;
    }
      if(dist(width/2,height/2,mouseX,mouseY)<width/8){
        current += 4;
      }
  }
  }

  public static void main(String [] args){
    PApplet.main("FinalProject");

  }
}
