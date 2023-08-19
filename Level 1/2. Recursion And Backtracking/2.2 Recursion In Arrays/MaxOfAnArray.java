// Max Of An Array.

// 1. You are given a number n, representing the count of elements.
// 2. You are given n numbers.
// 3. You are required to find the maximum of input. 

// Note : The online judge can't force you to write the function recursively but that is what the spirit of question is. 
//        Write recursive and not iterative logic. The purpose of the question is to aid learning recursion and not test you.

// Input Format :

// A number n
// n1
// n2
// .. n number of elements

// Output Format :

// A number representing max

// Constraints :

// 1 <= n <= 10^4
// 0 <= n1, n2, .. n elements <= 10^9

// Sample Input :

// 6
// 15
// 30
// 40
// 4
// 11
// 9

// Sample Output :

// 40


import java.util.Scanner;
public class MaxOfAnArray
{
    public static Scanner scn = new Scanner(System.in);

    // Maximum.
    public static int maxOfAnArray(int[] a, int idx)
    {
        if(idx == a.length)
        {
            return -(int)1e9; 
        }
        int maximum = maxOfAnArray(a, idx + 1);
        return Math.max(maximum, a[idx]);
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
        System.out.print(maxOfAnArray(a, 0));
    }
}
