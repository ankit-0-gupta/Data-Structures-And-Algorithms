// First Index.

// 1. You are given a number n, representing the count of elements.
// 2. You are given n numbers.
// 3. You are given a number x. 
// 4. You are required to find the first index at which x occurs in array a.
// 5. If x exists in array, print the first index where it is found otherwise print -1.

// Note : The online judge can't force you to write the function recursively but that is what the spirit of question is. 
//        Write recursive and not iterative logic. The purpose of the question is to aid learning recursion and not test you.

// Input Format : 

// A number n
// n1
// n2
// .. n number of elements
// A number x

// Output Format :

// A number representing first index of occurence of x in array a or -1 if not found at all

// Constraints :

// 1 <= n <= 10^4
// 0 <= n1, n2, .. n elements <= 10^3
// 0 <= x <= 10^3

// Sample Input :

// 6
// 15
// 11
// 40
// 4
// 4
// 9
// 4

// Sample Output :

// 3


import java.util.Scanner;
public class FirstIndex
{
    public static Scanner scn = new Scanner(System.in);
    
    // First Index.
    public static int firstIndex(int[] a, int x, int idx)
    {
        if(idx == a.length)
        {
            return -1;
        }
        if(a[idx] == x)
        {
            return idx;
        }
        return firstIndex(a, x, idx + 1);
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
        int x = scn.nextInt();
        System.out.print(firstIndex(a, x, 0));
    }
}
