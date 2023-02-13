import processing.core.*;
public class Platform {
  public Platform(PApplet pap, PVector p, PVector v, int w, int h){


  }
  public void update() {
  }
  public void display() {
      pap.fill(255);
      pap.rect(p.x,p.y,w,h);
  }
  private PVector p;
  private float w,h;
  private PApplet pap;
}
