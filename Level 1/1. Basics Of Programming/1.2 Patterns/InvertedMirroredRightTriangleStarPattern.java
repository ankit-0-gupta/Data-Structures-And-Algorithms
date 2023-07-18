// Inverted Mirrored Right Triangle Star Pattern.

// 1. You are given a number n.
// 2. You've to create a pattern of * as shown in output format.

// Input Format :

// A number n

// Output Format :

// ******
//  *****
//   ****
//    ***
//     **
//      *

// Constraints :

// 1 <= n <= 100


import java.util.Scanner;
public class InvertedMirroredRightTriangleStarPattern
{
    // Inverted Mirrored Right Triangle Star Pattern.
    public static void invertedMirroredRightTriangleStarPattern(int n)
    {
        int nsp = 0;
        int nst = n;
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
            nst--;
            System.out.println();
        }
    }

    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        invertedMirroredRightTriangleStarPattern(n);
    }
}
