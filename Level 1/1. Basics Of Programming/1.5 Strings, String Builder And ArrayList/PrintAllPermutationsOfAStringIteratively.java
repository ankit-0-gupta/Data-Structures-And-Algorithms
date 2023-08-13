// Print All Permutations Of A String Iteratively.

// 1. You are given a string. 
// 2. You have to print all permutations of the given string iteratively.

// Input Format :

// A String

// Output Format :

// All permutations of the given string(one in a line)

// Constraints :

// 1 <= length of string <= 15

// Sample Input :

// abc

// Sample Output :

// abc
// bac
// cab
// acb
// bca
// cba


import java.util.Scanner;
public class PrintAllPermutationsOfAStringIteratively
{
    // Factorial.
    public static int factorial(int n)
    {
        int fact = 1;
        for(int i = 2; i <= n; i++)
        {
            fact *= i;
        }
        return fact;
    }

    // Print All Permutations Of A String Iteratively.
    public static void permutaions(String str)
    {
        int n = str.length();
        int f = factorial(n);
        for(int i = 0; i < f; i++)
        {
            StringBuilder sb = new StringBuilder(str);
            int temp = i;
            for(int divisor = n; divisor >= 1; divisor--)
            {
                int quotient = temp / divisor;
                int remainder = temp % divisor;
                System.out.print(sb.charAt(remainder));
                sb.deleteCharAt(remainder);
                temp = quotient;
            }
            System.out.println();
        }
    }

    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        permutaions(str);
    }
}
