
import java.util.*;

public class ArrayCountZNames{

public static void testcountZNames(ArrayList<String>nums, int expected) {
 int correct = countZNames(nums);
  System.out.println("Expected: " + expected + " Correct: " + correct);
  for(String num : nums){
    System.out.println(num);
  }
  if(correct == expected){
    System.out.println("Woohoo!");
  } else {
    System.out.println("Boohoo!");
  }
}
public static int countZNames(ArrayList<String>nums){
 int count = 0;
  for (String num : nums)
      if(num.substring(0,1).equals("Z")){
    count += 1;
}
  else if (num.substring(0,1).equals("z")){
  count += 1;
}

  return count;

}

public static void main (String [] args){
  ArrayList<String> values = new ArrayList<String>();
  values.add("Hello");
  values.add("I");
  values.add("Am");
  values.add("Ramya");
  testcountZNames(values,0);
   ArrayList<String> values2 = new ArrayList<String>();
  values2.add("Zambia");
  values2.add("Zimbabwe");
  values2.add("Ethiopia");
  values2.add("Ghana");
  testcountZNames(values2,2);
  ArrayList<String> values3 = new ArrayList<String>();
  values3.add("Za");
  values3.add("Ze");
  values3.add("Zi");
  values3.add("Ze");
  testcountZNames(values3,4);
}
}
