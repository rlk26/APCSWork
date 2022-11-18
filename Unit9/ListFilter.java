import java.util.*;
public class ListFilter{

public static ArrayList<Integer> filterGoodScores(ArrayList<Integer>nums){
  ArrayList<Integer> result = new ArrayList<Integer>();
  for(int num: nums)
  if(num > 90){
    result.add(num);
  }
  System.out.println(result);
  return result;
}

public static void main(String [] args){
  ArrayList<Integer> values = new ArrayList<Integer>();
   values.add(8);
   values.add(100);
   values.add(67);
   values.add(30);
   filterGoodScores(values);

  ArrayList<Integer> values2 = new ArrayList<Integer>();
   values2.add(13);
   values2.add(264);
   values2.add(182);
   values2.add(44);
   filterGoodScores(values2);

  ArrayList<Integer> values3 = new ArrayList<Integer>();
   values3.add(11);
   values3.add(28);
   values3.add(106);
   values3.add(90);
   filterGoodScores(values3);

}
}
