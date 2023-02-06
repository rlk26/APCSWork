//
// HelloCheckers.java
//


import processing.core.*;


public class SampleCode2 extends PApplet
{
    public void settings()
    {
        size(600, 600);
    }

    public void setup()
    {
        cells = new int[cellCount][cellCount];

        for (int i=0; i<cells.length; i++)
        for (int j=0; j<cells[0].length; j++)
        {
            cells[i][j] = (i+j)%2;
        }
    }

    public void draw()
    {
        float w = width/cellCount;
        float h = height/cellCount;

        for (int i=0; i<cells.length; i++)
        for (int j=0; j<cells[0].length; j++)
        {
            fill(cells[i][j] * 255);
            rect(w*j, h*i, w, h);
        }
    }

    final int cellCount = 10;
    int[][] cells;

    public static void main(String[] args)
    {
        PApplet.main("SampleCode2");
    }
}
