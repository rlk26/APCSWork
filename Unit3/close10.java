public class close10{

  public static void testclose10(int a, int b, int expected){
    int correct = close10(a,b);
    System.out.println("Expected: " + expected + " Correct: " + correct);
    if(correct == expected){
      System.out.println("Woohoo!");
    } else {
      System.out.println("Boohoo!");
    }
  }

public static int close10(int a, int b) {
  int aDiff = Math.abs(a - 10);
  int bDiff = Math.abs(b - 10);

  if (aDiff < bDiff) {
    return a;
  }
  if (bDiff < aDiff) {
    return b;
  } else {
  return 0;
}
}

public static void main(String [] args){
  testclose10(10,20,10);
  testclose10(40,18,18);
  testclose10(8,12,0);
  testclose10(0,8,8);
}
}
