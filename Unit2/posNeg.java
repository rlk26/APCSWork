public class PosNeg{

  public static void main(String[] args) {
      public static boolean posNeg(int a, int b, boolean negative) {
      if (negative) {
        return (a < 0 && b < 0);
      }
      else {
        return ((a < 0 && b > 0) || (a > 0 && b < 0));
      }
    }

    posNeg(-2,-2, false);

  }
}
