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
  System.out.println(result);
  return result;
}

public static void main(String [] args){
  fibonacciSequence(3);
  fibonacciSequence(7);
  fibonacciSequence(18);

}
}
