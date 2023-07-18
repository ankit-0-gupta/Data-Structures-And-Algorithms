// Square Star Pattern.

// Sample Input :

// 5

// Sample Output :

// *****
// *****
// *****
// *****
// *****


import java.util.Scanner;
public class SquareStarPattern
{
    // Square Star Pattern.
    public static void squareStarPattern(int n)
    {
        int nst = n;
        for(int row = 1; row <= n; row++)
        {
            for(int cst = 1; cst <= nst; cst++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        squareStarPattern(n);
    }
}
