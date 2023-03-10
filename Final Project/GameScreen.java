import processing.core.*;
import java.util.*;
public class GameScreen implements Scene
{
    public GameScreen(PApplet pap)
    {
        this.pap = pap;
        plat = new Platform(pap,pap.width/2,pap.height/2 + pap.height/4 + pap.height/6,pap.width/15,pap.height/45);
        PVector p = new PVector(pap.width/2, pap.height/4*3);
        PVector v = new PVector(15,15);
        //PVector platp = new PVector(pap.width/2,pap.height/2+pap.height/4*3);
        v.setMag(pap.random(pap.width/266, pap.width/150));
        b = new Ball(pap,p,v,pap.height/40);
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
    private Ball b;
    public static Platform plat;
    private ArrayList<Block>blocks;
    private PApplet pap;
}
