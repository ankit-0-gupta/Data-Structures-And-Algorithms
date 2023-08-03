// Wave Print.

// Sample Input : 

// 3 4
// 11 12 13 14
// 21 22 23 24
// 31 32 33 34

// Sample Output : 

// 11 12 13 14 24 23 22 21 31 32 33 34


import java.util.Scanner;
public class WavePrint
{
    public static Scanner scn = new Scanner(System.in);

    // Wave Print.
    public static void wavePrint(int[][] arr)
    {
        int n = arr.length;
        int m = arr[0].length;
        for(int i = 0; i < n; i++)
        {
            if(i % 2 == 0)
            {
                for(int j = 0; j < m; j++)
                {
                    System.out.print(arr[i][j] + " ");
                }
            }
            else
            {
                for(int j = m - 1; j >= 0; j--)
                {
                    System.out.print(arr[i][j] + " ");
                }
            }
        }
    }

    // Input.
    public static void input(int[][] arr)
    {
        int n = arr.length;
        int m = arr[0].length;
        for(int i = 0; i < n; i++)
        {
            for(int j = 0; j < m; j++)
            {
                arr[i][j] = scn.nextInt();
            }
        }
    }

    public static void main(String[] args)
    {
        int n = scn.nextInt();
        int m = scn.nextInt();
        int[][] arr = new int[n][m];
        input(arr);
        wavePrint(arr);
    }
}
