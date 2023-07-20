// Hill Number Pattern.

// 1. You are given a number n.
// 2. You've to write code to print the pattern given in output format below.
                                                                 
// Input Format :

// A number n

// Output Format :

// 1                                                                                               1
// 1       2                                                                               2       1
// 1       2       3                                                               3       2       1
// 1       2       3       4                                               4       3       2       1
// 1       2       3       4       5                               5       4       3       2       1
// 1       2       3       4       5       6               6       5       4       3       2       1
// 1       2       3       4       5       6       7       6       5       4       3       2       1	

// Constraints :

// 1 <= n <= 10


import java.util.Scanner;
public class HillNumberPattern
{
    // Hill Number Pattern.
    public static void hillNumberPattern(int n)
    {
        int nst = 1;
        int nsp = 2 * n - 3;
        for(int row = 1; row <= n; row++)
        {
            int value = 1;
            for(int cst = 1; cst <= nst; cst++)
            {
                System.out.print(value++ + "\t");
            }
            for(int csp = 1; csp <= nsp; csp++)
            {
                System.out.print("\t");
            }
            if(row == n)
            {
                value--;
                nst--;
            }
            for(int cst = 1; cst <= nst; cst++)
            {
                System.out.print(--value + "\t");
            }
            nsp -= 2;
            nst++;
            System.out.println();
        }
    }

    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        hillNumberPattern(n);
    }
}
