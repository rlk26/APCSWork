public class Rectangle {
  public Rectangle(double baseIn, double heightIn){
  base = baseIn;
  height = heightIn;
}
  private double base;
  private double height;

  public void area(){
    System.out.println(base*height);
  }
  public void perimeter(){
    System.out.println(base+height+base+height);
  }
  public void diagonal(){
    System.out.println(Math.sqrt(base*base + height*height));
  }
}
