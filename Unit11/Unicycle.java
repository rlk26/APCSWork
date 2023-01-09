public class Unicycle implements Vehicle {

  public Unicycle () {
  }

  public String name(){
    return "Unicycle";
  }

  public int wheelCount(){
    return 1;
  }

  public boolean isHumanPowered(){
    return true;
  }

}
