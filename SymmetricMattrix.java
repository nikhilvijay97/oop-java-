import java.util.Scanner;

public class SymmetricMattrix
{
    public static void main(String args[])
    {
        boolean symmetric = true;
        Scanner s = new Scanner(System.in);

        System.out.println("Enter number of rows");
        int rows = s.nextInt();

        System.out.println("Enter number of columns");
        int cols = s.nextInt();

        int[][] matrix = new int[rows][cols];

        System.out.println("Enter elements of matrix");
        for(int i = 0; i < rows; i++)
        {
            for(int j = 0; j < cols; j++)
            {
                matrix[i][j] = s.nextInt();
            }
        }

        if(rows != cols)
        {
            System.out.println("Matrix is not symmetric");
        }
        else
        {
            for(int i = 0; i < rows; i++)
            {
                for(int j = 0; j < cols; j++)
                {
                    if(matrix[i][j] != matrix[j][i])
                    {
                        symmetric = false;
                        break;
                    }
                }
            }

            if(symmetric)
                System.out.println("The matrix is symmetric");
            else
                System.out.println("The matrix is not symmetric");
        }
    }
}