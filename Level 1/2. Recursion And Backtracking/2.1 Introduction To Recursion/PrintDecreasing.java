// Print Decreasing.

// 1. You are given a positive number n. 
// 2. You are required to print the counting from n to 1.
// 3. You are required to not use any loops. 

// Note : The online judge can't force you to write the function recursively but that is what the spirit of question is. 
//        Write recursive and not iterative logic. The purpose of the question is to aid learning recursion and not test you.

// Input Format :

// A number n

// Output Format :

// n
// n - 1
// n - 2
// .. 
// 1

// Constraints :

// 1 <= n <= 1000

// Sample Input :

// 5

// Sample Output :

// 5
// 4
// 3
// 2
// 1


import java.util.Scanner;
public class PrintDecreasing
{
    // Print Decreasing.
    public static void printDecreasing(int n)
    {
        if(n == 0)
        {
            return;
        }
        System.out.println(n);
        printDecreasing(n - 1);
    }

    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        printDecreasing(n);
    } 
}
