public class posNeg{
  public static void testposNeg(int a, int b, boolean negative, boolean expected){
  boolean result = posNeg(a,b,negative);
    System.out.println("a: " + a + ", b: " + b + ", Negative: " + negative + ", Expected: " + expected +", Result: " + result);
    if(expected == result){
      System.out.println("Woohoo!");
    } else {
      System.out.println("Boohoo!");
    }
  }
      public static boolean posNeg(int a, int b, boolean negative) {
      if (negative == true) {
        return (a < 0 && b < 0);
      } else {
        return ((a < 0 && b > 0) || (a > 0 && b < 0));
      }
    }
    public static void main(String[] args) {
    testposNeg(1,-1, false, true);
    testposNeg(5,3, true, false);
    testposNeg(-2,-2, false, false);
    testposNeg(-7,2, true, false);
  }
}
