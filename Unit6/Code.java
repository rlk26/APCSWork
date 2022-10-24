import processing.core.*;

public class Code extends PApplet
{
  public Code(PApplet pap, float x, float y, int vx, int vy, int angle){

    this.pap = pap;
    this.x = x;
    this.y = y;
    this.x = vx;
    this.vy = vy;

  }
  private PApplet pap;
  private float x,y;
  private float a;
  private int vx, vy;

  public static void main(String[] args)
  {
  }
}
