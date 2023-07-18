// Full Diamond Number Pattern.

// 1. You are given a number n.
// 2. You've to write code to print the pattern given in output format below.

// Input Format :

// A number n

// Output Format :

//     1
//    232
//   34543
//  4567654
// 567898765
//  4567654
//   34543
//    232
//     1

// Constraints :

// 1 <= n < 10
// Also, n is odd.


import java.util.Scanner;
public class FullDiamondNumberPattern
{
    // Full Diamond Number Pattern.
    public static void fullDiamondNumberPattern(int n)
    {
        int nsp = n / 2;
        int nst = 1;
        for(int row = 1; row <= n; row++)
        {
            for(int csp = 1; csp <= nsp; csp++)
            {
                System.out.print(" ");
            }
            int value = row;
            if(row > n / 2 + 1)
            {
                value = n - row + 1; 
            }
            for(int cst = 1; cst <= nst; cst++)
            {
                System.out.print(value);
                if(cst <= nst / 2)
                {
                    value++;
                }
                else
                {
                    value--;
                }
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
        fullDiamondNumberPattern(n); 
    }
}
