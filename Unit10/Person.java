import java.util.*;
public class Person {
  public Person (String nameIn, int petNumIn){
    name = nameIn;
    petNum = petNumIn;
  }
  public String getName(){
    return name;
  }
  public int getPetNum(){
    return petNum;
  }
  private String name;
  private int petNum;
}
