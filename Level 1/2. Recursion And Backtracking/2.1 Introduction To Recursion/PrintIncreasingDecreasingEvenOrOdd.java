// Print Increasing Decreasing Even Or Odd.

// Upward : Print Even numbers
// Downward : Print Odd numbers.


import java.util.Scanner;
public class PrintIncreasingDecreasingEvenOrOdd
{
    // Print Increasing Decreasing Even Or Odd.
    public static void printEvenOrOdd(int n, int i)
    {
        if(i > n)
        {
            return;
        }
        if(i % 2 == 0)
        {
            System.out.println(i);
        }
        printEvenOrOdd(n, i + 1);
        if(i % 2 != 0)
        {
            System.out.println(i);
        }
    }

    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        printEvenOrOdd(n, 1);
    }
}
