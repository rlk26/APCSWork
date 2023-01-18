import processing.core.*;
public class Block {
  public Block(PApplet pap,int x, int y, int w, int h){


  }
  public void update() {
  }
  public void display() {
      pap.fill(255);
      pap.rect(x,y,w,h);
  }
  private int x,y,w,h;
  private PApplet pap;
}
