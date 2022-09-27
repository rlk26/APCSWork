public class icyHot{
public static boolean icyHot(int temp1, int temp2) {
  if ((temp1 < 0 && temp2 > 100) || (temp1 > 100 && temp2 < 0)) {
    return true;
  } else {
    return false;
  }
}
  public static void main(String[] args) {
    testicyHot(10,10);
}
}
