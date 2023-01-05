import java.util.*;
public class Item {
  public Item (String nameIn, float priceIn){
    name = nameIn;
    price = priceIn;
  }
  public String getName(){
    return name;
  }
  public float getPrice(){
    return price;
  }
  private String name;
  private float price;
}
