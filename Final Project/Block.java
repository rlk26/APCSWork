import processing.core.*;
public class Block {
  public Block(PApplet pap, PVector p, float w, float h){
    this.pap = pap;
    //this.blocker = blocker;
    this.p = p;
    this. w = w;
    this.h = h;
    blocker = pap.loadImage("BlockButton.png");
  //  blocker.resize(w,h);
  }

  public boolean isInside(Ball b){
    if(b.p.x+b.r>p.x && b.p.x+b.r<p.x+w && b.p.y+b.r>p.y && b.p.y+b.r<p.y+h){
      //pap.fill(255,0,0);
      b.v.y*=-1;
      return true;
    }else {
      pap.fill(255);
      return false;
    }
  }

  public void display() {
      //pap.image(blocker,p.x,p.y);
      pap.rect(p.x,p.y,w,h);
  }
  private PImage blocker;
  private PVector p;
  private float w, h;
  private PApplet pap;
}
