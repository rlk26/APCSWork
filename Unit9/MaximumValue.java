import java.util.*;

public class MaximumValue{


  public static void testfindMax(ArrayList<Double>nums, double expected){
    double correct = findMax(nums);
    System.out.println("Expected: " + expected + " Correct: " + correct);
    for(double num : nums){
      System.out.println(num);
    }
    if(correct == expected){
      System.out.println("Woohoo!");
    } else {
      System.out.println("Boohoo!");
    }
  }
  public static double findMax(ArrayList<Double>nums){
    double result  = 0.0;
    for (double num : nums)
    if(num > result){
      result = num;
  }
  return result;
  }
  public static void main(String [] args){
    ArrayList<Double> values = new ArrayList<Double>();
     values.add(8.7);
     values.add(100.5);
     values.add(67.4);
     values.add(30.0);
     testfindMax(values,100.5);

    ArrayList<Double> values2 = new ArrayList<Double>();
     values2.add(13.47);
     values2.add(264.0);
     values2.add(82.9);
     values2.add(44.1);
     testfindMax(values2,264.0);

    ArrayList<Double> values3 = new ArrayList<Double>();
     values3.add(11.2);
     values3.add(28.1);
     values3.add(86.3);
     values3.add(90.1);
     testfindMax(values3,90.1);
  }
}
