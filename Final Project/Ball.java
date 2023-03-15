import processing.core.*;
public class Ball {
  public Ball(PApplet pap, PVector p, PVector v,float r, int life){
    this.pap = pap;
    this.p = p;
    this.v = v;
    this.r = r;
    this.life = life;


  }
  public void update() {
    p.add(v);
  }
  public void checkEdges() {
    if (p.x > pap.width || p.x < 0) {
      v.x*=-1;
    }
    //if (p.y > pap.height || p.y < 0) {
      //v.y*=-1;
    //}
  }
  public boolean checkBottom(Platform pl){
    if (p.y > pap.height && life == 0) {
      return true;
    } else if (p.y > pap.height && life != 0){
      life--;
      p.y = pl.y-pap.height/10;
      p.x = pl.x;
      v.x *= -1;
      v.y *= -1;
      return false;
    } else {
      return false;
    }
  }
  public boolean checkWin(){
    if(p.y < 0){
      return true;
    } else {
      return false;
    }
  }
  public void display() {
      pap.text("Lives: " + life, pap.width - pap.width/6, pap.height - pap.height/12);
      pap.fill(255);
      pap.ellipse(p.x, p.y, r, r);
  }
  public PVector p;
  public PVector v;
  public float r;
  public int life;
  private PApplet pap;
}
