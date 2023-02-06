import processing.core.*;
public class Ball {
  public Ball(PApplet pap, PVector p, PVector v,float r){
    this.pap = pap;
    this.p = p;
    this.v = v;
    this.r = r;
    life = 3;


  }
  public void update() {
    p.add(v);
  }
  public void checkEdges() {
    if (p.x > pap.width || p.x < 0) {
      v.x*=-1;
    }
    if (p.y > pap.height || p.y < 0) {
      v.y*=-1;
    }
  }
  /*public void isInside(float a, float b){
    if(pap.dist(p.x,p.y,a,b) > r){

    }
  }*/
  public void display() {
      pap.fill(255);
      pap.ellipse(p.x, p.y, r, r);
  }
  public PVector p;
  public PVector v;
  private float r;
  private PApplet pap;
  private int life;
}
