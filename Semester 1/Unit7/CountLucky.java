public class CountLucky{
  public static void testCountLucky(int [] nums, int expected) {
   int correct = countLucky(nums);
    System.out.println("Expected: " + expected + " Correct: " + correct);
    if(correct == expected){
      System.out.println("Woohoo!");
    } else {
      System.out.println("Boohoo!");
    }
  }
  public static int countLucky(int [] nums){
   int count = 0;
    for (int num : nums)
    if (num%7 == 0 || num%10 == 7) {
      count++;
  }

  return count;

  }
  public static void main (String [] args){
   int [] values = new int[4];
    values [0] = 7;
    values [1] = 107;
    values [2] = 140;
    values [3] = 99;
    testCountLucky(values,3);

   int [] values2 = new int[4];
    values2 [0] = 1;
    values2 [1] = 57;
    values2 [2] = 210;
    values2 [3] = 43;
    testCountLucky(values2,2);

   int [] values3 = new int[4];
    values3 [0] = 111;
    values3 [1] = 85;
    values3 [2] = 317;
    values3 [3] = 16;
    testCountLucky(values3,1);
}

}
