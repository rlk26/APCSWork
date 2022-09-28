public class isVampire{
  public static void testisVampire(float hour, boolean awake, boolean expected){
  boolean result = isVampire(hour, awake, expected);
    System.out.println("Hour : " + hour + ", Awake: " + awake + ", Expected result of 'Is a Vampire?': " + expected + ", Is a vampire?: " + result);
    if(expected == result){
      System.out.println("Woohoo!");
    } else {
      System.out.println("Boohoo!");
    }
  }
    public static boolean isVampire(float hour, boolean awake, boolean expected){
      if (hour < 6.5 && awake == true || hour > 22 && awake == true){
        return true;
      } else {
        return false;
        }
    }
    public static void main(String[] args) {
    testisVampire(4,true,true);
    testisVampire(23,false,false);
    testisVampire(8,true,false);
    testisVampire(18,true,false);
  }
}
