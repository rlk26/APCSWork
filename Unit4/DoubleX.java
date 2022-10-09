public class DoubleX {
  public static void testdoubleX(String hey, boolean expected){
    boolean correct = doubleX(hey);
    System.out.println("String: " + hey + " Expected: " + expected + " Correct: " + correct);
    if(correct == expected){
      System.out.println("Woohoo!");
    } else {
      System.out.println("Boohoo!");
    }
  }
  public static boolean doubleX(String hey) {
  int i = hey.indexOf("x");
  if (i == -1) {
  return false;
}
  else if (i+1 >= hey.length()){
  return false;
} else {
  return hey.substring(i+1, i+2).equals("x");
}
}
  public static void main(String [] args){
    testdoubleX("axxbb", true);
    testdoubleX("axaxax", false);
    testdoubleX("xxxxx", true);
  }
}
