import processing.core.*;
import java.util.*;
public class GameScreen implements Scene
{
    public GameScreen(PApplet pap, PImage game)
    {
        this.pap = pap;
        this.game = game;
        reDo();
    }

    public void saveHighScore(){
      String scoreString = "" + score;
      String [] scores = {scoreString};
      pap.saveStrings(filename, scores);
      System.out.println(scoreString);
    }

    public void reDo(){
      //System.out.println("Hello");
      plat = new Platform(pap,pap.width/2,pap.height/2 + pap.height/4 + pap.height/6,pap.width/10,pap.height/45);
      PVector p = new PVector(pap.width/2, pap.height-pap.height/4);
      PVector v = new PVector(pap.width/60,pap.height/60);
      //PVector platp = new PVector(pap.width/2,pap.height/2+pap.height/4*3);
      v.setMag(pap.random(pap.width/266, pap.height/150));
      life = 3;
      b = new Ball(pap,p,v,pap.height/40,life);
      blocks = new ArrayList<Block>();
      for (int i = 0; i < pap.width; i+=pap.width/10) {
      for (int j = 0; j < pap.height/2; j+=pap.height/10) {
        PVector ij = new PVector(i,j);
        Block b = new Block(pap,ij,pap.width/10,pap.height/10);
        blocks.add(b);
        }
      }
      score = 0;
      filename = "highScore.txt";
      //line = pap.loadStrings(filename);
    }

    public void display()
    {
      pap.background(game);
      pap.text("Score: " + score, 0 + pap.width/6, pap.height - pap.height/12);
      pap.textSize(pap.width/12);
      plat.update();
      plat.checkEdges();
      plat.isInside(b);
    //  plat.keyPressed();
      plat.display();
      b.update();
      b.checkEdges();
      //b.checkBottom(plat);
      b.display();
      for (int i = blocks.size()-1; i >= 0;i--) {
        Block bl = blocks.get(i);
        bl.display();
        //bl.isInside(b);
        if(bl.isInside(b)==true){
        blocks.remove(i);
        score +=1;
        bl.display();
        }
      }
    }
    public boolean isWon() {
      if (b.checkWin()==true){
        saveHighScore();
        return true;
      }
      else {
        return false;
      }
    }
    public boolean isLost() {
      if (b.checkBottom(plat)==true){
        saveHighScore();
        return true;
      }
      else {
        return false;
      }
    }
    public void handleMouseClicked(){
    }
    public void handleKeyPressed(){
      if(pap.keyCode == pap.LEFT){
        plat.vx -= pap.width/140;
      }
      else if(pap.keyCode == pap.RIGHT){
        plat.vx += pap.width/150;
      }
      else {
       plat.vx = 0;
      }
    }
    public void handleKeyReleased(){
        if(pap.keyCode == pap.LEFT){
        plat.vx = 0;
        }
        else if(pap.keyCode == pap.RIGHT){
        plat.vx = 0;
        }

    }

    private Ball b;
    private int life;
    private PImage game;
    private int score;
    private String filename;
    private String [] line;
    private Platform plat;
    private ArrayList<Block>blocks;
    private PApplet pap;
}
