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

  }
}
