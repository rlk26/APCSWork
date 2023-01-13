import java.util.*;
public class AnimalCalculator{

  public static void testaverageLegs(ArrayList<Animal>animals, double expected){
    double correct = averageLegs(animals);
    System.out.println("Expected: " + expected + " Correct: " + correct);
    for(Animal a : animals){
      System.out.println(a.legCount());
    }
    if(correct == expected){
      System.out.println("Woohoo!");
    } else {
      System.out.println("Boohoo!");
    }
  }

  public static void isFurry(ArrayList<Animal>animals){
    for(Animal a : animals){
      System.out.println("Hi, I'm " + a.name() + ". I have " + a.legCount() + " legs.");
      if (a.furriness == true){
      System.out.println("I am furry");
    } else {
      System.out.println("I am not furry");
    }
    }

  }

  public static double averageLegs(ArrayList<Animal>animals){
    double result = 0;
    for(Animal a : animals){
      result += a.legCount();
    }
    return result/animals.size();
  }
//doesnt work yet / unfinished
  public static String fewestLegs(ArrayList<Animal>animals){
    String b = "";
    int result = 30000000;
    for(Animal a : animals)
     if(a.legCount() <= result){
        result = a.legCount();
        b = a.name();

    }
    return b;
  }
  public static void main (String [] args){
    ArrayList<Animal>animals = new ArrayList<Animal>();
    Human h1 = new Human("Human", 2, true);
    animals.add(h1);
    Elephant e1 = new Elephant("Elephant",4,true);
    animals.add(e1);
    Dog d1 = new Dog("Dog",4, true);
    animals.add(d1);
    Fish f1 = new Fish("Fish",0, false);
    animals.add(f1);
    isFurry(animals);
    testaverageLegs(animals, 2.5);
    System.out.println(fewestLegs(animals));
  }

}
