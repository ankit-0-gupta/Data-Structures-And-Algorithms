// Input And Display.


import java.util.Scanner;
public class InputAndDisplay
{
    public static Scanner scn = new Scanner(System.in);

    // Display using For Each Loop.
    public static void display2(int[] arr)
    {
        for(int element : arr)
        {
            System.out.print(element + " ");
        }
    }

    // Display using For Loop.
    public static void display1(int[] arr)
    {
        int n = arr.length;
        for(int i = 0; i < n; i++)
        {
            System.out.print(arr[i] + " ");
        }
    }

    // Input.
    public static void input(int[] arr)
    {   
        int n = arr.length;
        for(int i = 0; i < n; i++)
        {
            arr[i] = scn.nextInt();
        }
    }

    public static void main(String[] args)
    {
        int n = scn.nextInt();
        int[] arr = new int[n];
        input(arr);
        display1(arr);
        System.out.println();
        display2(arr);
    }
}
