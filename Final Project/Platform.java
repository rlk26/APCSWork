import processing.core.*;
public class Platform {
  public Platform(PApplet pap, PVector p, PVector v, int w, int h){


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
