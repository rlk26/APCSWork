public class Multiples{

  public static void main(String[] args) {
    for (int i = 0; i < 30; i++)
    if (i%3 && i%5){
      System.out.println("FizzBuzz");
    }
    else if (i%3){
      System.out.println("Fizz");
    } else if (i%5){
      System.out.println("Buzz");
    } else {
        System.out.println(i);
    }
  }
}
