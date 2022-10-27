import processing.core.*;

public class Star
{
  public Star(PApplet pap, float x, float y, int angle){

    this.pap = pap;
    this.x = x;
    this.y = y;
    this.a = a;

  }

  void update(){
    pushMatrix();
    translate(x,y);
    rotate(a);
    rectMode(CENTER);
    fill(169,250,207);
    rect(0,0,60,20);
    rect(0, 0, 20, 60);
    a += 0.02;
    popMatrix();
  }
  private PApplet pap;
  private float x,y;
  private float a;

  public static void main(String[] args)
  {
  }
}
