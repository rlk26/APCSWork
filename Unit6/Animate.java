import processing.core.*;
import java.util.*;

public class Animate extends PApplet
{
    public void settings()
    {
        size(800, 800);
    }

    public void setup()
    {
     stars = new ArrayList <Star>();

    }

    public void createStar(){
    star = new Star(this,random(0,800),random(0,800), 0);
    stars.add(star);
    }

    public void draw()
    {
        background(255);

        for (Star star : stars){
          star.update();
        }

    }

    public void keyPressed(){
      createStar();
    }

    public static void main(String[] args)
    {
        PApplet.main("Animate");
    }
    private ArrayList < Star > stars;
    private Star star;
}
