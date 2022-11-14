import java.util.*;

public class ArrayCountLucky {
  public static void testCountLucky(ArrayList<Integer>nums, int expected) {
   int correct = countLucky(nums);
    System.out.println("Expected: " + expected + " Correct: " + correct);
    for(int num : nums){
      System.out.println(num);
    }
    if(correct == expected){
      System.out.println("Woohoo!");
    } else {
      System.out.println("Boohoo!");
    }
  }
  public static int countLucky(ArrayList<Integer>nums){
   int count = 0;
    for (int num : nums)
    if (num%7 == 0 || num%10 == 7) {
      count++;
  }

  return count;

  }
  public static void main (String [] args){
   ArrayList<Integer> values = new ArrayList<Integer>();
    values.add(7);
    values.add(107);
    values.add(140);
    values.add(99);
    testCountLucky(values,3);

   ArrayList<Integer> values2 = new ArrayList<Integer>();
    values2.add(1);
    values2.add(57);
    values2.add(210);
    values2.add(43);
    testCountLucky(values2,2);

   ArrayList<Integer> values3 = new ArrayList<Integer>();
    values3.add(111);
    values3.add(85);
    values3.add(317);
    values3.add(16);
    testCountLucky(values3,1);
}

}
