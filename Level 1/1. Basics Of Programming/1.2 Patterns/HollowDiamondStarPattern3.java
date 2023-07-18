// Hollow Diamond Star Pattern 3.

// 1. You are given a number n.
// 2. You've to create a pattern of * as shown in output format.

// Input Format :

// A number n

// Output Format :

//     *
//    * *
//   *   *
//  *     *
// *       *
//  *     *
//   *   *
//    * *
//     *
     
// Constraints :

// 1 <= n < 100
// Also, n is odd.


import java.util.Scanner;
public class HollowDiamondStarPattern3
{
    // Hollow Diamond Star Pattern.
    public static void hollowDiamondStarPattern(int n)
    {
        int nspO = n / 2;
        int nspI = -1;
        for(int row = 1; row <= n; row++)
        {
            for(int cspO = 1; cspO <= nspO; cspO++)
            {
                System.out.print(" ");
            }
            System.out.print("*");
            for(int cspI = 1; cspI <= nspI; cspI++)
            {
                System.out.print(" ");
            }
            if(row != 1 && row != n)
            {
                System.out.print("*");
            }
            if(row <= n / 2)
            {
                nspO--;
                nspI += 2;
            }
            else
            {
                nspO++;
                nspI -= 2;
            }
            System.out.println();
        }
    }

    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        hollowDiamondStarPattern(n);
    }
}
