public class Deal{
  public static void testgoodDeal(double originalPrice, double salePrice, boolean expected){
    boolean correct = goodDeal(originalPrice, salePrice, expected);
    System.out.println("Sale Price: " + salePrice + ", Original Price: " + originalPrice + ", Expected: " + expected + ", Result: " + correct);
    if(correct == expected){
      System.out.println("Woohoo!");
    } else {
      System.out.println("Boohoo!");
    }
  }
  public static boolean goodDeal(double originalPrice, double salePrice, boolean expected){
    if(salePrice < originalPrice*0.75){
      return true;
    } else {
      return false;
    }
  }
  public static void main(String[] args){
    testgoodDeal(20,14,true);
    testgoodDeal(30,44,false);
    testgoodDeal(10,8,false);
    testgoodDeal(60,18,true);
  }
}
