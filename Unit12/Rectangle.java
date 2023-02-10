public class Rectangle {
  public Rectangle(String nameIn,double baseIn, double heightIn){
  name = nameIn;
  base = baseIn;
  height = heightIn;
}
  public String getName(){
    return name;
  }
  public double getBase(){
    return base;
  }
  public double getHeight(){
    return height;
  }
  public double area(){
    return base*height;
  }
  public double perimeter(){
    return base+height+base+height;
  }

  private double base;
  private double height;
  private String name;

}
