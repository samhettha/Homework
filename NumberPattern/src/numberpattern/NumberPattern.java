
package numberpattern;

public class NumberPattern
{
    public static void printPattern(int n) 
    {
        int[][] arr = new int[n][n];
        int num = 1;

        // Fill diagonals
        for (int col = 0; col < n; col++)
        {
            int row = 0, c = col;
            while (c >= 0 && row < n)
            {
                arr[row][c] = num++;
                row++;
                c--;
            }
        }

        // Print required format
        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j <= i; j++) 
            {
                System.out.print(arr[i - j][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        printPattern(5);
    }
}
