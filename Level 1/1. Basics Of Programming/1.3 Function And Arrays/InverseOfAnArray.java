// Inverse Of An Array.

// 1. You are given a number n, representing the size of array a.
// 2. You are given n numbers, representing elements of array a.
// 3. You are required to calculate the inverse of array a.

// Input Format :

// Input is managed for you

// Output Format :

// Output is managed for you

// Constraints :

// 0 <= n < 10^7
// The range of values is from 0 to n - 1

// Sample Input :

// 5
// 4
// 0
// 2
// 3
// 1

// Sample Output :

// 1
// 4
// 2
// 3
// 0


// Extra Space.


import java.util.Scanner;
public class InverseOfAnArray
{
    public static Scanner scn = new Scanner(System.in);

    // Inverse Of Array.
    public static int[] inverseOfArray(int[] a)
    {
        int n = a.length;
        int[] inverse = new int[n];
        for(int i = 0; i < n; i++)
        {
            inverse[a[i]] = i;
        }
        return inverse;
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
        int[] arr = inverseOfArray(a);
        for(int element : arr)
        {
            System.out.println(element);
        }
    }
}
