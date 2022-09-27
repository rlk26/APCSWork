public class IsVampire{

    public static boolean isVampire(float hour, boolean awake){
      if (hour > 6.5 && hour < 22 && awake == true){
        return false;
      } else {
        return true;
        }
    }
    public static void main(String[] args) {
    testisVampire(4,true);
  }

}
