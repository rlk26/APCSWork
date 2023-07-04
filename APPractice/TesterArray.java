public class TesterArray {
  public static boolean [][] makeGrid(int rows, int cols){
    boolean [] [] grid;
    grid = new boolean [rows][cols];
    for(int r = 0; r < rows; r++){
      for(int c = 0; r < cols; c++){
        if((r+c) % 2 == 0){
          grid [r][c] = true;
        }
      }
    }
    return grid;
  }
  public static void main (String [] args){
    int row = 3;
    int col = 3;
    makeGrid(row,col);
  }
}
