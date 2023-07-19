// Swastik Star Pattern.

// 1. You are given a number n.
// 2. You've to write code to print the pattern given in output format below.
                                                                 
// Input Format :

// A number n

// Output Format :

// ****  *
//    *  *
//    *  *
// *******
// *  *
// *  *
// *  ****

// Constraints :

// n is odd.


import java.util.Scanner;
public class SwastikStarPattern
{
    // Swastik Star Pattern.
    public static void swastikStarPattern(int n)
    {
        for(int i = 1; i <= n; i++)
        {
            for(int j = 1; j <= n; j++)
            {
                if(i == 1)
                {
                    if(j <= n / 2 + 1 || j == n)
                    {
                        System.out.print("*");
                    }
                    else
                    {
                        System.out.print(" ");
                    }
                }
                else if(i <= n / 2)
                {
                    if(j == n / 2 + 1 || j == n)
                    {
                        System.out.print("*");
                    }
                    else
                    {
                        System.out.print(" ");
                    }
                }
                else if(i == n / 2 + 1)
                {
                    System.out.print("*");
                }
                else if(i < n)
                {
                    if(j == 1 || j == n / 2 + 1)
                    {
                        System.out.print("*");
                    }
                    else
                    {
                        System.out.print(" ");
                    }
                }
                else
                {
                    if(j == 1 || j >= n / 2 + 1)
                    {
                        System.out.print("*");
                    }
                    else
                    {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        swastikStarPattern(n);
    }
}
