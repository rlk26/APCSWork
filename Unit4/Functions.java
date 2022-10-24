public class Functions {
  public static void testcountOccurrences(String hey, String count, int expected){
    int correct = countOccurrences(hey,count);
    System.out.println("Expected: " + expected + " Correct: " + correct);
    if(correct == expected){
      System.out.println("Woohoo!");
    } else {
      System.out.println("Boohoo!");
    }
  }
  /*public static void sumOfSquares(int sum){
    if (int i = 0; i < sum; i++){
    int result = i;

  }

  return result ;
}*/
  public static int countOccurrences(String hey, String count){
    int counting = 0;
    for(int i = 0; i<=hey.length(); i++){
      if(count == ""){
      counting++;
    }
  }
    return counting;
  }
  public static String reverse(String hey){
    String hello;
    for(int i = hey.length(); i > 0; i--){
      hello = hey.substring(i, i+1);
      return hello;
    }
  }
  /*public static void factorial(int a){


  }*/
  public static void main(String [] args){
    testcountOccurrences("Bananananana", "na", 5);
    reverse(hello);
    //sumOfSquares(1);
    //sumOfSquares(2)
  }
}
