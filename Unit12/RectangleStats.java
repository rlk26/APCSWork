public class Rectangle{
  public static void main (String [] args){
    int n = 10;
    int[][] cells = new int[n][n];

    for (int i=0; i<n; i++)
    {
      for (int j=0; j<n; j++)
      {
        cells[i][j] = (i+j)%2;
      }
    }

  System.out.println("cells:");

  for (int[] row : cells)
  {
    for (int value : row)
    {
        System.out.print(value + " ");
    }
    System.out.println();
}
}
}
