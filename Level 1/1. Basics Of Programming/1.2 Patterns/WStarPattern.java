// W Star Pattern.

// 1. You are given a number n.
// 2. You've to write code to print the pattern given in output format below.

// Input Format :

// A number n

// Output Format :

// *     *
// *     *
// *     *
// *  *  *
// * * * *
// **   **
// *     *

// Constraints :

// 1 <= n < 10
// Also, n is odd.


import java.util.Scanner;
public class WStarPattern
{
    // W Star Pattern.
    public static void wStarPattern(int n)
    {
        for(int i = 1; i <= n; i++)
        {
            for(int j = 1; j <= n; j++)
            {
                if((j == 1 || j == n) || (i > n / 2 && (i == j || i + j == n + 1)))
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        wStarPattern(n);
    }
}
