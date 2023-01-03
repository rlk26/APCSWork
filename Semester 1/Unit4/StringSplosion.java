public class StringSplosion{
  public static void teststringSplosion(String hey, String expected){
    String correct = stringSplosion(hey);
    System.out.println("String: " + hey + " Expected: " + expected + " Correct: " + correct);
    if(correct.equals(expected)){
      System.out.println("Woohoo!");
    } else {
      System.out.println("Boohoo!");
    }
  }
  public static String stringSplosion(String hey) {
  String result = "";
  for (int i=0; i<hey.length(); i++) {
    result = result + hey.substring(0, i+1);
  }
  return result;
  }
  public static void main (String [] args){
    teststringSplosion("Ramya","RRaRamRamyRamya");
    teststringSplosion("Code","CCoCodCode");
    teststringSplosion("Computer","CCoComCompCompuComputComputeComputer");

  }
}
