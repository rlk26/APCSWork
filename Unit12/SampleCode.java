//
// Hello2DArrays.java
//


public class SampleCode
{
    public static void main(String[] args)
    {
        int[] values = {1, 3, 5, 7};

        for (int value: values)
            System.out.print(value + " ");
        System.out.println();


        int[][] numbers = { {1, 3, 5}, {2, 4}, {9} };

        System.out.println("numbers[0][2]: " +  numbers[0][2]);


        // print all numbers (for each loop)

        System.out.println("numbers:");

        for (int[] row : numbers)
        {
            for (int value : row)
            {
                System.out.print(value + " ");
            }
            System.out.println();
        }

        // for loop

        System.out.println("numbers (for loop):");

        for (int i=0; i<numbers.length; i++)
        {
            for (int j=0; j < numbers[i].length; j++)
            {
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println();
        }

        String[][] names = new String[2][2];

        names[0][0] = "Eloise";
        names[0][1] = "Ava";
        names[1][0] = "Madeleine";
        names[1][1] = "Sarah";

        System.out.println("names:");
        for (String[] row : names)
        {
            for (String name : row)
                System.out.print(name + " ");
            System.out.println();
        }

        // create an array:
        // 0 1 0 1 0
        // 1 0 1 0 1
        // 0 1 0 1 0
        // 1 0 1 0 1
        // 0 1 0 1 0

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
