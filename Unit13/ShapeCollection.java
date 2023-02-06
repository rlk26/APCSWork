import java.util.*;

public class ShapeCollection{
  public static void addShape(Shape s){
    shapes.add(s);
      System.out.println(s.getName());
      System.out.println(s.getSides());


  }
  public static int numberOfSides(String shapeName){
    int result = 0;
    for (Shape s : shapes){
      if(shapeName == s.getName()){
       result = s.getSides();
      }
    }
    return result;

  }
  public static int averageSides(){
    int result = 0;
    int count = 0;
    for(Shape s : shapes){

    result += s.getSides();

    count++;
  }

    return result/count;
  }
  public static ArrayList<Shape> evenSides(){
    ArrayList<Shape> evens = new ArrayList<Shape>();
    for(Shape s : shapes){
      if(s.getSides()%2==0)
      evens.add(s);
    }

    return evens;
  }
  public static void main (String [] args){
    shapes = new ArrayList<Shape>();
    addShape(new Shape("Circle",0));
    addShape(new Shape("Rectangle",4));
    addShape(new Shape("Triangle",3));
    addShape(new Shape("Octogon",8));
    addShape(new Shape("Dodecagon",12));

    System.out.println(numberOfSides("Octogon"));
    System.out.println(averageSides());
    System.out.println(evenSides());
  }

  private static ArrayList<Shape> shapes;
}
