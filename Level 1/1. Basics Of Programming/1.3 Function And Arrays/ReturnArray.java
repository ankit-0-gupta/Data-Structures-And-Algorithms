// Return Array.


import java.util.Scanner;
public class ReturnArray
{
    public static Scanner scn = new Scanner(System.in);

    // Return Array.
    public static int[] returnArray(int n)
    {
        int[] arr = new int[n];
        for(int i = 0; i < n; i++)
        {
            arr[i] = scn.nextInt();
        }
        return arr;
    }

    public static void main(String[] args)
    {
        int n = scn.nextInt();
        int[] arr = returnArray(n);
        for(int element : arr)
        {
            System.out.print(element + " ");
        }
    }
}
