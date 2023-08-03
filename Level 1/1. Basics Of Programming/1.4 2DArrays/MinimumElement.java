// Minimum Element.

// Sample Input :

// 5 4
// 10 20 30 40
// 50 60 70 80
// 90 55 95 85
// 23 24 26 27
// 32 34 45 56

// Sample Output :

// 10


import java.util.Scanner;
public class MinimumElement
{
    public static Scanner scn = new Scanner(System.in);

    // Minimum Element.
    public static int minimumElement(int[][] arr)
    {
        int n = arr.length;
        int m = arr[0].length;
        int minimum = (int)1e9;
        for(int i = 0; i < n; i++)
        {
            for(int j = 0; j < m; j++)
            {
                minimum = Math.min(minimum, arr[i][j]);
            }
        }
        return minimum;
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
        System.out.print(minimumElement(arr));
    }   
}
