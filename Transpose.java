import java.util.Scanner;

public class Transpose
{
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter number of rows:");
        int rows = s.nextInt();

        System.out.println("Enter number of columns:");
        int cols = s.nextInt();

        int[][] matrix = new int[rows][cols];

        System.out.println("Enter elements of the matrix:");
        for(int i = 0; i < rows; i++)
        {
            for(int j = 0; j < cols; j++)
            {
                matrix[i][j] = s.nextInt();
            }
        }

        System.out.println("Transpose of the matrix:");
        for(int i = 0; i < cols; i++)
        {
            for(int j = 0; j < rows; j++)
            {
                System.out.print(matrix[j][i] + " ");
            }
            System.out.println();
        }
    }
}