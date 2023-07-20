// Right Triangle Number Pattern.

// 1. You are given a number n.
// 2. You've to create a pattern as shown in output format.

// Input Format :

// A number n

// Output Format :

// 1
// 2   3
// 4   5   6
// 7   8   9   10
// 11  12  13  14  15
// ..

// Constraints :

// 1 <= n <= 44


import java.util.Scanner;
public class RightTriangleNumberPattern
{
    // Right Triangle Number Pattern.
    public static void rightTriangleNumberPattern(int n)
    {
        int nst = 1;
        int value = 1;
        for(int row = 1; row <= n; row++)
        {
            for(int cst = 1; cst <= nst; cst++)
            {
                System.out.print(value++ + "\t");
            }
            nst++;
            System.out.println();
        }
    }

    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        rightTriangleNumberPattern(n);
    }
}
