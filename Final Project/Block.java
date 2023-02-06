import processing.core.*;
public class Block {
  public Block(PApplet pap, PVector p, float w, float h){
    this.pap = pap;
    this.p = p;
    this. w = w;
    this.h = h;
  }
  public void update() {
  }
  public boolean isInside(Ball b){
    if(pap.dist(b.p.x,b.p.y,p.x,p.y) > w*h){
      return true;
    }
    else {
      return false;
    }
  }
  public void display() {
      pap.fill(255);
      pap.rect(p.x,p.y,w,h);
  }
  private PVector p;
  private float w, h;
  private PApplet pap;
}
