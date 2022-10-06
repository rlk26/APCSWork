public class attention{
  public static void testattention(String hello, boolean expected){
    boolean correct = attention(hello);
    System.out.println("Expected: " + expected + " Correct: " + correct);
    if(correct == expected){
      System.out.println("Woohoo!");
    } else {
      System.out.println("Boohoo!");
    }
  }
  public static boolean attention(String hey) {
    String index = hey.substring(0,8);
    if (index.equals("Hey you!")){
      return true;
    } else {
      return false;
    }


} public static void main(String [] args){
  testattention("Hello, my name is Ramya", false);
  testattention("Excuse me, Dr. Kessner?", false);
  testattention("Hey you! Give me your code!", true);
}
}
