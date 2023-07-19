// Arrow Star Pattern.

// 1. You are given a number n.
// 2. You've to write code to print the pattern given in output format below.

// Input Format :

// A number n

// Output Format :
    
//      *
//      **
//      ***
//      ****
//      *****
// ***********
//      *****
//      ****
//      ***
//      **
//      *

// Constraints :

// 1 <= n < 10
// Also, n is odd.


import java.util.Scanner;
public class ArrowStarPattern
{
    // Arrow Star Pattern.
    public static void arrowStarPattern(int n)
    {
        int nsp = n / 2;
        int nst = 1;
        for(int row = 1; row <= n; row++)
        {
            for(int csp = 1; csp <= nsp; csp++)
            {
                if(row == n / 2 + 1)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            for(int cst = 1; cst <= nst; cst++)
            {
                System.out.print("*");
            }
            if(row <= n / 2)
            {
                nst++;
            }
            else
            {
                nst--;
            }
            System.out.println();
        }
    }

    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        arrowStarPattern(n);
    }
}
