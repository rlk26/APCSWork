import java.util.*;
public class ItemCalculator{

  public static void testaverageOfItems(ArrayList<Item>items, float expected){
    float correct = averageOfItems(items);
    System.out.println("Expected: " + expected + " Correct: " + correct);
    for(Item i : items){
      System.out.println(i.getPrice());
    }
    if(correct == expected){
      System.out.println("Woohoo!");
    } else {
      System.out.println("Boohoo!");
    }
  }

  public static void testmostExpensive(ArrayList<Item>items, String expected){
    String correct = mostExpensive(items);
    System.out.println("Expected: " + expected + " Correct: " + correct);
    for(Item i : items){
      System.out.println(i.getPrice());
      System.out.println(i.getName());
    }
    if(correct.equals(expected)){
      System.out.println("Woohoo!");
    } else {
      System.out.println("Boohoo!");
    }
  }

    public static float averageOfItems(ArrayList<Item> items){
      float result = 0;
      for (Item i : items){
        result += i.getPrice();
      }
      return result / items.size();
    }

    public static String mostExpensive(ArrayList<Item> items){
      float result = 0;
      float result2 = 0;
      String hey = "";
      for (Item i : items){
        result = i.getPrice();
        if(result > result2){
        result2 = i.getPrice();
        hey = i.getName();
      }
      }
      return hey;
    }

    public static void main (String [] args){
      ArrayList<Item> items = new ArrayList<Item>();
      items.add(new Item("Bottled Water", 5f));
      items.add(new Item("Shrimp", 20f));
      items.add(new Item("Champagne", 600f));
      items.add(new Item("Erewhon Salad", 300f));
      testaverageOfItems(items,231.25f);
      testmostExpensive(items,"Champagne");
    }
}
