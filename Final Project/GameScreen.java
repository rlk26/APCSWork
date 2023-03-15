import processing.core.*;
import java.util.*;
public class GameScreen implements Scene
{
    public GameScreen(PApplet pap)
    {
        this.pap = pap;
        plat = new Platform(pap,pap.width/2,pap.height/2 + pap.height/4 + pap.height/6,pap.width/10,pap.height/45);
        PVector p = new PVector(pap.width/2, pap.height-pap.height/4);
        PVector v = new PVector(pap.width/60,pap.height/60);
        //PVector platp = new PVector(pap.width/2,pap.height/2+pap.height/4*3);
        v.setMag(pap.random(pap.width/266, pap.width/150));
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
    }

    public void display()
    {
      pap.background(0);
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
    public static Ball b;
    public static int life;
    public static Platform plat;
    private ArrayList<Block>blocks;
    private PApplet pap;
}
