import processing.core.*;

public class Instructions implements Scene {

  public Instructions(PApplet pap){
    this.pap = pap;
  }

  public void reDo(){
  }

  public void display()
  {
    pap.background(0);
    pap.textAlign(pap.CENTER);
    pap.fill(0);
    pap.textSize(pap.width/45);
    pap.stroke(255);
    pap.fill(255);
    pap.text("How To Play!",pap.width/2,pap.height/4);
    pap.textAlign(pap.CORNER);
    pap.textSize(pap.width/50);
    pap.text("1. Use the Arrow Keys To Control The Platform!",pap.width/4,pap.height/4+pap.height/8);
    pap.text("2. Keep the Ball from Falling Down",pap.width/4, pap.height/2);
    pap.text("3. Hit as Many Blocks as Possible to Increase your Score!",pap.width/4,pap.height/2+pap.height/8);
    pap.text("4. Get the Ball to the Top of the Screen to Win!",pap.width/4, pap.height/4+pap.height/2);
    pap.text("5. Click the Space Bar to Begin Playing!",pap.width/4,pap.height/4+pap.height/2+pap.height/8);
    pap.stroke(0);
  }
  public boolean isWon() {
    return false;
  }
  public boolean isLost() {
    return false;
  }
  public void handleMouseClicked(){
  }
  public void handleKeyPressed(){
  }
  public void handleKeyReleased(){

  }

  public void saveHighScore(){

  }
  private PApplet pap;
}
