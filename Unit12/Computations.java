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
  public static int aString(String [] [] values){
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
      return rere;
  }

  public static void main (String [] args){
    int lie = 2;
    int [][] cells = new int[lie][lie];
    cells[0][0] = 18;
    cells[0][1] = 3;
    cells[1][0] = 21;
    cells[1][1] = 8;

    for (int [] row : cells)
    {
        for (int value : row)
        {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    System.out.println(findSmall(cells));

    int lala = 2;
    float [][] sllec = new float [lala][lala];
    sllec [0][0] = 10;
    sllec [0][1] = 27;
    sllec [1][0] = 18;
    sllec [1][1] = 98;

    for (float [] row : sllec)
    {
        for (float value : row)
          {
              System.out.print(value + " ");
          }
          System.out.println();
      }

    System.out.println(sumFloat(sllec));

    int hi = 3;
    String[][] cellos = new String[hi][hi];
    cellos[0][0] = "Hi";
    cellos[0][1] = "I";
    cellos[0][2] = "Am";
    cellos[1][0] = "Ramya!";
    cellos[1][1] = "This";
    cellos[1][2] = "Collects";
    cellos[2][0] = "All";
    cellos[2][1] = "A";
    cellos[2][2] = "Strings.";
    for (String [] row : cellos)
    {
        for (String value : row)
        {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    System.out.println(aString(cellos));




  }
}
