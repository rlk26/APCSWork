import processing.core.*;

public class Animate extends PApplet
{
    public void settings()
    {
        size(800, 800);
    }

    public void setup()
    {
      createStar();
    }

    public void createStar(){
      float x = 400;
      float y = 400;
      int a = 0;

      star = new Star(this,x,y,a);
    }

    public void draw()
    {
        background(255);
        star.update();
    }

    public static void main(String[] args)
    {
        PApplet.main("Animate");
    }
    private Star star;
}
