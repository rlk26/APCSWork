import processing.core.*;
public class Block {
  public Block(PApplet pap, PVector p, float w){


  }
  public void update() {
  }
  public void collision(Ball b){
    if(b.isInside(p.x.p.y)){
      
    }
  }
  public void display() {
      pap.fill(255);
      pap.rect(p.x,p.y,p.);
  }
  private PVector p;
  private PApplet pap;
}
