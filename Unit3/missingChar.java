public class missingChar{
public static void testmissingChar(String str, int n, boolean expected){
// boolean correct = missingChar(str, n, expected);
  System.out.println(str, n, expected);
/*  if (correct == expected){
    System.out.println("Woohoo!");
  } else {
   System.out.println("Boohoo");
 }*/


}
  public static void missingChar(String str, int n, boolean expected) {
    String index = str.substring(0,n);
    String index2 = str.substring(n+1, str.length());
    return index + index2;
}
public static void main(String[] args){
  testmissingChar("kitten", 1, false);
  testmissingChar("kitten", 0, true);
  testmissingChar("kitten", 4. false);

}
}
