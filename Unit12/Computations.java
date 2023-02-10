public class Computations{
  public static int findSmall(int [][] values){
    int result = Integer.MAX_VALUE;
    for (int i=0; i<values.length; i++)
    {
        for (int j=0; j<values.length; j++)
        {
          if(values[i][j] < result){
            result = values[i][j];
          }

        }
    }
    return result;

  }

  public static float sumFloat(float [] [] values){
    float result = 0;
    for (int i=0; i<values.length; i++)
    {
        for (int j=0; j<values.length; j++)
        {
          result += values[i][j];

        }
    }
    return result;

  }
  public static void aString(String [] [] values){
    int rere = 0;
    for (int i=0; i<values.length; i++)
    {
        for (int j=0; j<values.length; j++)
        {
          if(values[i][j].substring(0,1).equals("A")){
          rere++;
        } else if(values[i][j].substring(0,1).equals("a")){
          rere++;
        }
        }
      }
  }

  public static void main (String [] args){
    int hi = 3;
    String[][] cells = new String[hi][hi];
    cells[0][1] = "element "


  }
}
