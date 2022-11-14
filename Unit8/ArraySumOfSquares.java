import java.util.*;
public class ArraySumOfSquares{
  public static void testsumOfSquares(ArrayList<Double>nums, double expected) {
    double correct = sumOfSquares(nums);
    System.out.println("Expected: " + expected + " Correct: " + correct);
    if(correct == expected){
      System.out.println("Woohoo!");
    } else {
      System.out.println("Boohoo!");
    }
  }
  public static double sumOfSquares(ArrayList<Double>nums){
    double count = 0.;
    for (double  num : nums)
    count += (num*num);
    return count;

  }
  public static void main (String [] args){
    ArrayList<Double> values = new ArrayList<Double>();
    values.add(1.0);
    values.add(2.0);
    values.add(3.0);
    values.add(4.0);
    testsumOfSquares(values,30.0);

    ArrayList<Double> values2 = new ArrayList<Double>();
    values2.add(5.0);
    values2.add(7.0);
    values2.add(0.);
    values2.add(0.);
    testsumOfSquares(values2,74.0);

    ArrayList<Double> values3 = new ArrayList<Double>();
    values3.add(1.0);
    values3.add(1.0);
    values3.add(1.0);
    values3.add(2.0);
    testsumOfSquares(values3,7.0);
}

}
