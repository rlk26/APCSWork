public class missingChar{
  public static void testmissingChar(String str, int n, String expected){
    String correct = missingChar(str, n);
    System.out.println("Expected: " + expected + " Correct: " + correct);
    if(correct.equals(expected)){
      System.out.println("Woohoo!");
    } else {
      System.out.println("Boohoo!");
    }
  }
  public static String missingChar(String str, int n) {
    String index = str.substring(0,n);
    String index2 = str.substring(n+1, str.length());
    return index + index2;
}
public static void main(String[] args){
  testmissingChar("kitten", 1, "ktten");
  testmissingChar("kitten", 0, "itten");
  testmissingChar("kitten", 4, "kittn");

}
}
