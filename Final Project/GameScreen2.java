import processing.core.*;
import java.util.*;
public class GameScreen2 implements Scene
{
    public GameScreen2(PApplet pap, PImage game2)
    {
        this.pap = pap;
        this.game2 = game2;
        reDo();
    }

    public void reDo(){
      this.pap = pap;
      plat = new Platform(pap,pap.width/2,pap.height/2 + pap.height/4 + pap.height/6,pap.width/12,pap.height/45);
      PVector p = new PVector(pap.width/2, pap.height-pap.height/4);
      PVector v = new PVector(pap.width/60,pap.height/60);
      //PVector platp = new PVector(pap.width/2,pap.height/2+pap.height/4*3);
      v.setMag(pap.random(pap.width/180, pap.height/125));
      life = 3;
      b = new Ball(pap,p,v,pap.height/40,life);
      blocks = new ArrayList<Block>();
      for (int i = 0; i < pap.width; i+=pap.width/20) {
      for (int j = 0; j < pap.height/2; j+=pap.height/12) {
        PVector ij = new PVector(i,j);
        Block b = new Block(pap,ij,pap.width/20,pap.height/12);
        blocks.add(b);
        }
      }
    }



    public void display()
    {
      pap.background(game2);
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
        bl.display();
        }
      }
    }

    public boolean isWon() {
      if (b.checkWin()==true){
        return true;
      }
      else {
        return false;
      }
    }
    public boolean isLost() {
      if (b.checkBottom(plat)==true){
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
        plat.vx -= pap.width/80;
      }
      else if(pap.keyCode == pap.RIGHT){
        plat.vx += pap.width/80;
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
    private Platform plat;
    private PImage game2;
    private ArrayList<Block>blocks;
    private PApplet pap;
}
