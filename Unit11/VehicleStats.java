import java.util.*;
public class VehicleStats{

  public static void testtotalWheels(ArrayList<Vehicle>vehicles, int expected){
    int correct = totalWheels(vehicles);
    System.out.println("Expected: " + expected + " Correct: " + correct);
    for(Vehicle v : vehicles){
      System.out.println(v.wheelCount());
    }
    if(correct == expected){
      System.out.println("Woohoo!");
    } else {
      System.out.println("Boohoo!");
    }
  }

  public static int totalWheels(ArrayList<Vehicle>vehicles){
    int result = 0;
    for(Vehicle v : vehicles){
      result += v.wheelCount();
    }
    return result;
  }

  public static ArrayList<Vehicle> humanPowered(ArrayList<Vehicle>vehicles){
    ArrayList<Vehicle> humans = new ArrayList<Vehicle>();
    for(Vehicle v : vehicles){
      System.out.println(v.isHumanPowered());
      if(v.isHumanPowered() == true)
      humans.add(v);
    }
    return humans;
  }

  public static void main(String [] args){
    ArrayList<Vehicle> vehicles = new ArrayList<Vehicle>();
    Car c1 = new Car();
    vehicles.add(c1);
    Motorcycle m1 = new Motorcycle();
    vehicles.add(m1);
    Bicycle b1 = new Bicycle();
    vehicles.add(b1);
    Unicycle u1 = new Unicycle();
    vehicles.add(u1);
    testtotalWheels(vehicles,9);
    System.out.println(humanPowered(vehicles));

  }
}
