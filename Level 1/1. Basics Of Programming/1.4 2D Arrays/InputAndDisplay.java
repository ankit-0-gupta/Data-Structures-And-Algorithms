// Input And Display.


import java.util.Scanner;
public class InputAndDisplay
{   
    public static Scanner scn = new Scanner(System.in);

    // Display Using For Each Loop.
    public static void display2(int[][] arr)
    {
        for(int[] ar : arr)
        {
            for(int element : ar)
            {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }

    // Display Using For Loop.
    public static void display1(int[][] arr)
    {
        int n = arr.length;
        int m = arr[0].length;
        for(int i = 0; i < n; i++)
        {
            for(int j = 0; j < m; j++)
            {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
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
        System.out.println();
        display1(arr);
        System.out.println();
        display2(arr);
    }
}
