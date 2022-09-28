public class icyHot{
  public static void testicyHot(int temp1, int temp2, boolean expected){
  boolean result = icyHot(temp1, temp2, expected);
    System.out.println("Temp1: " + temp1 + ", Temp2: " + temp2 + ", Expected result of temperatures: " + expected + ", Result of temperatures: " + result);
    if(expected == result){
      System.out.println("Woohoo!");
    } else {
      System.out.println("Boohoo!");
    }
  }
public static boolean icyHot(int temp1, int temp2, boolean expected) {
  if ((temp1 < 0 && temp2 > 100) || (temp1 > 100 && temp2 < 0)) {
    return true;
  } else {
    return false;
  }
}
  public static void main(String[] args) {
    testicyHot(10,10,false);
    testicyHot(102,-20,true);
    testicyHot(80,60,false);
    testicyHot(-35,110,true);
}
}
