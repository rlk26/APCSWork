public class greetings{
  
  public static void testgreetings(String hello, String expected){
    String correct = greetings(hello);
    System.out.println("Expected: " + expected + " Correct: " + correct);
    if(correct.equals(expected)){
      System.out.println("Woohoo!");
    } else {
      System.out.println("Boohoo!");
    }
  }
  public static String greetings(String hello) {
    return("Hello " + hello + ", how are you?");
} public static void main(String [] args){
  testgreetings("Ramya", "Hello Ramya, how are you?");
  testgreetings("Dr. Kessner", "Hello Dr. Kessner, how are you?");
  testgreetings("Logan", "Hello Logan, how are you?");
}
}
