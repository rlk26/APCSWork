import processing.core.*;

public class HomeScreen {

  private PImage home;
  public HomeScreen(PApplet pap){
    this.pap = pap;

  }
  public static void update(){
    home = pap.loadImage("background.jpg");
    home.resize(800,800);
  }

  public static void display()
  {
    pap.background(home);
  }
  private PApplet pap;
}
