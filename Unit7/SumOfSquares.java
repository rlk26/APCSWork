public class SumOfSquares{
  public static void testsumOfSquares(double  [] nums, double expected) {
    double correct = sumOfSquares(nums);
    System.out.println("Expected: " + expected + " Correct: " + correct);
    if(correct == expected){
      System.out.println("Woohoo!");
    } else {
      System.out.println("Boohoo!");
    }
  }
  public static double sumOfSquares(double  [] nums){
    double count = 0;
    for (double  num : nums)
    count += (num*num);
    return count;

  }
  public static void main (String [] args){
    double [] values = new double [4];
    values [0] = 1;
    values [1] = 2;
    values [2] = 3;
    values [3] = 4;
    testsumOfSquares(values,30);

    double [] values2 = new double [4];
    values2 [0] = 5;
    values2 [1] = 7;
    values2 [2] = 0;
    values2 [3] = 0;
    testsumOfSquares(values2,74);

    double [] values3 = new double [4];
    values3 [0] = 1;
    values3 [1] = 1;
    values3 [2] = 1;
    values3 [3] = 2;
    testsumOfSquares(values3,7);
}

}
