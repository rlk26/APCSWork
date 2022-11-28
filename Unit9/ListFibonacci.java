import java.util.*;
public class ListFibonacci{

public static ArrayList<Integer> fibonacciSequence(int hey){
  ArrayList<Integer> result = new ArrayList<Integer>();
  int a = 1;
  int b = 1;
  int c = 0;
  for(int i = 1; i < hey+1; i++){
    c = a+b;
    result.add(c);
    a = b;
    b = c;
  }
  return result;
}

public static void main(String [] args){
  System.out.println(fibonacciSequence(3));
  System.out.println(fibonacciSequence(7));
  System.out.println(fibonacciSequence(18));

}
}
