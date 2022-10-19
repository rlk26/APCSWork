import processing.core.*;

public class Code extends PApplet
{
  public Code(PApplet pap, int x, int y, int vx, int vy){

    this.pap = pap;
    this.x = x;
    this.y = y;
    this.x = vx;
    this.vy = vy;

  }
  private PApplet pap;
  private int x,y;
  private int vx, vy;

  public static void main(String[] args)
  {
  }
}
