public class Functions {
  public static void testsumOfSquares(int sum,int expected){
    int correct = sumOfSquares(sum);
    System.out.println("Expected: " + expected + " Correct: " + correct);
    if(correct == expected){
      System.out.println("Woohoo!");
    } else {
      System.out.println("Boohoo!");
    }
  }
  public static void testcountOccurrences(String hey, String count, int expected){
    int correct = countOccurrences(hey,count);
    System.out.println("Expected: " + expected + " Correct: " + correct);
    if(correct == expected){
      System.out.println("Woohoo!");
    } else {
      System.out.println("Boohoo!");
    }
  }

  public static void testReverse(String hey, String expected){
    String correct = reverse(hey);
    System.out.println("Expected: " + expected + " Correct: " + correct);
    if(correct.equals(expected)){
      System.out.println("Woohoo!");
    } else {
      System.out.println("Boohoo!");
    }
  }

  public static void testFactorial(int a, int expected){
    int correct = factorial(a);
    System.out.println("Expected: " + expected + " Correct: " + correct);
    if(correct == expected){
      System.out.println("Woohoo!");
    } else {
      System.out.println("Boohoo!");
    }
  }
  public static int sumOfSquares(int sum){
    int result = 0;
    for (int i = 1; i <= sum; i++)
      result += (i*i);
    return result;
}
  public static int countOccurrences(String hey, String count){
    int counting = 0;
    int hi = 0;
    while (hi != -1){
    hi = hey.indexOf(count,hi);
    if(hi != -1){
        counting++;
    hi += count.length();
  }
}
  return counting;
}
  public static String reverse(String hey){
    String hello = "";
    for(int i = hey.length() - 1; i >= 0; i--)
      //String hello = hey.substring(i, i+1);
      hello = hello + hey.charAt(i);
      return hello;
  }
  public static int factorial(int a){
    int hey = 1;
    for(int i = 1 ;i<=a;i++)
          hey=hey*i;
    return hey;
  }
  public static void main(String [] args){
    testcountOccurrences("Bananananana", "na", 5);
    testcountOccurrences("Mississippi", "iss", 2);
    testcountOccurrences("lalalalalalalalala", "la", 9);
    testReverse("hello", "olleh");
    testReverse("Ramya", "aymaR");
    testReverse("sleepy", "ypeels");
    testsumOfSquares(1,1);
    testsumOfSquares(2,5);
    testsumOfSquares(3,14);
    testsumOfSquares(4,30);
    testFactorial(5,120);
    testFactorial(2,2);
    testFactorial(4,24);
    testFactorial(0,1);
  }
}
