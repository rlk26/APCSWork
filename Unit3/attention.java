public class attention{
  public static void testattention(String hello, boolean expected){
    boolean correct = attention(hello, expected);
    System.out.println("Expected" + expected + "Correct" + correct);
    if(correct == expected){
      System.out.println("Woohoo!");
    } else {
      System.out.println("Boohoo!");
    }
  }
  public static boolean attention(String hey) {
    String index = hey.substring(0,7);
    Boolean hello;
    if (index.equals("Hey You!")){
      return true;
    } else {
      return false;
    }


} public static void main(String [] args){
  attention("Hello, my name is Ramya");
  attention("Excuse me, Dr. Kessner?");
  attention("Hey you! Give me your code!");
}
}
