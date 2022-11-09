public class CountZNames{
  public static void testcountZNames(String [] nums,String expected) {
   String correct = countZNames(nums);
    System.out.println("Expected: " + expected + " Correct: " + correct);
    if(correct.equals(expected)){
      System.out.println("Woohoo!");
    } else {
      System.out.println("Boohoo!");
    }
  }
  public static String countZNames(String [] nums){
   String hey = nums.substring();
   int count = 0;
    for (String num : nums)
    if(){
      count++;
    }

    return hey;

  }

  public static void main (String [] args){
    String [] values = new String [4];
    values [0] = "Hello";
    values [1] = "I";
    values [2] = "Am";
    values [3] = "Ramya";
    testcountZNames(values,0);
  }
}
