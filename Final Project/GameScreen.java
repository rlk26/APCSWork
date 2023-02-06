import processing.core.*;
import java.util.*;
public class GameScreen implements Scene
{
    public GameScreen(PApplet pap)
    {
        this.pap = pap;

        PVector p = new PVector(pap.width/2, pap.height-30);
        PVector v = PVector.random2D();;
        v.setMag(pap.random(pap.width/266, pap.width/150));
        b = new Ball(pap,p,v,pap.height/40);
        blocks = new ArrayList<Block>();
        for (int i = 0; i < pap.width; i+=pap.width/10) {
        for (int j = pap.height/6; j < pap.height/2; j+=pap.height/10) {
          PVector ij = new PVector(i,j);
          Block b = new Block(pap,ij,pap.width/10,pap.height/20);
          blocks.add(b);
          }
        }
    }

    public void display()
    {

      pap.background(0);
      pap.textSize(pap.width/12);
      b.update();
      b.checkEdges();
      b.display();
      for (Block bl : blocks) {
      bl.display();
      if(bl.isInside(b)==true){
        b.v.x = -1;
        b.v.y = -1;
      }
  }
    }
    private Ball b;
    private ArrayList<Block>blocks;
    private PApplet pap;
}
