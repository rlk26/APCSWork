import processing.core.*;
//import processing.library.SoundFile.*;
import java.util.*;

public class FinalProject extends PApplet {

  //String gameState;

  PImage home, button1;

  //SoundFile music;

  PImage win;

  PImage game, game2, game3;

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
    game = loadImage("game.png");
    game.resize(width,height);
    game2 = loadImage("Game2.png");
    game2.resize(width,height);
    game3 = loadImage("Game3.png");
    game3.resize(width,height);
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
    button1 = loadImage("BlockButton.png");
    button1.resize(width/2,height/10);
    textFont(font);
    //music = new SoundFile(this, "Powerful-Trap-.mp3");
    scenes = new ArrayList<Scene>();
    scenes.add(new HomeScreen(this, home));
    scenes.add(new LevelSelector(this, one, two, three));
    scenes.add(new GameScreen(this,game));
    scenes.add(new WinScreen(this,win));
    scenes.add(new EndScreen(this,end));
    scenes.add(new GameScreen2(this, game2));
    scenes.add(new GameScreen3(this, game3));
    scenes.add(new Instructions(this));
  }

  public void draw()
  {
    scenes.get(current).display();
    if(current == 2){
    if(scenes.get(current).isLost()){
      current += 2;
    }
    if(scenes.get(current).isWon()){
      current++;
    }
  }
    if(current == 5){
    if(scenes.get(current).isLost()){
      current--;
    }
    if(scenes.get(current).isWon()){
      current -= 1;
    }
  }
    if(current == 6){
    if(scenes.get(current).isLost()){
      current -= 1;
    }
    if(scenes.get(current).isWon()){
      current -= 2;
    }
  }
  }

  public void keyPressed(){
    if(current == 2 || current == 5 || current == 6){
    scenes.get(current).handleKeyPressed();
  }

    if (keyCode == ENTER)  {
      if (current == 0){
        current += 7;
      }
  }
    if(keyCode == ' '){
      if(current == 3){
        current = 0;
      }
    }
    if(current == 7){
      if(key == ' ') {
        current -= 6;
      }
    }
    if(current == 4){
      if(keyCode == 'z' || keyCode == 'Z'){
        GameScreen gameScene = (GameScreen)scenes.get(2);
        gameScene.reDo();
        GameScreen2 gameScene2 = (GameScreen2)scenes.get(5);
        gameScene2.reDo();
        GameScreen3 gameScene3 = (GameScreen3)scenes.get(6);
        gameScene3.reDo();
        current = 0;
      }
    }
    if(current == 3){
      if(key == ' '){
        GameScreen gameScene = (GameScreen)scenes.get(2);
        gameScene.reDo();
        GameScreen2 gameScene2 = (GameScreen2)scenes.get(5);
        gameScene2.reDo();
        GameScreen3 gameScene3 = (GameScreen3)scenes.get(6);
        gameScene3.reDo();
        current = 0;
      }
    }
  }

  public void keyReleased(){
    scenes.get(current).handleKeyReleased();
  }
  public void mouseClicked(){
    scenes.get(current).handleMouseClicked();
    if(current == 1){
    if(dist(width/4,height/2,mouseX,mouseY)<width/8){
      //System.out.println("lalal");
      current++;
    }
      if(dist(width/2,height/2,mouseX,mouseY)<width/8){
        current += 4;
      }
      if(dist(width/4+width/2,height/2,mouseX,mouseY)<width/8){
        //System.out.println("lalal");
        current+=5;
      }
  }
  }

  public static void main(String [] args){
    PApplet.main("FinalProject");

  }
}
