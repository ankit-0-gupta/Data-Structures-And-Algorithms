// Upper Half Diamond Star Pattern.

// Sample Input :

// 5

// Sample Output :
   
//     *
//    ***
//   *****
//  *******
// *********


import java.util.Scanner;
public class UpperHalfDiamondStarPattern
{
    // Upper Half Diamond Star Pattern.
    public static void upperHalfDiamondStarPattern(int n)
    {
        int nsp = n - 1;
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
            nsp--;
            nst += 2;
            System.out.println();
        }
    }

    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        upperHalfDiamondStarPattern(n);
    }
}
