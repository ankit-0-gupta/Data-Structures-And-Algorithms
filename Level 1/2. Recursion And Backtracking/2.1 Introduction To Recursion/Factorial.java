// Factorial.

// 1. You are given a number n.
// 2. You are required to calculate the factorial of the number. 

// Note : The online judge can't force you to write the function recursively but that is what the spirit of question is.Write recursive and not iterative logic. 
//        The purpose of the question is to aid learning recursion and not test you.

// Input Format :

// A number n

// Output Format :

// factorial of n

// Constraints :

// 0 <= n <= 10

// Sample Input :

// 5

// Sample Output :

// 120


import java.util.Scanner;
public class Factorial
{
    // Factorial.
    public static int factorial(int n)
    {
        return (n == 0) ? 1 : n * factorial(n - 1);
    }

    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        System.out.print(factorial(n));
    }
}
