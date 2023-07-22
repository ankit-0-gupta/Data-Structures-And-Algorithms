// Reverse An Array.

// 1. You are given a number n, representing the size of array a.
// 2. You are given n numbers, representing elements of array a.
// 3. You are required to reverse the contents of array a.

// Input Format :

// Input is managed for you

// Output Format :

// Output is managed for you

// Constraints :

// 0 <= n < 10^4
// -10^9 <= a[i] <= 10^9

// Sample Input :

// 5
// 1
// 2
// 3
// 4
// 5

// Sample Output :

// 5 4 3 2 1


import java.util.Scanner;
public class ReverseAnArray
{
    public static Scanner scn = new Scanner(System.in);

    // Swap.
    public static void swap(int[] a, int i, int j)
    {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    } 

    // Reverse An Array.
    public static int[] reverseAnArray(int[] a)
    {
        int n = a.length;
        int i = 0;
        int j = n - 1;
        while(i < j)
        {
            swap(a, i, j);
            i++;
            j--;
        }
        return a;
    }

    // Input.
    public static void input(int[] a)
    {   
        int n = a.length;
        for(int i = 0; i < n; i++)
        {
            a[i] = scn.nextInt();
        }
    }

    public static void main(String[] args)
    {
        int n = scn.nextInt();
        int[] a = new int[n];
        input(a);
        int[] arr = reverseAnArray(a);
        for(int element : arr)
        {
            System.out.print(element + " ");
        } 
    }
}
