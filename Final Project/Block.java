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
    if(b.p.x>p.x && b.p.x<p.x+w && b.p.x>p.y && b.p.y<p.y+h){
      //pap.fill(255,0,0);
      b.v.y*=-1;
      return true;
    }else {
      //pap.fill(255);
      return false;
    }
  }

  public void display() {
      pap.rect(p.x,p.y,w,h);
  }
  private PVector p;
  private float w, h;
  private PApplet pap;
}
