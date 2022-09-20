public class Fibonacci{
  public static void main(String[] args) {
    int a = 1;
    int b = 1;
    int c = 0;
    for(int i = 1; i < 30; i++){
      c = a+b;
      System.out.println(c);
      a = b;
      b=c;

    }
  }
}
