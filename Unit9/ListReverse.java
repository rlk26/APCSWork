import java.util.*;
public class ListReverse{

public static ArrayList<String> reverseAll(ArrayList<String>nums){
  ArrayList<String> result = new ArrayList<String>();
  for (String num : nums){
  String hello = "";
  for(int i = num.length() - 1; i >= 0; i--)
    hello = hello + num.charAt(i);
    result.add(hello);
}
return result;
}


public static void main(String [] args){
  ArrayList<String> values = new ArrayList<String>();
   values.add("Hey");
   values.add("I");
   values.add("Am");
   values.add("Ramya");
   System.out.println(reverseAll(values));

  ArrayList<String> values2 = new ArrayList<String>();
   values2.add("Robotics");
   values2.add("Is");
   values2.add("Very");
   values2.add("Stressful");
   System.out.println(reverseAll(values2));

  ArrayList<String> values3 = new ArrayList<String>();
   values3.add("But");
   values3.add("Also");
   values3.add("Really");
   values3.add("Fun");
   System.out.println(reverseAll(values3));
}
}
