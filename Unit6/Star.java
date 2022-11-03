import processing.core.*;

public class Star {

  public Star(PApplet pap, float x, float y, float a){
    this.pap = pap;
    this.x = x;
    this.y = y;
    this.a = a;

  }

  public void update()
  {
    pap.pushMatrix();
    pap.fill(x,y,x);
    pap.translate(x,y);
    pap.rotate(a);
    pap.rectMode(pap.CENTER);
    pap.rect(0,0,60,20);
    pap.rect(0,0,20,60);
    pap.quad(-15,30,-30,15,15,-30, 30,-15 );
    pap.quad(-15,-30,-30,-15,15,30,30,15 );
    pap.rect(0,0,20, 60);
    a += 0.2;
    pap.popMatrix();
  }

  private PApplet pap;
  private float x,y;
  private float a;

}
