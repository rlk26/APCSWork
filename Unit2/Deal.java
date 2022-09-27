public class Deal{

  public static void main(String[] args) {
      public static boolean goodDeal(double originalPrice, double salePrice){
        if (salePrice < 0.75*originalPrice){
          return true;
        } else {
          return false;
        }
      }
      goodDeal(20,15);
    }

}
