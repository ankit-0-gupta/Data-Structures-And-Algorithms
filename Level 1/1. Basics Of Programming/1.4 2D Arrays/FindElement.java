// Find Element.

// Sample Input :

// 5 4
// 10 20 30 40
// 50 60 70 80
// 90 55 95 85
// 23 24 26 27
// 32 34 45 56
// element : 95

// Sample Output :

// true


import java.util.Scanner;
public class FindElement
{
    public static Scanner scn = new Scanner(System.in);

    // Find Element.
    public static boolean maximumElement(int[][] arr, int element)
    {
        int n = arr.length;
        int m = arr[0].length;
        boolean foundElement = false;
        for(int i = 0; i < n; i++)
        {
            for(int j = 0; j < m; j++)
            {
                if(arr[i][j] == element)
                {
                    foundElement = true;
                    return foundElement;
                }
            }
        }
        return foundElement;
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
        int element = scn.nextInt();
        System.out.print(maximumElement(arr, element));
    }   
}
