// Print Decreasing Increasing.

// 1. You are given a positive number n. 
// 2. You are required to print the counting from n to 1 and back to n again.
// 3. You are required to not use any loops.

// Note : The online judge can't force you to write the function recursively but that is what the spirit of question is.Write recursive and not iterative logic. 
//        The purpose of the question is to aid learning recursion and not test you.

// Input Format :

// A number n

// Output Format :

// n
// n - 1
// n - 2
// ..
// 1
// 1
// 2
// 3
// ..
// n

// Constraints :

// 1 <= n <= 1000

// Sample Input :

// 3

// Sample Output :

// 3
// 2
// 1
// 1
// 2
// 3


import java.util.Scanner;
public class PrintDecreasingIncreasing
{
    // Print Decreasing Increasing.
    public static void printDecreasingIncreasing(int n)
    {
        if(n == 0)
        {
            return;
        }
        System.out.println(n);
        printDecreasingIncreasing(n - 1);
        System.out.println(n);
    }

    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        printDecreasingIncreasing(n);
    }
}
