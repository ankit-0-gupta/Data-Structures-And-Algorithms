// Maximum Element.

// Sample Input :

// 7
// 10 -6 11 2 100 16 78

// Sample Output :

// 100


import java.util.Scanner;
public class MaximumElement
{
    public static Scanner scn = new Scanner(System.in);

    // Maximum Element.
    public static int maximumElement(int[] arr)
    {
        int maximum = -(int)1e9;
        for(int element : arr)
        {
            maximum = Math.max(maximum, element);
        }
        return maximum;
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
        System.out.print(maximumElement(arr));
    }
}
