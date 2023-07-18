// Lower Half Diamond Star Pattern.

// Sample Input :

// 5

// Sample Output :

// *********
//  *******
//   *****
//    ***
//     *


import java.util.Scanner;
public class LowerHalfDiamondStarPattern
{
    // Lower Half Diamond Star Pattern.
    public static void lowerHalfDiamondStarPattern(int n)
    {
        int nsp = 0;
        int nst = 2 * n - 1;
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
            nsp++;
            nst -= 2;
            System.out.println();
        }
    }

    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        lowerHalfDiamondStarPattern(n);
    }
}
