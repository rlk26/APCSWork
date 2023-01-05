import java.util.*;
public class Person {
  public Person (String nameIn, float petNumIn){
    name = nameIn;
    petNum = petNumIn;
  }
  public String getName(){
    return name;
  }
  public float getPetNum(){
    return petNum;
  }
  private String name;
  private float petNum;
}
