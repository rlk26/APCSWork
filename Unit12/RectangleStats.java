public class RectangleStats{

  public static double averagePerimeter(Rectangle rectangles[][]){
    double result = 0;
    int count = 0;
    for (int i = 0; i < rectangles.length; i++) {
      for (int j = 0; j < rectangles[0].length; j++) {
         result += rectangles[i][j].perimeter();
         count++;
       }
     }
     return result/count;
  }

  public static Rectangle largestRectangle(Rectangle rectangles[][]) {

    Rectangle result = rectangles[0][0];

    for (int i = 0; i < rectangles.length; i++) {
      for (int j = 0; j < rectangles[0].length; j++) {
        if (rectangles[i][j].area() > result.area()) {
        result = rectangles[i][j];
        }
      }
    }

    return result;
  }
  public static void main (String [] args){

    int t = 2;
    Rectangle[][] cells = new Rectangle[t][t];
    Rectangle r1 = new Rectangle("BiggyRect",40,50);
    cells [0][0] = r1;
    Rectangle r2 = new Rectangle("SmallRect",4,6);
    cells [0][1] = r2;
    Rectangle r3 = new Rectangle("MediumRect",23,39);
    cells [1][0] = r3;
    Rectangle r4 = new Rectangle("TinyRect",2,2);
    cells [1][1] = r4;


    for (Rectangle[] row : cells)
      {
          for (Rectangle value : row)
            {
                System.out.print(value + " ");
            }
            System.out.println();
        }

    System.out.println(averagePerimeter(cells));
    System.out.println(largestRectangle(cells));


  }
}
