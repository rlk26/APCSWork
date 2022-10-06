public class missingChar{
  public static String missingChar(String str, int n) {
    String index = str.substring(0,n);
    String index2 = str.substring(n+1, str.length());
    System.out.println(index + index2);
    return index + index2;
}
public static void main(String[] args){
  missingChar("kitten", 1);
  missingChar("kitten", 0);
  missingChar("kitten", 4);

}
}
