import processing.core.*;
public class GameScreen implements Scene
{
    public GameScreen(PApplet pap)
    {
        this.pap = pap;
        PVector p = new PVector(pap.width/2, pap.height/2);
        PVector v = PVector.random2D();;
        v.setMag(pap.random(pap.width/266, pap.width/150));
        b = new Ball(pap,p,v,pap.height/40);
    }

    public void display()
    {
      pap.background(0);
      pap.textSize(pap.width/12);
      b.update();
      b.checkEdges();
      b.display();
    }
    private Ball b;
    private PApplet pap;
}
