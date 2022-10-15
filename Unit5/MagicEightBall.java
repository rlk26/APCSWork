public class MagicEightBall{
  public MagicEightBall(){
    a = "Possibly";
    b = "Signs Point to Yes";
    c = "No";
    d = "Please Ask Again";
  }
  private final String a;
  private final String b;
  private final String c;
  private final String d;

  public void ask(){
    int hey = (int)(Math.random() * 4);
    if (hey == 1){
    System.out.println(a);
  } else if (hey == 2){
    System.out.println(b);
  } else if (hey == 3){
    System.out.println(c);
  } else {
    System.out.println(d);
  }
  }
}
