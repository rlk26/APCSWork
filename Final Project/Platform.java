import processing.core.*;
public class Platform {
  public Platform(PApplet pap, int x, int y, float w, float h/*, int vx*/){
    this.pap = pap;
    this.x = x;
    this.y = y;
    this.w = w;
    this.h = h;
    vx = 0;
  }
  public void update() {
    x += vx;
  }
  public void checkEdges(){
    if (x > pap.width || x < 0) {
     vx = 0;
    }
  }

  public boolean isInside(Ball b){
    if(b.p.x+b.r>x && b.p.x+b.r<x+w && b.p.y+b.r>y && b.p.y+b.r<y+h){
      //pap.fill(255,0,0);
      b.v.y*=-1;
      return true;
    }else {
      pap.fill(255);
      return false;
    }
  }

  public void display() {
      //pap.fill(255);
      pap.rect(x,y,w,h);
  }


  public void keyPressed(){
    if(pap.keyCode == pap.LEFT){
      vx *= -10;
    }
    else if(pap.keyCode == pap.RIGHT){
      vx *= 10;
    }
    //else {
    //  vx = 0;
    //}
  }
  private int x,y;
  public int vx;
  private float w,h;
  private PApplet pap;
}
