public class attention{
  public static void attention(String hey) {
    String index = hey.substring(0,8);
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
