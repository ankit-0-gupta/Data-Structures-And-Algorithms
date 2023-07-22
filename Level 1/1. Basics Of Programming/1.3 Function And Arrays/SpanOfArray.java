// Span Of Array.

// 1. You are given a number n, representing the count of elements.
// 2. You are given n numbers.
// 3. You are required to find the span of input. Span is defined as difference of maximum value and minimum value.

// Input Format :

// A number n
// n1
// n2
// .. n number of elements

// Output Format :

// A number representing max - min

// Constraints :

// 1 <= n <= 10^4
// 0 <= n1, n2 .. n elements <= 10^9

// Sample Input :

// 6
// 15
// 30
// 40
// 4
// 11
// 9

// Sample Output :

// 36


import java.util.Scanner;
public class SpanOfArray
{
    public static Scanner scn = new Scanner(System.in);

    // Span Of Array.
    public static int spanOfArray(int[] arr)
    {
        int maximum = -(int)1e9;
        int minimum = (int)1e9;
        for(int element : arr)
        {
            maximum = Math.max(maximum, element);
            minimum = Math.min(minimum, element);
        }
        return (maximum - minimum);
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
        System.out.print(spanOfArray(arr));
    }
}
