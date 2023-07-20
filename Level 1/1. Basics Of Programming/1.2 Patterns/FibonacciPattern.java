// Fibonacci Pattern.

// 1. You are given a number n.
// 2. You've to create a pattern as shown in output format.

// Input Format :

// A number n

// Output Format :

// 0
// 1   1
// 2   3   5
// 8   13  21  34
// ..

// Constraints :

// 1 <= n <= 5


import java.util.Scanner;
public class FibonacciPattern
{
    // Fibonacci Pattern.
    public static void fibonacciPattern(int n)
    {
        int nst = 1;
        int first = 0;
        int second = 1;
        for(int row = 1; row <= n; row++)
        {
            for(int cst = 1; cst <= nst; cst++)
            {
                System.out.print(first + "\t");
                int sum = first + second;
                first = second;
                second = sum;
            }
            nst++;
            System.out.println();
        }
    }

    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        fibonacciPattern(n);
    }
}
