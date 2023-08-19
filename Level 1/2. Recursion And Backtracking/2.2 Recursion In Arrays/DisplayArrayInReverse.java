// Display Array In Reverse.

// 1. You are given a number n, representing the size of array a.
// 2. You are given n numbers, representing elements of array a.
// 3. You are required to print the elements of array from end to beginning each in a separate line.

// Note : The online judge can't force you to write the function recursively but that is what the spirit of question is. 
//        Write recursive and not iterative logic. The purpose of the question is to aid learning recursion and not test you.

// Input Format :

// A number n
// n1
// n2
// .. n number of elements

// Output Format :

// n1
// n2
// .. n elements

// Constraints :

// 1 <= n <= 30
// 0 <= n1, n2, .. n elements <= 10

// Sample Input :

// 5
// 3
// 1
// 0
// 7
// 5

// Sample Output :

// 5
// 7
// 0
// 1
// 3


import java.util.Scanner;
public class DisplayArrayInReverse
{
    public static Scanner scn = new Scanner(System.in);
    
    // Display Array In Reverse.
    public static void reverseDisplay(int[] a, int idx)
    {
        if(idx == a.length)
        {
            return;
        }
        reverseDisplay(a, idx + 1);
        System.out.println(a[idx]);
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
        reverseDisplay(a, 0);
    }
}
