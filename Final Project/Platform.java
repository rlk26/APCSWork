import processing.core.*;
public class Platform {
  public Platform(PApplet pap, PVector p, PVector v, int w, int h){
    this.pap = pap;
    this.p = p;
    this.v = v;
    this.w = w;
    this.h = h;
  }
  public void update() {
    pap.add(v);
  }
  public void display() {
      pap.fill(255);
      pap.rect(p.x,p.y,w,h);
  }
  private PVector p,v;
  private float w,h;
  private PApplet pap;
}
