public class close10{

public static int close10(int a, int b) {
  int aDiff = Math.abs(a - 10);
  int bDiff = Math.abs(b - 10);

  if (aDiff < bDiff) {
    System.out.println(a);
    return a;
  }
  if (bDiff < aDiff) {
    System.out.println(b);
    return b;
  } else {
    System.out.println("0");
  return 0;
}
}

public static void main(String [] args){
  close10(10,20);
  close10(40,18);
  close10(8,12);
  close10(0,8);
}
}
