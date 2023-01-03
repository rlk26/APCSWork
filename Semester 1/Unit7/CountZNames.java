public class CountZNames{
  public static void testcountZNames(String [] nums, int expected) {
   int correct = countZNames(nums);
    System.out.println("Expected: " + expected + " Correct: " + correct);
    if(correct == expected){
      System.out.println("Woohoo!");
    } else {
      System.out.println("Boohoo!");
    }
  }
  public static int countZNames(String [] nums){
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
    String [] values = new String [4];
    values [0] = "Hello";
    values [1] = "I";
    values [2] = "Am";
    values [3] = "Ramya";
    testcountZNames(values,0);
    String [] values2 = new String [4];
    values2 [0] = "Zambia";
    values2 [1] = "Zimbabwe";
    values2 [2] = "Ethiopia";
    values2 [3] = "Ghana";
    testcountZNames(values2,2);
    String [] values3 = new String [4];
    values3 [0] = "Za";
    values3 [1] = "Ze";
    values3 [2] = "Zi";
    values3 [3] = "Zo";
    testcountZNames(values3,4);
  }
}
