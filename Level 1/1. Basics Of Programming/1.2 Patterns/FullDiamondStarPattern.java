// Full Diamond Star Pattern.

// 1. You are given a number n.
// 2. You've to create a pattern of * as shown in output format.

// Input Format :

// A number n

// Output Format :
  
//     *
//    ***
//   *****
//  *******
// *********
//  *******
//   *****
//    ***
//     *

// Constraints :

// 1 <= n < 100
// Also, n is odd.


import java.util.Scanner;
public class FullDiamondStarPattern
{
    // Full Diamond Star Pattern.
    public static void fullDiamondStarPattern(int n)
    {
        int nsp = n / 2;
        int nst = 1;
        for(int row = 1; row <= n; row++)
        {
            for(int csp = 1; csp <= nsp; csp++)
            {
                System.out.print(" ");
            }
            for(int cst = 1; cst <= nst; cst++)
            {
                System.out.print("*");
            }
            if(row <= n / 2)
            {
                nsp--;
                nst += 2;
            }
            else
            {
                nsp++;
                nst -= 2;
            }
            System.out.println();
        }
    }

    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        fullDiamondStarPattern(n);
    }
}
