// Minimum Element.

// Sample Input : 

// 7
// 10 -6 11 2 100 16 78

// Sample Output :

// -6


import java.util.Scanner;
public class MinimumElement
{
    public static Scanner scn = new Scanner(System.in);

    // Minimum Element.
    public static int minimumElement(int[] arr)
    {
        int minimum = (int)1e9;
        for(int element : arr)
        {
            minimum = Math.min(minimum, element);
        } 
        return minimum;
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
        System.out.print(minimumElement(arr));
    }
}
