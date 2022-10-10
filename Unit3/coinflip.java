public class coinflip{
  public static boolean coinflip() {
    int coin = (int) (Math.random() * 2 + 2);
    if (coin == 2){
      System.out.println("Heads " + coin);
      return true;
    } else if (coin  == 3){
      System.out.println("Tails " + coin);
      return false;
    } else {
      return false;
    }
} public static void main(String [] args){
  coinflip();
  coinflip();
  coinflip();
  coinflip();
  coinflip();
  coinflip();
  coinflip();
  coinflip();
  coinflip();
  coinflip();
  coinflip();
  coinflip();
  coinflip();
  coinflip();
  coinflip();
  coinflip();
}
}
