public class Elephant extends Animal {
  public Elephant(String name, int legCount, boolean furriness){
    super(name,legCount, furriness);
  }
  public String name(){
    return name;
  }
  public int legCount(){
    return legCount;
  }
  public boolean furriness(){
    return furriness;
  }
}
